package stepdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	 @Before
	    public void beforeAny() {
//	        System.out.println(" Start Scenario: " + Scenario.class.getName());
		 System.out.println("========================");
		 System.out.println(" Start of Scenario: ");
		 System.out.println("************************");
		 
		 
	    }

	    @After
	    public void afterAny() {
//	        System.out.println(" End of Scenario: " + Scenario.class.getName());
	    	 System.out.println("************************");
			 System.out.println(" End of Scenario: ");
			 System.out.println("========================");
	    }
}

