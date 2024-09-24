package Sub5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class name {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String std_name;
        String std_num;

        System.out.print("이름을 입력하세요: ");
        std_name = br.readLine();

        System.out.print("학번을 입력하세요: ");
        std_num = br.readLine();

        sb.append("\n").append("<출력>");
        sb.append("\n").append("이름: ").append(std_name);
        sb.append("\n").append("학번: ").append(std_num);
        System.out.println(sb);

        /*
        System.out.println();
        System.out.println("<출력>");
        System.out.println("이름: " + std_name);
        System.out.println("학번: " + std_num);
        */
    }
}
