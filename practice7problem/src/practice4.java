import java.util.Scanner;

public class practice4 {

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        System.out.println(" 輸入三角形的三邊長(int)" );
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        if(a<=b && b<=c && a+b<c){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
