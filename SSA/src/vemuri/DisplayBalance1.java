package vemuri;

public class DisplayBalance1 extends DisplayBalanceAbstract {

	@Override
	public void displayBalance(DatastoreAbstract dataStore) {
		
		System.out.println("Curret Balance is: "+ dataStore.getBalance());
		
	}

}
