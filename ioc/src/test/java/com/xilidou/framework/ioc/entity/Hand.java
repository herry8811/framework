package com.xilidou.framework.ioc.entity;

import lombok.Data;

@Data
public class Hand {

    private Mouth mouth;

    private String code;

    public void waveHand() {
//        System.out.println("hand 编号：" + code + ",依赖于mouth 编号" + mouth.getCode());
//        System.out.println("挥一挥手");
        System.out.println("hand code:" + code + ",depend mouth code" + mouth.getCode());
        System.out.println("wave hand");

    }
}
