package com.telran.org.lessontwelve.homeworktwelve.tasktwo.initializer;

import com.telran.org.lessontwelve.homeworktwelve.tasktwo.Storage;
import com.telran.org.lessontwelve.homeworktwelve.tasktwo.UserRequest;
import com.telran.org.lessontwelve.homeworktwelve.tasktwo.enums.RequestStatus;

public class Initializer {
    public void initialize(Storage storage) {
        String[] inputData = {
                "User1;www.de.de;APPROVED",
                "User2;www.ebay.de;DENIED",
                "User2;www.amazon.de;DENIED",
                "User1;www.ebay.blabla;ERROR",
                "User3;www.vk.com;APPROVED"
        };

        for (String data : inputData) {
            String[] parts = data.split(";");

            if (parts.length == 3) {
                String user = parts[0];
                String address = parts[1];
                RequestStatus answer = RequestStatus.valueOf(parts[2]);

                UserRequest request = new UserRequest(address, answer);

                storage.addUserRequest(user, request);
            } else {
                System.out.println("Error in format data: " + data);
            }
        }
    }
}
