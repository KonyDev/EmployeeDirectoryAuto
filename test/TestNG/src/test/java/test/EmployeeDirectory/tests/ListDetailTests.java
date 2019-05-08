package test.EmployeeDirectory.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import test.EmployeeDirectory.EmployeeDirectoryWidgetId;
import test.EmployeeDirectory.forms.frmHome;
import test.EmployeeDirectory.forms.frmListDetail;
import test.common.Alerts;
import test.common.AppElement;

public class ListDetailTests {
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
                System.out.println("already in listdetails page");
           }
       }
	@Test	  
	 public void test_MenuDirectory() throws Exception{
		try
		 {
		 SoftAssert sa= new SoftAssert();
		 frmListDetail.hamburgerMenuClick();
		 frmListDetail.directoryMenuClick();
		 sa.assertEquals(frmListDetail.getHeaderText(), "Directory");
		 sa.assertAll();
		 } catch (Exception e) {
				Assert.fail("Verify " + e.getMessage());
			}
	 }
	@Test	  
	 public void test_MenuColleagues() throws Exception{
		try
		 {
		 SoftAssert sa= new SoftAssert();
		 frmListDetail.hamburgerMenuClick();
		 frmListDetail.colleaguesMenuClick();
		 Alerts.validateAlertMsg("Colleagues");
		 Alerts.acceptAlert();
		 frmListDetail.hamburgerMenuClick();
		 sa.assertAll();
		 } catch (Exception e) {
				Assert.fail("Verify " + e.getMessage());
			}
	 }
	@Test	  
	 public void test_MenuMessages() throws Exception{
		try
		 {
		 SoftAssert sa= new SoftAssert();
		 frmListDetail.hamburgerMenuClick();
		 frmListDetail.msgsMenuClick();
		 Alerts.validateAlertMsg("Messages");
		 Alerts.acceptAlert();
		 frmListDetail.hamburgerMenuClick();
		 sa.assertAll();
		 } catch (Exception e) {
				Assert.fail("Verify " + e.getMessage());
			}
	 }
	@Test	  
	 public void test_MenuEvents() throws Exception{
		try
		 {
		 SoftAssert sa= new SoftAssert();
		 frmListDetail.hamburgerMenuClick();
		 frmListDetail.eventsMenuClick();
		 Alerts.validateAlertMsg("Events");
		 Alerts.acceptAlert();
		 frmListDetail.hamburgerMenuClick();
		 sa.assertAll();
		 } catch (Exception e) {
				Assert.fail("Verify " + e.getMessage());
			}
	 }
	@Test	  
	 public void test_MenuSettings() throws Exception{
		try
		 {
		 SoftAssert sa= new SoftAssert();
		 frmListDetail.hamburgerMenuClick();
		 frmListDetail.settingsMenuClick();
		 Alerts.validateAlertMsg("Settings");
		 Alerts.acceptAlert();
		 frmListDetail.hamburgerMenuClick();
		 sa.assertAll();
		 } catch (Exception e) {
				Assert.fail("Verify " + e.getMessage());
			}
	 }
	
	@Test	  
	 public void EmployeeCheck() throws Exception{
		try
		 {
		 SoftAssert sa= new SoftAssert();
		 String empName=frmListDetail.getFirstEmpName();
		 String empDetailsName=frmListDetail.getDeatilsEmpName();
		 frmListDetail.detailsBackClick();
		 sa.assertEquals(empName, empDetailsName);		 
		 sa.assertAll();
		 } catch (Exception e) {
				Assert.fail("Verify " + e.getMessage());
			}
	 }
	@Test	  
	 public void FilterValidation() throws Exception{
		try
		 {
		 SoftAssert sa= new SoftAssert();
		 frmListDetail.filterBtnClick();
		 frmListDetail.selectFilterOptions();
		 frmListDetail.applyFilterBtnClick();
		 String empDesgnation=frmListDetail.getFirstDesgnation();
		 sa.assertEquals(empDesgnation, "Senior Project Manager");		 
		 sa.assertAll();
		 } catch (Exception e) {
				Assert.fail("Verify " + e.getMessage());
			}
	 }
	
	@Test	  
	 public void srollDetailsScreen() throws Exception{
		try
		 {
		 SoftAssert sa= new SoftAssert();
		 frmListDetail.getFirstEmpName();
		 boolean locVisiblibility=frmListDetail.checkLocVisibility();
		 frmListDetail.detailsBackClick();
		 sa.assertEquals(locVisiblibility, true);
		
		 sa.assertAll();
		 } catch (Exception e) {
				Assert.fail("Verify " + e.getMessage());
			}
	 }
	
	@Test	  
	 public void searchByDepartmnt() throws Exception{
		try
		 {
		 SoftAssert sa= new SoftAssert();
		 frmListDetail.search("Product Management");
		 String Department=frmListDetail.getFirstDepartment();
		 frmListDetail.searchCancel();
		 sa.assertEquals(Department, "Product Management");
		 sa.assertAll();
		 } catch (Exception e) {
				Assert.fail("Verify " + e.getMessage());
			}
	 }
	@Test	  
	 public void searchByEmpname() throws Exception{
		try
		 {
		 SoftAssert sa= new SoftAssert();
		 frmListDetail.search("Edwards");
		 String empName=frmListDetail.getFirstEmpName();
		 frmListDetail.detailsBackClick();
		 frmListDetail.searchCancel();
		 sa.assertEquals(empName, "Dawn Edwards");
		 sa.assertAll();
		 } catch (Exception e) {
				Assert.fail("Verify " + e.getMessage());
			}
	 }
}
