package oops;
public class Flightchild implements Flightgui{ // we are using implements keyword to call interface methods 

	public void login()
	{
		System.out.println("loginto the application ");	
	}

	public void bookFlight() {
		  System.out.println("loginto the application bookFlight");		
	}

	public void searchFlight() {
		System.out.println("search a flight");	
		}

	public void reSchedule() {
		System.out.println("reSchedule a light");
			
	}

	public void payment() {
		System.out.println("do the payment");	
	}
		
	public static void main(String[] args) {
		
		Flightchild obj= new Flightchild();
		obj.login();
		obj.searchFlight();       //1. one way of calling interface methods with object
		obj.bookFlight();
		obj.reSchedule();
		obj.payment();
		obj.done();
			obj.payment();
		//2.another way of calling methods// but it will call only the methods class flightgui has, it will not call 
		//local methods declared in this class
		/*Flightgui rv1; // creating reference variable for flightgui
		rv1 = obj;   // coonecting/assgining reference variable to obj
	   rv1.bookFlight(); // now rv1 works as obj and calling all the methods
	   rv1.searchFlight();
	   rv1.reSchedule();
	   rv1.payment();
	   */
	   // 3.another way is 
	   Flightgui rv1 = new Flightchild();
	   rv1.searchFlight();
	   rv1.bookFlight();
	   rv1.payment();
		
		
	
		}

	@Override
	public void done() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void payed() {
		// TODO Auto-generated method stub
		
	}
		
		
	}


