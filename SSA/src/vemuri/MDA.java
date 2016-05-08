package vemuri;

public class MDA {

	StateAbstract states[]; // Array to store all available states
	StateAbstract currentState; // varible to maintain current state
	OutputProcessor outProcessor; //output processsor object
	int attempts; //variable to maintain attemtps. 
	
	/*Constructor for this class
	 * Params: OutputProcessor
	 * Returns: OutputProcessor Object
	 * Initialized all the state objects and loads them into the array
	 * Initialized attempts to 0
	 */
	public MDA(OutputProcessor outProcessor){
		
		this.outProcessor = outProcessor;
		 
		states = new StateAbstract[8];
		states[0] = new StartState(outProcessor, this);
		states[1] = new IdleState(outProcessor, this);
		states[2] = new CheckPinState(outProcessor, this);
		states[3] = new ReadyState(outProcessor, this);
		states[4] = new OverdrawnState(outProcessor, this);
		states[5] = new IntermediateState(outProcessor, this);
		states[6] = new LockedState(outProcessor, this);
		states[7] = new SuspendedState(outProcessor, this);
		
		currentState = states[0];
		attempts = 0;
		
	}
	
	/*changeState method to transition between states
	 * Params: stateIndex, indicating the state to transition into
	 * 
	 */
	public boolean changeState(int stateIndex) {
		
		currentState = states[stateIndex];
		return true;
		
	}
	
	/*Open method to Open the account.
	 * Params: none
	 * Invokes Open method of the current state
	 */
	public boolean Open(){
		currentState.Open();
		return true;
	}

	/*Login method to Login into the account.
	 * Params: none
	 * Invokes Login method of the current state
	 */
	public boolean Login(){
		attempts = 0;
		currentState.Login();
		return true;
	}
	
	/*IncorrectLogin method to handle wrong login into the account.
	 * Params: none
	 * Invokes IncorrectLogin method of the current state
	 */
	public boolean IncorrectLogin(){
		currentState.IncorrectLogin();
		return true;
	}

	/*IncorectPin method to handle incorrent pin entry
	 * Params: none
	 * Invokes IncorectPin method of the current state
	 * verified if current attempt is under permissible limit
	 * else calls method to display too many attempts message
	 */
	public boolean IncorectPin(int maxPermissibleAttempts){
		attempts++;
		currentState.IncorrectPin();
		
		if(attempts == maxPermissibleAttempts){
			attempts = 0;
			currentState.TooManyattempts();
		}
		else if(currentState != states[1]){
			currentState.Login();
		}
		
		return true;
	}
	
	/*CorrectPinAboveMin method to indicate pin entry is correct and balance is above min
	 * Params: none
	 * Invokes CorrectPinAboveMin method of the current state
	 */
	public boolean CorrectPinAboveMin(){
		currentState.CorrectPinAboveMin();
		return true;
	}
	
	/*CorrectPinBelowMin method to indicate pin entry is correct and balance is below min
	 * Params: none
	 * Invokes CorrectPinBelowMin method of the current state
	 */
	public boolean CorrectPinBelowMin(){
		currentState.CorrectPinBelowMin();
		return true;
	}
	
	/*Logout method to handle Logout request.
	 * Params: none
	 * Invokes Logout method of the current state
	 */
	public boolean Logout(){
		currentState.Logout();
		return true;
	}
	
	/*Deposit method to handle Deposit request.
	 * Params: none
	 * Invokes Deposit method of the current state
	 */
	public boolean Deposit(){
		currentState.Deposit();
		return true;
	}
	
	/*Balance method to handle Balance request.
	 * Params: none
	 * Invokes Balance method of the current state
	 */
	public boolean Balance(){
		currentState.Balance();
		return true;
	}

	/*Withdraw method to handle Withdraw request.
	 * Params: none
	 * Invokes Withdraw method of the current state
	 */
	public boolean Withdraw(){
		currentState.Withdraw();
		return true;
	}
	
	/*AboveMinBalance method
	 * Params: none
	 * Invokes AboveMinBalance method of the current state
	 */
	public boolean AboveMinBalance(){
		currentState.AboveMinBalance();
		return true;
	}

	/*WithdrawBelowMinBalance method to handle withdraw request while balance is below min.
	 * Params: none
	 * Invokes WithdrawBelowMinBalance method of the current state
	 */
	public boolean WithdrawBelowMinBalance(){
		currentState.WithdrawBelowMinBalance();
		return true;
	}
	
	/*BelowMinBalance method .
	 * Params: none
	 * Invokes BelowMinBalance method of the current state
	 */
	public boolean BelowMinBalance(){
		currentState.BelowMinBalance();
		return true;
	}

	/*NoFunds method to dislplay NoFunds message
	 * Params: none
	 * Invokes NoFunds method of the current state
	 */
	public boolean NoFunds(){
		currentState.NoFunds();
		return true;
	}

	/*Lock method to handle lock request
	 * Params: none
	 * Invokes Lock method of the current state
	 */
	public boolean Lock(){
		currentState.Lock();
		return true;
	}

	/*IncorrectLock method to handle lock request with incorrect pin
	 * Params: none
	 * Invokes IncorrectLock method of the current state
	 */
	public boolean IncorrectLock(){
		currentState.IncorrectLock();
		return true;
	}

	/*Unlock method to handle unlock request with correct pin
	 * Params: none
	 * Invokes Unlock method of the current state
	 */
	public boolean Unlock(){
		currentState.Unlock();
		return true;
	}

	/*IncorrectUnlock method to handle lock request with incorrect pin
	 * Params: none
	 * Invokes IncorrectUnlock method of the current state
	 */
	public boolean IncorrectUnlock(){
		currentState.IncorrectUnlock();
		return true;
	}

	/*Suspend method to handle Suspend request
	 * Params: none
	 * Invokes Suspend method of the current state
	 */
	public boolean Suspend(){
		currentState.Suspend();
		return true;
	}

	/*Activate method to handle Activate request which activates suspended account
	 * Params: none
	 * Invokes Activate method of the current state
	 */
	public boolean Activate(){
		currentState.Activate();
		return true;
	}

	/*Close method to handle Close request
	 * Params: none
	 * Invokes Close method of the current state
	 */
	public boolean Close(){
		currentState.Close();
		return true;
	}



}
