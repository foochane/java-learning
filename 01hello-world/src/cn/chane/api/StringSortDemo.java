package cn.chane.api;

import java.util.*;

public class StringSortDemo {
    public static void main(String[] args) {
        String str = "BADACOMEKKLXDALJFLDSJFSABSDFEGREGHTYHEDWEGD";
        List<String> list = new ArrayList<>();


        long t1 = System.currentTimeMillis();
        int startIndex = 0, endIndex = 0;
        while (endIndex < str.length() - 1) {
            if (str.charAt(endIndex) > str.charAt(endIndex + 1)) {
                endIndex++;
                list.add(str.substring(startIndex, endIndex));
                startIndex = endIndex;
            }
            endIndex++;
        }
        System.out.println(System.currentTimeMillis()-t1);


        long t2 = System.currentTimeMillis();
        for (int i = 0, j = 0; j < str.length() - 1; j++) {
            if (str.charAt(j) > str.charAt(j + 1)) {
                list.add(str.substring(i, j + 1));
                i = j + 1;
            }
        }
        System.out.println(System.currentTimeMillis()-t2);

//        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);
    }
}
