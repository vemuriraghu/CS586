package vemuri;

public class MakeWithdraw2 extends MakeWithdrawAbstract {

	@Override
	public boolean process(DatastoreAbstract dataStore) {
		dataStore.withdraw();
		return true;
	}

}
