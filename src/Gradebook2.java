/*Write a java program which will take the have grades for 10 students in 3 subjects and than will be the grades will be processed*/
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class Gradebook2
{
    private int[][] grades=new int[10][3];
    private String Coursename;
    public Gradebook2(String name_of_course,int[][] grade)
    {
        this.Coursename=name_of_course;
        this.grades=grade;
    }
    public void setCoursename(String course_name)
    {
        this.Coursename=course_name;
    }
    public String getCoursename()
    {
        return Coursename;
    }

    public void processgrades()
    {
        outputgrades();
        System.out.printf("The lowest grade in the grades is %d",output_minimum());
        System.out.printf("The highest grade in the grades is %d",output_maximum());
    }

    /*This block will return the maximum value of the grade and will show it on the screen.*/
    public int output_maximum()
    {
        int maximum=Integer.MIN_VALUE;
        for(int i=0;i<grades.length;i++)
        {
            for(int j=0;j<grades[i].length;j++)
            {
                if(maximum<grades[i][j])
                    maximum=grades[i][j];
            }
        }
        return maximum;
    }
    /*This block will find out the minimu grade*/
    public int output_minimum()
    {
        int minimum=Integer.MAX_VALUE;
        for(int i=0;i<grades.length;i++)
        {
            for(int j=0;j<grades[i].length;j++)
            {
                if(grades[i][j]<minimum)
                    minimum=grades[i][j];
            }
        }
        return minimum;
    }

    /*Grades output on the screen*/
    public void outputgrades()
    {
        for(int i=0;i<grades.length;i++)
        {
            for(int j=0;j<grades[i].length;j++)
                System.out.printf("%d  ",grades[i][j]);
            System.out.println();
        }
    }

}