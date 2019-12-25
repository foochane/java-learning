[TOC]



API(Application Programming Interface)，应用程序编程接口。Java API是一本程序员的 字典 ，是JDK中提供给我们使用的类的说明文档。这些类将底层的代码实现封装了起来，我们不需要关心这些类是如何实现的，只需要学习这些类如何使用即可。所以我们可以通过查询API的方式，来学习Java提供的类，并得知如何使用它们。



## 1 Scanner类

### 1.1 引用类型的使用步骤

1. 导包

使用import关键字导包，在类的所有代码之前导包，引入要使用的类型，**java.lang包下的所有类无需导入**。 格式：

```java
import 包名.类名;
```

示例：

```java
java.util.Scanner;
```



2. 创建对象

使用该类的构造方法，创建一个该类的对象。 格式：

```java
数据类型  变量名  =  new 数据类型(参数列表);
```



示例：

```java
Scanner sc = new Scanner(System.in);
```



3. 调用方法

调用该类的成员方法，完成指定功能。 格式：

```java
变量名.方法名();
```

示例：

```java
int i = sc.nextInt(); // 接收一个键盘录入的整数
```



### 1.2 Scanner使用

使用Scanner类，完成接收键盘录入数据的操作，代码如下：

```java
//1. 导包
import java.util.Scanner;
public class Demo01_Scanner {
   public static void main(String[] args) {  
     //2. 创建键盘录入数据的对象   
       //System.in代表从键盘进行输入
     Scanner sc = new Scanner(System.in);    
     //3. 接收数据    
     System.out.println("请录入一个整数：");    
     int i = sc.nextInt();    
     //4. 输出数据    
     System.out.println("i:"+i);    
   }  
}
```



## 2 Random类

此类的实例用于生成伪随机数。

使用Random类，完成生成3个10以内的随机整数的操作，代码如下：

```java
//1. 导包
import java.util.Random;
public class Demo01_Random {
   public static void main(String[] args) {  
        //2. 创建键盘录入数据的对象
        Random r = new Random();
        for(int i = 0; i < 3; i++){
            //3. 随机生成一个数据
            int number = r.nextInt(10);
            //4. 输出数据
            System.out.println("number:"+ number);
        }      
    }
}
```



## 3 ArrayList类

java.util.ArrayList 是大小可变的数组的实现，存储在内的数据称为元素。此类提供一些方法来操作内部存储的元素。  ArrayList 中可不断添加元素，其大小也自动增长。

### 3.1 常用方法和遍历

对于元素的操作,基本体现在——增、删、查。常用的方法有：

- `public boolean add(E e)`：将指定的元素添加到此集合的尾部。
- `public E remove(int index) `：移除此集合中指定位置上的元素。返回被删除的元素。
- `public E get(int index)` ：返回此集合中指定位置上的元素。返回获取的元素。
- `public int size()` ：返回此集合中的元素数。遍历集合时，可以控制索引范围，防止越界。

### 3.2  如何存储基本数据类型

ArrayList对象不能存储基本类型，只能存储引用类型的数据。类似 `<int> `不能写，但是存储基本数据类型对应的包装类型是可以的。所以，想要存储基本类型数据， `<> `中的数据类型，必须转换后才能编写，转换写法如下：

| 基本类型 | 基本类型包装类 |
| -------- | -------------- |
| byte     | Byte           |
| short    | Short          |
| int      | Integer        |
| long     | Long           |
| float    | Float          |
| double   | Double         |
| char     | Character      |
| boolean  | Boolean        |



## 3 String类

`java.lang.String` 类代表字符串。Java程序中所有的字符串文字（例如 "abc" ）都可以被看作是实现此类的实例。

类`String`中包括用于检查各个字符串的方法，比如用于**比较**字符串，**搜索**字符串，**提取**子字符串以及创建具有翻译为**大写**或**小写**的所有字符的字符串的副本。

- 特点

1. 字符串不变：字符串的值在创建后不能被更改。

```java
String s1 = "abc";
s1 += "d";
System.out.println(s1); // "abcd"
// 内存中有"abc"，"abcd"两个对象，s1从指向"abc"，改变指向，指向了"abcd"。
```



2. 因为String对象是不可变的，所以它们可以被共享。

```java
String s1 = "abc";
String s2 = "abc";
// 内存中只有一个"abc"对象被创建，同时被s1和s2共享。
```



3. `"abc"` 等效于 ` char[] data={ 'a' , 'b' , 'c' } `。

```java
例如：
String str = "abc";
相当于：
char data[] = {'a', 'b', 'c'};    
String str = new String(data);
// String底层是靠字符数组实现的。
```



### 2.1 字符串创建

构造方法：

- `public String()` ：初始化新创建的 String对象，以使其表示空字符序列。
- `public String(char[] value)` ：通过当前参数中的字符数组来构造新的String。
- `public String(byte[] bytes)` ：通过使用平台的默认字符集解码当前参数中的字节数组来构造新的String。

```java
// 1. 使用空参构造
String str1 = new String(); // 小括号留空，说明字符串什么内容都没有。

// 2. 根据字符数组创建字符串
char[] charArray = { 'A', 'B', 'C' };
String str2 = new String(charArray);

// 3. 根据字节数组创建字符串
byte[] byteArray = { 97, 98, 99 };
String str3 = new String(byteArray);

// 4. 直接创建
String str4 = "Hello";
```



### 2.2 判断功能的方法

- `public boolean equals (Object anObject)` ：将此字符串与指定对象进行比较。
- `public boolean equalsIgnoreCase (String anotherString) `：将此字符串与指定对象进行比较，忽略大小写



示例：

```java
// 创建字符串对象
String s1 = "hello";
String s2 = "hello";
String s3 = "HELLO";

// boolean equals(Object obj):比较字符串的内容是否相同
System.out.println(s1.equals(s2)); // true
System.out.println(s1.equals(s3)); // false
System.out.println("‐‐‐‐‐‐‐‐‐‐‐");

//boolean equalsIgnoreCase(String str):比较字符串的内容是否相同,忽略大小写
System.out.println(s1.equalsIgnoreCase(s2)); // true
System.out.println(s1.equalsIgnoreCase(s3)); // true
System.out.println("‐‐‐‐‐‐‐‐‐‐‐");
```



### 2.3  获取功能的方法

- `public int length () `：返回此字符串的长度。
- `public String concat (String str)` ：将指定的字符串连接到该字符串的末尾。
- `public char charAt (int index)` ：返回指定索引处的 char值
- `public int indexOf (String str) `：返回指定子字符串第一次出现在该字符串内的索引。
- `public String substring (int beginIndex)`：返回一个子字符串，从beginIndex开始截取字符串到字符
  串结尾。
- `public String substring (int beginIndex, int endIndex) `：返回一个子字符串，从beginIndex到endIndex截取字符串。含beginIndex，不含endIndex。



示例：

```java
//创建字符串对象
String s = "helloworld";

// int length():获取字符串的长度，其实也就是字符个数
System.out.println(s.length());
System.out.println("‐‐‐‐‐‐‐‐");

// String concat (String str):将将指定的字符串连接到该字符串的末尾.
String s = "helloworld";
String s2 = s.concat("**hello");
System.out.println(s2);// helloworld**hello

// char charAt(int index):获取指定索引处的字符
System.out.println(s.charAt(0));
System.out.println(s.charAt(1));
System.out.println("‐‐‐‐‐‐‐‐");

// int indexOf(String str):获取str在字符串对象中第一次出现的索引,没有返回‐1
System.out.println(s.indexOf("l"));
System.out.println(s.indexOf("owo"));
System.out.println(s.indexOf("ak"));
System.out.println("‐‐‐‐‐‐‐‐");

// String substring(int start):从start开始截取字符串到字符串结尾
System.out.println(s.substring(0));
System.out.println(s.substring(5));
System.out.println("‐‐‐‐‐‐‐‐");

// String substring(int start,int end):从start到end截取字符串。含start，不含end。
System.out.println(s.substring(0, s.length()));
System.out.println(s.substring(3,8));
```



### 2.4 转换功能的方法

- `public char[] toCharArray ()` ：将此字符串转换为新的字符数组。
- `public byte[] getBytes ()` ：使用平台的默认字符集将该 String编码转换为新的字节数组。
- `public String replace (CharSequence target, CharSequence replacement) `：将与target匹配的字符串使用replacement字符串替换。



示例：

```java
//创建字符串对象
String s = "abcde";

// char[] toCharArray():把字符串转换为字符数组
char[] chs = s.toCharArray();
for(int x = 0; x < chs.length; x++) {
    System.out.println(chs[x]);
}
System.out.println("‐‐‐‐‐‐‐‐‐‐‐");

// byte[] getBytes ():把字符串转换为字节数组
byte[] bytes = s.getBytes();
for(int x = 0; x < bytes.length; x++) {
    System.out.println(bytes[x]);
}
System.out.println("‐‐‐‐‐‐‐‐‐‐‐");

//world替换为WORLD
String str = "hello world";
String replace = str.replace("world", "WORLD");
System.out.println(replace); // hello WORLD
System.out.println("‐‐‐‐‐‐‐‐‐‐‐");

```



### 2.4 分割功能的方法

- `public String[] split(String regex)` ：将此字符串按照给定的regex（规则）拆分为字符串数组。



示例：

```java
String str1 = "aaa,bbb,ccc";
String[] array1 = str1.split(",");
for (int i = 0; i < array1.length; i++) {
    System.out.println(array1[i]);
}
System.out.println("===============");

String str2 = "aaa bbb ccc";
String[] array2 = str2.split(" ");
for (int i = 0; i < array2.length; i++) {
    System.out.println(array2[i]);
}
System.out.println("===============");

String str3 = "XXX.YYY.ZZZ";
String[] array3 = str3.split("\\.");
System.out.println(array3.length); // 0
for (int i = 0; i < array3.length; i++) {
    System.out.println(array3[i]);
}
```



注意事项：

- split方法的参数其实是一个“正则表达式”
- 如果按照英文句点“.”进行切分，必须写`"\\."`（两个反斜杠）



## 4  Arrays类

`java.util.Arrays `类包含用来操作数组的各种方法，比如排序和搜索等。**其所有方法均为静态方法**。



### 4.1 toString



- `public static String toString(int[] a) `：返回指定数组内容的字符串表示形式。



示例：

```java
public static void main(String[] args) {
  // 定义int 数组
  int[] arr  =  {2,34,35,4,657,8,69,9};
  // 打印数组,输出地址值
  System.out.println(arr); // [I@2ac1fdc4
  // 数组内容转为字符串
  String s = Arrays.toString(arr);
  // 打印字符串,输出内容
  System.out.println(s); // [2, 34, 35, 4, 657, 8, 69, 9]
}
```



### 4.2 sort



- `public static void sort(int[] a) `：对指定的 int 型数组按数字升序进行排序。

示例：

```java
public static void main(String[] args) {
  // 定义int 数组
  int[] arr  =  {24, 7, 5, 48, 4, 46, 35, 11, 6, 2};
  System.out.println("排序前:"+ Arrays.toString(arr)); // 排序前:[24, 7, 5, 48, 4, 46, 35, 11, 6,
2]
  // 升序排序
  Arrays.sort(arr);
  System.out.println("排序后:"+ Arrays.toString(arr));// 排序后:[2, 4, 5, 6, 7, 11, 24, 35, 46,
48]
}
```



备注：
1. 如果是数值，sort默认按照升序从小到大
2. 如果是字符串，sort默认按照字母升序
3. 如果是自定义的类型，那么这个自定义的类需要有Comparable或者Comparator接口的支持。

## 5  Math类

`java.lang.Math` 类包含用于执行基本数学运算的方法，如初等指数、对数、平方根和三角函数。类似这样的工具类，其所有方法均为静态方法，并且不会创建对象，调用起来非常简单。

### 5.1 绝对值

- `public static double abs(double a) `：返回 double 值的绝对值。

```java
double d1 = Math.abs(‐5); //d1的值为5
double d2 = Math.abs(5); //d2的值为5
```



### 5.2 向上取整



- `public static double ceil(double a) `：返回大于等于参数的最小的整数。

```java
double d1 = Math.ceil(3.3); //d1的值为 4.0
double d2 = Math.ceil(‐3.3); //d2的值为 ‐3.0
double d3 = Math.ceil(5.1); //d3的值为 6.0
```





### 5.3 向下取整

- `public static double floor(double a)`：返回小于等于参数最大的整数。

```java
double d1 = Math.floor(3.3); //d1的值为3.0
double d2 = Math.floor(‐3.3); //d2的值为‐4.0
double d3 = Math.floor(5.1); //d3的值为 5.0
```



### 5.4 四舍五入

- `public static long round(double a)` ：返回最接近参数的 long。(相当于四舍五入方法)



```java
long d1 = Math.round(5.5); //d1的值为6.0
long d2 = Math.round(5.4); //d2的值为5.0
```















