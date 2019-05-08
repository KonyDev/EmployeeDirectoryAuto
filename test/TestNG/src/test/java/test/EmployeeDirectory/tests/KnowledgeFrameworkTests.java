package test.EmployeeDirectory.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import test.EmployeeDirectory.EmployeeDirectoryWidgetId;
import test.EmployeeDirectory.forms.frmHome;
import test.EmployeeDirectory.forms.frmKnowledgeFramework;
import test.EmployeeDirectory.forms.frmListDetail;
import test.common.AppElement;

public class KnowledgeFrameworkTests {
	@BeforeMethod
    public void beforeMethod() {
           AppElement loginBtnEle = null;
           try {
               loginBtnEle = new AppElement(EmployeeDirectoryWidgetId.getWidgetId("userWidgets_btnLogin"));
               frmHome.enterUsername("admin@kony.com");
       		frmHome.enterPassword("Kony@123");
       		frmHome.loginClick();
       		frmHome.touchIdCancel();
            } catch (Exception e) {
                System.out.println("already in ListDetail page");
           }
       }
	
	@Test
	 public void validatekFBtnClick() throws Exception{
		try
		 {
		 SoftAssert sa= new SoftAssert();
		 frmListDetail.KFClick();
		 sa.assertEquals(frmKnowledgeFramework.getKFHeader(), "Key Features");
		 sa.assertEquals(frmKnowledgeFramework.getKFRow1data(), "Object Services");
		 sa.assertEquals(frmKnowledgeFramework.getKFRow2data(), "Components");
		 frmKnowledgeFramework.closeKF();
		 sa.assertAll();
		 } catch (Exception e) {
				Assert.fail("Verify " + e.getMessage());
			}
	 }
	
	@Test
	 public void validatekFObjServ() throws Exception{
		try
		 {
		 SoftAssert sa= new SoftAssert();
		 frmListDetail.KFClick();
		 frmKnowledgeFramework.clickKFRow1();
		 sa.assertEquals(frmKnowledgeFramework.getKFHeader(), "Object Services");
		 frmKnowledgeFramework.closeKF();
		 sa.assertAll();
		 } catch (Exception e) {
				Assert.fail("Verify " + e.getMessage());
			}
	 }
	@Test
	 public void validatekFComp() throws Exception{
		try
		 {
		 SoftAssert sa= new SoftAssert();
		 frmListDetail.KFClick();
		 frmKnowledgeFramework.clickKFRow2();
		 sa.assertEquals(frmKnowledgeFramework.getKFHeader(), "Components");
		 frmKnowledgeFramework.closeKF();
		 sa.assertAll();
		 } catch (Exception e) {
				Assert.fail("Verify " + e.getMessage());
			}
	 }
}
