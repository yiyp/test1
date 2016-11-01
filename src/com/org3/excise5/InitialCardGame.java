package com.org3.excise5;

import java.util.*;

/**
 * Created by yiyp on 2016/11/1 0001.
 * 简易棋牌游戏
 */
public class InitialCardGame {
    /**
     * 用于存放备选牌的List
     */
    public List<Card> cardToSelect;

    public InitialCardGame() {
        this.cardToSelect = new ArrayList<Card>();
    }

    /**
     * 创建一副扑克牌
     * 排序：花色：黑桃，红心，梅花，方片；大小：2-A
     */
    public void createCard() {
        System.out.println("--------------------开始创建扑克牌------------------------");
        int id = 0;
        String name = "";
        String type = "";
        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    type = "黑桃";
                    break;
                case 1:
                    type = "红心";
                    break;
                case 2:
                    type = "梅花";
                    break;
                case 3:
                    type = "方片";
                    break;
            }
            for (int j = 0; j < 13; j++) {
                if (j == 9) {
                    name = type + "J";
                } else if (j == 10) {
                    name = type + "Q";
                } else if (j == 11) {
                    name = type + "K";
                } else if (j == 12) {
                    name = type + "A";
                } else {
                    name = type + (j + 2);
                }
                id++;
                cardToSelect.add(new Card(id, name));
            }
        }
        System.out.println("--------------------扑克牌创建成功！------------------------");
        System.out.println("一副牌为：" + cardToSelect + "\n");
    }

    /**
     * 游戏
     */
    public void playCardGame() {

    }

    public static void main(String[] args) {

        // 创建一副牌
        InitialCardGame icg = new InitialCardGame();
        icg.createCard();

        // 创建2位玩家
        List<Player> playerList = new ArrayList<Player>();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("请输入第" + (i + 1) + "位玩家的ID和姓名:" + "\n" + "输入ID");
            String id = input.next();
            System.out.println("输入姓名");
            String name = input.next();

            playerList.add(new Player(id, name));
        }
        System.out.println("欢迎玩家：" + playerList.get(0).name);
        System.out.println("欢迎玩家：" + playerList.get(1).name);

        // 洗牌
       /* List<Card> cardList = new ArrayList<Card>();
        for (Card cr : cardToSelect) {
            System.out.println("课程："+ cr.id + "." + cr.name );
        }*/
        Collections.shuffle(icg.cardToSelect, new Random(13));
        System.out.println("洗牌成功！：" + icg.cardToSelect);


        // 发牌
        // icg.sendOutCard();

        // 开始游戏
        // icg.playCardGame();

    }
}
