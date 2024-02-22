import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        
        int a,b,c;
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        
        while(a<2 || a>10000){
            a=s.nextInt();
        }
        while(b<2 || b>10000){
            b=s.nextInt();
        }
        while(c<2 || c>10000){
            c=s.nextInt();
        }
        
        
        
        System.out.println((a+b)%c);
        System.out.println(((a%c) + (b%c))%c);
        System.out.println((a*b)%c);
        System.out.println(((a%c) * (b%c))%c);
        
        s.close();
    }
}