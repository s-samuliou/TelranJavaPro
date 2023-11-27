package com.telran.org.lessonsixteen.practice;

public enum HttpCodes {
    INFORMATIONAL(100, 199, (code, v) -> System.out.println("http code: " + code + " : " + v)),
    SUCCESS(200, 299, (code, v) -> System.out.println("http code: " + code + " : " + v)),
    REDIRECTION(300, 399, (code, v) -> System.out.println("http code: " + code + " : " + v)),
    CLIENT_ERROR(400, 499, (code, v) -> System.out.println("http code: " + code + " : " + v)),
    SERVER_ERROR(500, 599, (code, v) -> System.out.println("http code: " + code + " : " + v));

    private final int minCode;
    private final int maxCode;
    private final Action action;

    public static void printValueByCode(int code) {
        for (HttpCodes value : HttpCodes.values()) {
            if (value.minCode < code && code < value.maxCode) {
                value.doIt(code, value);
            }
        }
    }

    private void doIt(int code, HttpCodes v) {
        action.action(code, v);
    }

    HttpCodes(int nimCode, int maxCode, Action action) {
        this.minCode = nimCode;
        this.maxCode = maxCode;
        this.action = action;
    }
}
