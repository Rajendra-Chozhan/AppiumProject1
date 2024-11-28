package appiumpackage1;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Test_001 {




	 public static void main(String[] args) throws InterruptedException, IOException
	    {
	 AndroidDriver<MobileElement> driver ;
	 
	 
	 DesiredCapabilities caps = new DesiredCapabilities();

	 caps.setCapability(MobileCapabilityType.DEVICE_NAME,"vivo 1951");
	 caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	 caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
	 caps.setCapability(MobileCapabilityType.APP,"E:\\Appium Notes\\APKs\\hotstar.apk");
	  driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
	
	
	Thread.sleep(10000);
	
	MobileElement tamillanguage = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"in.startv.hotstar.dplus:id/tv_language\" and @text=\"தமிழ்\"]"));
	
	tamillanguage.click();
	Thread.sleep(5000);
	
    MobileElement englishlanguage = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"in.startv.hotstar.dplus:id/tv_language\" and @text=\"English\"]"));
	englishlanguage.click();
    Thread.sleep(5000);
	        

    MobileElement continuebutton = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"in.startv.hotstar.dplus:id/continue_button_text\"]"));
    continuebutton.click();
    Thread.sleep(1000);
    
    MobileElement TV_button = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"in.startv.hotstar.dplus:id/smallLabel\" and @text=\"TV\"]"));
    TV_button.click();
    
    Thread.sleep(1000);
    MobileElement Hotstar_button = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"in.startv.hotstar.dplus:id/bottom_navigation\"]/android.view.ViewGroup/android.widget.FrameLayout[3]/android.view.ViewGroup"));
    Hotstar_button.click();
    
    Thread.sleep(1000);
    
    MobileElement Movies_button = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"in.startv.hotstar.dplus:id/smallLabel\" and @text=\"Movies\"]"));
    Movies_button.click();
    Thread.sleep(1000);
    
    MobileElement Sports_button = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"in.startv.hotstar.dplus:id/smallLabel\" and @text=\"Sports\"]"));
    Sports_button.click();
    
    Thread.sleep(1000);
    
    MobileElement Home_button = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"in.startv.hotstar.dplus:id/largeLabel\"]"));
    Home_button.click();   

    Thread.sleep(1000);
    
    MobileElement Search_button = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Search\"]"));
    Search_button.click();
    
    
    Thread.sleep(1000);
    MobileElement Channels_button = driver.findElement(By.id("in.startv.hotstar.dplus:id/channels"));
    Channels_button.click();
    
    Thread.sleep(3000);
    
    MobileElement Navigateback_button = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‏‏‏‏‏‎‏‎‎‎‏‏‎‏‎‎‎‏‏‎‎‎‏‏‏‏‎‏‎‎‎‎‏‏‎‏‏‎‏‎‎‏‎‎‏‎‎‎‎‎‎‏‎‏‎‎‎‎‏‏‏‎‎‎‎‎Navigate up‎‏‎‎‏‎\"]"));
    Navigateback_button.click();

    Thread.sleep(1000);
	
MobileElement Navigateback1_button = driver.findElement(By.id("in.startv.hotstar.dplus:id/back"));
Navigateback1_button.click();



Thread.sleep(1000);
MobileElement TopMenu_button = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]"));
TopMenu_button.click();


Thread.sleep(1000);

MobileElement KidsSafe_button = driver.findElement(By.xpath("//android.widget.Switch[@resource-id=\"in.startv.hotstar.dplus:id/kid_mode_switch\"]"));
KidsSafe_button.click();


Thread.sleep(1000);



String ScreenshotName = "Test001";
TakesScreenshot ts = (TakesScreenshot) driver; // interface
File source = ts.getScreenshotAs(OutputType.FILE); // method
File target = new File(System.getProperty("user.dir") + "/Screenshots/" +"/Snapshots/" + ScreenshotName + ".png");
FileUtils.copyFile(source, target);
System.out.println("Screenshot taken");

Thread.sleep(3000);


MobileElement Out_of_this_World = driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector()"+ ".textMatches(\"Out of this World"+"\").instance(0))");
Out_of_this_World.click();


System.out.println("Out of World is clicked");


Thread.sleep(3000);

MobileElement ToyStory = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Movie NameToy Story That Time Forgot (Tv Special)\"]"));
ToyStory.click();

Thread.sleep(3000);
MobileElement Play_button = driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"in.startv.hotstar.dplus:id/play\"])[1]"));
Play_button.click();

Thread.sleep(3000);

System.out.println("Script is passed");



	    }}
