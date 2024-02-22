import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a, b;
        a=s.nextInt();
        //while(a<1 || a>10000){
        //    a=s.nextInt();
       // }
        b=s.nextInt();
        //while(b<1 || b>10000){
            //b=s.nextInt();
        //}
        
        //if(a<b){
        //    int c=a;
        //    a=b;
        //    b=c;
        //}
       
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        
        System.out.print(a%b);
        
        s.close();
    }
}