package pages;

import driverHelper.DriverHelper;
import org.openqa.selenium.By;


public class HomePage extends DriverHelper {

    public void onHomePage(){
        driver.findElement(By.id("consent_prompt_submit")).click();
        java.lang.String title = driver.getTitle();
        System.out.println(title);
       // assertEquals("Argos | Order online today for fast home delivery", title);
    }

    public void selectOptions(String option){
        // a[data-name="ev_cmsComponentLoad"]
        commonMethods.items((java.lang.String) option,"a[data-name='ev_cmsComponentLoad']");
    }
}
