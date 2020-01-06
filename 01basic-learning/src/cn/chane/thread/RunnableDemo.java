package cn.chane.thread;

public class RunnableDemo {
    public static void main(String[] args) {
        RunnableImpl runnable = new RunnableImpl();
        Thread thread = new Thread(runnable);
        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() +":"+ i);
        }
    }
}
