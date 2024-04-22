package com.time;

public class TimeUtils {

    public static int timeToSec(String time) {
        int sInHh = 3600, timesSixty= 60;
        String[] part = time.split(":");
        int hh = Integer.parseInt(part[0]);
        int mm = Integer.parseInt(part[1]);
        int ss = Integer.parseInt(part[2]);

        return sInHh * hh + timesSixty * mm + ss;
    }

    public static String secToTime(int a) {
        int hh;
        int mm;
        int ss;
        int ssInHh = 3600;
        int timesSixty= 60;
        int ten = 10;

        if (a < 0 || a >= 86400) {
            return "-1";
        }

        hh = a / ssInHh;
        a = a - (ssInHh * hh);
        mm = a / timesSixty;
        ss = a - (timesSixty * mm);

        String res = hh + ":";
        if (mm <= ten) {
            res = res + "0" + mm + ":";
        } else {
            res = res + mm + ":";
        }
        if (ss <= ten) {
            res = res + "0" + ss;
        } else {
            res = res + ss;
        }

        return res;
    }
}
