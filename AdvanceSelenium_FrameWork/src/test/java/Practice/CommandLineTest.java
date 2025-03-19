package Practice;

import org.testng.annotations.Test;

public class CommandLineTest {
	
	@Test
	public void getDataFromCommandLine() {
		
		//to get run time parameter from commandline
		String BROWSER = System.getProperty("browser");
		System.out.println("browser---"+BROWSER);
		
	}

}
