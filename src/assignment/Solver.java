package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Solver{
    private static final Map<Character, String> LETTER_COMBINATIONS = Map.of(
        '2', "abc",
        '3', "def",
        '4', "ghi",
        '5', "jkl",
        '6', "mno",
        '7', "pqrs",
        '8', "tuv",
        '9', "wxyz"
    );

    /**
    * Generates all possible letter combinations for the given digits (2–9)
    * based on phone keypad mapping.
     *
     * @param digits input digit string
     * @return list of letter combinations, or empty list if input is invalid
     */
    public List<String> mapping(String digits){
        List<String> result = new ArrayList<>();

        if(!checkDigits(digits)){
            return result;
        }

        result.add("");

        for(int i = 0; i < digits.length(); i++){
            char digitChar = digits.charAt(i);
            String letters = LETTER_COMBINATIONS.get(digitChar);
            List<String> temp = new ArrayList<>();
            for(String combination : result){
                for(char letter : letters.toCharArray()){
                    temp.add(combination + letter);
                }
            }
            result = temp;
        }

        Collections.sort(result);
        return result;

    }

    /**
     * Validates the input digit string.
    *
    * @param digits input string to validate
    * @return true if the input is non-null, length 1–4, and contains only digits 2–9; false otherwise
    */
    public boolean checkDigits(String digits){
        return digits != null
            && digits.length() > 0
            && digits.length() <= 4
            && digits.matches("[2-9]+");
    }
}