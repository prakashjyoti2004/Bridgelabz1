import java.util.*;
public class Febonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 0;
        int s = 1;
        int t = 0; 
        if (n==1){
            System.out.print(0);
        } 
        if(n==2){
            System.out.print(2);
        }
        for(int i=3;i<n+1;i++){
            t=f+s;
            f=s;
            s=t;         
        }
        System.out.print(s);
    }
}   