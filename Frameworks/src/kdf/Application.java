package kdf;
//hi hello pari

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import utils.GenericMethods;

public class Application {
	@Test
	public void verifyInvalidLogin() throws IOException
	{
		String[][] data = GenericMethods.getData("C:\\Users\\Krunal\\Desktop\\parinda\\Book1.xlsx"
				+ "", "Sheet1");
		for (int i=1 ; i<data.length ; i++) {
			switch(data[i][3]) {
			case "OpenBrowser":
				Methods.openBrowser();
				break;
			case "maxBrowser":	
				Methods.maxBrowser();
				break;	
			case "impWait":
				Methods.implicitWait();
				break;
			case "navigateToAUT":
				Methods.navigateToApp(data [i][6]);
				break;

			case "EnterUserID":
				Methods.enterUserid(data[i][5], data[i][6]);
				break;
			case "enterpassword":
				Methods.enterPassWord(data[i][5],data[i][6]);
				break;
			case "clicksignin":
				Methods.signIn(data[i][4],data[i][5]);
				break;
			case "verifyMessage":
				String actualMsg = Methods.errorMsg(data[i][5]);
				Assert.assertEquals(actualMsg,data[i][6]);
				break;
			case "closeappliction":
				Methods.closeApp();
				break;

			}


		}

	}

}
