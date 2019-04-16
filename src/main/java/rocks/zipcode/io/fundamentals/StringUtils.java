package rocks.zipcode.io.fundamentals;


import rocks.zipcode.io.arrays.ArrayUtils;
import rocks.zipcode.io.collections.PowerSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/**
 * @author leon on 10/01/2019.
 */
public class StringUtils {
    /**
     * @param string - string to be evaluated
     * @return collection containing all permutations of casing of this string
     */
    public static Collection<String> getAllCasings(String string) {
        ArrayList<String> answer = new ArrayList<>();
        Integer[] range = ArrayUtils.getRange(0, string.length());

        Double d = Double.valueOf(string.length());
        Double n = Math.pow(2.0, d) ;

        for (int i = 0; i < 4; i++) {
            answer.add(string);
        }

        for (int i = 0; i < answer.size(); i++) {
            upperCaseIndices(answer.get(i), range);
            }

        return answer;
        // get length of string
        // get range of length
        // get power-set of range

        // for every set in power-set
        // uppercase indices of string using set
    }

    /**
     * @param string  - string to be evaluated
     * @param indices - indices to be evaluated
     * @return near-identical string whose characters at specified indices are capitalized
     */
    public static String upperCaseIndices(String string, Integer... indices) {
        StringBuilder builder = new StringBuilder(string);
        for (Integer index:indices) {
            builder.replace(index, index+1, String.valueOf(builder.charAt(index)).toUpperCase());
        }
        return builder.toString();
    }

    /**
     * @param stringToBeManipulated - string to be evaluated
     * @param valueToBeInserted     - value to insert into string
     * @param index                 - string-index at which to insert value into string
     * @return near-identical string with `valueToBeInserted` inserted at `index`
     */
    public static String insertAtIndex(String stringToBeManipulated, String valueToBeInserted, Integer index) {
        StringBuilder builder = new StringBuilder(stringToBeManipulated);
        builder.insert(index, valueToBeInserted);
        return builder.toString();
    }

    /**
     * @param stringToBeManipulated - string to be evaluated
     * @param replacementValue      - value to insert at `index`
     * @param index                 - position of string to be manipulated
     * @return near-identical string with character at `index` replaced with `replacementValue`
     */
    public static String replaceAtIndex(String stringToBeManipulated, Character replacementValue, Integer index) {
        StringBuilder builder = new StringBuilder(stringToBeManipulated);
        builder.replace(index, index+1, replacementValue.toString());
        return builder.toString();
    }
}