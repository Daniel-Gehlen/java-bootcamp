// StringUtil.java
package util;

public class StringUtil {

    public static boolean isEmptyOrNull(String str) {
        return str == null || str.isEmpty();
    }

    public static String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }
}
