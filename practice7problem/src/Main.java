import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().charAt(0);
        if(ch - 'A' >= 0 && ch - 'A' < 26) {
            System.out.println("Uppercase");
        }
        else if(ch - 'a' >= 0 && ch - 'a' < 26){
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Special Character");
        }
    }
}