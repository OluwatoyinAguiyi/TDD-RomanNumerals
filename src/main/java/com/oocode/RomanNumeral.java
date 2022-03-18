package com.oocode;

import java.sql.Array;
import java.util.*;

public class RomanNumeral {

    private int numbers[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
    private String romanLiterals[] = {"M", "CM","D","CD","C", "XC", "L","XL","X", "IX", "V","IV", "I" };

    public RomanNumeral() {
    }

    public String convertToRomanNumeral(int target) {
        StringBuilder romanValue = new StringBuilder();
        while (target > 0){
            for ( int i = 0; i < this.numbers.length; i++) {
                if (this.numbers[i] <= target) {
                    target = target - this.numbers[i];
                    romanValue.append(this.romanLiterals[i]);
                    break;
                }
            }
        }
        return romanValue.toString();
    }
}
