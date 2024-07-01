package org.example.string;

public class StringUtil {

    public static boolean isEmpty(String s) {
        if(s == null){
            return true;
        }else{
             s = s.replaceAll(" ", "");
             return s.equals("");
        }
    }

    public static boolean hasText(String s) {
        return s != null && !s.trim().equals("");
    }

}
