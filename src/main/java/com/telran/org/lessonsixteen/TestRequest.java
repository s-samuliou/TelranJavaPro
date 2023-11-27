package com.telran.org.lessonsixteen;

import java.util.function.Function;

public class TestRequest {

    public static void main(String[] args) {
        taskTwoVersionTwo();
    }

    public static void taskTwoVersionOne() {
        Request request = new Request("Hello", 545);

        Function<Request, String> createRequestInfo = request1 ->
                "Message is: '" + request1.getMessage() +
                        "' , number is: '" + request1.getNumber() + "'";

        String reqInfo = createRequestInfo.apply(request);
        System.out.println(reqInfo);
    }

    public static void taskTwoVersionTwo() {
        Request request = new Request("Hello", 545);

        RequestFormater requestFormater = req -> "Message is: '" + req.getMessage() +
                        "' , number is: '" + req.getNumber() + "'";

        String formattedString = requestFormater.format(request);
        System.out.println(formattedString);
    }
}
