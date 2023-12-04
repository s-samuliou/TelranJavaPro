package com.telran.org.lessoneighteen.homeworkeighteen.taskthree.studentdirection;

import com.telran.org.lessoneighteen.homeworkeighteen.taskthree.ClassType;
import com.telran.org.lessoneighteen.homeworkeighteen.taskthree.Student;

public class QAStudent extends Student {
    public QAStudent(String name, double rate, boolean finished) {
        super(name, rate, finished);
        this.type = ClassType.QA;
    }
}
