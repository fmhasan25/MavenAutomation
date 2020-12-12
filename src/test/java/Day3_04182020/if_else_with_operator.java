package Day3_04182020;

public class if_else_with_operator {
    public static void main(String[] args) {

        //scenario is if student grade is 90 to 100 then it's A
        //if student grade is 80 to below 90 then it's B
        //if anything below C is failure
        //define a variable which will represent grade number
        int grade = 95;//this value is changeable
        // if changed different statement should be printed
        if (grade >= 90 && grade <= 100) {//condition A
            //&& represents and operator in java
            //&& and operator all conditio n has to be true
            //||or operator one of the condition has to be true
            System.out.println("Students grade is A");
        }//end of if condition
        else if (grade >= 80 && grade < 90) {//condition B
            System.out.println("Student grade is B");
        }//end of else if condition

        else if (grade >= 70 && grade < 80) {//condition C
            System.out.println("Student grade is C");
        }//end of else if condition
        else {//condition failure
            System.out.println("Student grade is F");
        }//end of else if condition*/

    }//end of main method
}//end of java class
