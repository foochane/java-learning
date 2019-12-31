package cn.chane.api;

public class StaticDemo {
    public static void main(String[] args) {

        // 首先设置一下教室，这是静态的东西，应该通过类名称进行调用
        Student.room = "101教室";

        Student stu1 = new Student("xiaoming",18);
        System.out.println("id："+ stu1.getId()+",姓名："+ stu1.getName()+"，年龄："+stu1.getAge()+",教室："+Student.room);
        System.out.println("=====================");

        Student stu2 = new Student("xiaohong",19);
        System.out.println("id："+ stu2.getId()+",姓名："+ stu2.getName()+"，年龄："+stu2.getAge()+",教室："+Student.room);
        System.out.println("=====================");

        Student stu3 = new Student("xiaowang",22);
        System.out.println("id："+ stu3.getId()+",姓名："+ stu3.getName()+"，年龄："+stu3.getAge()+",教室："+Student.room);
        System.out.println("=====================");

        //访问静态变量
        System.out.println(Student.room);

        //访问静态方法
        Student.showNum();

    }
}
