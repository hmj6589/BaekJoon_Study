import java.util.*;

public class Main{
    public static void main(String [] args){
        Scanner s= new Scanner(System.in);
        int A, B;
        A=s.nextInt();
        B=s.nextInt();
        
        int C=s.nextInt();
        
        int d=B+C;
        int e;
        int f;
        if(d>60){
            
            e=(B+C)/60;
            if(A+e > 23){
                A=A+e-24;
            }
            else{
                A+=e;
            }
            f=(B+C)%60;
            
            
            B=f;
        }
        else if(d==60){
            if(A==23){
                A=0;
            }
            else{
                A++;
            }
            B=0;
        }
        else{
            B+=C;
        }
        
        
        
        
        System.out.print(A+" "+B);
    }
}