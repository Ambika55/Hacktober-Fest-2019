import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinimumStepsToOne {
    public static int mini(int n){
        if(n==1)return 0;
        if(n%3==0)return 1+mini(n/3);
        if(n%2==0)return 1+mini(n/2);       
         return 1+mini(n-1);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(mini(n));
     
    }
}

