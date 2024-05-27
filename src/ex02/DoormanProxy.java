package ex02;

public class DoormanProxy extends Doorman {

    public void 쫓아내(Animal animal) {
        System.out.println("지갑 검사");
        super.쫓아내(animal);
    }
}
