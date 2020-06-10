package com.wanniwa.dp.singleton;

/**
 * 放在静态代码块种初始化，与01相同
 */
public class Config02 {
    private static final Config02 INSTANCE;

    static {
        INSTANCE = new Config02();
    }

    private Config02() {};

    public static Config02 getInstance() {
        return INSTANCE;
    }

    public void show() {
        System.out.println("展示配置内容");
    }

    public static void main(String[] args) {
        Config02 m1 = Config02.getInstance();
        Config02 m2 = Config02.getInstance();
        System.out.println(m1 == m2);
    }
}
