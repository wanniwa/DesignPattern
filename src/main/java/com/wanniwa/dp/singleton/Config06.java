package com.wanniwa.dp.singleton;

/**
 * lazy loading懒汉式
 * 加入了双重判断，第一次判断
 */
public class Config06 {
    private static volatile Config06 INSTANCE; //JIT

    private Config06() {

    }

    public static Config06 getInstance() {
        if (INSTANCE == null) {
            //双重检查
            synchronized (Config06.class) {
                if(INSTANCE == null) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Config06();
                }
            }
        }
        return INSTANCE;
    }

    public void show() {
        System.out.println("展示配置内容");
    }

    public static void main(String[] args) {
        for(int i=0; i<100; i++) {
            new Thread(()->{
                System.out.println(Config06.getInstance().hashCode());
            }).start();
        }
    }
}
