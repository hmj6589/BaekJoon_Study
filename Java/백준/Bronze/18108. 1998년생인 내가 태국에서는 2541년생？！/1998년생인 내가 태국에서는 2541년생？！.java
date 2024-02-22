import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        
        int a=s.nextInt();
        while(a<1000 || a>3000){
            a=s.nextInt();
        }
        //int b=2541-1998;
        System.out.println(a-2541+1998);
    }
}