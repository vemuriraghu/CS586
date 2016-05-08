package vemuri;

public abstract class DatastoreAbstract {

	public abstract boolean storeData(String p, String y, String a);
	
	public abstract boolean initData();
	
	public abstract String getPin();
	
	public abstract String getBalance();
	
	public abstract boolean storeDepositAmt(String deposit);
	
	public abstract boolean storeWithdrawAmt(String deposit);
	
	public abstract String getUserId();

	public abstract boolean withdraw();

	public abstract boolean deposit();
	
	public abstract boolean withdrawWithPenalty();
	
	
}
