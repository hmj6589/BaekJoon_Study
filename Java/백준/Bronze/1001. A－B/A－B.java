import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int a,b;
        a=s.nextInt();
        if(a<0){
            a=s.nextInt();
        }
        b=s.nextInt();
        if(b>10){
            b=s.nextInt();
        }
        System.out.println(a-b);
    }
}