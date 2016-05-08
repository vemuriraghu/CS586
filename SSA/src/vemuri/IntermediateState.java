package vemuri;

public class IntermediateState implements StateAbstract {

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
	public IntermediateState(OutputProcessor outputProcessor, MDA mda){
		this.outputProcessor = outputProcessor;
		this.mda = mda;
	}
	
	/*
	 * changes state to ready
	 */
	public boolean AboveMinBalance(){
		mda.changeState(3);
		return true;
	}
	
	/*
	 * changes state to overdrawn
	 */
	public boolean BelowMinBalance(){
		mda.changeState(4);
		return true;
	}
	
	/*
	 * invokes MakeWithdrawBelowMinBalance in outputProcessor
	 * changes state to overdrawn
	 */
	public boolean WithdrawBelowMinBalance(){
		outputProcessor.MakeWithdrawBelowMinBalance();
		mda.changeState(4);
		return true;
	}
	
	/*
	 * unsupported operation in current state
	 */
	public boolean Lock(){
		return false;
	}
	
	/*
	 * unsupported operation in current state
	 */
	public boolean LogOut(){
		return false;
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
