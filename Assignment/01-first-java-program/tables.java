import java.util.*;
public class tables
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number for which we need table ");
        int num = in.nextInt();
        int count = 1;
        for (count = 1; count < 21; count++)
        {
            System.out.println(num + "x" + count + "=" +( count * num));


        }
    }
}