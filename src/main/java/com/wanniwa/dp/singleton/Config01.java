package com.wanniwa.dp.singleton;

/**
 * 饿汉式
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 简单实用，推荐使用！
 * 唯一缺点：不管用到与否，类装载时就完成实例化
 * Class.forName("")
 * （话说你不用的，你装载它干啥）
 */
public class Config01 {
    private static final Config01 INSTANCE = new Config01();

    private Config01() {};

    public static Config01 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Config01 m1 = Config01.getInstance();
        Config01 m2 = Config01.getInstance();
        System.out.println(m1 == m2);
    }
}
    //public static Config01 getInstance() {
    //    return INSTANCE;
    //}
    //
    //public void show() {
    //    System.out.println("展示配置内容");
    //}

