import java.util.Scanner;

public class practice5 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("輸入1~1000");
        int value = scn.nextInt();

        if(value < 10000 && value > 0) {
            int a = value / 1000;
            value = value % 1000;
            int b = value / 100;
            value = value % 100;
            int c = value / 10;
            int d = value % 10;
            System.out.println(a + "thousand" + b + "hundred" + c + "ten" + d + "dollar");
        }
        else{
            System.out.println("error");
        }
    }
}

