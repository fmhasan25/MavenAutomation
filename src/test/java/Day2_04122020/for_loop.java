package Day2_04122020;

public class for_loop {
    public static void main(String[] args) {

        String[] states = new String[6];


        states[0]   =   "New york";
        states[1]   =   "California";
        states[2]   =   "Ohio";
        states[3]   =   "Arizona";
        states[4]   =   "New jersey";
        states[5]   =   "Navada";


        //print all the states from 0 to last value in sequences
        //i++ each time is adding +1 to i
        //i represents your initial/starting point of your index
        //print all the states from 0 to 3

        for(int i = 0; i<states.length; i++){

            System.out.println("My state is "+ states[i]);

        }//end fo the loop


    }//end of the method
}// end of the java class
