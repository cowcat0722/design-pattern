package ex10;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // 1. 사용자 입력
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();

        // 2.입력에 따른 버튼 생성 (팩토리)
        ButtonFactory factory = ButtonFactory.getInstance();
        Button button = factory.createButton(command);

        // 3. 커맨드 패턴이 적용된 메서드
        button.press();
    }
}
