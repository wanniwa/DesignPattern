package com.wanniwa.dp.singleton;

/**
 * 静态内部类方式
 * JVM保证单例
 * 加载外部类时不会加载内部类，这样可以实现懒加载
 */
public class Config07 {

    private Config07() {
        if (null != Config07Holder.INSTANCE) {
            throw new IllegalStateException();
        }
    }

    private static class Config07Holder {
        private final static Config07 INSTANCE = new Config07();
    }

    public static Config07 getInstance() {
        return Config07Holder.INSTANCE;
    }

    public void show() {
        System.out.println("展示配置内容");
    }

    public static void main(String[] args) {
        for(int i=0; i<100; i++) {
            new Thread(()->{
                System.out.println(Config07.getInstance().hashCode());
            }).start();
        }
    }


}
