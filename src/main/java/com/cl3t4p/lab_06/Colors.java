package com.cl3t4p.lab_06;

import java.util.Map;
import java.util.regex.Pattern;

public class Colors {
    
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLACK = "\u001B[30m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_WHITE = "\u001B[37m";

    private static Map<String,String> colors = 
    Map.of(
        "r",ANSI_RED,
        "g",ANSI_GREEN,
        "y",ANSI_YELLOW,
        "b",ANSI_BLUE,
        "p",ANSI_PURPLE,
        "c",ANSI_CYAN,
        "w",ANSI_WHITE,
        "d",ANSI_RESET
    );
    private static Pattern pattern;
    static{
        pattern = Pattern.compile("%["+String.join("", colors.keySet())+"]");
    }

    public static void print(String text){
        String value = pattern.matcher(text).replaceAll(match -> colors.get(match.group().substring(1)));
        System.out.println(value + ANSI_RESET);
    }

}
