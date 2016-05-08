package vemuri;

public class IncorrectLockMsg1 extends IncorrectLockMsgAbstract {

	@Override
	public boolean showMessage() {
		System.out.println("Lock failed, incorrect pin entered");
		return true;
	}

}
