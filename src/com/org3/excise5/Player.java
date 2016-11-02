package com.org3.excise5;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by yiyp on 2016/11/1 0001.
 */
public class Player {
    public String id;
    public String name;
    public List<Card> cards;

    public Player(String id, String name) {
        this.id = id;
        this.name = name;
        this.cards = new ArrayList<Card>();
    }
}
