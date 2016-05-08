package vemuri;

public class CheckPinState implements StateAbstract {
	
	/*
	 * variables to hold pointers to OutputProcessor & MDA
	 */
	OutputProcessor outputProcessor;  
	MDA mda;
	
	/*
	 * constructor
	 * params: OutputProcessor, MDA
	 * Initializes the outputProcessor & mda objects with
	 * passed parameters
	 */
	public CheckPinState(OutputProcessor outputProcessor, MDA mda){
		
		this.outputProcessor = outputProcessor;
		this.mda = mda;
	}
	
	/*
	 * Invokes IncorrectPinMsg in the output processor
	 */
	public boolean IncorrectPin(){
		outputProcessor.IncorrectPinMsg();
		return true;
	}
	
	/*
	 * Invokes TooManyAttemptsMsg in the output processor
	 * changes state to idle
	 */
	public boolean TooManyattempts(){
		mda.changeState(1);
		outputProcessor.TooManyAttemptsMsg();
		return true;
		
	}
	
	/*
	 * Invokes DisplayMenu in the output processor
	 * changes state to ready
	 */
	public boolean CorrectPinAboveMin(){
		mda.changeState(3);
		outputProcessor.DisplayMenu();
		return true;
		
	}
	
	/*
	 * Invokes DisplayMenu in the output processor
	 * changes state to overdrawn
	 */
	public boolean CorrectPinBelowMin(){
		mda.changeState(4);
		outputProcessor.DisplayMenu();
		return true;
		
	}
	
	/*
	 * changes state to idle
	 */
	public boolean Logout(){
		System.out.println("logging out...");
		mda.changeState(1);
		return true;
	}

	/*
	 * unsupported operation in current state
	 */
	@Override
	public boolean Open() {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * Invokes PromptPinMsg in the output processor
	 */
	@Override
	public boolean Login() {
		outputProcessor.PromptPinMsg();
		//mda.changeState(2);
		return true;
	}

	/*
	 * unsupported operation in current state
	 */
	@Override
	public boolean IncorrectLogin() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Deposit() {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * unsupported operation in current state
	 */
	@Override
	public boolean Balance() {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * unsupported operation in current state
	 */
	@Override
	public boolean Withdraw() {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * unsupported operation in current state
	 */
	@Override
	public boolean AboveMinBalance() {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * unsupported operation in current state
	 */
	@Override
	public boolean WithdrawBelowMinBalance() {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * unsupported operation in current state
	 */
	@Override
	public boolean BelowMinBalance() {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * unsupported operation in current state
	 */
	@Override
	public boolean NoFunds() {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * unsupported operation in current state
	 */
	@Override
	public boolean IncorrectLock() {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * unsupported operation in current state
	 */
	@Override
	public boolean Lock() {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * unsupported operation in current state
	 */
	@Override
	public boolean Unlock() {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * unsupported operation in current state
	 */
	@Override
	public boolean IncorrectUnlock() {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * unsupported operation in current state
	 */
	@Override
	public boolean Suspend() {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * unsupported operation in current state
	 */
	@Override
	public boolean Activate() {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * unsupported operation in current state
	 */
	@Override
	public boolean Close() {
		// TODO Auto-generated method stub
		return false;
	}
}
