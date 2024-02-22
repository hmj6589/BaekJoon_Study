import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        
        int a,b;
        a=s.nextInt();
        while(a<100 || a>1000){
            a=s.nextInt();
        }
        b=s.nextInt();
        while(b<100 || b>1000){
            b=s.nextInt();
        }
        
        int c=b/100;
        b-=c*100;
        int d=b/10;
        b-=d*10;
        
        System.out.println(a*b);
        System.out.println(a*d);
        System.out.println(a*c);
        System.out.println(a*b+a*d*10+a*c*100);
        
        
        s.close();
    }
}