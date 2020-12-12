package Day3_04182020;

public class Multiple_Condition {
    public static void main(String[] args) {
        //declare three integer variables
        int a, b, c;
        a = 3;
        b = 7;
        c = 10;

        // write multiple if else condition to handle your scenarios
        if(a+b>c){
            System.out.println("a+b is greater than c");
        }//end of if condition

        else if (a+b<c){
            System.out.println("a+b is less than c");
        }//end of else if condition

        else{
            System.out.println("a+b is equal to c");
        }//end of else condition


    }//end of the main method
}//end of the java class
