package com.telran.org.lessoneighteen.homeworkeighteen.taskthree.studentdirection;

import com.telran.org.lessoneighteen.homeworkeighteen.taskthree.ClassType;
import com.telran.org.lessoneighteen.homeworkeighteen.taskthree.Student;

public class FrontEndStudent extends Student {

    public FrontEndStudent(String name, double rate, boolean finished) {
        super(name, rate, finished);
        this.type = ClassType.FE;
    }
}
