package com.telran.org.lessontwelve.homeworktwelve.tasktwo;

import com.telran.org.lessontwelve.homeworktwelve.tasktwo.enums.RequestStatus;

public class UserRequest {
    private String address;
    private RequestStatus answer;

    public UserRequest(String address, RequestStatus answer) {
        this.address = address;
        this.answer = answer;
    }

    public String getAddress() {
        return address;
    }

    public RequestStatus getAnswer() {
        return answer;
    }

    @Override
    public String toString() {
        return "UserRequest{" +
                "address='" + address + '\'' +
                ", answer=" + answer +
                '}';
    }
}
