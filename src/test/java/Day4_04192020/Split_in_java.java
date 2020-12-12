package Day4_04192020;

public class Split_in_java {
    public static void main(String[] args) {
        String message = "My_name_is_firoz";
        String[]splitMessage = message.split("_");
        //if replaced by space (" ") instead of "_" regex will be (" ")
        System.out.println("My name is "+ splitMessage[3]);


    }
}
