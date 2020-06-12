package com.wanniwa.dp.strategy;

import com.wanniwa.dp.strategy.fly.FlyHigh;
import com.wanniwa.dp.strategy.fly.FlyLow;
import com.wanniwa.dp.strategy.fly.FlyMedium;

public class Player1 {

    private int vipLevel;

    public int getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(int vipLevel) {
        this.vipLevel = vipLevel;
    }

    public Player1(int vipLevel) {
        this.vipLevel = vipLevel;
    }

    public static void main(String[] args) {
        Player1 player = new Player1(1);
        int vipLevel = player.getVipLevel();
        Character1 character = new Character1();
        if (vipLevel <= 1) {
            character.setFlyBehavior(new FlyLow());
        } else if (vipLevel <= 2) {
            character.setFlyBehavior(new FlyMedium());
        } else {
            character.setFlyBehavior(new FlyHigh());
        }
        character.performFly();
    }

    public static void main2(String[] args) {
        Player1 player = new Player1(1);
        int vipLevel = player.getVipLevel();
        Character1 character = new Character1();
        if (vipLevel <= 1) {
            System.out.println("低空飞行 速度1 最高10m");
        } else if (vipLevel <= 2) {
            System.out.println("中空飞行 速度2 最高30m");
        } else {
            System.out.println("高空飞行 速度3 最高100m");
        }
        character.performFly();
    }


}
