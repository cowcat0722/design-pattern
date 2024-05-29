package ex08.polling;

public class App {
    public static void main(String[] args) {
        LotteMart lotteMart = new LotteMart();
        Customer1 customer1 = new Customer1();

        // 1. 마트 입고 준비 (마트 스레드)
        new Thread(() -> {
            lotteMart.received();
        }).start();

        // 2. 손님1 (손님 스레드 = main 스레드)
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (lotteMart.getValue() != null) {
                customer1.update(lotteMart.getValue() + "가 들어왔습니다.");
            } else {
                System.out.println("상품이 아직 들어오지 않았어요");
            }
        }
    }
}
