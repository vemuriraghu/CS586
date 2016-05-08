package vemuri;

public interface StateAbstract {

	boolean Open();

	boolean Login();

	boolean IncorrectLogin();

	boolean IncorrectPin();

	boolean TooManyattempts();

	boolean CorrectPinAboveMin();

	boolean CorrectPinBelowMin();

	boolean Logout();

	boolean Deposit();

	boolean Balance();

	boolean Withdraw();

	boolean AboveMinBalance();

	boolean WithdrawBelowMinBalance();

	boolean BelowMinBalance();

	boolean NoFunds();

	boolean IncorrectLock();

	boolean Lock();

	boolean Unlock();

	boolean IncorrectUnlock();

	boolean Suspend();

	boolean Activate();

	boolean Close();	
	
}
