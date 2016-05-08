package vemuri;

public class Account2 {

	FactoryAbstract factory; //factory object
	DatastoreAbstract data; //datastore object
	MDA mda; //MDA object
	
	//Variables to maintain min. balance limit for this account 
	//and max. permissible attempts while entering pin
	int minBalance, maxPermissibleAttempts; 
	
	/*Constructor for this class
	 * Params: FactoryAbstract, MDA
	 * Returns: Account2 Object
	 */
	public Account2(FactoryAbstract factory, MDA mda){
		
		minBalance = 0;
		maxPermissibleAttempts = 2;
		this.factory = factory;
		data =  factory.getDataObject();
		this.mda = mda;
		
	}
	
	/*
	 * OPEN method to open the account
	 * Parameters: Pin, UserID, Balance in order
	 * Ivokes open method in MDA
	 */
	public boolean OPEN (int p, int y, int a) {
		
		data.storeData(Integer.toString(p), Integer.toString(y), Integer.toString(a));
		mda.Open();
		return true;
		
	}
	
	/*
	 * Helper method to verify the pin passes by the user
	 * params: Pin
	 * returns true if passed pin is correct. else returns false
	 */
	public boolean verifyPin(int x){
		
		if(x == Integer.parseInt(data.getPin()))
			return true;
		
		return false;
	}
	
	/*
	 * PIN method accepts pin form the user
	 * params: pin
	 * This method verifies the pin passed and invokes MDA CorrectPinAboveMin method
	 *  If pin entered is incorrect, it invokes incorrectPin method in MDA.
	 */
	public boolean PIN (int x){
		
		if(verifyPin(x)){
			mda.CorrectPinAboveMin();
		}
		else
			mda.IncorectPin(maxPermissibleAttempts);
		
		return true;
	}

	/*
	 * DEPOSIT method to handle deposit request from the user
	 * params: deposit amount
	 * This method stores the passed amount in datastore
	 *  invokes MDA deposit method
	 */
	public boolean DEPOSIT (int d){
		
		data.storeDepositAmt(Integer.toString(d));
		mda.Deposit();
		return true;
	}
	
	/*
	 * Helper method to check if current account has minimum balance
	 * returns true it it has min balance, else returns false
	 */
	public boolean hasMinBal(){

		if(Integer.parseInt(data.getBalance()) > minBalance){
			return true;
		}

		return false;
	}
	
	/*
	 * WITHDRAW method to handle withdraw request from the user
	 * params: withdraw amount
	 * This method stores the passed withdraw in datastore 
	 *  invokes MDA withdraw method
	 *  After withdraw, based on balance, it calls MDA methods AboveMinBalance/BelowMinBalance 
	 */
	public boolean WITHDRAW (int w){
		data.storeWithdrawAmt(Integer.toString(w));
		
		if(hasMinBal()){
			mda.Withdraw();
			mda.AboveMinBalance();
		}
		else
			mda.NoFunds();
		return true;
	}

	public boolean BALANCE(){
		
		mda.Balance();
		return true;
	}
	
	public boolean verifyUserId(int y){

		if(y==Integer.parseInt(data.getUserId())){
			return true;
		}
		return false;
	}

	/*
	 * LOGIN method to login into the account
	 * params: userID
	 * Verifies the user ID and if correct, invoked login method in MDA
	 * else, it invokes incorrectLogin method in MDA
	 */
	public boolean LOGIN(int y){
		
		if(verifyUserId(y)){
			mda.Login();
		}
		else
			mda.IncorrectLogin();
		return true;
	}

	public boolean LOGOUT(){
		mda.Logout();
		return true;
	}

	public boolean suspend(){
		mda.Suspend();
		return true;
	}

	public boolean activate(){
		mda.Activate();
		return true;
	}

	public boolean close(){
		mda.Close();
		return true;
	}

}
