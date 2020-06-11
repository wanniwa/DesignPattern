package com.wanniwa.dp.singleton;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * 饿汉式
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 简单实用，推荐使用！
 * 唯一缺点：不管用到与否，类装载时就完成实例化
 * Class.forName("")
 * （话说你不用的，你装载它干啥）
 */
public class Config01 implements Serializable {
    private static final Config01 INSTANCE = new Config01();

    private Config01() {
        if (null != INSTANCE) {
            throw new IllegalStateException();
        }
    }

    public static Config01 getInstance() {
        return INSTANCE;
    }

    private Object readResolve() {
        return INSTANCE;
    }

    public static void main(String[] args) throws Exception{
        Config01 c1=Config01.getInstance();
        Config01 c2=Config01.getInstance();
        System.out.println("c1内存地址:"+c1);
        System.out.println("c2内存地址:"+c1);
        System.out.println("正常情况，实例化两个实例是否相同："+(c1==c2)+"\n");

        ////反射
        //Constructor<Config01> constructor=Config01.class.getDeclaredConstructor();
        //constructor.setAccessible(true);
        //Config01 c3=constructor.newInstance();
        //System.out.println("c3内存地址:"+c3);
        //System.out.println("反射，实例化两个实例是否相同："+(c1==c3)+"\n");

        // 通过反序列化的方式构造多个对象（类需要实现Serializable接口）
        // 1. 把对象c1写入硬盘文件
        FileOutputStream fos = new FileOutputStream("object");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(c1);
        oos.close();
        fos.close();
        // 2. 把硬盘文件上的对象读出来
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object"));
        // 如果对象定义了readResolve()方法，readObject()会调用readResolve()方法。从而解决反序列化的漏洞
        Config01 c4 = (Config01) ois.readObject();
        // 反序列化出来的对象，和原对象，不是同一个对象。如果对象定义了readResolve()方法，可以解决此问题。
        System.out.println("c4内存地址:"+c4);
        System.out.println("反序列化,实例化两个实例是否相同：" + (c1==c4));
        ois.close();
    }
}

