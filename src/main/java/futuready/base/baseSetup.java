package futuready.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;
public class baseSetup {
	
	
		//Khai bao
		public static String test_url;
		public static WebDriver driver;
		
		//Function
		public static void wellcome () throws Exception {
			System.out.println("Automated Testing Program");
			System.out.println("Project : Futuready");
			System.out.println("Tester : Minh Thang Tran");
			System.out.println("Company : Itads");
			System.out.println("*************************************");
		}
		
		public static void select_test_server ()throws Exception {
			Scanner scan = new Scanner(System.in);
			System.out.println("Select Test Server >");
			System.out.println("1. Develop");
			System.out.println("2. Stagging");
			System.out.println("3. Product");
			System.out.println("Your choice ? __");
			int selected_server = scan.nextInt();
			if (selected_server == 1) {
				test_url = "https://dev-friends.futuready.co.th/login?url=%2Fdashboard";
				System.out.println(test_url);
			}
			if (selected_server == 2) {
				test_url = "https://stagging-friends.futuready.co.th/login?url=%2Fdashboard";
				System.out.println(test_url);
			}
			if (selected_server == 3) {
				test_url = "https://prod-friends.futuready.co.th/login?url=%2Fdashboard";
				System.out.println(test_url);
			}
			
			 
		}
		
		public void select_test_browser () throws Exception {
		
			Scanner scan = new Scanner(System.in);
			System.out.println("Select your test Browser");
			System.out.println("1. Google Chrome");
			System.out.println("2. Microsoft Edge");
			System.out.println("3. Mozilla Firefox");
			System.out.println("Your Selection _ ");
			int selected_test_browser = scan.nextInt();
			if (selected_test_browser == 1) {
				System.out.println("Chrome is selected");
				start_chrome_driver ();
			}
			if (selected_test_browser == 2) {
				System.out.println("Edge is selected");
				start_edge_driver ();
			}
			if (selected_test_browser == 3) {
				System.out.println("Firefox is selected");
				start_firefox_driver ();
			}
			
		}
		
		public static void main(String[] args) throws Exception {
			wellcome ();
			
		}
		
		public void start_chrome_driver () throws Exception{
			WebDriverManager.chromedriver().setup();
			baseSetup.driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to(test_url);
		}
		
		public void start_edge_driver() throws Exception {
			WebDriverManager.edgedriver().setup();
			baseSetup.driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.navigate().to(test_url);
		}
		
		public  void start_firefox_driver () throws Exception {
			WebDriverManager.firefoxdriver();
			baseSetup.driver = new FirefoxDriver();
			driver.navigate().to(test_url);
		}
}
