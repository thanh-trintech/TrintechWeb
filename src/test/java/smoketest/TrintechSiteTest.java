package smoketest;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TrintechSiteTest {
	private WebDriver driver;
	static String driverpath = "src/test/resources/webdrivers/";

	
	
  @Test
  public void trintechMainTest() throws Throwable {
	  driver.get("http://www.trintech.com");
	  
	  //Homepage
	  TimeUnit.SECONDS.sleep(2);
	  String homeTitle = driver.getTitle();
	  Assert.assertTrue(homeTitle.equals("Your Financial Processes, Transformed | Trintech, Inc."));
	  System.out.println("I am on the Trintech homepage");
	  
	  //Reconciliation
	  driver.findElement(By.xpath("//*[@id='body']/main/section[1]/div/div[2]/div[1]/div[2]/div/div/a[1]")).click();
	  TimeUnit.SECONDS.sleep(2);
	  String reconciliationHeader = driver.findElement(By.xpath("//*[@id='home-slide-1']/div[1]/h2")).getText();
	  Assert.assertTrue(reconciliationHeader.equals("Account Reconciliation"));
	  System.out.println("I am at Account Reconciliation");
	  driver.findElement(By.xpath("//*[@id='home-slide-1']/div[1]/h2/button")).click();
	  TimeUnit.SECONDS.sleep(2);
	  
	  //Close
	  driver.findElement(By.xpath("//*[@id='body']/main/section[1]/div/div[2]/div[1]/div[2]/div/div/a[2]")).click();
	  TimeUnit.SECONDS.sleep(2);
	  String closeHeader = driver.findElement(By.xpath("//*[@id='home-slide-2']/div[1]/h2")).getText();
	  Assert.assertTrue(closeHeader.equals("Close"));
	  System.out.println("I am at Close");
	  driver.findElement(By.xpath("//*[@id='home-slide-2']/div[1]/h2/button")).click();
	  TimeUnit.SECONDS.sleep(2);
	  
	  //Compliance
	  driver.findElement(By.xpath("//*[@id='body']/main/section[1]/div/div[2]/div[1]/div[2]/div/div/a[5]")).click();
	  TimeUnit.SECONDS.sleep(2);
	  String complianceHeader = driver.findElement(By.xpath("//*[@id='home-slide-3']/div[1]/h2")).getText();
	  Assert.assertTrue(complianceHeader.equals("Compliance"));
	  System.out.println("I am at Compliance");
	  driver.findElement(By.xpath("//*[@id='home-slide-3']/div[1]/h2/button")).click();
	  TimeUnit.SECONDS.sleep(2);
	  
	  //Journal Entry
	  driver.findElement(By.xpath("//*[@id='body']/main/section[1]/div/div[2]/div[1]/div[2]/div/div/a[3]")).click();
	  TimeUnit.SECONDS.sleep(2);
	  String jeHeader = driver.findElement(By.xpath("//*[@id='home-slide-4']/div[1]/h2")).getText();
	  Assert.assertTrue(jeHeader.equals("Journal Entry"));
	  System.out.println("I am at Journal Entry");
	  driver.findElement(By.xpath("//*[@id='home-slide-4']/div[1]/h2/button")).click();
	  TimeUnit.SECONDS.sleep(2);
	  
	  //Intercompany
	  driver.findElement(By.xpath("//*[@id='body']/main/section[1]/div/div[2]/div[1]/div[2]/div/div/a[4]")).click();
	  TimeUnit.SECONDS.sleep(2);
	  String interCompanyHeader = driver.findElement(By.xpath("//*[@id='home-slide-5']/div[1]/h2")).getText();
	  Assert.assertTrue(interCompanyHeader.equals("Intercompany"));
	  System.out.println("I am at Intercompany");
	  driver.findElement(By.xpath("//*[@id='home-slide-5']/div[1]/h2/button")).click();
	  TimeUnit.SECONDS.sleep(2);
	  
	  //Regulatory & Financial Reporting
	  driver.findElement(By.xpath("//*[@id='body']/main/section[1]/div/div[2]/div[1]/div[2]/div/a")).click();
	  TimeUnit.SECONDS.sleep(2);
	  String regulatoryFinancialReportHeader = driver.findElement(By.xpath("//*[@id='home-slide-6']/div[1]/h2")).getText();
	  Assert.assertTrue(regulatoryFinancialReportHeader.equals("Regulatory & Financial Reporting"));
	  System.out.println("I am at Regulatory & Financial Reporting");
	  driver.findElement(By.xpath("//*[@id='home-slide-6']/div[1]/h2/button")).click();
	  TimeUnit.SECONDS.sleep(2);
	  
	  //Unclaimed Property Compliance
	  driver.findElement(By.xpath("//*[@id='body']/main/section[1]/div/div[2]/div[1]/div[2]/a")).click();
	  TimeUnit.SECONDS.sleep(2);
	  String unclaimedPropComplianceHeader = driver.findElement(By.xpath("//*[@id='home-slide-7']/div[1]/h2")).getText();
	  Assert.assertTrue(unclaimedPropComplianceHeader.equals("Unclaimed Property Compliance"));
	  System.out.println("I am at Unclaimed Property Compliance");
	  driver.findElement(By.xpath("//*[@id='home-slide-7']/div[1]/h2/button")).click();
	  TimeUnit.SECONDS.sleep(2);
	  
	  //Solutions
	  driver.findElement(By.xpath("//*[@id='menu-item-33']/a")).click();
	  TimeUnit.SECONDS.sleep(2);
	  String solutionsHeader = driver.findElement(By.xpath("//*[@id='body']/main/section[1]/div/div[2]/div[1]/h1")).getText();
	  Assert.assertTrue(solutionsHeader.equals("Solutions"));
	  String solutionsTitle = driver.getTitle();
	  Assert.assertTrue(solutionsTitle.equals("Solutions | Trintech"));
	  System.out.println("I am at Solutions");
	  driver.findElement(By.xpath("//*[@id='body']/header/div/div/div/div[1]/div/a")).click();
	  TimeUnit.SECONDS.sleep(2);
	  
	  //Resources
	  driver.findElement(By.xpath("//*[@id='menu-item-34']/a")).click();
	  TimeUnit.SECONDS.sleep(2);
	  String resourcesHeader = driver.findElement(By.xpath("//*[@id='body']/main/section[1]/div/div[2]/div[1]/h1")).getText();
	  Assert.assertTrue(resourcesHeader.equals("Resources"));
	  String resourcesTitle = driver.getTitle();
	  Assert.assertTrue(resourcesTitle.equals("Record to Report Resource Library | Trintech, Inc."));
	  System.out.println("I am at Resources");
	  driver.findElement(By.xpath("//*[@id='body']/header/div/div/div/div[1]/div/a")).click();
	  TimeUnit.SECONDS.sleep(2);
	  
	  //Events
	  driver.findElement(By.xpath("//*[@id='menu-item-35']/a")).click();
	  TimeUnit.SECONDS.sleep(2);
	  String eventsHeader = driver.findElement(By.xpath("//*[@id='body']/main/section[1]/div/div[3]/div/h1")).getText();
	  Assert.assertTrue(eventsHeader.equals("Events"));
	  String eventsTitle = driver.getTitle();
	  Assert.assertTrue(eventsTitle.equals("Events | Trintech"));
	  System.out.println("I am at Events");
	  driver.findElement(By.xpath("//*[@id='body']/header/div/div/div/div[1]/div/a")).click();
	  TimeUnit.SECONDS.sleep(2);
	  
	  //About
	  driver.findElement(By.xpath("//*[@id='menu-item-36']/a")).click();
	  TimeUnit.SECONDS.sleep(2);
	  String aboutHeader = driver.findElement(By.xpath("//*[@id='body']/main/section[1]/div/div[3]/div/h1")).getText();
	  Assert.assertTrue(aboutHeader.equals("About Trintech"));
	  String aboutTitle = driver.getTitle();
	  Assert.assertTrue(aboutTitle.equals("About Trintech | Trintech"));
	  System.out.println("I am at About Trintech");
	  driver.findElement(By.xpath("//*[@id='body']/header/div/div/div/div[1]/div/a")).click();
	  TimeUnit.SECONDS.sleep(2);
	
  }
  
  @Test
  public void reconciliationText() throws Throwable {
	  driver.get("http://www.trintech.com");
	  driver.findElement(By.xpath("//*[@id='body']/main/section[1]/div/div[2]/div[1]/div[2]/div/div/a[1]")).click();
	  TimeUnit.SECONDS.sleep(2);
	  String reconciliationHeader = driver.findElement(By.xpath("//*[@id='home-slide-1']/div[1]/h2")).getText();
	  Assert.assertTrue(reconciliationHeader.equals("Account Reconciliation"));
	  System.out.println("I am at Account Reconciliation");
	  
	  //Amortization Scheduling
	  driver.findElement(By.xpath("//*[@id='home-slide-1']/div[2]/ul/li[1]/a")).click();
	  String amortizationSchedulingTitle = driver.getTitle();
	  Assert.assertTrue(amortizationSchedulingTitle.equals("Amortization Scheduling | Trintech"));
	  System.out.println("I am at Amortization Scheduling");
	  
	  //Period End Reconciliation
	  driver.findElement(By.xpath("//*[@id='body']/main/section[1]/div/div[2]/div[2]/ul/li[1]/a")).click();
	  String periodEndRecTitle = driver.getTitle();
	  Assert.assertTrue(periodEndRecTitle.equals("Period-End Reconciliation | Trintech"));
	  System.out.println("I am at Period-End Reconciliation");
	  
	  //Operational Reconciliation
	  driver.findElement(By.xpath("//*[@id='body']/main/section[1]/div/div[2]/div[2]/ul/li[1]/a")).click();
	  String operationalRecTitle = driver.getTitle();
	  Assert.assertTrue(operationalRecTitle.equals("Operational Reconciliation | Trintech"));
	  System.out.println("I am at Operational Reconciliation");
	  
	  //Variance Analysis
	  driver.findElement(By.xpath("//*[@id='body']/main/section[1]/div/div[2]/div[2]/ul/li[3]/a")).click();
	  String varianceAnalysisTitle = driver.getTitle();
	  Assert.assertTrue(varianceAnalysisTitle.equals("Variance Analysis | Trintech"));
	  System.out.println("I am at Variance Analysis");
	  
	  //System-to-System Matching
	  driver.findElement(By.xpath("//*[@id='body']/main/section[1]/div/div[2]/div[2]/ul/li[4]/a")).click();
	  String systemMatchingTitle = driver.getTitle();
	  Assert.assertTrue(systemMatchingTitle.equals("System-to-System Matching | Trintech"));
	  System.out.println("I am at System-to-System Matching");
	  
	  //Financial Transaction Matching
	  driver.findElement(By.xpath("//*[@id='body']/main/section[1]/div/div[2]/div[2]/ul/li[5]/a")).click();
	  String financialTransactionMatchingTitle = driver.getTitle();
	  Assert.assertTrue(financialTransactionMatchingTitle.equals("Financial Transaction Matching | Trintech"));
	  System.out.println("I am at Financial Transaction Matching");
	  
	  
	  
	  
	  
  
  }
  
  
  @BeforeTest
  public void beforeTest() throws Throwable {
	  System.setProperty("webdriver.ie.driver", driverpath+"IEDriverServer32.exe");
	  driver = new InternetExplorerDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
