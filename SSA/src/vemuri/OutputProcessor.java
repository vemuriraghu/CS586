package vemuri;

public class OutputProcessor {

	FactoryAbstract factory; //factory object
	DatastoreAbstract dataStore; //dataStore object

	/*Constructor for this class
	 * Params: FactoryAbstract
	 * Returns: OutputProcessor Object
	 * Initialized the factory & dataStore objects
	 */
	public OutputProcessor(FactoryAbstract factory){
		this.factory = factory;
		dataStore = factory.getDataObject();
	}


	/*
	 * initThisAccount method to initialize the pin, userID and balance.
	 * Params: none
	 * Gets the corresponding initAccount object from factory
	 * and calls process method to do it.
	 */
	public boolean initThisAccount(){
		InitAccountAbstract InitAccountMethod = factory.getInitAccount(); 
		InitAccountMethod.process(dataStore);
		return true;
	}

	/*
	 * IncorrectIdMsg method to display incorrect ID message.
	 * Params: none
	 * Gets the IncorrectIdMsg object from factory
	 * and calls showMessage method to do it.
	 */
	public boolean IncorrectIdMsg(){
		IncorrectIdMsgAbstract incorrectIdMsg = factory.getIncorrectIdMsgObject();
		incorrectIdMsg.showMessage();
		return true;
	}


	/*
	 * NoFundsMsg method to display lack of funds message.
	 * Params: none
	 * Gets the NoFundsMsg object from factory
	 * and calls showMessage method to do it.
	 */
	public boolean NoFundsMsg(){
		NoFundsMsgAbstract noFundsMsg = factory.getNoFundsMsgObject();
		noFundsMsg.showMessage();
		return true;
	}

	/*
	 * IncorrectPinMsg method to display that entered pin is incorrect.
	 * Params: none
	 * Gets the IncorrectPinMsg object from factory
	 * and calls showMessage method to do it.
	 */
	public boolean IncorrectPinMsg(){
		IncorrectPinMsgAbstract incorrectPinMsg = factory.getIncorrectPinMsgObject();
		incorrectPinMsg.showMessage();
		return true;
	}

	/*
	 * TooManyAttemptsMsg method to display that too many attempts for pin
	 * Params: none
	 * Gets the TooManyAttemptsMsg object from factory
	 * and calls showMessage method to do it.
	 */
	public boolean TooManyAttemptsMsg(){
		TooManyAttemptsMsgAbstract tooManyAttempts = factory.TooManyAttemptsMsgObject();
		tooManyAttempts.showMessage();
		return true;
	}

	/*
	 * DisplayMenu method to display the menu
	 * Params: none
	 * Gets the DisplayMenu object from factory
	 * and calls displayMenu method to do it.
	 */
	public boolean DisplayMenu(){
		DisplayMenuAbstract displayMenu = factory.DisplayMenuObject();
		displayMenu.displayMenu();
		return true;
	}

	/*
	 * MakeDeposit method to process the deposit request
	 * Params: none
	 * Gets the MakeDeposit object from factory
	 * and calls process method to do it.
	 */
	public boolean MakeDeposit(){
		MakeDepositAbstract makeDeposit = factory.MakeDepositObject();
		makeDeposit.process(dataStore);
		return true;
	}

	
	/*
	 * DisplayBalance method to display the balance
	 * Params: none
	 * Gets the displayBalance object from factory
	 * and calls displayBalance method to do it.
	 */
	public boolean DisplayBalance(){
		DisplayBalanceAbstract displayBalance = factory.DisplayBalanceObject();
		displayBalance.displayBalance(dataStore);
		return true;
	}


	/*
	 * MakeWithdraw method to process the withdraw request
	 * Params: none
	 * Gets the makeWithdraw object from factory
	 * and calls process method to do it.
	 */
	public boolean MakeWithdraw(){
		MakeWithdrawAbstract makeWithdraw = factory.MakeWithdrawObject();
		makeWithdraw.process(dataStore);
		return true;
	}

	/*
	 * MakeWithdrawBelowMinBalance method to process the withdraw request
	 * when balance is below minimum
	 * Params: none
	 * Gets the MakeWithdrawBelowMinBalance object from factory
	 * and calls process method to do it.
	 */
	public boolean MakeWithdrawBelowMinBalance(){
		MakeWithdrawBelowMinBalanceAbstract makeWithdraw = factory.MakeWithdrawBelowMinBalanceObject();
		makeWithdraw.process(dataStore);
		return true;
	}

	/*
	 * Close method to process the Close account request
	 * Params: none
	 * Gets the close object from factory
	 * and calls process method to do it.
	 */
	public void Close(){
		CloseAbstract close = factory.CloseObject();
		close.process();
	}

	/*
	 * IncorrectUnlockMsg method to display incorrect unlock msg
	 * during unlock process
	 * Params: none
	 * Gets the IncorrectUnlockMsg object from factory
	 * and calls showMessage method to do it.
	 */
	public boolean IncorrectUnlockMsg(){
		IncorrectUnlockMsgAbstract incorrectUnlockMsg = factory.IncorrectUnlockMsgObject();
		incorrectUnlockMsg.showMessage();
		return true;
	}

	/*
	 * IncorrectLockMsg method to display incorrect lock msg
	 * during lock process
	 * Params: none
	 * Gets the IncorrectLockMsg object from factory
	 * and calls showMessage method to do it.
	 */
	public boolean IncorrectLockMsg(){
		IncorrectLockMsgAbstract incorrectLockMsg = factory.IncorrectLockMsgObject();
		incorrectLockMsg.showMessage();
		return true;
	}

	/*
	 * PromptPinMsg method to display msg asking for pin
	 * Params: none
	 * Gets the PromptPinMsg object from factory
	 * and calls showMessage method to do it.
	 */
	public boolean PromptPinMsg() {
		PromptPinMsgAbstract promptPinMsg = factory.PromptPinMsgObject();
		promptPinMsg.showMessage();
		return true;
	}

}
