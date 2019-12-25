[toc]

## 1 基础概念



### 1.1 二进制

字节是计算机中最小存储单元。计算机存储任何的数据，都是以字节的形式存储。8个bit（二进制位） 0000-0000表示为1个字节，写成1 byte或者1 B。

- 8 bit = 1 B
- 1024 B =1 KB
- 1024 KB =1 MB
- 1024 MB =1 GB
- 1024 GB = 1 TB



### 1.2 Java虚拟机



虚拟机是一种抽象化的计算机，通过在实际的计算机上仿真模拟各种计算机功能来实现的。Java虚拟机（Java Virtual Machine，JVM ）有自己完善的硬体架构，如处理器、堆栈、寄存器等，还具有相应的指令系统。Java虚拟机屏蔽了与具体操作系统平台相关的信息，使得Java程序只需生成在Java虚拟机上运行的目标代码(字节码)，就可以在多种平台上不加修改地运行。

所谓的java虚拟机，就是一台虚拟的机器。它是一款软件，用来执行一系列虚拟计算机指令，大体上虚拟机可以分为系统虚拟机和程序虚拟机。visual Box、VMWare就属于系统虚拟机。他们完全是对物理计算机的仿真，提供一个可运行完整操作系统的软件平台。而java虚拟机就是典型程序虚拟机，它专门为执行单个计算机程序而设计，在java虚拟机中执行的指令我们称之为java字节码指令。java发展到今天，出现了很多虚拟机，最初sun使用的叫Classic的java虚拟机，到现在使用最广泛的是HotSpot虚拟机，除了sun以外还有BEA的JRockit,目前JRockit和HotSpot都被甲骨文公司收入旗下，大有整合的趋势。

任何软件的运行，都必须要运行在操作系统之上，而我们用Java编写的软件可以运行在任何的操作系
统上，这个特性称为Java语言的**跨平台特性**。该特性是由JVM实现的，我们编写的程序运行在JVM上，而JVM运行在操作系统上。



### 1.3 JRE  和 JDK

- JRE  (Java Runtime Environment) ：是Java程序的运行时环境，包含 JVM 和运行时所需要的 核心类库 。
-  JDK (Java Development Kit)：是Java程序开发工具包，包含 JRE 和开发人员使用的工具。


我们想要运行一个已有的Java程序，那么只需安装 JRE 即可。我们想要开发一个全新的Java程序，那么必须安装 JDK 。



### 1.4  常量和变量

- 常量：程序运行中固定不变的量
- 变量：程序中运行可以变化的量



常量分类：

| 类型       | 含义                                   | 举例                        |
| ---------- | -------------------------------------- | --------------------------- |
| 整数常量   | 所有的整数                             | 0，1， 567， -9             |
| 小数常量   | 所有的小数                             | 0.0， -0.1， 2.55           |
| 字符常量   | 单引号引起来,只能写一个字符,必须有内容 | 'a' ， ' '， '好'           |
| 字符串常量 | 双引号引起来,可以写多个字符,也可以不写 | "A" ，"Hello" ，"你好" ，"" |
| 布尔常量   | 只有两个值                             | true ， false               |
| 空常量     | 只有一个值                             | null                        |



变量分类：

Java的数据类型分为两大类：

- 基本数据类型 ：整数 、 浮点数 、 字符 、 布尔 。
- 引用数据类型 ：类 、 数组 、 接口 。



| 数据类型     | 关键字         | 占用内存 | 取值范围              |
| ------------ | -------------- | -------- | --------------------- |
| 字节型       | byte           | 1个字节  | -128~127              |
| 短整型       | short          | 2个字节  | -32768~32767          |
| 整型         | int（默认）    | 4个字节  | $-2^{31}$~$2^{31}-1$  |
| 长整型       | long           | 8个字节  | $-2^{63}$~$2^{63}-1$  |
| 单精度浮点数 | float          | 4个字节  | 1.4013E-45~3.4028E+38 |
| 双精度浮点数 | double（默认） | 8个字节  | 4.9E-324~1.7977E+308  |
| 字符型       | char           | 2个字节  | 0-65535               |
| 布尔类型     | boolean        | 1个字节  | true，false           |

> long类型：建议数据后加L表示
> float类型：建议数据后加F表示



### 1.5 数据类型转换



自动类型转换（隐式）

- 特点：代码不需要进行特殊处理，自动完成。
- 规则：数据范围从小到大。

强制类型转换（显式）

- 特点：代码需要进行特殊的格式处理，不能自动完成。

- 格式：范围小的类型 范围小的变量名 = (范围小的类型) 原本范围大的数据;



注意事项：

1. 强制类型转换一般不推荐使用，因为有可能发生精度损失、数据溢出。

2. byte/short/char这三种类型都可以发生数学运算，例如加法“+”.
3. byte/short/char这三种类型在运算的时候，都会被首先**提升成为int类型**，然后再计算。
4. boolean类型不能发生数据类型转换



### 1.6 运算符

#### 算数运算符

| 符号     | 说明                         |
| -------- | ---------------------------- |
| +        | 加法运算，字符串连接运算     |
| -        | 减法运算                     |
| *        | 乘法运算                     |
| /        | 除法运算                     |
| %        | 取模运算，两个数字相除取余数 |
| ++ 、 -- | 自增自减运算                 |

**前++和后++的区别**

```java
public static void main(String[] args) {
    int a = 1;
    int b = ++a;
    System.out.println(a);//计算结果是2
    System.out.println(b);//计算结果是2
}
```

```java
public static void main(String[] args) {
    int a = 1;
    int b = a++;
    System.out.println(a);//计算结果是2
    System.out.println(b);//计算结果是1
}
```

#### 赋值运算符

### 

| 符号 | 说明   |
| ---- | ------ |
| =    | 等于号 |
| +=   | 加等于 |
| - =  | 减等于 |
| *=   | 乘等于 |
| /=   | 除等于 |
| %=   | 取模等 |



#### 比较运算符

| 符号 | 说明                                                         |
| ---- | ------------------------------------------------------------ |
| ==   | 比较符号两边数据是否相等，相等结果是true。                   |
| <    | 比较符号左边的数据是否小于右边的数据，如果小于结果是true。   |
| >    | 比较符号左边的数据是否大于右边的数据，如果大于结果是true。   |
| <=   | 比较符号左边的数据是否小于或者等于右边的数据，如果小于结果是true。 |
| >=   | 比较符号左边的数据是否大于或者等于右边的数据，如果小于结果是true。 |
| ！ = | 不等于符号 ，如果符号两边的数据不相等，结果是true。          |



#### 逻辑运算符

| 符号       | 说明                                                         |
| ---------- | ------------------------------------------------------------ |
| && 短路与  | 1. 两边都是true，结果是true<br/>2. 一边是false，结果是false<br/>**短路特点：符号左边是false，右边不再运算** |
| \|\|短路或 | 1. 两边都是false，结果是false<br/>2. 一边是true，结果是true<br/>**短路特点： 符号左边是true，右边不再运算** |
| ！ 取反    | 1. ! true 结果是false<br/>2. ! false结果是true               |

####  三元运算符

三元运算符格式：

` 数据类型 变量名 = 布尔类型表达式？结果1：结果2`

示例：

```java
public static void main(String[] args) {
    int i = (1==2 ? 100 : 200);
    System.out.println(i);//200
    int j = (3<=4 ? 500 : 600);
    System.out.println(j);//500
}
```





### 1.7  JShell脚本工具

JShell脚本工具是JDK9的新特性,当我们编写的代码非常少的时候，而又不愿意编写类，main方法，也不愿意去编译和运
行，这个时候可以使用JShell工具。

启动JShell工具，在DOS命令行直接输入JShell命令。



### 1.8 IDEA快捷键

| 快捷键                   | 功能                                   |
| ------------------------ | -------------------------------------- |
| Alt + Enter              | 导入包，自动代码修正                   |
| Ctrl+Y                   | 删除光标所在行                         |
| Ctrl+D                   | 复制光标所在行的内容，插入光标位置下面 |
| Ctrl+Alt+L               | 格式化代码                             |
| Ctrl+/                   | 单行注释                               |
| Ctrl+Shift+/             | 选中代码注释，多行注释，再按取消注释   |
| Alt+Ins                  | 自动生成代码，toString，get，set等方法 |
| Alt+Shift+ 上下箭头      | 移动当前代码行                         |
| Shift+F6                 | 同时修改不同地方的同一个量             |
| 输入sout                 | System.out.println();                  |
| 输入psvm                 | public static void main(String[] args) |
| 输入5.fori               | for (int i = 0; i < 5; i++)            |
| 输入arr.fori或者arr.forr | for循环变量数组                        |



## 2 三大语句



### 2.1 判断语句if-else

语句格式：

```java
if (判断条件1) {
   执行语句1;  
} else if (判断条件2) {
   执行语句2;  
}
...
}else if (判断条件n) {
  执行语句n;   
} else {
   执行语句n+1;  
}
```



### 2.2 选择语句swich-case

语句格式：

```java
switch(表达式) {
  case 常量值1:
    语句体1;
    break;
  case 常量值2:
    语句体2;
    break;
  ...
  default:
    语句体n+1;
    break;
}
```



### 2.3 循环语句

####  循环语句for

语句格式：

```java
for(初始化表达式①; 布尔表达式②; 步进表达式④){
循环体③        
}
```

执行流程
执行顺序：①②③④ >②③④>②③④…②不满足为止。
①负责完成循环变量初始化
②负责判断是否满足循环条件，不满足则跳出循环
③具体执行的语句
④循环后，循环条件所涉及变量的变化情况

 

#### 循环语句while

语句格式1:

```java
初始化表达式①
  while(布尔表达式②){
    循环体③
    步进表达式④
}
```

执行流程
执行顺序：①②③④ >②③④>②③④…②不满足为止。
①负责完成循环变量初始化。
②负责判断是否满足循环条件，不满足则跳出循环。
③具体执行的语句。
④循环后，循环变量的变化情况。



语句格式2：

```java
初始化表达式①
    do{
    循环体③
    步进表达式④
}while(布尔表达式②);
```

执行流程
执行顺序：①③④ >②③④>②③④…②不满足为止。
①负责完成循环变量初始化。
②负责判断是否满足循环条件，不满足则跳出循环。
③具体执行的语句
④循环后，循环变量的变化情况



### 2.4 break和continue

#### break

使用场景：终止 switch或者循环

- 在选择结构 switch语句中
- 在循环语句中
- 离开使用场景的存在是没有意义的

示例：

```java
public static void main(String[] args) {
    for (int i = 1; i<=10; i++) {
        //需求:打印完两次HelloWorld之后结束循环
        if(i == 3){
          break;
        }
        System.out.println("HelloWorld"+i);
    }
}
```

### 

#### continue

使用场景：结束本次循环，继续下一次的循环

示例：

```java
public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) {
        //需求:不打印第三次HelloWorld
        if(i == 3){
          continue;
        }
        System.out.println("HelloWorld"+i);
    }
}
```





## 3 数组

### 3.1 容器

容器： 是将多个数据存储到一起，每个数据称为该容器的元素。



### 3.2 数组概念

数组概念： 数组就是存储数据长度固定的容器，保证多个数据的数据类型要一致。



### 3.3 数组的定义

#### 方式一

格式：

```java
数组存储的数据类型[] 数组名字 = new 数组存储的数据类型[长度];
```

示例：

```java
int[] arr = new int[3];
```



#### 方式二

格式：

```java
数据类型[] 数组名 = new 数据类型[]{元素1,元素2,元素3...};
```

示例：

```java
int[] arr = new int[]{1,2,3,4,5};
```





#### 方式三

格式：

```java
数据类型[] 数组名 = {元素1,元素2,元素3...};
```

示例：

```java
int[] arr = {1,2,3,4,5};
```



【注意】：

1. 数组有定长特性，长度一旦指定，不可更改
2. `方式三`同样也进行了`new`操作



### 3.4 数组操作

- 索引： 每一个存储到数组的元素，都会自动的拥有一个编号，从0开始，这个自动编号称为数组索引(index)，可以通过数组的索引访问到数组中的元素。
- 数组的长度： 每个数组都具有长度，而且是固定的，Java中赋予了数组的一个属性，可以获取到数组的长度，语句为： `数组名 .length` ，属性length的执行结果是数组的长度，int类型结果。由次可以推断出，数组的最大索引值为` 数组名 .length-1 `。
- 索引访问数组中的元素: `数组名[索引]`

示例：

```java
public static void main(String[] args) {
    //定义存储int类型数组，赋值元素1，2，3，4，5
    int[] arr = {1,2,3,4,5};
    //为0索引元素赋值为6
    arr[0] = 6;
    //获取数组0索引上的元素
    int i = arr[0];
    System.out.println(i);
    //直接输出数组0索引元素
    System.out.println(arr[0]);
}
```

#### 数组取最大值

代码如下：

```java
public static void main(String[] args) {
    int[] arr = { 5, 15, 2000, 10000, 100, 4000 };
    //定义变量，保存数组中0索引的元素
    int max = arr[0];
    //遍历数组，取出每个元素
    for (int i = 0; i < arr.length; i++) {
      //遍历到的元素和变量max比较
      //如果数组元素大于max
      if (arr[i] > max) {
        //max记录住大值
        max = arr[i];
      }
    }
    System.out.println("数组最大值是： " + max);
}
```





#### 数组反转

代码如下：



```java
public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    /*
      循环中定义变量min=0最小索引
      max=arr.length‐1最大索引
      min++,max‐‐
      */
    for (int min = 0, max = arr.length ‐ 1; min <= max; min++, max‐‐) {
      //利用第三方变量完成数组中的元素交换
      int temp = arr[min];
      arr[min] = arr[max];
      arr[max] = temp;
    }
    // 反转后，遍历数组
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
}
```



### 3.5 数组内存划分



内存是计算机中的重要原件，临时存储区域，作用是运行程序。我们编写的程序是存放在硬盘中的，在硬盘中的程序是不会运行的，必须放进内存中才能运行，运行完毕后会清空内存。

Java虚拟机要运行程序，必须要对内存进行空间的分配和管理。

**Java的内存需要划分成为5个部分:**

1. 栈(Stack) :存放的都是方法中的局部变量。**方法的运行一定要在栈当中运行。**
   - 局部变量:方法的参数，或者是方法{}内部的变量
   - 作用域:一旦超出作用域，立刻从栈内存当中消失。

2. 堆(Heap) :凡是new出来的东西，都在堆当中。
   - 堆内存里面的东西都有一一个地址值: 16进制
   - 堆内存里面的数据，都有默认值。规则:
     - 如果是整数  默认为0
     - 如果是浮点数  默认为0.0
     - 如果是字符 默认为'\u0000'
     - 如果是布尔  默认为false
     - 如果是引用类型  默认为null
3. 方法区(Method Area) :存储class相关信息，包含方法的信息。

4. 本地方法栈(Native Method Stack) :与操作系统相关。

5. 寄存器(pc Register) :与CPU相关。



示例：

```java
public static void main(String[] args) {
    
    // 定义数组，存储3个元素
    int[] arr = new int[3];
    
    //数组索引进行赋值
    arr[0] = 5;
    arr[1] = 6;
    arr[2] = 7;
    
    //输出3个索引上的元素值
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);

}
```

代码执行流程：

1. main方法进入方法栈。程序运行前main方法存储在方法区，程序运行时，main方法进入栈
2. 创建数组。JVM在堆内存中开辟一个内存空间存储数组（new int[3])，数组中的三个元素默认值为0。内存地址以一个十六进制数表示（0xff343）。
3. JVM将内存地址赋值给变量 arr。**变量arr保存的是数组内存中的地址，而不是一个具体的数值，因此数组为引用数据类型。**
4. 根据数组索引给数组的3个元素赋值，分布赋值为5，6，7。然后进行打印。

![数组内存图](./image/数组内存图.jpg)



两个变量指向同一个数据：

```java
public static void main(String[] args) {
    // 定义数组，存储3个元素
    int[] arr = new int[3];
    //数组索引进行赋值
    arr[0] = 5;
    arr[1] = 6;
    arr[2] = 7;
    //输出3个索引上的元素值
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);
    //定义数组变量arr2，将arr的地址赋值给arr2
    int[] arr2 = arr;
    arr2[1] = 9;
    System.out.println(arr[1]);
}
```



上述代码中，arr和arr2都指向同一个内存地址，`arr2[1] = 9`执行后，`arr[1]`也会跟着改变。



## 4   面向对象

Java语言是一种面向对象的程序设计语言，而面向对象思想是一种程序设计思想，我们在面向对象思想的指引下，
使用Java语言去设计、开发计算机程序。 这里的对象泛指现实中一切事物，每种事物都具备自己的属性和行为。面向对象思想就是在计算机程序设计过程中，参照现实中事物，将事物的属性特征、行为特征抽象出来，描述成计算机事件的设计思想。 它区别于面向过程思想，强调的是通过调用对象的行为来实现功能，而不是自己一步一步的去操作实现。 



面向对象思想是一种更符合我们思考习惯的思想，它可以将复杂的事情简单化，并将我们从执行者变成了指挥者。**面向对象的语言中，包含了三大基本特征，即封装、继承和多态。**

### 4.1 类和对象

-  类 ：是一组相关**属性**和**行为**的集合。可以看成是一类事物的模板，使用事物的属性特征和行为特征来描述该
  类事物。
  - 属性：事物的状态信息。 
  - 行为：事物能够做什么。
-  对象 ：是一类事物的具体体现。对象是类的一个实例，必然具备该类事物的属性和行为。
-  类与对象的关系
  - 类是对一类事物的描述，是 抽象的。
  - 对象是一类事物的实例，是 具体的。
  - 类是对象的模板，对象是类的实体 。



### 4.2 类的定义

定义格式：

```java
public class ClassName {
  //成员变量
  //成员方法
}
```



示例：

```java
public class Student {
   //成员变量  
   String name；//姓名  
   int age；//年龄
   
   //成员方法
   //学习的方法
    public void study() {
    System.out.println("好好学习，天天向上");
  }
  //吃饭的方法
  publicvoid eat() {
    System.out.println("学习饿了要吃饭");
  }
}    
```



### 4.3 对象使用



对象的使用格式

创建对象：

```java
类名 对象名 = new 类名();
```



使用对象访问类中的成员:

```java
对象名.成员变量；
对象名.成员方法()；
```



示例：

```java
public class Test01_Student {
  public static void main(String[] args) {
    //创建对象格式：类名 对象名 = new 类名();
    Student s = new Student();
    System.out.println("s:"+s); //cn.itcast.Student@100363
    //直接输出成员变量值
    System.out.println("姓名："+s.name); //null
    System.out.println("年龄："+s.age); //0
    System.out.println("‐‐‐‐‐‐‐‐‐‐");
    //给成员变量赋值
    s.name = "赵丽颖";
    s.age = 18;
    //再次输出成员变量的值
    System.out.println("姓名："+s.name); //赵丽颖
    System.out.println("年龄："+s.age); //18
    System.out.println("‐‐‐‐‐‐‐‐‐‐");
    //调用成员方法
    s.study(); // "好好学习，天天向上"
    s.eat(); // "学习饿了要吃饭"
  }
}
```



成员变量的默认值

- 基本类型：
  - 整数（byte，short，int，long）：0
  - 浮点数（float，double）：0.0
  - 字符（char）： '\u0000'
  - 布尔（boolean）：false

	- 引用类型：数组，类，接口 null



### 4.4 成员变量和局部变量区别

```java
public class Car{
    String color; //成员变量
    public void drive(){
        int speed = 80; //局部变量
        //......
    }
}
```





- 在类中的位置不同
  - 成员变量：类中，方法外
  -  局部变量：方法中或者方法声明上 (形式参数)
- 作用范围不一样
  - 成员变量：类中
  - 局部变量：方法中
- 初始化值的不同
  - 成员变量：有默认值
  - 局部变量：没有默认值。必须先定义，赋值，最后使用在内
- 存中的位置不同 
  - 成员变量：堆内存
  - 局部变量：栈内存
- 生命周期不同
  - 成员变量：随着对象的创建而存在，随着对象的消失而消失
  - 局部变量：随着方法的调用而存在，随着方法的调用完毕而消失           



## 5 封装

面向对象编程语言是对客观世界的模拟，客观世界里成员变量都是隐藏在对象内部的，外界无法直接操作和修改。封装可以被认为是一个保护屏障，防止该类的代码和数据被其他类随意访问。要访问该类的数据，必须通过指定的方式。适当的封装可以让代码更容易理解与维护，也加强了代码的安全性。

封装的步骤
1. 使用  private 关键字来修饰成员变量。
2. 对需要访问的成员变量，提供对应的一对  getXxx 方法 、 setXxx 方法。

### 5.1 private关键字

private的含义
1. private是一个权限修饰符，代表最小权限。
2. 可以修饰成员变量和成员方法。
3. 被private修饰后的成员变量和成员方法，只在本类中才能访问。

private的使用格式：

```java
private 数据类型 变量名 ；
```



1. 使用  private 修饰成员变量，代码如下：

```java
public class Student {
  private String name;
  private int age;
}
```



2. 提供  getXxx 方法 /  setXxx 方法，可以访问成员变量，代码如下：

```java
public class Student {
  private String name;
  private int age;
  public void setName(String n) {
    name = n;
  }
  public String getName() {
    return name;
  }
  public void setAge(int a) {
    age = a;
  }
  public int getAge() {
    return age;
  }
}
```



### 5.2 this关键字

this的含义this代表所在类的当前对象的引用（地址值），即对象自己的引用。

**方法被哪个对象调用，方法中的this就代表那个对象。即谁在调用，this就代表谁。**

this使用格式:

```java
this.成员变量名；
```



使用  this 修饰方法中的变量，解决成员变量被隐藏的问题，代码如下：

> 由于形参变量名与成员变量名重名，导致成员变量名被隐藏，方法中的变量名，无法访问到成员变量，从而赋值失败。所以，我们只能使用this关键字，来解决这个重名问题。

```java
public class Student {
  private String name;
  private int age;
  public void setName(String name) {
    //name = name;
    this.name = name;
  }
  public String getName() {
    return name;
  }
  public void setAge(int age) {
    //age = age;
    this.age = age;
  }
  public int getAge() {
    return age;
  }
```



### 5.3 构造方法

当一个对象被创建时候，构造方法用来初始化该对象，给对象的成员变量赋初始值。

**无论你与否自定义构造方法，所有的类都有构造方法，因为Java自动提供了一个无参数构造方法，一旦自己定义了构造方法，Java自动提供的默认无参数构造方法就会失效。**

构造方法的定义格式:


```java
修饰符 构造方法名(参数列表){
// 方法体    
}
```



构造方法的写法上，方法名与它所在的类名相同。它没有返回值，所以不需要返回值类型，甚至不需要void。使用构造方法后，代码如下：

```java
public class Student {
  private String name;
  private int age;
  // 无参数构造方法
  public Student() {}
  // 有参数构造方法
  public Student(String name,int age) {
    this.name = name;
    this.age = age;
  }
}
```



注意事项
1. 如果你不提供构造方法，系统会给出无参数构造方法。
2. 如果你提供了构造方法，系统将不再提供无参数构造方法。
3. 构造方法是可以重载的，既可以定义参数，也可以不定义参数。



### 5.4 JavaBean

JavaBean 是 Java语言编写类的一种标准规范。符合 JavaBean 的类，要求类必须是具体的和公共的，并且具有无参数的构造方法，提供用来操作成员变量的 set 和 get 方法。  

```java
public class ClassName{
  //成员变量
  //构造方法
  //无参构造方法【必须】
  //有参构造方法【建议】
  //成员方法   
  //getXxx()
  //setXxx()
}
```



编写符合 JavaBean 规范的类，以学生类为例，标准代码如下：

```java
public class Student {
  //成员变量
  private String name;
  private int age;
  //构造方法
  public Student() {}
  public Student(String name,int age) {
    this.name = name;
    this.age = age;
  }
  //成员方法
  publicvoid setName(String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }
  publicvoid setAge(int age) {
    this.age = age;
  }
  publicint getAge() {
    return age;
  }
}
```



## 6 继承

多个类中存在相同属性和行为时，将这些内容抽取到单独一个类中，那么多个类无需再定义这些属性和行为，只要继承那一个类即可。

其中，多个类可以称为子类，单独那一个类称为父类、超类（superclass）或者基类。

父类更通用，子类更具体。我们通过继承，可以使多种事物之间形成一种关系体系。

### 6.1 定义

**继承** ：就是子类继承父类的属性和行为，使得子类对象具有与父类相同的属性、相同的行为。子类可以直接访问父类中的非私有的属性和行为。

好处:
1. 提高代码的复用性。
2. 类与类之间产生了关系，是多态的前提。



格式：

通过  `extends` 关键字，可以声明一个子类继承另外一个父类，定义格式如下：

```java
class 父类 {
...    
}
class 子类 extends 父类 {
...    
}
```



示例：

```java
/*
 * 定义员工类Employee，做为父类
 */
class Employee {
String name; // 定义name属性    
// 定义员工的工作方法    
public void work() {    
System.out.println("尽心尽力地工作");        
}    
}
/*
 * 定义讲师类Teacher 继承 员工类Employee
 */
class Teacher extends Employee {
// 定义一个打印name的方法    
public void printName() {    
System.out.println("name=" + name);        
}    
}
/*
 * 定义测试类
 */
public class ExtendDemo01 {
public static void main(String[] args) {    
        // 创建一个讲师类对象
Teacher t = new Teacher();        
     
        // 为该员工类的name属性进行赋值
t.name = "小明";         
     
       // 调用该员工的printName()方法  
t.printName(); // name = 小明        
       
       // 调用Teacher类继承来的work()方法  
       t.work();  // 尽心尽力地工作  
}    
}
```





###  6.2 继承后的特点

#### 成员变量

- 成员变量不重名
  - 如果子类父类中出现不重名的成员变量，这时的访问是没有影响的。
- 成员变量重名
  - 如果子类父类中出现重名的成员变量，这时的访问是有影响的。
  - 子父类中出现了同名的成员变量时，在子类中需要访问父类中非私有成员变量时，需要使用 `super` 关键字，修饰父类成员变量，类似于之前学过的 ` this` 。

#### 成员方法

- 成员方法不重名
  - 如果子类父类中出现不重名的成员方法，这时的调用是没有影响的。
  - 对象调用方法时，会先在子类中查找有没有对应的方法，若子类中存在就会执行子类中的方法，若子类中不存在就会执行父类中相应的方法。
- 成员方法重名 ——**重写(Override)**
  - 如果子类父类中出现重名的成员方法，这时的访问是一种特殊情况，叫做方法重写 (Override)。



#### 构造方法

- 构造方法的名字是与类名一致的。所以子类是无法继承父类构造方法的。
- 构造方法的作用是初始化成员变量的。所以子类的初始化过程中，必须先执行父类的初始化动作。子类的构造方法中默认有一个 super() ，表示调用父类的构造方法，父类成员变量初始化后，才可以给子类使用。

```java
class Fu {
  private int n;
  Fu(){
    System.out.println("Fu()");
  }
}

class Zi extends Fu {
  Zi(){
    // super（），调用父类构造方法
    super();
    System.out.println("Zi（）");
  } 
}
public class ExtendsDemo07{
  public static void main (String args[]){
    Zi zi = new Zi();
  }
}
输出结果：
Fu（）
Zi（）
```



#### Java继承特点

Java只支持单继承，不支持多继承。



### 6.3 重写(Override)

方法重写 ：子类中出现与父类一模一样的方法时（返回值类型，方法名和参数列表都相同），会出现覆盖效果，也称为重写或者复写。声明不变，重新实现。

示例：

子类可以根据需要，定义特定于自己的行为。既沿袭了父类的功能名称，又根据子类的需要重新实现父类方法，从而进行扩展增强。比如新的手机增加来电显示头像的功能，代码如下：

```java
class Phone {
    public void sendMessage(){    
    	System.out.println("发短信");        
    }    
    public void call(){    
    	System.out.println("打电话");        
    }    
    public void showNum(){    
    	System.out.println("来电显示号码");        
    }    
}

//智能手机类
class NewPhone extends Phone {
   
    //重写父类的来电显示号码功能，并增加自己的显示姓名和图片功能    
    public void showNum(){    
        //调用父类已经存在的功能使用super        
        super.showNum();        
        //增加自己特有显示姓名和图片功能        
        System.out.println("显示来电姓名");        
        System.out.println("显示头像");        
    }    
}
public class ExtendsDemo06 {
public static void main(String[] args) {    
       // 创建子类对象  
       NewPhone np = new NewPhone()；  
       
        // 调用父类继承而来的方法
        np.call();
     
       // 调用子类重写的方法  
       np.showNum();  
}    
}

```





**注意事项**

1. 子类方法覆盖父类方法，必须要保证权限大于等于父类权限。
2. 子类方法覆盖父类方法，返回值类型、函数名和参数列表都要一模一样。



### 6.4 super 和this

父类空间优先于子类对象产生

在每次创建子类对象时，先初始化父类空间，再创建其子类对象本身。目的在于子类对象中包含了其对应的父类空间，便可以包含其父类的成员，如果父类成员非private修饰，则子类可以随意使用父类成员。代码体现在子类的构造方法调用时，一定先调用父类的构造方法。

super和this的含义

- super ：代表父类的存储空间标识(可以理解为父亲的引用)。
- this ：代表当前对象的引用(谁调用就代表谁)。



super和this的用法

1. 访问成员

```java
this.成员变量     ‐‐    本类的   
super.成员变量     ‐‐    父类的  
this.成员方法名()   ‐‐    本类的      
super.成员方法名()   ‐‐    父类的
```



示例：

```java
class Animal {
    public void eat() {
        System.out.println("animal : eat");
    }
}
class Cat extends Animal {
    public void eat() {
        System.out.println("cat : eat");
    }
    public void eatTest() {
        this.eat();   // this  调用本类的方法
        super.eat();  // super 调用父类的方法
    }
}
public class ExtendsDemo {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        Cat c = new Cat();
        c.eatTest();
    }
}
输出结果为：
animal : eat
cat : eat
animal : eat
```



2. 访问构造方法



```java
this(...)     ‐‐    本类的构造方法   
super(...)    ‐‐    父类的构造方法
```



- 子类的每个构造方法中均有默认的super()，调用父类的空参构造。手动调用父类构造会覆盖默认的super()。
- super() 和 this() 都必须是在构造方法的第一行，所以不能同时出现。



### 6.5 抽象类-abstract

父类中的方法，被它的子类们重写，子类各自的实现都不尽相同。那么父类的方法声明和方法主体，只有声明还有意义，而方法主体则没有存在的意义了。我们把没有方法主体的方法称为**抽象方法**。**Java语法规定，包含抽象方法的类就是抽象类**。



#### 抽象方法 : 没有方法体的方法。

使用 abstract 关键字修饰方法，该方法就成了抽象方法，抽象方法只包含一个方法名，而没有方法体

格式：

```java
修饰符 abstract 返回值类型 方法名 (参数列表)；
```



示例：

```java
public abstract void run()；
```



#### 抽象类 ：包含抽象方法的类。

格式：

```java
abstract class 类名字 {
 
}
```



示例：

```java
public abstract class Animal {
    public abstract void run()；
}
```





抽象的使用：

继承抽象类的子类必须重写父类所有的抽象方法。否则，该子类也必须声明为抽象类。最终，必须有子类实现该父类的抽象方法，否则，从最初的父类到最终的子类都不能创建对象，失去意义。

```java
public class Cat extends Animal {
    public void run (){
       System.out.println("小猫在墙头走~~~")；         
    }
}
public class CatTest {
   public static void main(String[] args) {   
        // 创建子类对象
        Cat c = new Cat();
      
        // 调用run方法
        c.run();
   }  
}
输出结果：
小猫在墙头走~~~
```

此时的方法重写，是子类对父类抽象方法的完成实现，我们将这种方法重写的操作，也叫做实现方法。



## 7 多态

多态 ： 是指同一行为，具有多个不同表现形式。

### 7.1 多态的体现

多态体现的格式：

```java
父类类型 变量名 = new 子类对象； //父类类型：指子类对象继承的父类类型，或者实现的父接口类型。
变量名.方法名();
```



当使用多态方式调用方法时，首先检查父类中是否有该方法，如果没有，则编译错误；如果有，执行的是子类重写后方法。

定义父类：

```java
public abstract class Animal { 
    public abstract void eat(); 
}
```



定义子类：

```java
class Cat extends Animal { 
    public void eat() { 
        System.out.println("吃鱼"); 
    } 
} 
class Dog extends Animal { 
    public void eat() { 
        System.out.println("吃骨头"); 
    } 
}
```

定义测试类：

```java
public class Test {
    public static void main(String[] args) {
        // 多态形式，创建对象
        Animal a1 = new Cat(); 
        // 调用的是 Cat 的 eat
        a1.eat();         
        // 多态形式，创建对象
        Animal a2 = new Dog();
        // 调用的是 Dog 的 eat
        a2.eat();              
    } 
}
```



### 7.2 多态的好处

实际开发的过程中，父类类型作为方法形式参数，传递子类对象给方法，进行方法的调用，更能体现出多态的扩展性与便利。

定义父类：

```java
public abstract class Animal { 
    public abstract void eat(); 
} 
```



定义子类：

```java
class Cat extends Animal { 
    public void eat() { 
        System.out.println("吃鱼"); 
    } 
} 
class Dog extends Animal { 
    public void eat() { 
        System.out.println("吃骨头"); 
    } 
}
```

定义测试类：

```java
public class Test {
    public static void main(String[] args) {
        // 多态形式，创建对象
        Cat c = new Cat(); 
        Dog d = new Dog();
        // 调用showCatEat
        showCatEat(c);
        // 调用showDogEat
        showDogEat(d);
        /*
        以上两个方法, 均可以被showAnimalEat(Animal a)方法所替代
        而执行效果一致
        */
        showAnimalEat(c);
        showAnimalEat(d);
    }
    public static void showCatEat (Cat c){
        c.eat();
    }
    public static void showDogEat (Dog d){
        d.eat();
    }
    public static void showAnimalEat (Animal a){
        a.eat();
    }
}
```



由于多态特性的支持， showAnimalEat方法的Animal类型，是Cat和Dog的父类类型，父类类型接收子类对象，当然可以把Cat对象和Dog对象，传递给方法。

当eat方法执行时，多态规定，执行的是子类重写的方法，那么效果自然与showCatEat、showDogEat方法一致，所以showAnimalEat完全可以替代以上两方法。

不仅仅是替代，在扩展性方面，无论之后再多的子类出现，我们都不需要编写showXxxEat方法了，直接使用showAnimalEat都可以完成。

所以，多态的好处，体现在，可以使程序编写的更简单，并有良好的扩展。

### 7.3  引用类型转换

多态的转型分为向上转型与向下转型两种

#### 向上转型

向上转型 ：多态本身是子类类型向父类类型向上转换的过程，这个过程是默认的。当父类引用指向一个子类对象时，便是向上转型。

使用格式：

```java
父类类型  变量名 = new 子类类型();
如：Animal a = new Cat();
```

#### 向下转型

向下转型 ：父类类型向子类类型向下转换的过程，这个过程是强制的。一个已经向上转型的子类对象，将父类引用转为子类引用，可以使用强制类型转换的格式，便是向下转型。



使用格式：

```java
子类类型 变量名 = (子类类型) 父类变量名;
如:Cat c =(Cat) a; 
```

#### 为什么要转型

当使用多态方式调用方法时，首先检查父类中是否有该方法，如果没有，则编译错误。也就是说，不能调用子类拥有，而父类没有的方法。编译都错误，更别说运行了。这也是多态给我们带来的一点"小麻烦"。所以，想要调用子类特有的方法，必须做向下转型。

转型演示，代码如下：

定义类：

```java
abstract class Animal { 
    abstract void eat(); 
} 
class Cat extends Animal { 
    public void eat() { 
        System.out.println("吃鱼"); 
    } 
    public void catchMouse() { 
        System.out.println("抓老鼠"); 
    } 
} 
class Dog extends Animal { 
    public void eat() { 
        System.out.println("吃骨头"); 
    } 
    public void watchHouse() { 
        System.out.println("看家"); 
    } 
}
```



定义测试类：

```java
public class Test {
    public static void main(String[] args) {
        // 向上转型 
        Animal a = new Cat(); 
        a.eat();  // 调用的是 Cat 的 eat               
        // 向下转型 
        Cat c = (Cat)a;      
        c.catchMouse();  // 调用的是 Cat 的 catchMouse        
    } 
}
```

#### 转型的异常

转型的过程中，一不小心就会遇到这样的问题，请看如下代码：

```java
public class Test {
    public static void main(String[] args) {
        // 向上转型 
        Animal a = new Cat(); 
        a.eat();               // 调用的是 Cat 的 eat
        // 向下转型 
        Dog d = (Dog)a;      
        d.watchHouse();        // 调用的是 Dog 的 watchHouse 【运行报错】
    } 
}
```



这段代码可以通过编译，但是运行时，却报出了  `ClassCastException `，类型转换异常！这是因为，明明创建了Cat类型对象，运行时，当然不能转换成Dog对象的。这两个类型并没有任何继承关系，不符合类型转换的定义。

为了避免`ClassCastException`的发生，Java提供了 ` instanceof `关键字，给引用变量做类型的校验，格式如下：

```java
变量名 instanceof 数据类型
如果变量属于该数据类型，返回true。
如果变量不属于该数据类型，返回false。
```

所以，转换前，我们最好先做一个判断，代码如下：

```java
public class Test {
    public static void main(String[] args) {
        // 向上转型 
        Animal a = new Cat(); 
        a.eat();               // 调用的是 Cat 的 eat
        // 向下转型 
        if (a instanceof Cat){
            Cat c = (Cat)a;      
            c.catchMouse();        // 调用的是 Cat 的 catchMouse
        } else if (a instanceof Dog){
            Dog d = (Dog)a;      
            d.watchHouse();       // 调用的是 Dog 的 watchHouse
        }
    } 
}
```





## 8 接口

接口，是Java语言中一种引用类型，是方法的集合，如果说类的内部封装了成员变量、构造方法和成员方法，那么接口的内部主要就是封装了方法，包含**抽象方法**（JDK 7及以前），**默认方法**和**静态方法**（JDK 8），**私有方法**（JDK 9）。

接口的定义，它与定义类方式相似，但是使用  interface 关键字。它也会被编译成.class文件，但一定要明确它并不是类，而是另外一种引用数据类型。

接口的使用，它不能创建对象，但是可以被实现（ implements ，类似于被继承）。一个实现接口的类（可以看做是接口的子类），需要实现接口中所有的抽象方法，创建该类对象，就可以调用方法了，否则它必须是一个抽象类。

定义格式

```java
 public interface 接口名称 {
    // 抽象方法
    // 默认方法
    // 静态方法
    // 私有方法
}
```



类与接口的关系为实现关系，即类实现接口，该类可以称为接口的实现类，也可以称为接口的子类。实现的动作类似继承，格式相仿，只是关键字不同，实现使用 ` implements` 关键字。

非抽象子类实现接口：

1. 必须重写接口中所有抽象方法。
2. 继承了接口的默认方法，即可以直接调用，也可以重写。

实现格式：

```java
class 类名 implements 接口名 {
    // 重写接口中抽象方法【必须】
   // 重写接口中默认方法【可选】  
}
```



### 8.1 抽象方法

抽象方法：使用 `abstract` 关键字修饰，可以省略，没有方法体。该方法供子类实现使用。

**抽象方法必须实现。**

定义接口：

```java
public interface LiveAble {
    // 定义抽象方法
    public abstract void eat();
    public abstract void sleep();
}
```



接口实现类：

```java
public class Animal implements LiveAble {
    @Override
    public void eat() {
        System.out.println("吃东西");
    }
    @Override
    public void sleep() {
        System.out.println("晚上睡");
    }
}
```



测试类：

```java
public class InterfaceDemo {
    public static void main(String[] args) {
        // 创建子类对象 
        Animal a = new Animal();
        // 调用实现后的方法
        a.eat();
        a.sleep();
    }
}
输出结果：
吃东西
晚上睡
```

### 8.2 默认方法

使用  `default `修饰，不可省略，供子类调用或者子类重写。

可以**继承**，可以**重写**，二选一，但是只能通过实现类的对象来调用。

#### 继承默认方法

定义接口：

```java
public interface LiveAble {
    public default void fly(){
        System.out.println("天上飞");
    }
}
```

定义实现类：

```java
public class Animal implements LiveAble {
// 继承，什么都不用写，直接调用    
}
```

定义测试类：

```java
public class InterfaceDemo {
    public static void main(String[] args) {
        // 创建子类对象 
        Animal a = new Animal();
        // 调用默认方法
        a.fly();
    }
}
输出结果：
天上飞
```

#### 重写默认方法

定义接口:

```java
public interface LiveAble {
    public default void fly(){
        System.out.println("天上飞");
    }
}
```



定义实现类：

```java
public class Animal implements LiveAble {
    @Override
    public void fly() {
        System.out.println("自由自在的飞");
    }
}
```

定义测试类：

```java
public class InterfaceDemo {
    public static void main(String[] args) {
        // 创建子类对象 
        Animal a = new Animal();
        // 调用重写方法
        a.fly();
    }
}
输出结果：
自由自在的飞
```



### 8.3 静态方法

静态方法：使用  static 修饰，供接口直接调用。

静态方法与.class 文件相关，**只能使用接口名调用**，不可以通过实现类的类名或者实现类的对象调用

定义接口：

```java
public interface LiveAble {
    public static void run(){
        System.out.println("跑起来~~~");
    }
}
```



定义实现类：

```java
public class Animal implements LiveAble {
// 无法重写静态方法    
}
```

测试类：

```java
public class InterfaceDemo {
    public static void main(String[] args) {
        // Animal.run(); // 【错误】无法继承方法,也无法调用
        LiveAble.run(); //
    }
}
输出结果：
跑起来~~~
```

### 8.4 私有方法

私有方法：使用  `private` 修饰，供接口中的默认方法或者静态方法调用。

- 私有方法：只有默认方法可以调用。
- 私有静态方法：默认方法和静态方法可以调用。

如果一个接口中有多个默认方法，并且方法中有重复的内容，那么可以抽取出来，封装到私有方法中，供默认方法去调用。从设计的角度讲，私有的方法是对默认方法和静态方法的辅助。

示例：

```java
public interface LiveAble {
    default void func(){
        func1();
        func2();
    }
    private void func1(){
        System.out.println("跑起来~~~");
    }
    private void func2(){
        System.out.println("跑起来~~~");
    }
}
```

### 8.5  接口的多实现

在继承体系中，一个类只能继承一个父类。而对于接口而言，一个类是可以实现多个接口的，这叫做接口的多实现。并且，一个类能继承一个父类，同时实现多个接口。



实现格式：

```java
class 类名 [extends 父类名] implements 接口名1,接口名2,接口名3... {
    // 重写接口中抽象方法【必须】
   // 重写接口中默认方法【不重名时可选】  
}
```

#### 抽象方法多实现

接口中，有多个抽象方法时，实现类必须重写所有抽象方法。**如果抽象方法有重名的，只需要重写一次。**

定义多个接口：

```java
interface A {
    public abstract void showA();
    public abstract void show();
}
interface B {
    public abstract void showB();
    public abstract void show();
}
```

实现：

```java
public class C implements A,B{
    @Override
    public void showA() {
        System.out.println("showA");
    }
    @Override
    public void showB() {
        System.out.println("showB");
    }
    @Override
    public void show() {
        System.out.println("show");
    }
}
```



#### 默认方法多实现

接口中，有多个默认方法时，实现类都可继承使用。**如果默认方法有重名的，必须重写一次。**

定义多个接口：

```java
interface A {
    public default void methodA(){}
    public default void method(){}
}
interface B {
    public default void methodB(){}
    public default void method(){}
}
```



实现：

```java
public class C implements A,B{
    @Override
    public void method() {
        System.out.println("method");
    }
}
```



#### 静态方法多实现

接口中，存在同名的静态方法并不会冲突，原因是只能通过各自接口名访问静态方法。



#### 优先级的问题

当一个类，既继承一个父类，又实现若干个接口时，父类中的成员方法与接口中的默认方法重名，子类就近选择执行父类的成员方法。

定义接口：

```java
interface A {
    public default void methodA(){
        System.out.println("AAAAAAAAAAAA");
    }
}
```



定义父类：

```java
class D {
    public void methodA(){
        System.out.println("DDDDDDDDDDDD");
    }
}
```



定义子类：

```java
class C extends D implements A {
   // 未重写methodA方法  
}
```



定义测试类：

```java
public class Test {
    public static void main(String[] args) {
        C c = new C();
        c.methodA();
    }
}
输出结果:
DDDDDDDDDDDD
```



### 8.6 接口的多继承

一个接口能继承另一个或者多个接口，这和类之间的继承比较相似。接口的继承使用  extends 关键字，子接口继承父接口的方法。如果父接口中的默认方法有重名的，那么子接口需要重写一次。



定义父接口：

```java
interface A {
    public default void method(){
        System.out.println("AAAAAAAAAAAAAAAAAAA");
    }
}
interface B {
    public default void method(){
        System.out.println("BBBBBBBBBBBBBBBBBBB");
    }
}
```

定义子接口：

```java
interface D extends A,B{
    @Override
    public default void method() {
        System.out.println("DDDDDDDDDDDDDD");
    }
}
```

### 8.7 主要事项

1. 子接口重写默认方法时，default关键字可以保留。
2. 子类重写默认方法时，default关键字不可以保留。
3. **接口中，无法定义成员变量，但是可以定义常量，其值不可以改变，默认使用 `public static final`修饰。**
4. 接口中，没有构造方法，不能创建对象。
5. 接口中，没有静态代码块。

## 9  static关键字

关于  static 关键字的使用，它可以用来修饰的**成员变量**和**成员方法**，被修饰的成员是属于类的，而不是单单是属
于某个对象的。也就是说，既然属于类，就可以不靠创建对象来调用了。



### 9.1 类变量

当  static 修饰**成员变量**时，该变量称为**类变量**。该类的每个对象都共享同一个类变量的值。任何对象都可以更改该类变量的值，但也可以在不创建该类的对象的情况下对类变量进行操作。

格式：

```java
static 数据类型 变量名；
```



示例：

创建Student类

```java
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

```



调用：

```java
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

    }
}
```



**类变量的修改还调用一般直接使用类名**



### 9.2  静态方法

当 static 修饰成员方法时，该方法称为**类方法** 。**静态方法在声明中有 static ，建议使用类名来调用，而不需要创建类的对象。**调用方式非常简单。



使用 static关键字修饰的成员方法，习惯称为**静态方法**。



格式：

```java
修饰符 static 返回值类型 方法名 (参数列表){
// 执行语句     
}
```



示例： 在Student类中定义静态方法

```java
public static void showNum() {
  System.out.println("num:" +  numberOfStudent);
}
```





调用格式：

被static修饰的成员可以并且**建议通过类名直接访问**。虽然也可以通过对象名访问静态成员，原因即多个对象均属于一个类，共享使用同一个静态成员，但是不建议，会出现警告信息。

格式：

```java
// 访问类变量
类名.类变量名；
    
// 调用静态方法
类名.静态方法名(参数)；
```



示例：

```java
//访问静态变量(类变量)
System.out.println(Student.room);

//访问静态方法
Student.showNum();
```



**静态方法调用的注意事项：**

- 静态方法可以直接访问类变量和静态方法。
- 静态方法 不能直接访问普通成员变量或成员方法。反之成员方法可以直接访问类变量或静态方法。
- 静态方法中，不能使用 this关键字。



### 9.3  静态原理图解

static 修饰的内容：

- 是随着类的加载而加载的，且只加载一次。
- 存储于一块固定的内存区域（静态区），所以，可以直接被类名调用。
- 它优先于对象存在，所以，可以被所有对象共享。



![静态的内存图](./image/静态的内存图.png)



### 9.4  静态代码块

静态代码块 ：定义在成员位置，使用static修饰的代码块{ }。

- 位置：类中方法外。
- 执行：**随着类的加载而执行且执行一次，优先于 main方法和构造方法的执行**。



格式：

```java
public class ClassName{
  static {
    // 执行语句
  }
}
```





示例：

```java
public class Person {

    static {
        System.out.println("静态代码块执行！");
    }

    public Person() {
        System.out.println("构造方法执行！");
    }

}
```



调用Person类

```java
/*
静态代码块特点：当第一次用到本类时，静态代码块执行唯一的一次。
静态内容总是优先于非静态，所以静态代码块比构造方法先执行。

静态代码块的典型用途：用来一次性地对静态成员变量进行赋值。
 */
public class Demo04Static {

    public static void main(String[] args) {
        
        //静态代码块先执行，且只执行一次，构造方法执行了两次
        Person one = new Person();
        Person two = new Person();
    }

}
```



## 10  final关键字

学习了继承后，我们知道，子类可以在父类的基础上改写父类内容，比如，方法重写。那么我们能不能随意的继承API中提供的类，改写其内容呢？显然这是不合适的。为了避免这种随意改写的情况，Java提供了`final `关键字，用于修饰不可改变内容。

**`final `： 不可改变。可以用于修饰类、方法和变量。**

- 类：被修饰的类，不能被继承。
- 方法：被修饰的方法，不能被重写。
- 变量：被修饰的变量，不能被重新赋值。

### 10.1 修饰类

格式如下：

```java
final class 类名 {
 
}
```

查询 API发现像  public final class String 、 public final class Math 、 public final class Scanner等，很多我们学习过的类，都是被final修饰的，目的就是供我们使用，而不让我们所以改变其内容。

### 10.2 修饰方法

格式如下：

```java
修饰符 final 返回值类型 方法名(参数列表){
    //方法体
}
```

**重写被  final 修饰的方法，编译时就会报错。**

### 10.3 修饰变量

#### 局部变量—基本类型

基本类型的局部变量，被final修饰后，只能赋值一次，不能再更改。代码如下：

```java
public class FinalDemo1 {
    public static void main(String[] args) {
        // 声明变量，使用final修饰
        final int a;
        // 第一次赋值
        a = 10;
        // 第二次赋值
        a = 20; // 报错,不可重新赋值
        // 声明变量，直接赋值，使用final修饰
        final int b = 10;
        // 第二次赋值
        b = 20; // 报错,不可重新赋值
    }
}
```



####  局部变量—引用类型

引用类型的局部变量，被final修饰后，只能指向一个对象，地址不能再更改。但是不影响对象内部的成员变量值的修改，代码如下：

```java
public class FinalDemo2 {
    public static void main(String[] args) {
        // 创建 User 对象
        final   User u = new User();
        // 创建 另一个 User对象
        u = new User(); // 报错，指向了新的对象，地址值改变。
        // 调用setName方法
        u.setName("张三"); // 可以修改
    }
}
```



#### 成员变量

成员变量涉及到初始化的问题，初始化方式有两种，只能二选一：

- 显示初始化:

```java
public class User {
    final String USERNAME = "张三";
    private int age;
}
```

- 构造方法初始化:

```java
public class User {
    final String USERNAME ;
    private int age;
    public User(String username, int age) {
        this.USERNAME = username;
        this.age = age;
    }
}
```





**被final修饰的常量名称，一般都有书写规范，所有字母都大写。**



##  11 权限修饰符

在Java中提供了四种访问权限，使用不同的访问权限修饰符修饰时，被修饰的内容会有不同的访问权限，

- public ：公共的。
- protected ：受保护的
- default ：默认的
- private ：私有的

不同权限的访问能力:

| 类                     | public | protected | default（空的） | private |
| ---------------------- | ------ | --------- | --------------- | ------- |
| 同一类中               | √      | √         | √               | √       |
| 同一包中(子类与无关类) | √      | √         | √               |         |
| 不同包的子类           | √      | √         |                 |         |
| 不同包中的无关类       | √      |           |                 |         |

可见，public具有最大权限。private则是最小权限。

编写代码时，如果没有特殊的考虑，建议这样使用权限：

- 成员变量使用 private ，隐藏细节。
- 构造方法使用 public ，方便创建对象。
- 成员方法使用 public ，方便调用方法。



**注意：不加权限修饰符，其访问能力与default修饰符相同**

## 12 内部类

将一个类A定义在另一个类B里面，里面的那个类A就称为内部类，B则称为外部类。

### 12.1 成员内部类

成员内部类 ：定义在类中方法外的类。

定义格式：

```java
class 外部类 {
    class 内部类{
    }
}
```



在描述事物时，若一个事物内部还包含其他事物，就可以使用内部类这种结构。比如，汽车类 Car 中包含发动机类 Engine ，这时， Engine 就可以使用内部类来描述，定义在成员位置。

代码举例：

```java
class Car { //外部类
    class Engine { //内部类
    }
}
```

访问特点

- 内部类可以直接访问外部类的成员，包括私有成员。
- 外部类要访问内部类的成员，必须要建立内部类的对象。



创建内部类对象格式：

```java
外部类名.内部类名 对象名 = new 外部类型().new 内部类型()；
```

访问演示，代码如下：
定义类：

```java
public class Person {
    private  boolean live = true;
    class Heart {
        public void jump() {
            // 直接访问外部类成员
            if (live) {
                System.out.println("心脏在跳动");
            } else {
                System.out.println("心脏不跳了");
            }
        }
    }
    public boolean isLive() {
        return live;
    }
    public void setLive(boolean live) {
        this.live = live;
    }
}
```



定义测试类：

```java
public class InnerDemo {
    public static void main(String[] args) {
        // 创建外部类对象
        Person p  = new Person();
        // 创建内部类对象
        Heart heart = p.new Heart();
        // 调用内部类方法
        heart.jump();
        // 调用外部类方法
        p.setLive(false);
        // 调用内部类方法
        heart.jump();
    }
}

输出结果:
心脏在跳动
心脏不跳了
```



内部类仍然是一个独立的类，在编译之后会内部类会被编译成独立的 .class文件，但是前面冠以外部类的类名和`$`符号 。
比如，`Person$Heart.class`

### 12.2  匿名内部类

匿名内部类 ：是内部类的简化写法。它的本质是一个 带具体实现的 父类或者父接口的 匿名的 子类对象。开发中，最常用到的内部类就是匿名内部类了。

匿名内部类必须继承一个父类或者实现一个父接口。

格式:

```java
new 父类名或者接口名(){
    // 方法重写
    @Override
    public void method() {
        // 执行语句
    }
};
```

使用方式

以接口为例，匿名内部类的使用，代码如下：
定义接口：

```java
public abstract class FlyAble{
    public abstract void fly();
}
```

创建匿名内部类，并调用：

```java
public class InnerDemo {
    public static void main(String[] args) {
        /*
        1.等号右边:是匿名内部类，定义并创建该接口的子类对象
        2.等号左边:是多态赋值,接口类型引用指向子类对象
        */
        FlyAble  f = new FlyAble(){
            public void fly() {
                System.out.println("我飞了~~~");
            }
        };
        //调用 fly方法,执行重写后的方法
        f.fly();
    }
}
```

通常在方法的形式参数是接口或者抽象类时，也可以将匿名内部类作为参数传递。代码如下：

```java
public class InnerDemo2 {
    public static void main(String[] args) {
        /*
        1.等号右边:定义并创建该接口的子类对象
        2.等号左边:是多态,接口类型引用指向子类对象
       */
        FlyAble  f = new FlyAble(){
            public void fly() {
                System.out.println("我飞了~~~");
            }
        };
        // 将f传递给showFly方法中
        showFly(f);
    }
    public static void showFly(FlyAble f) {
        f.fly();
    }
}
```

以上两步，也可以简化为一步，代码如下：

```java
public class InnerDemo3 {
    public static void main(String[] args) {           
        /*
       创建匿名内部类,直接传递给showFly(FlyAble f) 
        */
        showFly( new FlyAble(){
            public void fly() {
                System.out.println("我飞了~~~");
            }
        });
    }
    public static void showFly(FlyAble f) {
        f.fly();
    }
}
```



## 13 引用类型用法总结

实际的开发中，引用类型的使用非常重要，也是非常普遍的。我们可以在理解基本类型的使用方式基础上，进一步去掌握引用类型的使用方式。基本类型可以作为成员变量、作为方法的参数、作为方法的返回值，那么当然引用类型也是可以的。

### 13.1 class 作为成员变量

在定义一个类Role（游戏角色）时，代码如下：

```java
class Role {
   int id; // 角色id  
   int blood; // 生命值  
   String name; // 角色名称  
}
```

使用 int 类型表示 角色id和生命值，使用 String 类型表示姓名。此时， String 本身就是引用类型，由于使用的方式类似常量，所以往往忽略了它是引用类型的存在。如果我们继续丰富这个类的定义，给 Role 增加武器，穿戴装备等属性，我们将如何编写呢？

定义武器类，将增加攻击能力：

```java
class Weapon {
  String name； // 武器名称   
    int hurt； // 伤害值
}
```

定义穿戴盔甲类，将增加防御能力，也就是提升生命值：

```java
class Armour {
   String name；// 装备名称  
    int protect；// 防御值 
}
```

定义角色类：

```java
class Role {
    int id；
    int blood；
    String name；
    // 添加武器属性
    Weapon wp；
    // 添加盔甲属性
    Armour ar；
    // 提供get/set方法
    public Weapon getWp() {
        return wp;
    }
    public void setWeapon(Weapon wp) {
        this.wp = wp;
    }
    public Armour getArmour() {
        return ar;
    }
    public void setArmour(Armour ar) {
        this.ar = ar;
    }
    // 攻击方法
    public void attack(){
        System.out.println("使用"+ wp.getName() +", 造成"+wp.getHurt()+"点伤害"); 
    }
    // 穿戴盔甲
    public void wear(){
        // 增加防御,就是增加blood值
        this.blood += ar.getProtect();
        System.out.println("穿上"+ar.getName()+", 生命值增加"+ar.getProtect());
    } 
}
```



测试类：

```java
public class Test {
   public static void main(String[] args) {  
     // 创建Weapon 对象     
       Weapon wp = new Weapon("屠龙刀" , 999999);        
       // 创建Armour 对象  
       Armour ar = new Armour("麒麟甲",10000);  
       // 创建Role 对象  
       Role r = new Role();        
       
       // 设置武器属性  
       r.setWeapon(wp);   
       // 设置盔甲属性   
       r.setArmour(ar);  
     
       // 攻击  
       r.attack();  
        // 穿戴盔甲
       r.wear();  
   }  
}

输出结果:
使用屠龙刀,造成999999点伤害
穿上麒麟甲 ,生命值增加10000
       
```



类作为成员变量时，对它进行赋值的操作，实际上，是赋给它该类的一个对象。



### 13.2 interface 作为成员变量

接口是对方法的封装，对应游戏当中，可以看作是扩展游戏角色的技能。所以，如果想扩展更强大技能，我们在Role 中，可以增加接口作为成员变量，来设置不同的技能。

定义接口：

```java
// 法术攻击
public interface FaShuSkill {
    public abstract void faShuAttack();
}
```

定义角色类：

```java
public class Role {
    FaShuSkill fs;
    public void setFaShuSkill(FaShuSkill fs) {
        this.fs = fs;
    }
    // 法术攻击
    public void faShuSkillAttack(){
        System.out.print("发动法术攻击:");
        fs.faShuAttack();
        System.out.println("攻击完毕");
    }
}
```

定义测试类：

```java
public class Test {
    public static void main(String[] args) {
        // 创建游戏角色
        Role role = new Role();
        // 设置角色法术技能
        role.setFaShuSkill(new FaShuSkill() {
            @Override
            public void faShuAttack() {
                System.out.println("纵横天下");
            }
        });
        // 发动法术攻击
        role.faShuSkillAttack();
        // 更换技能
        role.setFaShuSkill(new FaShuSkill() {
            @Override
            public void faShuAttack() {
                System.out.println("逆转乾坤");
            }
        });
        // 发动法术攻击
        role.faShuSkillAttack();
	}    
}

输出结果:
发动法术攻击:纵横天下
攻击完毕
发动法术攻击:逆转乾坤
攻击完毕
```



我们使用一个接口，作为成员变量，以便随时更换技能，这样的设计更为灵活，增强了程序的扩展性。
接口作为成员变量时，对它进行赋值的操作，实际上，是赋给它该接口的一个子类对象。



### 13.3  interface 作为方法参数和返回值类型

当接口作为方法的参数时,需要传递什么呢？当接口作为方法的返回值类型时，需要返回什么呢？对，其实都是它的子类对象。  ArrayList 类我们并不陌生，查看API我们发现，实际上，它是  java.util.List 接口的实类。所以，当我们看见 List 接口作为参数或者返回值类型时，当然可以将 ArrayList 的对象进行传递或返回。

请观察如下方法：获取某集合中所有的偶数。

定义方法：

```java
public static List<Integer> getEvenNum(List<Integer> list) {
    // 创建保存偶数的集合
    ArrayList<Integer> evenList = new ArrayList<>();
    // 遍历集合list,判断元素为偶数,就添加到evenList中
    for (int i = 0; i < list.size(); i++) {
        Integer integer = list.get(i);
        if (integer % 2 == 0) {
            evenList.add(integer);
        }
    }
    /*
   返回偶数集合
   因为getEvenNum方法的返回值类型是List,而ArrayList是List的子类, 
   所以evenList可以返回 
   */  
    return evenList;
}
```

调用方法：

```java
public class Test {
    public static void main(String[] args) {
        // 创建ArrayList集合,并添加数字
        ArrayList<Integer> srcList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            srcList.add(i);
        }
        /*
       获取偶数集合  
       因为getEvenNum方法的参数是List,而ArrayList是List的子类,  
       所以srcList可以传递  
       */  
        List list = getEvenNum(srcList);
        System.out.println(list);
    }
}
```



接口作为参数时，传递它的子类对象。

接口作为返回值类型时，返回它的子类对象。