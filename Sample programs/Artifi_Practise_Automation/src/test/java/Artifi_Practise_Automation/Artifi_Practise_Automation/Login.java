package Artifi_Practise_Automation.Artifi_Practise_Automation;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import package_artifi.LoginArtifi;

public class Login {
	
	LoginArtifi loginpage;
	
	@Test(priority=0)
	@Parameters({"browser","URL"})
	public void openBrowser(String browser,String URL){
		
		Invoke.openBrowser(browser,URL);
		System.out.println("Browser is opened");
		
		
		
	}
	

}
