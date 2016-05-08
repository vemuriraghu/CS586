package vemuri;

//class account-1
public class Account1 {

	FactoryAbstract factory; //factory object
	DatastoreAbstract data; //datastore object
	MDA mda; //MDA object
	
	//Variables to maintain min. balance limit for this account 
	//and max. permissible attempts while entering pin
	int minBalance, maxPermissibleAttempts;  

	/*Constructor for this class
	 * Params: FactoryAbstract, MDA
	 * Returns: Account1 Object
	 */
	public Account1(FactoryAbstract factory, MDA mda){

		minBalance = 500;
		maxPermissibleAttempts = 3;
		this.factory = factory;
		data =  factory.getDataObject();
		this.mda = mda;

	}

	/*
	 * Open method to open the account
	 * Parameters: Pin, UserID, Balance in order
	 * Ivokes open method in MDA
	 */
	public boolean open (String p, String y, float a){

		data.storeData(p, y, Float.toString(a));
		mda.Open();
		return true;

	}

	/*
	 * login method to login into the account
	 * params: userID
	 * Verifies the user ID and if correct, invoked login method in MDA
	 * else, it invokes incorrectLogin method in MDA
	 */
	public boolean login(String y){

		if(verifyUserId(y)){
			mda.Login();
		}
		else
			mda.IncorrectLogin();
		return true;
	}

	/*
	 * Helper method to verify the pin passes by the user
	 * params: Pin
	 * returns true if passed pin is correct. else returns false
	 */
	public boolean verifyPin(String x){

		if(x.equals(data.getPin()))
			return true;

		return false;
	}

	/*
	 * Helper method to check if current account has minimum balance
	 * returns true it it has min balance, else returns false
	 */
	public boolean hasMinBal(){

		if(Float.parseFloat(data.getBalance()) > minBalance){

			return true;
		}

		return false;
	}

	/*
	 * pin method accepts pin form the user
	 * params: pin
	 * This method verifies the pin passed and invokes MDA methods 
	 *  CorrectPinAboveMin/CorrectPinBelowMin based on balance availabel in the account
	 *  If pin entered is incorrect, it invokes incorrectPin method in MDA
	 */
	public boolean pin (String x){

		if(verifyPin(x)){

			if(hasMinBal()){
				mda.CorrectPinAboveMin();
			}
			else
				mda.CorrectPinBelowMin();
		}

		else{
			mda.IncorectPin(maxPermissibleAttempts);
		}

		return true;
	}

	/*
	 * deposit method to handle deposit request from the user
	 * params: deposit amount
	 * This method stores the passed amount in datastore 
	 *  invokes MDA deposit method
	 *  After deposit, based on balance, it calls MDA methods AboveMinBalance/BelowMinBalance
	 */
	public boolean deposit (float d){

		data.storeDepositAmt(Float.toString(d));
		mda.Deposit();

		if(hasMinBal()){
			mda.AboveMinBalance();
		}
		else
			mda.BelowMinBalance();

		return true;
	}

	/*
	 * withdraw method to handle withdraw request from the user
	 * params: withdraw amount
	 * This method stores the passed withdraw in datastore 
	 *  invokes MDA withdraw method
	 *  After withdraw, based on balance, it calls MDA methods AboveMinBalance/BelowMinBalance 
	 */
	public boolean withdraw (float w){

		data.storeWithdrawAmt(Float.toString(w));
		mda.Withdraw();

		if(hasMinBal()){
			mda.AboveMinBalance();
		}
		else
			mda.WithdrawBelowMinBalance();

		return true;
	}

	/*
	 * balance method to handle balance request from the user
	 * params: none
	 *  invokes MDA balance method 
	 */
	public boolean balance(){
		
		mda.Balance();
		return true;
	}

	/*
	 * Helper method to verify the userID passes by the user
	 * params: UserID
	 * returns true if passed userID is correct. else returns false
	 */
	public boolean verifyUserId(String y){

		if(y.equals(data.getUserId())){
			return true;
		}
		return false;
	}

	/*
	 * logout method to handle logout request from the user
	 * params: none
	 *  invokes MDA logout method 
	 */
	public boolean logout(){

		mda.Logout();
		return true;
	}

	/*
	 * lock method to handle lock request from the user
	 * params: pin
	 *  invokes MDA lock method if pin passed as parameter is correct
	 *  if pin is incorrect, it invokes incorrect unlock method
	 */
	public boolean lock(String x){

		//correct pin
		if(verifyPin(x)){
			mda.Lock();
		}
		//incorrect pin
		else
			mda.IncorrectLock();
		return true;
	}

	/*
	 * unlock method to handle unlock request from the user
	 * params: pin
	 *  invokes MDA unlock method if pin passed as parameter is correct
	 *  if pin is incorrect, it invokes incorrect unlock method
	 */
	public boolean unlock(String x){

		//correct pin
		if(verifyPin(x)){
			mda.Unlock();

			if(hasMinBal()){
				mda.AboveMinBalance();
			}
			else
				mda.BelowMinBalance();
		}
		//incorrect pin
		else{
			mda.IncorrectUnlock();
		}

		return true;
	}

}
