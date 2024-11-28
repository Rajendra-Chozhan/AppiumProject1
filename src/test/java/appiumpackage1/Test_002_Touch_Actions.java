package appiumpackage1;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import static io.appium.java_client.touch.TapOptions.tapOptions;





public class Test_002_Touch_Actions {
	


	 public static void main(String[] args) throws InterruptedException, IOException
	    {
	 AndroidDriver<MobileElement> driver ;
	 
	 
	 DesiredCapabilities caps = new DesiredCapabilities();
	 caps.setCapability(MobileCapabilityType.UDID,"fbeeb7ea");
	 caps.setCapability(MobileCapabilityType.DEVICE_NAME,"vivo 1951");
	 caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	 caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
	 caps.setCapability(MobileCapabilityType.APP,"E:\\Appium Notes\\APKs\\snapdeal.apk");

	driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
	
	
	Thread.sleep(5000);
	
	MobileElement English_language = driver.findElement(By.xpath("//android.widget.TextView[@text=\"English\"]"));
	
	English_language.click();
	Thread.sleep(5000);
	
        

   MobileElement continuebutton = driver.findElement(By.id("com.snapdeal.main:id/bottom_content_container"));
   continuebutton.click();
   Thread.sleep(4000);
   
   MobileElement category_button = driver.findElement(By.id("//android.widget.TextView[@text=\"Category\"]"));
   category_button.click();
   Thread.sleep(4000);
   
   
   // Tap Action Performed
   
   
 AndroidElement Kids_button = (AndroidElement) driver.findElement(By.id("android:id/text1"));
 

   
   
   AndroidTouchAction touch = new AndroidTouchAction(driver);
   
   touch.tap(TapOptions.tapOptions().withElement(ElementOption.element(Kids_button))).perform();
   
   Thread.sleep(1000);
   
   
   // Long Press 
   
  // MobileElement TV_button = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"in.startv.hotstar.dplus:id/smallLabel\" and @text=\"TV\"]"));
       
   
   //LongPressOptions longpress = new LongPressOptions();
   
   
  //  longpress.withDuration(Duration.ofSeconds(5)).withElement(ElementOption.element(TV_button));
 
   
   
   // Swipe
   
   // Get the size of screen.
   Dimension size = driver.manage().window().getSize();
   System.out.println(size);
   
// Find swipe x points from screen's with and height.
   // Find x1 point which is at right side of screen.
   int x1 = (int) (size.width * 0.20);
   // Find x2 point which is at left side of screen.
   int x2 = (int) (size.width * 0.80);
   
   // Create object of TouchAction class.
   TouchAction action = new TouchAction(driver);

   // Find element to swipe from right to left.
  
   
   //MobileElement swipeelement = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"in.startv.hotstar.dplus:id/titleTV\" and @text=\"Hockey\"]"));
   AndroidElement swipelement = (AndroidElement) driver.findElementByAccessibilityId("Show NameSiragadikka Aasai, Season1, Episode354");	   
   action.longPress(ElementOption.element(swipelement)).moveTo(ElementOption.element(swipelement, x1, 580)).release().perform();

   Thread.sleep(5000);
           
   // Create swipe action chain and perform horizontal(right to left) swipe.
   // Here swipe to point x1 Is at left side of screen. So It will swipe element
   // from right to left.
   
   
   driver.quit();
   
   System.out.println("Test Case Passed");
   
   
   
   
	    }

}
