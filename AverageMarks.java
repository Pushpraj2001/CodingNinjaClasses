import java.util.Scanner ;
public class AverageMarks {
    public static  void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String student = s.next();
            char stu = student.charAt(0);
            int m1 = s.nextInt();
            int m2 = s.nextInt();
            int m3 = s.nextInt();
            int total = (m1+m2+m3)/3;
            System.out.println(stu);
            System.out.println(total);
            
    }
}
