package vemuri;

public abstract class FactoryAbstract {
	
	public abstract DatastoreAbstract getDataObject();
	public abstract InitAccountAbstract getInitAccount();
	public abstract IncorrectIdMsgAbstract getIncorrectIdMsgObject();
	public abstract IncorrectPinMsgAbstract getIncorrectPinMsgObject();
	public abstract TooManyAttemptsMsgAbstract TooManyAttemptsMsgObject();
	public abstract DisplayMenuAbstract DisplayMenuObject();
	public abstract MakeDepositAbstract MakeDepositObject();
	public abstract DisplayBalanceAbstract DisplayBalanceObject();
	public abstract MakeWithdrawAbstract MakeWithdrawObject();
	public abstract MakeWithdrawBelowMinBalanceAbstract MakeWithdrawBelowMinBalanceObject();
	public abstract NoFundsMsgAbstract getNoFundsMsgObject();
	public abstract CloseAbstract CloseObject();
	public abstract IncorrectUnlockMsgAbstract IncorrectUnlockMsgObject();
	public abstract IncorrectLockMsgAbstract IncorrectLockMsgObject();
	public abstract PromptPinMsgAbstract PromptPinMsgObject();
	
}
