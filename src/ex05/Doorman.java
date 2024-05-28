package ex05;

// 싱글톤 패턴 목적 : 문지기를 메모리에 하나만 올리고 싶다.
public class Doorman {

    public static Doorman instance = new Doorman();

    private Doorman() {
    }

    public void 쫓아내(Animal animal) {
        System.out.println(animal.getName() + "을 쫓아내");
    }
}
