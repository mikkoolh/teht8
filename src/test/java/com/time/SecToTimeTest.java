package com.time;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecToTimeTest {
    private String res;
    @ParameterizedTest(name = "{0} sekuntia on {1}")
    @CsvSource({ "-1, -1", "0, 0:00:00", "1, 0:00:01", "59, 0:00:59", "60, 0:01:00", "3599, 0:59:59", "3600, 1:00:00", "86399, 23:59:59", "86400, -1" })
    public void testSecToTime(int luku, String tulos) {
        res = TimeUtils.secToTime(luku);
        String msg = luku + " aika väärin: " + res;
        assertEquals(tulos, res, msg);
    }
}