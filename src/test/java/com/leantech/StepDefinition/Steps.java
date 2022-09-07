package com.leantech.StepDefinition;

import com.leantech.Pages.Base;
import com.leantech.Pages.ItemInformationPage;
import com.leantech.Pages.TvPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

   Base base = new Base();
   TvPage tvPage = new TvPage();
   ItemInformationPage informationPage = new ItemInformationPage();
 

   @Given("^I am in the aws page$")
   public void i_am_in_the_aws_page() throws Throwable {
      base.openDriver();
      base.openAws();

   }

   @When("^I search in the hamburger menu tv appliances electronics$")
   public void i_search_in_the_hamburger_menu_tv_appliances_electronics() throws Throwable {
      base.goHamburgerMenu();
   }

   @When("^I select televisions option$")
   public void i_select_televisions_option() throws Throwable {
      base.goSelectTelevision();      
      tvPage.selectSamsung();   
   

   }

   @When("^I select second highest priced item of the samsung brand$")
   public void i_select_second_highest_priced_item_of_the_samsung_brand() throws Throwable {
      tvPage.sortItems();

   }

   @Then("^I verify the information about this item$")
   public void i_verify_the_information_about_this_item() throws Throwable {
      informationPage.verifyItem();
      base.closeDriver();

   }
  

}
