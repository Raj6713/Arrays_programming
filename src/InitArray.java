/*Write a program which will initialize the array values and will show the all outputs.*/
import java.util.Scanner;
public class InitArray
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int[] a=new int[10];
        System.out.printf("%s\t%s\n","Index","Value");
        for(int i=0;i<10;i++)
        {
            System.out.printf("%d\t%d\n",i,a[i]);
        }
    }
}