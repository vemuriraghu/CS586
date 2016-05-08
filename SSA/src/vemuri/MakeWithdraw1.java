package vemuri;

public class MakeWithdraw1 extends MakeWithdrawAbstract {

	@Override
	public boolean process(DatastoreAbstract dataStore) {
		
		dataStore.withdraw();
		return true;
	}

}
