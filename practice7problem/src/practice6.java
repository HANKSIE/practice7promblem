import java.util.Scanner;

public class practice6{

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int d = scn.nextInt();
        int e = scn.nextInt();
        int f = scn.nextInt();
        int count1=0,count2=0,count3=0;

        if(a>0){
            count1++;
        }
        else if (a<0){
            count2++;
        }
        else{
            count3++;
        }
        if(b>0){
            count1++;
        }
        else if (b<0){
            count2++;
        }
        else{
            count3++;
        }
        if(c>0){
            count1++;
        }
        else if (c<0){
            count2++;
        }
        else{
            count3++;
        }
        if(d>0){
            count1++;
        }
        else if (d<0){
            count2++;
        }
        else{
            count3++;
        }
        if(e>0){
            count1++;
        }
        else if (e<0){
            count2++;
        }
        else{
            count3++;
        }
        if(f>0){
            count1++;
        }
        else if (f<0){
            count2++;
        }
        else{
            count3++;
        }

        System.out.println("+="+count1);
        System.out.println("0="+count3);
        System.out.println("-="+count2);

    }
}
