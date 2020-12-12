package Day4_04192020;

import java.util.Scanner;

public class split_command {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
//--------------------------
        //Create a string message first and store it as a single string variable
       // String message = "Welcome to_Selenium@Automation class";

        //i want to only print the keyword 'Selenium' from my message variable
        //we need to define String array variable in order to split the message
        String[] arrayResult = message.split(" ");


        //------------------------
        System.out.println("My final message is " + arrayResult[1]);//arrayResult[1] became the new array
        //if replaced by space (" ") instead of "_" regex will be (" ")


        //-------------------------
        String[] arrayResult1 = arrayResult[1].split("_");
        System.out.println("My final message is " + arrayResult1[1]);


        //--------------------------
        String[] arrayResult2 = arrayResult[1].split("@");
        System.out.println("My final message is " + arrayResult2[1]);


        //--------------------------
        System.out.println("My two keyword is "+ arrayResult1[1]+ "My second keyword is "+ arrayResult2[0]);

    }//end of main method
}//end of java class
