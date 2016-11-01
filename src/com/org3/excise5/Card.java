package com.org3.excise5;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by yiyp on 2016/11/1 0001.
 */
public class Card {
    public int id;
    public String name;
    public Set<Card> cards;

    public Card() {}

    public Card(int id, String name) {
        this.id = id;
        this.name = name;
        this.cards = new HashSet<Card>();
    }

    @Override
    public String toString() {
        return name;
    }
}
