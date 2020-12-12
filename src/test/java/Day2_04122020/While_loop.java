package Day2_04122020;

public class While_loop {
    public static void main(String[] args) {

        String[] states = new String[6];


        states[0] = "New york";
        states[1] = "California";
        states[2] = "Ohio";
        states[3] = "Arizona";
        states[4] = "New jersey";
        states[5] = "Nevada";


        //while loop is more of broken down into statements
        //if the argument is true/false then perform some action
        int i = 0;
        while (i < 6) {
            //Print all value for states
            System.out.println("My state is " + states[i]);
            i = i + 1; // incrementation and put this at the end of your statements
            // We can't put i=i+0 then the output will be infinite numbers, because 'states.length' is undefined.
            //also we can't write i<=i,that basically don't define anything and satisfy the condition.Instead we can put only i++ not i=i++




        }//end of while loop

    }//end of the method
}//end of the java class
