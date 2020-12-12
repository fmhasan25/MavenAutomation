package Practice;

import org.testng.annotations.*;

public class testNG_practice {
    @BeforeMethod
    public void myComment(){
        System.out.println("I love everyone");
    }
    @Test
    public void testOne(){

        System.out.println("The family");

    }

    @Test
    public void testTwo(){
        System.out.println("Friends");

    }

    @Test
    public void testThree(){
        System.out.println("Relatives");

    }

@AfterMethod
        public void myLastComment(){
    System.out.println("I love my wife");
}

    @BeforeSuite
    public void ourStatus(){
        System.out.println("We are family");
    }

    @AfterSuite
    public void ourStatus2(){

        System.out.println("Wee are united");
    }

}//end of the java class


