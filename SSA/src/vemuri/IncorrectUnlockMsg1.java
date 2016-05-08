package vemuri;

public class IncorrectUnlockMsg1 extends IncorrectUnlockMsgAbstract {

	@Override
	public boolean showMessage() {
		System.out.println("Incorrect Pin entered, cannot Unlock");
		return false;
	}

}
