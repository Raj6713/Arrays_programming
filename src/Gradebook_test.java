
import java.util.Scanner;
public class Gradebook_test
{
    public static void main(String[] args)
    {
        int[] gradesarray={67,56,78,98,90,67,54,34,56,23,89,89,98,87,67,67};
        Gradebook new_grades=new Gradebook("Introduction to java programmig",gradesarray);
        System.out.printf("Name of the course is %s\n",new_grades.getCourseName());
        new_grades.gradeprocess();
    }
}