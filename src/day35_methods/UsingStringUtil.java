package day35_methods;

import my_utilities.StringUtil;

public class UsingStringUtil {

    public static void main(String[] args) {
        System.out.println(StringUtil.reverse("apple"));

        System.out.println(StringUtil.fixFormat("jaMES"));

        System.out.println(StringUtil.frequencyOfChar("apple", 'z'));

        System.out.println(StringUtil.uniqueCharacters("aaaaabcccdeeff"));

        System.out.println(StringUtil.duplicateChar("aaaaabcccdeeff"));
    }
}
