package SikuliTest.sampletest;

import org.sikuli.basics.Debug;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Screen;

public class skypeSampleTest {

	public static void main(String[] args) throws FindFailed {
		// TODO Auto-generated method stub
		Screen s = new Screen();

		ImagePath.setBundlePath("C://Users//Reema.Vishwani//Desktop//sikuliimages");
	

		s.find("skypefrbuisnessLogo.PNG");
		s.click("skypefrbuisnessLogo.PNG");
		
		s.find("CaptureEmail.PNG");
		s.type("rvishwani@parkar.consulting");
		
		s.find("signInbutton.PNG");
		s.click("signInbutton.PNG");	
		
		s.find("AfterSignIn.PNG");
		s.click("AfterSignIn.PNG");
		
		s.find("SignOut.PNG");
		s.click("SignOut.PNG");
		
		
		Debug.log(2, "Done with test", s);
	}

}
