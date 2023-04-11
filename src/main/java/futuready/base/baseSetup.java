package futuready.base;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
		public String tester_name = "Minh Thang Tran";
		public String  tester_mail = "thang.tran@itads.net";
		public String company = "Itads.Co,ltd";
		//Function
		public String get_current_date () throws Exception {
			 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
			 LocalDateTime now = LocalDateTime.now();  
			 System.out.println(dtf.format(now));  
			 String output_date_time = dtf.format(now);
			 return output_date_time;
		}
		public String get_root_directory () throws Exception {
			String dir = System.getProperty("user.dir");
			System.out.println(dir);
			return dir;
		}
		
		public String get_directory_of_testing_files () throws Exception {
			String directory = get_root_directory();
			String files_directory = directory + "\\Images\\aaa.jpg";
			System.out.println(files_directory);
			return files_directory;
		}
		
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
