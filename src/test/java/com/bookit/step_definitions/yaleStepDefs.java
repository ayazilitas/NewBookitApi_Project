package com.bookit.step_definitions;

import com.bookit.pages.BasePage;
import com.bookit.pages.YalePages;
import com.bookit.utilities.BrowserUtils;
import com.bookit.utilities.ConfigurationReader;
import com.bookit.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class yaleStepDefs extends BasePage {

       YalePages yalePages=new YalePages();

    @Given("User should go to login page")
    public void user_should_go_to_login_page() {
      String url= ConfigurationReader.get("url");
      Driver.get().get(url);
    }

    @When("User given the username as {string} and password {string}")
    public void userGivenTheUsernameAsAndPassword(String email, String password) {

        yalePages.email.sendKeys(email);
        yalePages.password.sendKeys(password);
        yalePages.signInButton.click();
    }

    @When("User should click the {string} room")
    public void user_should_click_the_room(String string) {

        BrowserUtils.waitForVisibility(yalePages.yaleroom,5);
       // BrowserUtils.waitForClickablility(yalePages.yaleroom,10).click();
       // BrowserUtils.waitForClickablility(yalePages.yaleroom,5).click();

        //yalePages.yaleroom.click();

    }

    @When("User should click the hunt button")
    public void user_should_click_the_hunt_button() {
        yalePages.hunt.click();
    }

    @When("User should clicks the calendar image")
    public void user_should_clicks_the_calendar_image() {

      //  BrowserUtils.waitForClickablility(yalePages.startdate,);
        yalePages.startdate.click();

    }

    @And("User should clicks the year and month button")
    public void userShouldClicksTheYearAndMonthButton() {

        BrowserUtils.waitFor(3);
        yalePages.monthYearBtn.click();

    }
    @And("User Should clicks the <{int}> button")
    public void userShouldClicksTheButton(int arg0) {
        yalePages.Click_Year_Btn(String.valueOf(arg0));

    }
    @And("User should clicks the {string} month")
    public void userShouldClicksTheMonth(String month) {
        yalePages.Click_Month_Btn(month);

    }
    @When("User should selects the day <{int}>")
    public void user_should_selects_the_day(Integer int1) {
        yalePages.Click_Day_Btn(int1);
    }

    @When("User should clicks the start time")
    public void user_should_clicks_the_start_time() {
        yalePages.starttime.click();
    }
    @And("User should select the start time from {string}")
    public void userShouldSelectTheStartTimeFrom(String startTime) {
        yalePages.Click_Start_Time(startTime);
}


    @When("User should clicks the end time")
    public void user_should_clicks_the_end_time() {
      BrowserUtils.waitForClickablility(yalePages.endtime,3);
       yalePages.endtime.click();
    }

    @And("User should selects the end time to {string}")
    public void userShouldSelectsTheEndTimeTo(String endTime) {
        //BrowserUtils.waitFor(2);
        yalePages.Click_End_Time(endTime);

    }



    @When("User should clicks the search button")
    public void user_should_clicks_the_search_button() {
        yalePages.searchButton.click();
    }


    @And("User should clicks the book button for {string} room")
    public void userShouldClicksTheBookButtonForRoom(String roomName) {
        yalePages.Click_Room_To_Book(roomName);
    }

    @When("User should clicks the confirm button")
    public void user_should_clicks_the_confirm_button() {
        yalePages.confirmBtn.click();
    }

    @Then("User should see the yey, you got it text on the page")
    public void user_should_see_the_yey_you_got_it_text_on_the_page() {
      String actualText= yalePages.textMsg.getText();
      String expectedText="yey, you got it";

        Assert.assertEquals(expectedText,actualText);

    }


    @When("user given the username {string} and password {string}")
    public void userGivenTheUsernameAndPassword(String arg0, String arg1) {
    }




//    @And("User should select the start time from <{int}:{int}> am")
//    public void userShouldSelectTheStartTimeFromAm(int arg0, int arg1) {
//
//        yalePages.Click_Start_Time(arg0, arg1);
//  ..  }


}
