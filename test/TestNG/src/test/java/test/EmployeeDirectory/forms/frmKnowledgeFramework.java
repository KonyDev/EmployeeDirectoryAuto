package test.EmployeeDirectory.forms;

import test.common.AppCalendar;
import test.common.AppElement;
import test.common.Segment;
import test.common.ListBox;
import test.EmployeeDirectory.EmployeeDirectoryWidgetId;

public class frmKnowledgeFramework {


  public frmKnowledgeFramework() throws Exception {
  AppElement lblHeader=new AppElement(EmployeeDirectoryWidgetId.getWidgetId("frmKnowledgeFramework_frmKnowledgeFramework"));
  }
  public static String getKFHeader() throws Exception{
	  AppElement flxHeader=new AppElement(EmployeeDirectoryWidgetId.getWidgetId("userwidgetmodel_lblHeading"));
	  return flxHeader.getText();
  }
  public static String getKFRow1data() throws Exception{
	  Segment segKF = new Segment(EmployeeDirectoryWidgetId.getWidgetId("frmKnowledgeFramework_sgmtAPI"),
				EmployeeDirectoryWidgetId.getWidgetId("tmpSegAPI_lblNameOfAPI"));
	  AppElement frstRow=segKF.getElementWithIndex(0);
	  return frstRow.getText();
  }
  public static String getKFRow2data() throws Exception{
	  Segment segKF = new Segment(EmployeeDirectoryWidgetId.getWidgetId("frmKnowledgeFramework_sgmtAPI"),
				EmployeeDirectoryWidgetId.getWidgetId("tmpSegAPI_lblNameOfAPI"));
	  AppElement secRow=segKF.getElementWithIndex(1);
	  return secRow.getText();
  }
  public static frmListDetail closeKF() throws Exception{
	  AppElement btnClose=new AppElement(EmployeeDirectoryWidgetId.getWidgetId("userwidgetmodel_btnClose"));
	  btnClose.click();
	  return new frmListDetail();
  }
  public static void clickKFRow1() throws Exception{
	  Segment segKF = new Segment(EmployeeDirectoryWidgetId.getWidgetId("frmKnowledgeFramework_sgmtAPI"),
				EmployeeDirectoryWidgetId.getWidgetId("tmpSegAPI_lblNameOfAPI"));
	  AppElement frstRow=segKF.getElementWithIndex(0);
	  frstRow.click();
  }
  public static void clickKFRow2() throws Exception{
	  Segment segKF = new Segment(EmployeeDirectoryWidgetId.getWidgetId("frmKnowledgeFramework_sgmtAPI"),
				EmployeeDirectoryWidgetId.getWidgetId("tmpSegAPI_lblNameOfAPI"));
	  AppElement secRow=segKF.getElementWithIndex(1);
	  secRow.click();
  }

}