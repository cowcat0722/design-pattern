package ex10;

import ex10.alarm.Alarm;
import ex10.command.AlarmCommand;
import ex10.command.LampCommand;
import ex10.lamp.BlueLamp;
import ex10.lamp.RedLamp;

public class ButtonFactory {
    private static ButtonFactory instance = new ButtonFactory();

    private ButtonFactory() {
    }

    public static ButtonFactory getInstance() {
        return instance;
    }

    public Button createButton(String command) { // blueLamp, redLamp, alarm
        if (command.equals("blueLamp")) {
            Button blueLampButton = new Button(new LampCommand(new BlueLamp()));
            return blueLampButton;
        } else if (command.equals("redLamp")) {
            Button redLampButton = new Button(new LampCommand(new RedLamp()));
            return redLampButton;
        } else if (command.equals("alarm")) {
            Button alarmButton = new Button(new AlarmCommand(new Alarm()));
            return alarmButton;
        } else {
            return null;
        }
    }

}