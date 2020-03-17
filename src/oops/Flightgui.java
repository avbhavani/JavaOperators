package oops;

public interface Flightgui {   // interface class doesn't have main method

	
	String flightname = "gui"; // // variables declared in Interface are by default static and final
	int x = 100;
	// by defalut the methods are converted to abstract without using abstract keyword

	 public void bookFlight();
	 
	 public  void searchFlight();
	 
	 public void reSchedule();
	 
	 public void payment();
	 public void  done();
	 public void payed();

}
