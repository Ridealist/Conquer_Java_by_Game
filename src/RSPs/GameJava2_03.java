package RSPs;

import java.util.*;
import java.io.*;

public class GameJava2_03 {
    public static void main(String[] args) throws IOException {

        boolean game = true;

        while (game) {

            Random r = new Random();
            int computer = Math.abs(r.nextInt() % 3);

            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String user;
            System.out.println("______________________________________________________");
            System.out.println("가위, 바위, 보 중 하나를 선택하세요. (가위=a, 바위=b, 보=c)");
            System.out.println("게임을 종료하려면 d를 눌러주세요.");
            System.out.println("______________________________________________________");
            System.out.print(">> ");
            user = in.readLine(); // 키보드로부터 한 줄 입력받음

            if (!(user.equals("a") | user.equals("b") | user.equals("c") | user.equals("d"))) {
                System.out.println("올바른 값을 입력해주세요!");
            }

            if (user.equals("a")) {
                if (computer==0) System.out.println("무승부(컴퓨터:가위, 사람:가위)");
                else if (computer==1) {
                    System.out.println("컴퓨터 승!(컴퓨터:바위, 사람:가위)");
                } else if (computer==2) {
                    System.out.println("사람 승!(컴퓨터:보, 사람:가위)");
                }
            }

            if (user.equals("b")) {
                if (computer==0) System.out.println("사람 승!(컴퓨터:가위, 사람:바위)");
                else if (computer==1) {
                    System.out.println("무승부(컴퓨터:바위, 사람:바위)");
                } else if (computer==2) {
                    System.out.println("컴퓨터 승!(컴퓨터:보, 사람:바위)");
                }
            }

            if (user.equals("c")) {
                if (computer==0) System.out.println("컴퓨터 승!(컴퓨터:가위, 사람:보)");
                else if (computer==1) {
                    System.out.println("사람 승!(컴퓨터:바위, 사람:보)");
                } else if (computer==2) {
                    System.out.println("무승부(컴퓨터:보, 사람:보)");
                }
            }

            if (user.equals("d")) {
                game = false;
            }
        }
        System.out.println("게임 종료");
    }
}
