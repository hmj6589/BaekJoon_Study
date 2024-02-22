import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        double a, b;
        a=s.nextDouble();
        if(a<0){
            a=s.nextDouble();
        }
        b=s.nextDouble();
        if(b>10){
            b=s.nextDouble();
        }
        System.out.print(a/b);
    }
}