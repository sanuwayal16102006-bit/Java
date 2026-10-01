import java.util.Scanner;

class ExceptionDemo1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int no1 = 0, no2 = 0,Ans = 0;

        try
        {

            System.out.println("Enter First number:");
            no1 = sobj.nextInt();

            System.out.println("Enter Second number:");
            no2 = sobj.nextInt();
            
            Ans = no1/no2;      //Exception prone code
        }
        catch(ArithmeticException aobj)
        {
            System.out.println("Exception occured :"+aobj);
        } 
        finally
        {
            System.out.println("Inside finally block");
        }   
            System.out.println("Division is :"+Ans);
        
    }
}

