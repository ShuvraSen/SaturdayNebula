package singleton;

public class Theory {
	/*
	  When we have a overloaded constructor , it become hard to manage.
	Singleton ensures that only one instance is created and shared, avoiding unnecessary
object creation.


Singleton: a java singleton class is a class that can have only one object
	   (an instance of the class) at a time. 
	 provides a global access point to it.

Private Constructor – 

 Static Instance – static instance gives us a advantages to call that without 
 object creation.

 A public static method (getInstance()) is used to provide global access to 
 single instance.

Instance Check – 



private static WebDriver driver; // private static instance

    private SetupDrivers() {
        // private constructor to prevent external instantiation
    }

    // Method to initialize and provide global access to the single WebDriver instance
    public static WebDriver getDriver() {
        if (driver == null) {
            // Ensures driver is created only once
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--disable-notifications");
            driver = new ChromeDriver(options); // create the WebDriver instance if it doesn't exist
        }
        return driver; // returns the single instance
    }

    // Method to close the WebDriver instance
    public static void tearDownDriver() {
        if (driver != null) {
            driver.quit(); // or driver.close() based on your needs
            driver = null; // Nullify the instance to allow garbage collection
        }
WebDriverManager.chromedriver().setup(); WebDriverManager makes 
it easier to use ChromeDriver by handling all the setup for you, 
so you don't have to worry about manual configuration.

ChromeOptions options = new ChromeOptions();
ChromeOptions is used to set up how the browser should behave, 
like whether it should start maximized or disable notifications
	 */
	

}
