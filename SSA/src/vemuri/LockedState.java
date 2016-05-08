package vemuri;

public class LockedState implements StateAbstract {
	
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
	public LockedState(OutputProcessor outputProcessor, MDA mda){
		this.outputProcessor = outputProcessor;
		this.mda = mda;
	}
	
	/*
	 * changes state to ready
	 */
	public boolean Unlock(){
		mda.changeState(3);
		return true;
	}
	
	/*
	 * invokes IncorrectUnlockMsg in outputProcessor
	 */
	public boolean IncorrectUnlock(){
		outputProcessor.IncorrectUnlockMsg();
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
	public boolean Logout() {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * unsupported operation in current state
	 */
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
