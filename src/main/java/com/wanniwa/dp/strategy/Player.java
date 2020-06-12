package com.wanniwa.dp.strategy;

import com.wanniwa.dp.strategy.fly.FlyHighBehavior;
import com.wanniwa.dp.strategy.fly.FlyLowBehavior;
import com.wanniwa.dp.strategy.fly.FlyMediumBehavior;

public class Player {

    private int vipLevel;

    public int getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(int vipLevel) {
        this.vipLevel = vipLevel;
    }

    public Player(int vipLevel) {
        this.vipLevel = vipLevel;
    }

    public static void main(String[] args) {
        Player player = new Player(1);
        int vipLevel = player.getVipLevel();
        Charactor charactor = new Charactor();
        if (vipLevel == 1) {
            charactor.setFlyBehavior(new FlyLowBehavior());
        } else if (vipLevel == 2) {
            charactor.setFlyBehavior(new FlyMediumBehavior());
        } else if (vipLevel == 3) {
            charactor.setFlyBehavior(new FlyHighBehavior());
        }
        charactor.performFly();
    }
}
