package com.jobsity.bowling.util;

import com.jobsity.bowling.domain.Frame;
import com.jobsity.bowling.domain.Roll;

import java.util.List;

public class BowlingUtil {

    public static final int LAST_FRAME = 10;
    public static final String TAB = "\t";
    public static final String DOUBLE_TAB = "\t\t";

    public static boolean isStrike(Frame frame) {
        List<Roll> rolls = frame.getRolls();
        if (rolls.size() > 0) {
            return rolls.get(0).getPins() == 10;
        }
        return false;
    }

    public static boolean isSpare(Frame frame) {
        List<Roll> rolls = frame.getRolls();
        if (rolls.size() >= 2) {
            int roll1 = rolls.get(0).getPins();
            int roll2 = rolls.get(1).getPins();
            return roll1 < 10 & roll1 + roll2 == 10;
        }
        return false;
    }

    public static int getPureScore(Frame frame) {
        return frame.getRolls().stream()
                .mapToInt(Roll::getPins)
                .sum();
    }

    public static int getPinsOfTwoRolls(Frame frame) {
        return frame.getRolls().stream()
                .limit(2)
                .mapToInt(Roll::getPins)
                .sum();
    }
}