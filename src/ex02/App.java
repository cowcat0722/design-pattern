package ex02;

public class App {
    public static void main(String[] args) {
        Animal mouse = new Mouse();
        Animal tiger = new Tiger();
        Animal dog = new Dog();
        DoormanProxy2 doormanProxy = new DoormanProxy2(new Doorman());
        doormanProxy.쫓아내(mouse);
        doormanProxy.쫓아내(tiger);
        doormanProxy.쫓아내(dog);
    }
}
