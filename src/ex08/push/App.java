package ex08.push;

import ex08.push.pub.EMart;
import ex08.push.pub.LotteMart;
import ex08.push.pub.Mart;
import ex08.push.sub.Cus1;
import ex08.push.sub.Cus2;

public class App {
    public static void main(String[] args) {
        // 1. Bean 로드
        Mart lotteMart = new LotteMart();
        Mart eMart = new EMart();
        Cus1 cus1 = new Cus1();
        Cus2 cus2 = new Cus2();

        // 2. 구독
        lotteMart.subscribe(cus1);
        lotteMart.subscribe(cus2);

        eMart.subscribe(cus1);
        eMart.subscribe(cus2);

        // 3. 구독해지
        lotteMart.remove(cus2);

        // 4. 출판(구독자들에게 알림)
        new Thread(() -> {
            lotteMart.received();
        }).start();

        new Thread(() -> {
            eMart.received();
        }).start();
    }
}
