package vemuri;

public class Datastore1 extends DatastoreAbstract {
	
	private String p; //temp pin
	private String y; //temp userID
	private float a; //temp balance
	
	private String pin; //pin
	private String uID; //userID
	private float balance; //balance
	
	private float temp_deposit; //temp deposit
	private float temp_withdraw; //temp withdraw
	private float penalty; // penalty amount
	
	/*
	 * Constructor 
	 * params: none
	 * initializes Datastore1 object
	 */
	public Datastore1() {
		penalty = 20;
	}
	
	/*
	 * storeData method to store temp values
	 * params: Pin, userID, balance
	 * returns true after being finished.
	 */
	@Override
	public boolean storeData(String p, String y, String a) {
		// TODO Auto-generated method stub
		
		this.p = p;
		this.y = y;
		this.a = Float.parseFloat(a);
		
		return true;
	}
	
	/*
	 * initData method to intialize using temp variables
	 * params: none
	 * returns true after being finished.
	 */
	@Override
	public boolean initData() {
		this.pin = p;
		this.uID = y;
		this.balance = a;
		
		return true;
	}

	//returns pin
	@Override
	public String getPin() {
		return this.pin;
	}

	//returns balance
	@Override
	public String getBalance() {
		return Float.toString(this.balance);
	}
	
	//processes the deposit
	@Override
	public boolean deposit(){
		this.balance += temp_deposit;
		return true;
	}

	//stores the deposit amount
	@Override
	public boolean storeDepositAmt(String deposit) {
		this.temp_deposit = Float.parseFloat(deposit);
		return true;
	}
	
	//processes withdraw
	@Override
	public boolean withdraw(){
		this.balance -= temp_withdraw;
		return true;
	}

	//stores the withdraw amount
	@Override
	public boolean storeWithdrawAmt(String deposit) {
		this.temp_withdraw = Float.parseFloat(deposit);
		return true;
	}

	//returns userID
	@Override
	public String getUserId() {
		return this.uID;
	}
 
 	//processes penalty
	@Override
	public boolean withdrawWithPenalty() {
		
		this.balance -= (penalty);
		return true;
	}


}
