import java.util.*;

public class Main{
    public static void main(String [] args){
        int a,b;
        Scanner s = new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        
        if(a>b){
            System.out.print(">");
        }
        else if(a<b){
            System.out.print("<");
          
        }
        else{
            System.out.print("==");
        }
    }
}