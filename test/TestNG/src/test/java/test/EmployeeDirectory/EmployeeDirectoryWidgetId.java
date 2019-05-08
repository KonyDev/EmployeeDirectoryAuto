package test.EmployeeDirectory;

import java.io.IOException;

import test.common.SgConfiguration;
import test.common.WidgetID;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class EmployeeDirectoryWidgetId {
	static WidgetID widgetIds;
	FileInputStream widconfig;
    private static EmployeeDirectoryWidgetId widconf;
    
	protected EmployeeDirectoryWidgetId()
	{
		try {
			widconfig = new FileInputStream("mobileWidgetId.properties");
			Properties props = new Properties();
			props.load(widconfig);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public static EmployeeDirectoryWidgetId getInstance(){
		if (widconf != null)
			return widconf;
		widconf = new EmployeeDirectoryWidgetId();
		return widconf;
	}
	
	public static String getWidgetId(String key) throws Exception,IOException{
		if(widgetIds==null){
			if(SgConfiguration.getInstance().getKeyValue("Device").equalsIgnoreCase("Tablet"))
				widgetIds = new WidgetID("tabletWidgetId.properties");
			else if(SgConfiguration.getInstance().getKeyValue("Device").equalsIgnoreCase("Mobile")||SgConfiguration.getInstance().getKeyValue("Device").equalsIgnoreCase("Phone") )
				widgetIds = new WidgetID("mobileWidgetId.properties");
			else if(SgConfiguration.getInstance().getKeyValue("Device").equalsIgnoreCase("Desktop"))
				widgetIds = new WidgetID("desktopWidgetId.properties");
		}
			
		return widgetIds.getWidgetId(key);
	}

}