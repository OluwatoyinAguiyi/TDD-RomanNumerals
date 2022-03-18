package com.oocode;

import java.sql.Array;
import java.util.*;

public class RomanNumeral {

    private int numbers[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
    private String romanLiterals[] = {"M", "CM","D","CD","C", "XC", "L","XL","X", "IX", "V","IV", "I" };

    private Map<Integer, String> numberToRomanLiteralMap = new HashMap<>();
    public RomanNumeral() {
        initialiseNumberToRomanLiteralMap();
    }

    public String convertToRomanNumeral(int target) {
        StringBuilder romanValue = new StringBuilder();
        while (target > 0){
            target = getNextRomanNumeral(target, romanValue);
        }
        return romanValue.toString();
    }

    private int getNextRomanNumeral(int target, StringBuilder romanValue) {

        Integer [] numberArray = this.numberToRomanLiteralMap.keySet().toArray(new Integer[this.numberToRomanLiteralMap.keySet().size()]);
        String [] romanLiteralArray = this.numberToRomanLiteralMap.values().toArray(new String[this.numberToRomanLiteralMap.keySet().size()]);

        for ( int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] <= target) {
                target = target - numberArray[i];
                romanValue.append(romanLiteralArray[i]);
                break;
            }
        }
        return target;
    }

    private void initialiseNumberToRomanLiteralMap(){
        this.numberToRomanLiteralMap.put(1000, "M");
        this.numberToRomanLiteralMap.put(900, "CM");
        this.numberToRomanLiteralMap.put(500, "D");
        this.numberToRomanLiteralMap.put(400, "CD");
        this.numberToRomanLiteralMap.put(100, "C");
        this.numberToRomanLiteralMap.put(90, "XC");
        this.numberToRomanLiteralMap.put(50, "L");
        this.numberToRomanLiteralMap.put(40, "XL");
        this.numberToRomanLiteralMap.put(10, "X");
        this.numberToRomanLiteralMap.put(9, "IX");
        this.numberToRomanLiteralMap.put(5, "V");
        this.numberToRomanLiteralMap.put(4, "IV");
        this.numberToRomanLiteralMap.put(1, "I");
    }
}
