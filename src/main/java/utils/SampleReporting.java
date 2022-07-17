package utils;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReporting {
	
	@Test
	public void generateReport() {
		
		// start report
		ExtentReports report = new ExtentReports("./reports/Result.html", false);
		
		// start test
		ExtentTest test = report.startTest("TC005", "To verify IRCTC Registration for the new user sign up");
		
		test.assignAuthor("Sudha");
		
		test.assignCategory("Functional");
		
		// log test steps
		test.log(LogStatus.PASS	, "The application got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The application got launched with the given url successfully");
		
		// end test
		report.endTest(test);
		
		// end report
		report.flush();
		
		
		
	}

}
