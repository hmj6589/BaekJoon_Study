import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner s= new Scanner(System.in);
        
        int a=s.nextInt();
        
        for(int b=0;b<a/4;b++){
            System.out.print("long ");
        }
        System.out.print("int");
    }
}