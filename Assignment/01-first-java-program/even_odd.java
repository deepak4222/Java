import java.util.*;
public class even_odd
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the num to be checked :");
        int n=in.nextInt();
        if(n%2==0)
        {
            System.out.println(n+"="+"even");

        }
        else
            System.out.println(n+"="+"odd");
    }


}
