import java.util.*;
public class erre {
    
    public static void main(String[]args)
    {
        int i,j,k;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=n-i;j>=0;j--)
            {
                System.out.print(" ");
            }
        for(k=1;k<=i;k++)
        {
            if(k%2==0){
                System.out.print("2");
            }
            else{
                System.out.print("1");
            }
        }
        for(int t=1;t<i;t++)
        {
            if(t%2==0){
                System.out.print("2");
            }
            else
            {
                System.out.print("1");
            }
        }
        System.out.println();
    }
        
    }
}
