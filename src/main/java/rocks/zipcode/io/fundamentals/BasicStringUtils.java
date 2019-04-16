package rocks.zipcode.io.fundamentals;

import java.util.Arrays;

public class BasicStringUtils {
    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(char[] chars) {
        StringBuilder builder = new StringBuilder();
        for (char letter : chars) {
            builder.append(letter);
        }
        return builder.toString();
    }

    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(Character[] chars) {
        StringBuilder builder = new StringBuilder();
        Arrays.stream(chars).forEach(builder::append);
        return builder.toString();
    }

    /**
     * @param string - string to be manipulated
     * @return identical string with lowercase and uppercase vowels removed
     */
    public static String removeAllVowels(String string) {
       return removeSpecifiedCharacters(string, "aeiouAEIOU");
    }

    /**
     * @param string             - string to be manipulated
     * @param charactersToRemove - characters to be removed from string
     * @return
     */
    public static String removeSpecifiedCharacters(String string, String charactersToRemove) {
        charactersToRemove = "[" + charactersToRemove + "]";
        return string.replaceAll(charactersToRemove,"");

    }
}
