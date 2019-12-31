package cn.chane.api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("hello").append(123).append('a').append(2.3).append(true);
        System.out.println(builder.toString());

        String str1 = "hello";
        String str2 = str1 + "world";
        System.out.println(str1==str2);

        StringBuilder builder1 = builder.append("xxxxxxxxxx");
        System.out.println(builder==builder1);
        int a = 1;
        String s = a+"";

        int i = 1;
        String sx = String.valueOf(i);

        List<Object> arrayList = new ArrayList();
        arrayList.add("xxx");
        arrayList.add(1);

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
