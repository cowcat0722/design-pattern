package ex10.command;

import ex10.alarm.Alarm;

public class AlarmCommand implements Command {

    private Alarm alarm;

    public AlarmCommand(Alarm alram) {
        this.alarm = alarm;
    }

    @Override
    public void execute() {
        alarm.alarmOn();
    }
}
