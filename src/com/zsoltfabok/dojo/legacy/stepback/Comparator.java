package com.zsoltfabok.dojo.legacy.stepback;


public class Comparator {
    public boolean same(String string) {
        String[] words = string.split(" ");

        if (words.length == 2) {
            return words[0].equalsIgnoreCase(words[1]);
        } else {
            return false;
        }
    }
}