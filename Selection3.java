import java.util.*;

class Selection3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int Age = 0;

        System.out.println("Enter your Age:");
        Age = sobj.nextInt();

        if(Age < 18 )
        {
            System.out.println("NotAllowed");
        }
        else
        {
            System.out.println("Allowed");
        }
    }
}

