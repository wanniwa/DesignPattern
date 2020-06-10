package com.wanniwa.dp.singleton;

/**
 * lazy loading
 * 缩小了synchronized范围，但测试之后发现并没有成功
 * 因为在判断INSTANCE有没有实例的时候，CPU很可能去执行了其他线程的getInstance先一步创建了实例，
 * 再回到当前synchronized包围的代码块时，因为已经通过了判断，所以还是会new一个新的实例
 */
public class Config05 {
    private static Config05 INSTANCE;

    private Config05() {
    }

    public static Config05 getInstance() {
        if (INSTANCE == null) {
            //妄图通过减小同步代码块的方式提高效率，然后不可行
            synchronized (Config05.class) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new Config05();
            }
        }
        return INSTANCE;
    }

    public void show() {
        System.out.println("展示配置内容");
    }

    public static void main(String[] args) {
        for(int i=0; i<100; i++) {
            new Thread(()-> System.out.println(Config05.getInstance().hashCode())).start();
        }
    }
}
