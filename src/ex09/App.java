package ex09;

import ex09.student.HomeworkDelegator;
import ex09.student.HomeworkType;


public class App {
    public static void main(String[] args) {
        HomeworkDelegator homeworkDelegator = new HomeworkDelegator();

        // 1. 수학
        homeworkDelegator.delegateHomework(HomeworkType.MATH);

        // 2. 과학
        homeworkDelegator.delegateHomework(HomeworkType.SCIENCE);
    }
}
