package vemuri;

public class MakeDeposit2 extends MakeDepositAbstract {

	@Override
	public void process(DatastoreAbstract dataStore) {
		dataStore.deposit();

	}

}
