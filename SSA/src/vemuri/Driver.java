package vemuri;

import java.util.Scanner;

public class Driver {


	public static int tryParse(String text) {
		try {
			return Integer.parseInt(text);
		} catch (NumberFormatException e) {
			return -1;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean firstRun = true;
		Scanner sc = new Scanner(System.in);
		int choice = -1;

		System.out.println("Press enter to start: ");
		sc.nextLine();


		do{

			if(firstRun){
				firstRun = false;

				System.out.println("*************CS586-Project**************");
				System.out.println("Please choose an account to proceed");
				System.out.println("\n\t\t\t1. Account-1");
				System.out.println("\t\t\t2. Account-2");

				System.out.println("\n\nPlease enter 1 to access Account-1 or enter 2 to access Account-2");
				System.out.print("your choice:");

			}
			else{

				System.out.println("Please enter a VALID input.");
				System.out.println("Enter 1 to access Account-1\nEnter 2 to access Account-2");
				System.out.println("Enter 0 to quit");
				System.out.print("your choice:");
			}

			choice = tryParse(sc.next());

			if(choice == 0){
				sc.close();
				System.out.println("Exiting.........");
				try {
					Thread.sleep(700);                 //1000 milliseconds is one second.
				} catch(InterruptedException ex) {
					Thread.currentThread().interrupt();
				}
				System.exit(0);
			}

		}while(!(choice == 1 || choice == 2));


		if(choice == 1){

			FactoryAbstract factory = new FactoryAccount1();

			OutputProcessor outProcessor = new OutputProcessor(factory);
			MDA mda = new MDA(outProcessor);
			//DatastoreAbstract data = factory.getDataObject();

			Account1 account1 = new Account1(factory,mda);

			System.out.println("\t\t**********************Account-1**********************");

			System.out.println("\n\t\t******************MENU of Operations*****************");

			System.out.println("Select any operation from below:");

			System.out.println("\t0. open(String, String, float)");
			System.out.println("\t1. login(String)");
			System.out.println("\t2. pin(String)");
			System.out.println("\t3. deposit(float)");
			System.out.println("\t4. withdraw(float)");
			System.out.println("\t5. balance()");
			System.out.println("\t6. logout()");
			System.out.println("\t7. lock(String)");
			System.out.println("\t8. unlock(String)");
			System.out.println("\t9. quit()");	

			System.out.print("your choice:");

			choice =  -1;
			firstRun = true;
			while(true){
				if(firstRun){
					firstRun = false;
				}
				else{

					System.out.println("\n0.open  1.login  2.pin  3.deposit  "
							+ "4.withdraw  5.balance  6.logout  7.lock  8.unlock  9.quit");
					System.out.print("your choice:");
				}

				choice =  tryParse(sc.next());

				switch(choice){

				case 0:
					//System.out.println("\t You chose open(String, String, float)");

					System.out.println("Enter value for Pin(String): ");
					String pin = sc.next();
					//System.out.println(pin);

					System.out.println("Enter value for UserId(String): ");
					String userId = sc.next();
					//System.out.println(userId);

					System.out.println("Enter value for Balance(float): ");
					String balance = sc.next();
					//System.out.println(balance);

					account1.open(pin, userId, Float.parseFloat(balance));

					break;

				case 1:
					//System.out.println("\t You chose login(String)");

					System.out.println("Enter value for UserId(String): ");
					String y = sc.next();
					//System.out.println(y);

					account1.login(y);
					break;

				case 2:
					//System.out.println("\t You chose pin(String)");

					System.out.println("Enter value for pin(String): ");
					String pn = sc.next();
					//System.out.println(pn);

					account1.pin(pn);
					break;

				case 3:
					//System.out.println("\t You chose deposit(float)");

					System.out.println("Enter value for amount(float): ");
					String d = sc.next();
					//System.out.println(d);

					account1.deposit(Float.parseFloat(d));
					break;

				case 4:
					//System.out.println("\t You chose withdraw(float)");

					System.out.println("Enter value for amount(float): ");
					String w = sc.next();
					//System.out.println(w);

					account1.withdraw(Float.parseFloat(w));
					break;

				case 5:
					//System.out.println("\t You chose balance()");

					//System.out.println("Available balance is: ");
					account1.balance();
					break;

				case 6:
					//System.out.println("\t You chose logout()");

					//System.out.println("you're being logged out....");
					account1.logout();
					break;

				case 7:
					//System.out.println("\t You chose lock(String)");

					System.out.println("Enter value for pin(String): ");
					String l = sc.next();
					//System.out.println(l);

					account1.lock(l);
					break;

				case 8:
					//System.out.println("\t You chose unlock(String)");

					System.out.println("Enter value for pin(String): ");
					String ul = sc.next();
					//System.out.println(ul);

					account1.unlock(ul);
					break;

				case 9:
					sc.close();
					System.out.println("Exiting.........");
					try {
						Thread.sleep(700);                 //1000 milliseconds is one second.
					} catch(InterruptedException ex) {
						Thread.currentThread().interrupt();
					}
					System.exit(0);



				}
			}

		}
		else{
			
			FactoryAbstract factory = new FactoryAccount2();

			OutputProcessor outProcessor = new OutputProcessor(factory);
			MDA mda = new MDA(outProcessor);
			//DatastoreAbstract data = factory.getDataObject();

			Account2 account2 = new Account2(factory,mda);
			
			System.out.println("\t\t**********************Account-2**********************");

			System.out.println("\n\t\t******************MENU of Operations*****************");

			System.out.println("Select any operation from below:");

			System.out.println("\t0. OPEN (int, int, int)");
			System.out.println("\t1. LOGIN(int) ");
			System.out.println("\t2. PIN(int) ");
			System.out.println("\t3. DEPOSIT(int)");
			System.out.println("\t4. WITHDRAW(int)");
			System.out.println("\t5. BALANCE()");
			System.out.println("\t6. LOGOUT()");
			System.out.println("\t7. suspend()");
			System.out.println("\t8. activate()");
			System.out.println("\t9. close()");		      
			System.out.println("\t10.quit()");	

			System.out.print("your choice:");

			choice =  -1;
			firstRun = true;
			
			while(true){

				if(firstRun){
					firstRun = false;
				}
				else{

					System.out.println("\n0.OPEN  1.LOGIN  2.PIN  3.DEPOSIT  "
							+ "4.WITHDRAW  5.BALANCE  6.LOGOUT  7.suspend  8.activate  9.close  10.quit");
					System.out.print("your choice:");
				}

				choice =  tryParse(sc.next());


				switch(choice){

				case 0:

					System.out.println("Enter value for Pin(int): ");
					String pin = sc.next();

					System.out.println("Enter value for UserId(int): ");
					String userId = sc.next();
					
					System.out.println("Enter value for Balance(int): ");
					String balance = sc.next();

					account2.OPEN(Integer.parseInt(pin), Integer.parseInt(userId), Integer.parseInt((balance)));
					
					break;

				case 1:
					System.out.println("Enter value for UserId(int): ");
					String y = sc.next();
					account2.LOGIN(Integer.parseInt(y));
					
					break;

				case 2:

					System.out.println("Enter value for pin(int): ");
					String p = sc.next();
					
					account2.PIN(Integer.parseInt(p));
					
					break;

				case 3:
					System.out.println("\t You chose DEPOSIT(int)");

					System.out.println("Enter value for amount(int): ");
					String d = sc.next();
					
					account2.DEPOSIT(Integer.parseInt(d));
					
					break;

				case 4:
					System.out.println("\t You chose WITHDRAW(int)");

					System.out.println("Enter value for amount(int): ");
					String w = sc.next();
					
					account2.WITHDRAW(Integer.parseInt(w));
					
					break;

				case 5:
					
					account2.BALANCE();
					break;
					
				case 6:
					System.out.println("\t You chose LOGOUT()");
					account2.LOGOUT();
					break;
					
				case 7:
					System.out.println("\t You chose suspend()");
					account2.suspend();
					break;
					
					
				case 8:
					System.out.println("\t You chose activate()");
					account2.activate();
					break;
					
				case 9:
					System.out.println("\t You chose close()");
					account2.close();
					break;
					
				case 10:
					System.out.println("Exiting.........");
					try {
						Thread.sleep(700);                 //1000 milliseconds is one second.
					} catch(InterruptedException ex) {
						Thread.currentThread().interrupt();
					}
					sc.close();
					System.exit(0);
					break;

				}
			}
		}



	}//Main End

}
