package com.wanniwa.dp.singleton;

/**
 * lazy loading 也称懒汉式
 * 在getInstance获取对象时才初始化对象
 * 虽然达到了按需初始化的目的，但却带来线程不安全的问题
 */
public class Config03 {
    private volatile static Config03 INSTANCE;

    private Config03() {
    }

    public static Config03 getInstance() {
        if (INSTANCE == null) {
            //sleep 1 millis为了放大没优化前懒汉式单例的线程安全问题
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Config03();
        }
        return INSTANCE;
    }
    public void show() {
        System.out.println("展示配置内容");
    }

    public static void main(String[] args) {
        for(int i=0; i<100; i++) {
            new Thread(()->
                System.out.println(Config03.getInstance())
            ).start();
        }
    }
}
