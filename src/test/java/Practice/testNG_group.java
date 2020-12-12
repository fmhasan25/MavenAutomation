package Practice;

import org.testng.annotations.Test;

public class testNG_group {
@Test(groups = {"sanity"})
    public void school(){
    System.out.println("Feni is my love");
}

    @Test
    public void college(){
        System.out.println("mohsin is my love");
    }
    @Test(groups = {"sanity","love"})
    public void university(){
        System.out.println("ustc is my love");
    }
    @Test(groups = {"love"})
    public void icst(){
        System.out.println("icst is my love");
    }
    @Test
    public void esquire(){
        System.out.println("esquire is my love");
    }
    @Test(groups = {"sanity"})
    public void shore2shore(){
        System.out.println("shore to shore is my love");
    }
    @Test(groups = {"love"})
    public void uber(){
        System.out.println("uber is my love");
    }

}
