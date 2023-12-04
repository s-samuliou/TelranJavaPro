package com.telran.org.lessoneighteen.homeworkeighteen.taskthree;

public class ProjectStudent {
    private String name;
    double rate;
    ClassType type;

    public ProjectStudent(String name, double rate, ClassType type) {
        this.name = name;
        this.rate = rate;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public ClassType getType() {
        return type;
    }

    public void setType(ClassType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ProjectStudent{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", type=" + type +
                '}';
    }
}
