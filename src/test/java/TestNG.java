import org.testng.annotations.*;

/**
 * Created by User on 28.04.2016.
 */
public class TestNG {
    @BeforeGroups
    public void beforeGroups(){
        System.out.println("@BeforeGroups");
    }

    @AfterGroups
    public void afterGroups(){
        System.out.println("@AfterGroups");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("@BeforeClass");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("@AfterClass");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("@BeforeTest");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("@AfterTest");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("@BeforeMethod");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("@AfterMethod");
    }

    @Test(priority = 0)
    public void runTest1(){
        System.out.println("Test 1 - groups shopping");
    }

    @Test(priority = 1)
    public void runTest2(){
        System.out.println("Test 2 - groups shopping");
    }

    @Test(priority = 2)
    public void runTest3(){
        System.out.println("Test 3 - groups merge");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("@BeforeSuite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("@AfterSuite");
    }
}
