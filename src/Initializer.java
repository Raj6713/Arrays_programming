/*Write a program which will initialize the array values and will show on the screen.*/
import java.util.Scanner;
public class Initializer
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int[] a={1,4,7,9,33,23,45,67,98,100,34,54,22};
        System.out.printf("%s\t%s\n","Index","Value");
        for(int i=0;i<a.length;i++)
        {
            System.out.printf("%d\t%d\n",i,a[i]);
        }
    }
}