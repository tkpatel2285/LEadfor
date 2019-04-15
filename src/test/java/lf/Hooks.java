package lf;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BasePage  {
  AllBrowser browser = new AllBrowser();

    @Before
    public void setUp() {
     chrome_Driver();
      //browser.Brw();
    }


    @After

    public void afterMethod(){

        driver.quit();
    }
//    public void after(ITestResult result)
    {
//        if (ITestResult.FAILURE == result.getStatus())
//        {
//            try
//            {
//                TakesScreenshot ts = (TakesScreenshot) driver;
//                File source = ts.getScreenshotAs(OutputType.FILE);
//                FileUtils.copyFile(source, new File("src\\test\\Resources\\Screenshot" + result.getName() + ".png"));
//                System.out.println("Screenshot taken");
//            }
//            catch (Exception e)
//            {
//                System.out.println("exception while taking Screenshot " + e.getMessage());
//            }
//
//        }


    }}







