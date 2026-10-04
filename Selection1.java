import java.util.*;

class Selection1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int no = 0;

        System.out.println("Enter number:");
        no = sobj.nextInt();

        if((no % 2) ==0)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is Odd");
        }
    }
}