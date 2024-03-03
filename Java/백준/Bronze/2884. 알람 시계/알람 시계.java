import java.util.*;

public class Main{
    public static void main(String [] args){
        Scanner s= new Scanner(System.in);
        int H, M;
        
        H=s.nextInt();
        //while(H>=0 && H<=23){
        //    H=s.nextInt();
       // }
        M=s.nextInt();
        //while(M>=0 && M<=59){
        //    M=s.nextInt();
        //}
        
        if(M<45){
            if(H>0){
               H=H-1;
               M=60-(45-M); 
            }
            else{
               H=23;
                M=60-(45-M);
            }
            
        }
        else{
            M=M-45;
        }
        System.out.print(H+" "+M);
    }
}