import java.util.Scanner;

class ExceptionDemo2X
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
    try
    {

        int arr[] = {11,21,51,101,111};
        int index = 0;

        System.out.println("Enter The index:");
        index = sobj.nextInt();
        
        System.out.println("Element is:"+arr[index]);
    }
    catch(ArrayIndexOutOfBoundsException aobj)
    {
        System.out.println("Inside catch:"+aobj);
    }
        System.out.println("End of main");
    }
}


