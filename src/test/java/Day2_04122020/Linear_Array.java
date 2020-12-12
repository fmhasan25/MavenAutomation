package Day2_04122020;

public class Linear_Array {

    public static void main(String[] args) {


        // declare the empty array variable first
        String[] location, countries, places;


        // declare the empty int array variables first
        int[] number, houseAddress;

        location = new String [] { "sixflag", "Disney", "Beach"};
        countries = new String[]{ "Bangladesh","USA","Canada", "india"};

        //define the int array variables
        number= new int [] {1,2,3,4};
        houseAddress= new int [] {222,333,444,555};

//print the last value from the locations variable
        System.out.println("My location is "+ location[0]);
        System.out.println("My last location is "+ location[2]+ " which is in the array and the index no is "+ number[1]);

        System.out.println("i want to go to "+ location[0]+ " which is in "+ countries[1]+ " and my address is "+ number[2]+ ","+ houseAddress[2]+ " Argyle road,Brooklyn,Ny,11218");
    }//end of the main method
}//End of java class
