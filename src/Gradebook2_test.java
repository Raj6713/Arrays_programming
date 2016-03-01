/*This class will check the output of the gradebookmclass and will show on the screen.*/
import java.util.Scanner;
public class Gradebook2_test
{
    public static void main(String[] args)
    {
        int[][] grade={{56,56,56},
                {90,98,78},{12,34,65},{56,67,78},{89,99,89},{67,76,56},{23,87,98},{12,32,54},{34,34,43},{89,87,67}};
        Gradebook2 grade2=new Gradebook2("Java programming",grade);
        System.out.println("Overview of the gradecard");
        System.out.printf("Name of the subject: %s",grade2.getCoursename());
        grade2.processgrades();
    }
}