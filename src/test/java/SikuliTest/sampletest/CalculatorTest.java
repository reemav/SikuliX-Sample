package SikuliTest.sampletest;

import org.sikuli.basics.Debug;
import org.sikuli.basics.FileManager;
import org.sikuli.basics.Settings;
import org.sikuli.script.*;

public class CalculatorTest {

	public static void main(String[] args) throws FindFailed {
		// TODO Auto-generated method stub
		Screen s = new Screen();

		ImagePath.setBundlePath("C://Users//Reema.Vishwani//Desktop//sikuliimages");
		
	//	omits .png
		s.find("number8");
		Settings.setShowActions(true);
		s.click("number8");
	
		
		s.find("Multiplyimg");
		s.click("Multiplyimg");
		
		
		s.find("Number3");
		s.click("Number3");
		
		s.find("equalsimg");
		s.click("equalsimg");
		
		s.find("result");
		s.exists("result");
	Debug.on(3);
	Debug.log(1, "Done with test", s);
Settings.UserLogs=true;
Settings.UserLogPrefix="user"	;
	}

}
