package test.EmployeeDirectory.forms;

import test.common.AppCalendar;
import test.common.AppElement;
import test.common.Segment;
import test.common.SgConfiguration;
import test.common.ListBox;
import test.EmployeeDirectory.EmployeeDirectoryWidgetId;

public class frmListDetail {


  public frmListDetail() throws Exception {
  AppElement lblHeader=new AppElement(EmployeeDirectoryWidgetId.getWidgetId("frmListDetail_frmListDetail"));
  }

  public static String getFirstEmpName() throws Exception {
		String EventLandingTitle;
		AppElement firstEventTitle = null;
		Segment segSplashEvents = new Segment(EmployeeDirectoryWidgetId.getWidgetId("frmListDetail_segEmployees"),
					EmployeeDirectoryWidgetId.getWidgetId("segRowTemplate_empname"));
		firstEventTitle = segSplashEvents.getElementWithIndex(0);
		EventLandingTitle = firstEventTitle.getText();
		firstEventTitle.click();
		return EventLandingTitle;
	}
  public static void hamburgerMenuClick() throws Exception{
	  AppElement hamburgerBtn= new AppElement(EmployeeDirectoryWidgetId.getWidgetId("userwidgetmodel_btnMenu"));
	  hamburgerBtn.click();
  }
  
  public static void directoryMenuClick() throws Exception{
	  AppElement menu= new AppElement(EmployeeDirectoryWidgetId.getWidgetId("userwidgetmodel_flxmenu0"));
	  menu.click();
  }
  public static void colleaguesMenuClick() throws Exception{
	  AppElement menu= new AppElement(EmployeeDirectoryWidgetId.getWidgetId("userwidgetmodel_flxmenu1"));
	  menu.click();
  }
  public static void msgsMenuClick() throws Exception{
	  AppElement menu= new AppElement(EmployeeDirectoryWidgetId.getWidgetId("userwidgetmodel_flxmenu2"));
	  menu.click();
  }
  public static void eventsMenuClick() throws Exception{
	  AppElement menu= new AppElement(EmployeeDirectoryWidgetId.getWidgetId("userwidgetmodel_flxmenu3"));
	  menu.click();
  }
  public static void settingsMenuClick() throws Exception{
	  AppElement menu= new AppElement(EmployeeDirectoryWidgetId.getWidgetId("userwidgetmodel_flxmenu4"));
	  menu.click();
  }
  public static String getHeaderText() throws Exception{
	  AppElement header= new AppElement(EmployeeDirectoryWidgetId.getWidgetId("userwidgetmodel_lblHeader"));
	  return header.getText();
  }
  public static frmHome logout() throws Exception{ 
	  AppElement logoutBtn=new AppElement(EmployeeDirectoryWidgetId.getWidgetId("userWidgets_flxBotom"));
	  logoutBtn.click();
	  return new frmHome();
	  }
  public static String getDeatilsEmpName() throws Exception{
	  AppElement empName= new AppElement(EmployeeDirectoryWidgetId.getWidgetId("userwidgetmodel_lblEmployeeName"));
	  return empName.getText();
  }
  public static void detailsBackClick() throws Exception{
	  AppElement back= new AppElement(EmployeeDirectoryWidgetId.getWidgetId("userwidgetmodel_imgBack"));
	  back.click();
  }
  public static void filterBtnClick() throws Exception{
	  AppElement filter= new AppElement(EmployeeDirectoryWidgetId.getWidgetId("userwidgetmodel_imgFilter"));
	  filter.click();
  }
  public static void selectFilterOptions() throws Exception{
	  AppElement Deptmnt= new AppElement(EmployeeDirectoryWidgetId.getWidgetId("userwidgetmodel_lblflxOptionsmenu00"));
	  Deptmnt.click();
	  AppElement desHdr= new AppElement(EmployeeDirectoryWidgetId.getWidgetId("userwidgetmodel_flxHeaderDatamenu0"));	  
	  desHdr.click();
	  AppElement Desg= new AppElement(EmployeeDirectoryWidgetId.getWidgetId("userwidgetmodel_lblflxOptionsmenu16"));
	  Desg.click();
  }
  public static void applyFilterBtnClick() throws Exception{
	  AppElement apply= new AppElement(EmployeeDirectoryWidgetId.getWidgetId("userwidgetmodel_btnClick"));
	  apply.click();
  }
  public static String getFirstDesgnation() throws Exception {
		String EventLandingDesgnatn;
		AppElement firstEventDesgnatn = null;
		Segment segSplashEvents = new Segment(EmployeeDirectoryWidgetId.getWidgetId("frmListDetail_segEmployees"),
					EmployeeDirectoryWidgetId.getWidgetId("segRowTemplate_designation"));
		firstEventDesgnatn = segSplashEvents.getElementWithIndex(0);
		EventLandingDesgnatn = firstEventDesgnatn.getText();
		//firstEventTitle.click();
		return EventLandingDesgnatn;
	}
  public static boolean checkLocVisibility() throws Exception{	  
	  AppElement form= new AppElement(EmployeeDirectoryWidgetId.getWidgetId("frmListDetail_frmListDetail"));
	  form.swipeUp();
	  AppElement empLocFlx= new AppElement(EmployeeDirectoryWidgetId.getWidgetId("userwidgetmodel_locationFlex"));
	  return empLocFlx.isElementVisible();
  }
  public static void search(String text) throws Exception{
	  AppElement tbxSearch= new AppElement(EmployeeDirectoryWidgetId.getWidgetId("userwidgetmodel_tbxSearch"));
	  tbxSearch.click();
	  tbxSearch.type(text);
  }
  public static String getFirstDepartment() throws Exception {
		String EventLandingDesgnatn;
		AppElement firstEventDeprtmnt = null;
		Segment segSplashEvents = new Segment(EmployeeDirectoryWidgetId.getWidgetId("frmListDetail_segEmployees"),
					EmployeeDirectoryWidgetId.getWidgetId("segRowTemplate_department"));
		firstEventDeprtmnt = segSplashEvents.getElementWithIndex(0);
		EventLandingDesgnatn = firstEventDeprtmnt.getText();		
		return EventLandingDesgnatn;
	}
  public static void searchCancel() throws Exception{
	  AppElement cancelBtn= new AppElement(EmployeeDirectoryWidgetId.getWidgetId("userwidgetmodel_btnSearchCancel"));
	  cancelBtn.click();
  }
  public static frmKnowledgeFramework KFClick() throws Exception{
	  AppElement KFBtn= new AppElement(EmployeeDirectoryWidgetId.getWidgetId("userwidgetmodel_btnKFclicked"));
	  KFBtn.click();
	  return new frmKnowledgeFramework();
  }
  
}