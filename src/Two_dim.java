/*Write a program in java which will declare the array as per given by the user and will show it on the screen.*/
import java.util.Scanner;
public class Two_dim
{
    private final static int size=3;
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int[][] array1=new int[size][size];
        /*output array*/
        output_array(array1);
        int counter=0;
       for(int i=0;i<array1.length;i++)
       {
           for(int j=0;j<array1[i].length;j++)
               counter+=1;
       }
        System.out.printf("The total number of element is %d",counter);


    }
    public static void output_array(int[][] a)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
                System.out.printf("%d ",a[i][j]);
            System.out.println();
        }
    }
}