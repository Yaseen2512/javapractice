import java.util.*;
public class foreach {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] a=new int[n];
        int sum=0;
        
        for (int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();

        }
        //for (int i=0;i<a.length;i++) = noraml for loop used to print the array element 
        //{
          //  System.out.println(a[i]);
        //}

        for (int x:a)  // this is for every loop method used to print the array element 
        {
            System.out.println(x);
            sum+=x;
            
            
        } // in this methid we store each element in the array  to the varialbe X and print the each element in array using the given variable X.
        System.out.println(sum);
    }
}
