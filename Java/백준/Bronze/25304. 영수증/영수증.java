import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int ga=s.nextInt();
        int gea=s.nextInt();
        
        int b=0, c=0, sum=0;
        
        for (int a=0;a<gea;a++){
            b=s.nextInt();
            c=s.nextInt();
            
            sum+=b*c;
        }
        
        if(ga==sum){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
        
    }
}