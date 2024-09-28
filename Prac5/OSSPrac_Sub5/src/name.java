import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class name {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String std_name;
        String std_num;
        String std_major;
        String std_grade;
        String std_univ;

        System.out.print("이름을 입력하세요: ");
        std_name = br.readLine();

        System.out.print("학번을 입력하세요: ");
        std_num = br.readLine();

        System.out.print("학과를 입력하세요: ");
        std_major = br.readLine();
      
        System.out.print("학교를 입력하세요: ");
        std_univ = br.readLine();

        System.out.print("학년을 입력하세요: ");
        std_grade = br.readLine();

        sb.append("\n").append("<출력>");
        sb.append("\n").append("이름: ").append(std_name);
        sb.append("\n").append("학번: ").append(std_num);
        sb.append("\n").append("학과: ").append(std_major);
        sb.append("\n").append("학교: ").append(std_univ);
        sb.append("\n").append("학년: ").append(std_grade);

        System.out.println(sb);

        /*
        System.out.println();
        System.out.println("<출력>");
        System.out.println("이름: " + std_name);
        System.out.println("학번: " + std_num);
        System.out.println("학과: " + std_major);
        System.out.println("학교: " + std_univ);
        System.out.println("학년: " + std_grade);
        */
    }
}
