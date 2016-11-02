package com.org3.excise5;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by yiyp on 2016/11/1 0001.
 */
public class Card implements Comparable<Card> {
    // 存放 点数
    public int id;
    // 存放 花色
    public int type;
    // 存放 扑克牌的名称
    public String name;

   // public Card() {}

    public Card(int id, String name, int type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Card o) {
        if (this.id > o.id) {
            return 1;
        } else if (this.id == o.id) {
            if(this.type > o.type) {
                return 1;
            }else {
                return -1;
            }
        } else {
            return -1;
        }
    }
}
