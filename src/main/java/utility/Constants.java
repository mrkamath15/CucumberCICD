package utility;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Constants {
  public static final String CONFIG_FILE_PATH = System.getProperty("user.dir") + "/config.properties";
  public static final String DATE_TIME = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss_sss_a").format(new Date());
  public static final String EXTENT_REPORTS_PATH =
    System.getProperty("user.dir") + "/ExtentReports/Extent_Report_" + DATE_TIME + ".html";
}
