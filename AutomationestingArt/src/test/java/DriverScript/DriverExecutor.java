package DriverScript;

import Config.UIActionKeywords;
import Utility.ExcelUtits;
	
public class DriverExecutor {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String spath ="C:\\Users\\elcot\\Desktop\\LoginFB.xlsx";
		ExcelUtits.SetExcelFile(spath,"Data");
		
		for (int iRow=1;iRow<=7;iRow++) {
			String sActionKeyword = ExcelUtits.getCellData(iRow,3);
			
			if(sActionKeyword.equals("openBrowser"))
			{
				UIActionKeywords.openBrowser();
			}
			else if(sActionKeyword.equals("navigate"))
			{
				UIActionKeywords.navigate();
			}
			else if(sActionKeyword.equals("enterEmail"))
			{
				UIActionKeywords.enterEmail();
			}
			else if(sActionKeyword.equals("enterPassword"))
			{
				UIActionKeywords.enterPassswsord();
			}
			else if(sActionKeyword.equals("clickLogIn"))
			{
				UIActionKeywords.clickLogin();
			}
			else if(sActionKeyword.equals("applywait"))
			{
				UIActionKeywords.applyWait();
			}
			else if(sActionKeyword.equals("CloseBrowser"))
			{
				UIActionKeywords.closeBowser();
			}
			
			
		}
		

	}

}
