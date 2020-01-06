package cn.chane.api;

public class Student {
    private int id;
    private String name;
    private int age;
    static String room;
    private static int idCounter = 0; //学号计数器，每当new了一个新对象的时候，计数器++

    public Student(){
        this.id = ++idCounter;
    }

    public Student(String name,int age) {
        this.id = ++idCounter;
        this.name = name;
        this.age = age;
    }

    public static void showNum(){
        System.out.println("num:" + idCounter);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
