package vemuri;

public class IdleState implements StateAbstract {

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
	public IdleState(OutputProcessor outputProcessor, MDA mda){

		this.outputProcessor = outputProcessor;
		this.mda = mda;

	}

	/*
	 * invokes PromptPinMsg in outputProcessor
	 * changes state to checkpin
	 */
	@Override
	public boolean Login(){
		outputProcessor.PromptPinMsg();
		mda.changeState(2);
		return true;
	}

	/*
	 * invokes IncorrectIdMsg in outputProcessor
	 * changes state to idle
	 */
	@Override
	public boolean IncorrectLogin(){
		mda.changeState(1);
		outputProcessor.IncorrectIdMsg();
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
