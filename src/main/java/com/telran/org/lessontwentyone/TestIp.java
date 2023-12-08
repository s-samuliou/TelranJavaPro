package com.telran.org.lessontwentyone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestIp {

    public static void main(String[] args) {
        //IP - A.B.C.D - 0-255
        //[0-9], \d{1,2}, \d{2} - любое двузначное
        //

        String regex = "(\\d{1,2}|(0|1)\\d{2}|2[0-4][0-9]|25[0-5])";

        String ip1 = "000.14.22.135";
        String ip2 = "0.0.0.0";
        String ip3 = "00.1.24.24.24";
        String ip4 = "i.am.not.an.ip";

        System.out.println(isValidIpAddress(regex, ip1));
        System.out.println(isValidIpAddress(regex, ip2));
        System.out.println(isValidIpAddress(regex, ip3));
        System.out.println(isValidIpAddress(regex, ip4));

    }

    private static boolean isValidIpAddress(String regex, String address) {
        if (address == null){
            return false;
        }

        String fullRegex = regex + "\\." + regex + "\\." + regex + "\\." + regex;
        Pattern pattern = Pattern.compile(fullRegex);
        Matcher matcher = pattern.matcher(address);

        return matcher.matches();
    }
}
