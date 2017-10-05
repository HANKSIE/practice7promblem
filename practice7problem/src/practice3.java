import java.util.Scanner;

public class practice3 {

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int value = scn.nextInt();

        if (value % 2 == 1 ){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
    }
}
