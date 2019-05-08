package test.EmployeeDirectory.tests;

import org.testng.asserts.SoftAssert;

import java.io.IOException;

import org.kony.qa.stargate.helpers.SgConfig;
import org.kony.qa.stargate.wrappers.appy.SgCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import test.common.Alerts;
import test.common.AppCalendar;
import test.common.AppElement;
import test.common.Segment;
import test.common.SgConfiguration;
import test.common.ListBox;
import test.EmployeeDirectory.EmployeeDirectoryBaseTest;
import test.EmployeeDirectory.EmployeeDirectoryWidgetId;
import test.EmployeeDirectory.forms.frmHome;
import test.EmployeeDirectory.forms.frmListDetail;

public class LoginTests extends EmployeeDirectoryBaseTest{
	@BeforeMethod
	   public void beforeMethod() throws IOException, Exception {
	       AppElement loginBtnEle = null;
	       AppElement hamburgerIconEle = null;
	       try {
	           loginBtnEle = new AppElement(EmployeeDirectoryWidgetId.getWidgetId("userWidgets_btnLogin"));
	        } catch (Exception e) {
	        	if (loginBtnEle == null)
	            {
	        		hamburgerIconEle=new AppElement(EmployeeDirectoryWidgetId.getWidgetId("userwidgetmodel_btnMenu"));
	        		hamburgerIconEle.click();
	        		frmListDetail.logout();
	       }
	   }
	}
 @Test
	public void LoginTest() throws Exception{
	 try
	 {
		SoftAssert sa = new SoftAssert();
		frmHome.enterUsername("admin@kony.com");
		frmHome.enterPassword("Kony@123");
		frmHome.loginClick();
		frmHome.touchIdCancel();
		sa.assertAll();
	 } catch (Exception e) {
		Assert.fail("Verify " + e.getMessage());
	}
		}
 
 @Test
	public void LoginTestWrongPwd() throws Exception{
	 try
	 {
		SoftAssert sa = new SoftAssert();
		frmHome.enterUsername("admin@kony.com");
		frmHome.enterPassword("Kony@1234");
		frmHome.loginClick();
		Alerts.validateAlertMsg("Login Failed");
		Alerts.acceptAlert();
		sa.assertAll();
	 } catch (Exception e) {
		Assert.fail("Verify " + e.getMessage());
	}
		}
 
 
}