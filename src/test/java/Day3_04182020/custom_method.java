package Day3_04182020;

public class custom_method {
    //purpose of these user defined custom methods so that i can reuse it again and again
    //and call it on my main method when i need to use them
    //user defined custom methods will be created here
    //let's create one for void first
//your reusable method must ber static in order to be called on other classes
    //Void method only executes your statement inside that method
    public static void VoidAdd(int a, int b) {
        int result = a + b;
        System.out.println("My additional result is " + result);
    }//end of void method

    //create same method as return method
    //return method executed your statements as well as returns you the result you want
    public static int returnAdd(int a, int b) {
        int result = a + b;
        System.out.println("My additional result is " + result);
        return result; //will return the result of c
    }//end of custom void method
}//end of java class
