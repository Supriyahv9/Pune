package Practice;



import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class Xml {
	
	//XmlTest is class from testng 
	//test is the parameter
	
	@Test
	public void getdataFromXmlTest(XmlTest test) {
		
		System.out.println(test.getParameter("browser"));
	}
	

}
