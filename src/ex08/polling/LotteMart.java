package ex08.polling;

/**
 * 목표
 * 1. 주기적으로 잘 물어보고
 * 2. 실시간으로 반응하려고!!
 * 3. 주기를 잘 정해야함
 */
public class LotteMart {
    private String value = null;

    public String getValue() {
        return value;
    }

    public void received() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        value = "상품";
    }

}