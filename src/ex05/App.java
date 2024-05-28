package ex05;

public class App {
    public static void main(String[] args) {
        Animal tiger = new Tiger();
        Animal mouse = new Mouse();
        Doorman doorman = Doorman.instance;
        doorman.쫓아내(tiger);
        doorman.쫓아내(mouse);
    }
}
