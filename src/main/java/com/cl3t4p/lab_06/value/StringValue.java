package com.cl3t4p.lab_06.value;


public class StringValue extends ExpValue<String>{
    public StringValue(String value) {
        super(parseString(value));

    }

    private static String parseString(String text) {
        text = text.substring(1, text.length() - 1);
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '\\') {
                text = switch (text.charAt(i + 1)) {
                    case 'n' -> text.substring(0, i) + "\n" + text.substring(i + 2);
                    case 't' -> text.substring(0, i) + "\t" + text.substring(i + 2);
                    case 'b' -> text.substring(0, i) + "\b" + text.substring(i + 2);
                    case 'r' -> text.substring(0, i) + "\r" + text.substring(i + 2);
                    case 'f' -> text.substring(0, i) + "\f" + text.substring(i + 2);
                    case '\'' -> text.substring(0, i) + "'" + text.substring(i + 2);
                    case '"' -> text.substring(0, i) + "\"" + text.substring(i + 2);
                    case '\\' -> text.substring(0, i) + "\\" + text.substring(i + 2);
                    default -> text;
                };
            }
        }
        return text;
    }

}
