package test.EmployeeDirectory.forms;

import test.common.AppCalendar;
import test.common.AppElement;
import test.common.Segment;
import test.common.ListBox;
import test.EmployeeDirectory.EmployeeDirectoryWidgetId;

public class frmHome {


  public frmHome() throws Exception {
  AppElement lblHeader=new AppElement(EmployeeDirectoryWidgetId.getWidgetId("frmHome_frmHome"));
  }

  public static void enterUsername(String text) throws Exception{
	  AppElement usrname=new AppElement(EmployeeDirectoryWidgetId.getWidgetId("userWidgets_tbxUsername"));
	  usrname.type(text);
	  }
  public static void enterPassword(String text) throws Exception{
	  AppElement pwd=new AppElement(EmployeeDirectoryWidgetId.getWidgetId("userWidgets_tbxPassword"));
	  pwd.type(text);
	  }
  public static void loginClick() throws Exception{ 
	  AppElement btnLogin=new AppElement(EmployeeDirectoryWidgetId.getWidgetId("userWidgets_btnLogin"));
	  btnLogin.click();
	  Thread.sleep(8000);
	  }
  public static frmListDetail touchIdCancel() throws Exception{ 
	  AppElement btnCancel=new AppElement(EmployeeDirectoryWidgetId.getWidgetId("userWidgets_btnCancel"));
	  btnCancel.click();
	  return new frmListDetail();
	  }
  
}