package vemuri;

public class Datastore2 extends DatastoreAbstract {

	private int p; //temp pin
	private int y; //temp userID
	private int a; //temp balance

	private int pin; //pin
	private int uID; //userID
	private int balance; //balance

	private int temp_deposit; //temp deposit
	private int temp_withdraw; //temp withdraw

	//constructor
	public Datastore2() {

	}

	/*
	 * storeData method to store temp values
	 * params: Pin, userID, balance
	 * returns true after being finished.
	 */
	@Override
	public boolean storeData(String p, String y, String a) {

		this.p = Integer.parseInt(p);
		this.y = Integer.parseInt(y);
		this.a = Integer.parseInt(a);

		return true;
	}

	//returns pin
	@Override
	public String getPin() {
		return Integer.toString(this.pin);
	}

	//returns balance
	@Override
	public String getBalance() {
		return Integer.toString(this.balance);
	}

	//stores deposit amount
	@Override
	public boolean storeDepositAmt(String deposit) {
		this.temp_deposit = Integer.parseInt(deposit);
		return true;
	}

	//stores withdraw amount
	@Override
	public boolean storeWithdrawAmt(String deposit) {
		this.temp_withdraw = Integer.parseInt(deposit);
		return true;
	}

	//returns userID
	@Override
	public String getUserId() {
		return Integer.toString(this.uID);
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

	//processes withdraw
	@Override
	public boolean withdraw() {
		this.balance -= temp_withdraw;
		return true;
	}

	//processes deposit
	@Override
	public boolean deposit() {
		this.balance += temp_deposit;
		return true;
	}

	//processes penalty
	@Override
	public boolean withdrawWithPenalty() {
		return false;
	}

}
