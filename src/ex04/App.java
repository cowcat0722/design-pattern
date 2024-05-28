package ex04;

import ex04.teacher.JavaTeacher;
import ex04.teacher.PythonTeacher;

public class App {
    public static void main(String[] args) {
        JavaTeacher jt = new JavaTeacher();
        jt.수업하기();
        PythonTeacher pt = new PythonTeacher();
        pt.수업하기();
    }
}
