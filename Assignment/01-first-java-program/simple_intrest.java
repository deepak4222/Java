import java.util.*;
public class simple_intrest
{
    public static void main(String[] args)
    {
     Scanner in=new Scanner(System.in);
     System.out.println("enter the values of p,t,r");
     double p=in.nextDouble();
     double t= in.nextDouble();
     double r=in.nextDouble();
     double intrest=(p*t*r)/100;
     System.out.println("simple intrest="+intrest);
    }


}
