package vemuri;

public class InitAccount1 extends InitAccountAbstract {

	public boolean process(DatastoreAbstract dataStore){

		dataStore.initData();
		
		return true;
	}

}
