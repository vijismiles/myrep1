package iiq1.iiq1_test;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



//import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.Select;

//import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import helpers.DataHelpers;
//import step_definitions.Hooks;

public class step_def_createreq {
	 // public WebDriver driver;
	    public List<HashMap<String,String>> datamap;

	public step_def_createreq() {
		//driver = Hooks.driver;
     	datamap = DataHelpers.data(System.getProperty("user.dir")+"//src//test//resources//testDatat/IIQData.xlsx","Sheet1");
	}

	public int a,index;
	
	@Given("^I get the (\\d+)$")
	public void i_get_the(int arg1) throws Throwable {
		  index =arg1-1;
	        System.out.println("Printing current data set...");
	        for(HashMap h:datamap)
	        {
	            //System.out.println(h.keySet());
	            //System.out.println(h.values());
	        }
	     System.out.println((datamap.get(index).get("S.No")));
		//return index;
	        
	    
	 	}
	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition() throws Throwable {
		System.out.print("test1");

	}

	@Given("^some other precondition$")
	public void some_other_precondition() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("^I complete action$")
	public void i_complete_action() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("^some other action$")
	public void some_other_action() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("^yet another action$")
	public void yet_another_action() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^check more outcomes \"([^\"]*)\"$")
	public void check_more_outcomes(String arg1) throws Throwable {
			      //  Select subjectHeading = new Select(driver.findElement(By.id("id_contact")));
	       // subjectHeading.selectByVisibleText(datamap.get(index).get("heading"));

	        System.out.println((datamap.get(index).get("S.No")));
	        System.out.println((datamap.get(index).get("applicationname")));
	        System.out.println((datamap.get(index).get("Provisioning method")));
	        System.out.println((datamap.get(index).get("SOD Policy")));
	        System.out.println((datamap.get(index).get("entitlements")));
        System.out.println((datamap.get(index).get("Roles")));
        System.out.println((datamap.get(index).get("Tasks")));
	        System.out.println((datamap.get(index).get("Model")));
	        System.out.println((datamap.get(index).get("EO/RO")));
	        System.out.println((datamap.get(index).get("SEO/SRO")));
	        System.out.println((datamap.get(index).get("Provisioner")));
	        //driver.findElement(By.id("email")).sendKeys(datamap.get(index).get("email"));
	        //driver.findElement(By.id("id_order")).sendKeys(datamap.get(index).get("order_reference"));
	        //driver.findElement(By.id("message")).sendKeys(datamap.get(index).get("message"));
	        //driver.findElement(By.id("submitMessage")).sendKeys(datamap.get(index).get("message"));
	    
	}

	@Given("^I am on the home Page$")
	public void i_am_on_the_home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("^I navigate to Application page$")
	public void i_navigate_to_Application_page() throws Throwable {
	    
		System.out.println((datamap.get(index).get("applicationname")));
	}

	@Given("^I search for application$")
	public void i_search_for_application() throws Throwable {
      //  System.out.println((datamap.get(index).get("applicationname")));   
	}

	@Then("^I click on application and open the application$")
	public void i_click_on_application_and_open_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^I click on Configuration$")
	public void i_click_on_Configuration() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^i click on Test connection$")
	public void i_click_on_Test_connection() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^I validate Test Connection$")
	public void i_validate_Test_Connection() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^I run aggregation task$")
	public void i_run_aggregation_task() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^I validate aggregation task result$")
	public void i_validate_aggregation_task_result() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

@Then("^I get the row number as \"([^\"]*)\"$")
public void i_get_the_row_number_as(String arg1) throws Throwable {
    System.out.println(arg1);
}

    @Given("^I submit a req with entitlements$")
    public void i_submit_a_req_with_entitlements() throws Throwable {
        
        System.out.println((datamap.get(index).get("applicationname")));
     
        
 
        if (!(datamap.get(index).get("entitlements")).equals("null")){
        	System.out.println((datamap.get(index).get("entitlements")));
        }
        
        
    }

    @Given("^I fill the form$")
    public void i_fill_the_form() throws Throwable {
    	if (!(datamap.get(index).get("Provisioning form")).equals("No")){
    		System.out.println((datamap.get(index).get("Provisioning form")));
    		System.out.println((datamap.get(index).get("Prov form Data")));
    		
    	}
 
}
}

