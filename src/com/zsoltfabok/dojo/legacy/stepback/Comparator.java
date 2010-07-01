package com.zsoltfabok.dojo.legacy.stepback;
public class Comparator {
    public boolean same(String string) {
        char[] data = string.toCharArray();
        char[] first = null;
        char[] second = null;
        boolean value = false;

        for (int i = 0; i < data.length; i++)
        if (data[i] == ' ') {
            first = new char[i];
            second = new char[data.length - i - 1];
            System.arraycopy(data, 0, first, 0, i);
            System.arraycopy(data, i + 1, second, 0, data.length - i - 1);
            if (first.length == second.length)
                for (int j = 0; j < first.length; j++)
                    if (first[j] == second[j])
                        value = true;
                    else {
                        value = false;
                        break;
                    }
            else
                return false;
            break;
        }
        return value;
    }
}