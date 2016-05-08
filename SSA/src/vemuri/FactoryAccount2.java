package vemuri;

public class FactoryAccount2 extends FactoryAbstract {

	/*
	 *Below variables to hold respective class objects 
	 */
	DatastoreAbstract data;
	InitAccountAbstract initAccountObject;
	IncorrectIdMsgAbstract IncorrectIdMsgObject;
	IncorrectPinMsgAbstract IncorrectPinMsgObject;
	TooManyAttemptsMsgAbstract TooManyAttemptsMsgObject;
	DisplayMenuAbstract DisplayMenuObject;
	MakeDepositAbstract MakeDepositObject;
	DisplayBalanceAbstract DisplayBalanceObject;
	MakeWithdrawAbstract MakeWithdrawObject;
	MakeWithdrawBelowMinBalanceAbstract MakeWithdrawBelowMinBalanceObject;
	NoFundsMsgAbstract NoFundsMsgObject;
	PromptPinMsgAbstract PromptPinMsgObject;
	CloseAbstract close;

	/*Constructor to initialize the factory
	 * Params: none
	 * Returns: FactoryAccount2 Object
	 * Initialized the respective class objects
	 */
	public FactoryAccount2(){
		data = new Datastore2();
		initAccountObject = new InitAccount2();
		IncorrectIdMsgObject = new IncorrectIdMsg2();
		IncorrectPinMsgObject = new IncorrectPinMsg2();
		TooManyAttemptsMsgObject = new TooManyAttemptsMsg2();
		DisplayMenuObject = new DisplayMenu2();
		MakeDepositObject = new MakeDeposit2();
		DisplayBalanceObject = new DisplayBalance2();
		MakeWithdrawObject = new MakeWithdraw2();
		MakeWithdrawBelowMinBalanceObject = new MakeWithdrawBelowMinBalance2();
		NoFundsMsgObject = new NoFundsMsg2();
		PromptPinMsgObject = new PromptPinMsg2();
		close = new Close2();
	}

	/*
	 * returns DatastoreAbstract object pointing to 
	 * Datastore2
	 */
	@Override
	public DatastoreAbstract getDataObject(){
		return data;
	}

	/*
	 * returns InitAccountAbstract object pointing to 
	 * InitAccount2
	 */
	@Override
	public InitAccountAbstract getInitAccount(){
		return initAccountObject;
	}

	/*
	 * returns IncorrectIdMsgAbstract object pointing to 
	 * IncorrectIdMsg2
	 */
	@Override
	public IncorrectIdMsgAbstract getIncorrectIdMsgObject(){
		return IncorrectIdMsgObject;
	}

	/*
	 * returns IncorrectPinMsgAbstract object pointing to 
	 * IncorrectPinMsg2
	 */
	@Override
	public IncorrectPinMsgAbstract getIncorrectPinMsgObject(){
		return IncorrectPinMsgObject;
	}

	/*
	 * returns TooManyAttemptsMsgAbstract object pointing to 
	 * TooManyAttemptsMsg2
	 */
	@Override
	public TooManyAttemptsMsgAbstract TooManyAttemptsMsgObject(){
		return TooManyAttemptsMsgObject;
	}

	/*
	 * returns DisplayMenuAbstract object pointing to 
	 * DisplayMenu2
	 */
	@Override
	public DisplayMenuAbstract DisplayMenuObject() {
		return DisplayMenuObject;
	}

	/*
	 * returns MakeDepositAbstract object pointing to 
	 * MakeDeposit2
	 */
	@Override
	public MakeDepositAbstract MakeDepositObject() {
		return MakeDepositObject;
	}

	/*
	 * returns DisplayBalanceAbstract object pointing to 
	 * DisplayBalance2
	 */
	@Override
	public DisplayBalanceAbstract DisplayBalanceObject() {
		return DisplayBalanceObject;
	}

	/*
	 * returns MakeWithdrawAbstract object pointing to 
	 * MakeWithdraw2
	 */
	@Override
	public MakeWithdrawAbstract MakeWithdrawObject() {
		return MakeWithdrawObject;
	}

	/*
	 * returns MakeWithdrawBelowMinBalanceAbstract object pointing to 
	 * MakeWithdrawBelowMinBalance2
	 */
	@Override
	public MakeWithdrawBelowMinBalanceAbstract MakeWithdrawBelowMinBalanceObject() {
		// TODO Auto-generated method stub
		return MakeWithdrawBelowMinBalanceObject;
	}

	/*
	 * returns NoFundsMsgAbstract object pointing to 
	 * NoFundsMsg2
	 */
	@Override
	public NoFundsMsgAbstract getNoFundsMsgObject() {
		return NoFundsMsgObject;
	}

	/*
	 * returns null as not required by corresponding account
	 */
	@Override
	public CloseAbstract CloseObject() {
		return close;
	}

	/*
	 * returns null as not required by corresponding account
	 */
	@Override
	public IncorrectUnlockMsgAbstract IncorrectUnlockMsgObject() {
		return null;
	}

	/*
	 * returns IncorrectLockMsgAbstract object pointing to 
	 * IncorrectLockMsg2
	 */
	@Override
	public IncorrectLockMsgAbstract IncorrectLockMsgObject() {
		return null;
	}

	/*
	 * returns PromptPinMsgAbstract object pointing to 
	 * PromptPinMsg2
	 */
	@Override
	public PromptPinMsgAbstract PromptPinMsgObject() {
		return PromptPinMsgObject;
	}
}
