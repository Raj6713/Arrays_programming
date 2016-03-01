/*Write a program which will sum all the values in a two dimensional array and will show the output.*/
import java.util.Scanner;
public class Total_two_dimension
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        double[][] array1={{1,2,3,4,5},{6,7,8,9,10,11},{5,6,7},{4,3,2,1}};

        System.out.println("The array is given by the following values.");
        outputarray(array1);
        System.out.println("The sum of all values are: ");
        sum_value(array1);
        System.out.println("The average of all the values are: ");
        avg_value(array1);

    }


    public static void outputarray(double[][] array)
    {
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array[i].length;j++)
                System.out.printf("%.2f ",array[i][j]);

            System.out.println();
        }
    }


    public static void sum_value(double[][] array)
    {
        double sum=0;
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array[i].length;j++)
                sum+=array[i][j];
        }
        System.out.printf("The sum of the value is %.2f",sum);
    }

    public static void avg_value(double[][] array)
    {
        int sum=0;
        int counter=0;
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array[i].length;j++)
            {
                sum += array[i][j];
                counter += 1;
            }
        }
        double avg=(double)sum/(double)counter;
        System.out.printf("Average of the value is %.2f",avg);
    }

}