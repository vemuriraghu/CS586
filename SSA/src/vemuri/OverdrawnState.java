package vemuri;

public class OverdrawnState implements StateAbstract {
	
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
	public OverdrawnState(OutputProcessor outputProcessor, MDA mda){
		
		this.outputProcessor = outputProcessor;
		this.mda = mda;
		
	}
	
	/*
	 * invokes DisplayBalance in outputProcessor
	 */
	public boolean Balance(){
		outputProcessor.DisplayBalance();
		return true;
	}
	
	/*
	 * invokes NoFundsMsg in outputProcessor
	 */
	public boolean Withdraw(){
		outputProcessor.NoFundsMsg();
		return true;
	}
	
	/*
	 * invokes MakeDeposit in outputProcessor
	 * changes state to intermediate
	 */
	public boolean Deposit(){
		outputProcessor.MakeDeposit();
		mda.changeState(5);
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
	 * changes state to locked
	 */
	public boolean Lock(){
		mda.changeState(6);
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
	 * unsupported operation in current state
	 */
	@Override
	public boolean Login() {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * unsupported operation in current state
	 */
	@Override
	public boolean IncorrectLogin() {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * unsupported operation in current state
	 */
	@Override
	public boolean IncorrectPin() {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * unsupported operation in current state
	 */
	@Override
	public boolean TooManyattempts() {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * unsupported operation in current state
	 */
	@Override
	public boolean CorrectPinAboveMin() {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * unsupported operation in current state
	 */
	@Override
	public boolean CorrectPinBelowMin() {
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
