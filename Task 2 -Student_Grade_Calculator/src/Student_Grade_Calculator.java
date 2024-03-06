import java.util.Scanner;

import java.util.Scanner;
class Grade{
    public String grade(int avgp){
        switch (avgp/10){
            case 10:
                return "A+";
            case 9:
                return "A";

            case 8:
                return "B+";

            case 7:
                return "B";

            case 6:
                return "C";

            case 5:
                return "D";

            default:
                return "F";


        }
    }
}
public class Student_Grade_Calculator{
    public static void main(String[] args) {
        Grade g=new Grade();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of subjects");
        int totalsubj=sc.nextInt();
        int tmarks=0;
        for (int i=0;i<totalsubj;i++){
            System.out.println("Enter the marks obtained  "+(i+1));
            int marks=sc.nextInt();
            tmarks+=marks;
        }
        int avgp=tmarks/totalsubj;
        String grade=g.grade(avgp);;
        System.out.println("Total marks obtained = "+ tmarks);
        System.out.println("Percentage obtained = "+avgp+"%");
        System.out.println("Grade obtained = "+grade);
        sc.close();
    }
}