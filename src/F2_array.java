/*Initialize the array elements and than show the values on the command line*/
import java.util.Scanner;
public class F2_array
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int[] b=new int[5];
        for(int i=0;i<b.length;i++)
            b[i]=8;
        output_array(b);
    }
    public static void output_array(int[] a)
    {
        for(int i=0;i<a.length;i++)
            System.out.printf("%d ",a[i]);

    }
}