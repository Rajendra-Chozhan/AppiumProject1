package appiumpackage1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class AutomationWithSauceLabs {

	public static void main(String[] args) throws MalformedURLException{
	
		
		MutableCapabilities caps = new MutableCapabilities();
		caps.setCapability("platformName", "Android");
		caps.setCapability("appium:app", "storage:filename=shopclues-3-6-57.apk");  // The filename of the mobile app
		caps.setCapability("appium:deviceName", "Galaxy F41");
		caps.setCapability("appium:automationName", "UiAutomator2");
		
		MutableCapabilities sauceOptions = new MutableCapabilities();
		sauceOptions.setCapability("build", "Test Build");
		sauceOptions.setCapability("name", "Saucelabs First Test");
		caps.setCapability("sauce:options", sauceOptions);
		
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("https://mobiledemomail1:e923d90f-034a-46d8-9df9-281d99998670@ondemand.eu-central-1.saucelabs.com:443/wd/hub"), caps);
		
		try {
			driver.findElementByXPath("//android.widget.Button[@text='Allow']").click();
		} catch (Exception e) {
			System.out.println("Popup not displayed");
		}
		
		
		AndroidElement accountElement = driver.findElementByXPath("//android.widget.TextView[@text='Account']");
		
		//Tap
		AndroidTouchAction acc = new AndroidTouchAction(driver);
		acc.tap(TapOptions.tapOptions().withElement(ElementOption.element(accountElement))).perform();
		
		String text = driver.findElementById("com.shopclues:id/rl_normal_login").getText();
		System.out.println(text);
		
		AndroidElement wishListElement = driver.findElementById("com.shopclues:id/tv_bottom_nav_wishlist");
		
		acc.tap(TapOptions.tapOptions().withElement(ElementOption.element(wishListElement))).perform();
		
		
		System.out.println("Execution completed");
		driver.quit();

	}

}
