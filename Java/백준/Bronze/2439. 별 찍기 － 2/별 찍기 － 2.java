import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        for(int a=1;a<=n;a++){
            for(int b=1;b<=n-a;b++){
                System.out.print(" ");
            }
            
            for(int c=1;c<=a;c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}