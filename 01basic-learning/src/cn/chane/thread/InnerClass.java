package cn.chane.thread;

public class InnerClass {
    public static void main(String[] args) {


        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    method();
                }
            }
        }.start();

        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    method();
                }
            }
        };
        new Thread(r).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                method();
            }
        }).start();

        method();
    }

    public static void method(){
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
