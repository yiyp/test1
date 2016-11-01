package com.org3.excise5;

import com.org3.excise4.collection.Course;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by yiyp on 2016/11/1 0001.
 */
public class Player {
    public String id;
    public String name;
    public Set<Card> cards;

    public Player(String id, String name) {
        this.id = id;
        this.name = name;
        this.cards = new HashSet<Card>();
    }
}
