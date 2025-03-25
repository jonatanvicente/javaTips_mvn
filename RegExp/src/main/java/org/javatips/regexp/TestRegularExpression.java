package org.javatips.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegularExpression {


    static String input = "abcabcabcdefabc";
    static String regexp[] = { "abc+", "(abc)+", "(abc){2,}" };


    public static void main(String[] args) {

        System.out.println("Input: \"" + input + "\"");

        for(String arg : regexp) {
            System.out.println("Regular expression: \"" + arg + "\"");

            //compile & match
            Pattern p = Pattern.compile(arg);
            Matcher m = p.matcher(input);

            while(m.find()) {
                System.out.println("Match \"" + m.group() + "\" at positions " + m.start() + "-" + (m.end() - 1));
            }

        }
    }
}

