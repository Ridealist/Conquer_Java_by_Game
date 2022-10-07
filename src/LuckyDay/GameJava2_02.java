package LuckyDay;

import java.util.Date;
import java.util.Random;
import java.text.SimpleDateFormat;


public class GameJava2_02 {
    public static void main(String[] args) {

        Date today = new Date();  // Date 클래스 객체 생성

        SimpleDateFormat dateForm = new SimpleDateFormat("yyyy년 MM월 dd일의 ");
        // 오늘 날짜를 어떻게 출력할 것인지 출력 형식 설정
        System.out.print(dateForm.format(today));

        Random r = new Random();

        int randomNum = Math.abs(r.nextInt() % 100)+1;
        System.out.println("금전운(100): "+ randomNum + "%");
    }
}
