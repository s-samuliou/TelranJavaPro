package com.telran.org.lessoneighteen.homeworkeighteen.taskthree.studentdirection;

import com.telran.org.lessoneighteen.homeworkeighteen.taskthree.ClassType;
import com.telran.org.lessoneighteen.homeworkeighteen.taskthree.Student;

public class BackEndStudent extends Student {
    public BackEndStudent(String name, double rate, boolean finished) {
        super(name, rate, finished);
        this.type = ClassType.BA;
    }
}
