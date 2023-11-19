package com.telran.org.lessontwelve.homeworktwelve.tasktwo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {
    private Map<String, List<UserRequest>> storage;

    public Storage() {
        this.storage = new HashMap<>();
    }

    public void addUserRequest(String userName, UserRequest userRequest) {
        if (!storage.containsKey(userName)) {
            storage.put(userName, new ArrayList<>());
        }
        storage.get(userName).add(userRequest);
    }

    public void printAllUsers() {
        for (Map.Entry<String, List<UserRequest>> user : this.storage.entrySet()) {
            System.out.println(user.getKey());
        }
    }

    public void showInfoByName(String name) {
        for (Map.Entry<String, List<UserRequest>> user : this.storage.entrySet()) {
            if (user.getKey().equals(name)) {
                System.out.println("User name: " + user.getKey());

                for (UserRequest info : user.getValue()) {
                    System.out.print("Address: " + info.getAddress() +
                            " Request status: " + info.getAnswer() + "\n");

                }
            }
        }
    }
}
