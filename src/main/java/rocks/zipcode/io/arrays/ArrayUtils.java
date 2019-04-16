package rocks.zipcode.io.arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 24/01/2019.
 */
public class ArrayUtils {
    /**
     * @param start - value to begin counting
     * @param end   - value to stop counting
     * @return array of all integers between `start` and `stop`
     */
    public static Integer[] getRange(Integer start, Integer end) {
        ArrayList<Integer> array = new ArrayList<>();
        for (Integer i = start; i <= end; i++) {
            array.add(i);
        }
        return array.toArray(new Integer[array.size()]);
    }

    /**
     * @param array - array to be unboxed
     * @return array with identical contents in primitive-array form
     */
    public static char[] unbox(Character[] array) {
        char[] answer = new char[array.length];
        for (int i = 0; i <array.length ; i++) {
            answer[i] = array[i].charValue();
        }
        return answer;
    }

    /**
     * @param array - array to be boxed
     * @return array with identical contents in nonprimitive-array form
     */
    public static Character[] box(char[] array) {
        ArrayList<Character> temp = new ArrayList<>();
        for (char letter: array) {
            temp.add(letter);
        }
        return temp.toArray(new Character[temp.size()]);
    }
}
