import java.util.*;

public class Main{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        int sum=0;
        for(int a=1;a<=n;a++){
            sum+=a;
        }
        System.out.print(sum);
    }
}