package vemuri;

public class FactoryAccount1 extends FactoryAbstract {
	
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
	IncorrectUnlockMsgAbstract IncorrectUnlockMsgObject;
	IncorrectLockMsgAbstract IncorrectLockMsgObject;
	PromptPinMsgAbstract PromptPinMsgObject;
	
	/*Constructor to initialize the factory
	 * Params: none
	 * Returns: FactoryAccount1 Object
	 * Initialized the respective class objects
	 */
	public FactoryAccount1(){
		data = new Datastore1();
		initAccountObject = new InitAccount1();
		IncorrectIdMsgObject = new IncorrectIdMsg1();
		IncorrectPinMsgObject = new IncorrectPinMsg1();
		TooManyAttemptsMsgObject = new TooManyAttemptsMsg1();
		DisplayMenuObject = new DisplayMenu1();
		MakeDepositObject = new MakeDeposit1();
		DisplayBalanceObject = new DisplayBalance1();
		MakeWithdrawObject = new MakeWithdraw1();
		MakeWithdrawBelowMinBalanceObject = new MakeWithdrawBelowMinBalance1();
		NoFundsMsgObject = new NoFundsMsg1();
		IncorrectUnlockMsgObject = new IncorrectUnlockMsg1();
		IncorrectLockMsgObject = new IncorrectLockMsg1();
		PromptPinMsgObject = new PromptPinMsg1();
	}
	
	/*
	 * returns DatastoreAbstract object pointing to 
	 * Datastore1
	 */
	@Override
	public DatastoreAbstract getDataObject(){
		return data;
	}
	
	/*
	 * returns InitAccountAbstract object pointing to
	 * InitAccount1
	 */
	@Override
	public InitAccountAbstract getInitAccount(){
		return initAccountObject;
	}
	
	/*
	 * returns IncorrectIdMsgAbstract object pointing to 
	 * IncorrectIdMsg1
	 */
	@Override
	public IncorrectIdMsgAbstract getIncorrectIdMsgObject(){
		return IncorrectIdMsgObject;
	}
	
	/*
	 * returns IncorrectPinMsgAbstract object pointing to 
	 * IncorrectPinMsg1
	 */
	@Override
	public IncorrectPinMsgAbstract getIncorrectPinMsgObject(){
		return IncorrectPinMsgObject;
	}
	
	/*
	 * returns TooManyAttemptsMsgAbstract object pointing 
	 * to TooManyAttemptsMsg1
	 */
	@Override
	public TooManyAttemptsMsgAbstract TooManyAttemptsMsgObject(){
		return TooManyAttemptsMsgObject;
	}

	/*
	 * returns DisplayMenuAbstract object pointing to DisplayMenu1
	 */
	@Override
	public DisplayMenuAbstract DisplayMenuObject() {
		return DisplayMenuObject;
	}

	/*
	 * returns MakeDepositAbstract object pointing to MakeDeposit1
	 */
	@Override
	public MakeDepositAbstract MakeDepositObject() {
		return MakeDepositObject;
	}

	/*
	 * returns DisplayBalanceAbstract object pointing to DisplayBalance1
	 */
	@Override
	public DisplayBalanceAbstract DisplayBalanceObject() {
		return DisplayBalanceObject;
	}

	/*
	 * returns MakeWithdrawAbstract object pointing to MakeWithdraw1
	 */
	@Override
	public MakeWithdrawAbstract MakeWithdrawObject() {
		return MakeWithdrawObject;
	}

	/*
	 * returns MakeWithdrawBelowMinBalanceAbstract object pointing 
	 * to MakeWithdrawBelowMinBalance1
	 */
	@Override
	public MakeWithdrawBelowMinBalanceAbstract MakeWithdrawBelowMinBalanceObject() {
		// TODO Auto-generated method stub
		return MakeWithdrawBelowMinBalanceObject;
	}

	/*
	 * returns NoFundsMsgAbstract object pointing to NoFundsMsg1
	 */
	@Override
	public NoFundsMsgAbstract getNoFundsMsgObject() {
		return NoFundsMsgObject;
	}

	/*
	 * returns null as close is not supported
	 */
	@Override
	public CloseAbstract CloseObject() {
		return null;
	}

	/*
	 * returns IncorrectUnlockMsgAbstract object pointing to IncorrectUnlockMsg1
	 */
	@Override
	public IncorrectUnlockMsgAbstract IncorrectUnlockMsgObject() {
		return IncorrectUnlockMsgObject;
	}

	/*
	 * returns IncorrectLockMsgAbstract object pointing to IncorrectLockMsg1
	 */
	@Override
	public IncorrectLockMsgAbstract IncorrectLockMsgObject() {
		return IncorrectLockMsgObject;
		
	}

	/*
	 * returns PromptPinMsgAbstract object pointing to PromptPinMsg1
	 */
	@Override
	public PromptPinMsgAbstract PromptPinMsgObject() {
		return PromptPinMsgObject;
	}
	
	

}
