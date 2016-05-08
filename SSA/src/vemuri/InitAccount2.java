package vemuri;

public class InitAccount2 extends InitAccountAbstract {

	@Override
	public boolean process(DatastoreAbstract dataStore) {
		dataStore.initData();

		return true;
	}

}
