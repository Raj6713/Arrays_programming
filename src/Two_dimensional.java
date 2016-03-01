/*Write a array program which will show the output of array on a screen.*/
import java.util.Scanner;
public class Two_dimensional
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int[][] array1={{1,2,3},{4,5,6},{7,8,9}};
        int[][] array2={{1,2,3},{4,5},{6}};
        System.out.println("The first output of values are: ");
        outputarray(array1);
        System.out.println("The second output of values are: ");
        outputarray(array2);
    }

    public static void outputarray(int[][] array)
    {
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array[i].length;j++)
                System.out.printf("%d ",array[i][j]);
            System.out.println();
        }
    }
}