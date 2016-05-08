package vemuri;

public class MakeWithdrawBelowMinBalance2 extends MakeWithdrawBelowMinBalanceAbstract {

	@Override
	public boolean process(DatastoreAbstract dataStore) {

		dataStore.withdrawWithPenalty();
		return true;
	}

}
