package com.wanniwa.dp.singleton;

/**
 * 不仅可以解决线程同步，还可以防止反序列化。
 */
public enum Config08 {

    INSTANCE;

    public void show() {
        System.out.println("展示配置内容");
    }

    public static void main(String[] args) {
        for(int i=0; i<100; i++) {
            new Thread(()->{
                System.out.println(Config08.INSTANCE.hashCode());
            }).start();
        }
    }
}
