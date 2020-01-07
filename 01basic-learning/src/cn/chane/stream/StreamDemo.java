package cn.chane.stream;

import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("aaa", "bbb", "abc", "aab");

        stringStream.filter(str->str.startsWith("a")).forEach(str-> System.out.println(str));

//        Stream<String> stringStream1 = stringStream.filter(str -> str.startsWith("aa"));
//
//        stringStream1.forEach(str-> System.out.println(str));


    }
}
