package Action_items;

public class Actionitem_01whileloop {

    public static void main(String[] args) {
        //Declaring the variable
        String[] zipCode;
        int[] houseNumber;

// input in index variable.
        zipCode = new String[4];
        zipCode[0] = "11218";
        zipCode[1] = "11219";
        zipCode[2] = "11220";
        zipCode[3] = "11221";


//Defining the integer variable
        houseNumber = new int[4];
        houseNumber[0] = 2;
        houseNumber[1] = 3;
        houseNumber[2] = 4;
        houseNumber[3] = 5;
for(int i=0;i<=3;i++){

            System.out.println("My zipCode is " + zipCode[i] + " and my street number is " + houseNumber[i]);


        }
    }// end of the method

}// end of the class









