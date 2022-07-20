package com.bookit.pages;

import com.bookit.utilities.BrowserUtils;
import com.bookit.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class YalePages {
     public YalePages(){
         PageFactory.initElements(Driver.get(),this);
     }

    @FindBy(name="email")
    public WebElement email;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(xpath = "//button[.='sign in']")
    public WebElement signInButton;

    @FindBy(xpath = "//span[.='yale']")
    public WebElement yaleroom;

    @FindBy(xpath ="//a[.='hunt'] ")
    public WebElement hunt;

    @FindBy(xpath = "//button[@class='mat-calendar-period-button mat-button']")
    public WebElement monthYearBtn;

    @FindBy(xpath = "//div[@class='mat-form-field-suffix ng-tns-c18-0 ng-star-inserted' ]")
    public WebElement startdate;

    @FindBy(xpath = "//span[.='from']")
    public WebElement starttime;

    @FindBy(xpath = "(//span[.='to' ])[1] ")
    public WebElement endtime;

    @FindBy(xpath = "//span[.='search' ]")
    public WebElement searchButton;

    @FindBy(xpath = " //button[.='confirm']")
    public WebElement confirmBtn;

    @FindBy(xpath = "//h1[.='yey, you got it']")
    public WebElement textMsg;



    public void Click_Year_Btn (String yearBtn){

        WebElement element = Driver.get().findElement(By.xpath("//div[.='"+yearBtn+"']"));
        BrowserUtils.waitForClickablility(element,5);
        element.click();


    }
     public void Click_Month_Btn(String MonthBtn){

        WebElement element=Driver.get().findElement(By.xpath("//div[.='"+MonthBtn+"']"));
        BrowserUtils.waitForClickablility(element,3);
        element.click();
     }

     public void Click_Day_Btn(int dayBtn){

        WebElement element=Driver.get().findElement(By.xpath("//div[.='"+dayBtn+"']"));
         BrowserUtils.waitForClickablility(element,3);
         element.click();
     }

     public void Click_Start_Time(String startTime){

        WebElement element=Driver.get().findElement(By.xpath("//span[.=' "+startTime+" ']"));
        BrowserUtils.waitForClickablility(element,2);
        element.click();
     }
    public void Click_End_Time(String endTime){

        BrowserUtils.waitFor(2);
        try{
        WebElement element=Driver.get().findElement(By.xpath(" //span[.=' 10:00am '] "));
        BrowserUtils.waitForClickablility(element,3);
        element.click();

    }
    catch (org.openqa.selenium.StaleElementReferenceException ex)
    {
        WebElement element2=Driver.get().findElement(By.xpath(" //span[.=' 10:00am '] "));
        BrowserUtils.waitForClickablility(element2,3);
        element2.click();
    }

}
public void Click_Room_To_Book(String roomName) {
 BrowserUtils.waitFor(2);
    List<WebElement> rooms = Driver.get().findElements(By.xpath("//div[@class='column is-one-third ng-star-inserted']"));
        String target = "yale";
    for (WebElement room : rooms) {
        //System.out.println("room.getText() = " + room.getText());

        if (room.getText().contains(target)) {
          //  System.out.println("target = " + target);
            Driver.get().findElement(By.xpath("//*[@id=\"mat-tab-content-0-1\"]/div/div[2]/app-available-rooms/div/div[3]/div/footer/div/button")).click();

        }
    }

}

}
