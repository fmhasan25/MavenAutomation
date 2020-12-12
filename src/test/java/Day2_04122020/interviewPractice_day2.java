package Day2_04122020;

public class interviewPractice_day2 {
    public static void main(String[] args) {

        String[] zipcode = new String[]{"11218", "11219", "11220"};
        System.out.println(zipcode[1]);
        for (int i = 0; i < zipcode.length; i++) {

            if(zipcode[i]=="11220"||zipcode[i].equals("11219")){
                System.out.println("Hello 11220");
            }
            System.out.println("The zipcode is " + zipcode[i]);

        }//end of the for loop

        String[] borough = new String[3];
        borough[0] = "brooklyn";
        borough[1] = "Queens";
        borough[2] = "Manhattan";
        for (int j = 0; j < borough.length; j++) {
            System.out.println("The borough is " + borough[j]);
        }//end of the for loop

    }//end of the main method
}//end of the class
