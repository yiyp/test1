package com.org3.excise5;

import java.util.*;

/**
 * Created by yiyp on 2016/11/1 0001.
 * 简易棋牌游戏
 */
public class InitialCardGame {
    /**
     * 用于存放一副备选牌的List
     */
    public List<Card> cardToSelect;
    public  List<Player> playerList;

    public InitialCardGame() {
        this.cardToSelect = new ArrayList<Card>();
        this.playerList = new ArrayList<Player>();
    }

    /**
     * 创建一副扑克牌
     * 排序：花色：黑桃，红心，梅花，方片；大小：2-A
     */
    public void createCard() {
        System.out.println("--------------------开始创建扑克牌------------------------");
        String name = "";
        String typeText = "";
        int type = 0;
        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    typeText = "方片";
                    type = 0;
                    break;
                case 1:
                    typeText = "梅花";
                    type = 1;
                    break;
                case 2:
                    typeText = "红心";
                    type = 2;
                    break;
                case 3:
                    typeText = "黑桃";
                    type = 3;
                    break;
            }
            for (int j = 0; j < 13; j++) {
                if (j == 9) {
                    name = typeText + "J";
                } else if (j == 10) {
                    name = typeText + "Q";
                } else if (j == 11) {
                    name = typeText + "K";
                } else if (j == 12) {
                    name = typeText + "A";
                } else {
                    name = typeText + (j + 2);
                }
                cardToSelect.add(new Card(j, name, type));
            }
        }
        System.out.println("--------------------扑克牌创建成功！------------------------");
        System.out.println("一副牌为：" + cardToSelect + "\n");
    }

    /**
     * 创建两位玩家
     */
    public void createPlayer() {
        // 创建2位玩家
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
    }

    /**
     * 发牌
     */
    public void giveOutCard() {
        System.out.println("--------------------开始发牌！------------------------");
        for (int j = 0; j < 2; j++) {
            System.out.println("玩家：" + playerList.get(0).name + "-拿牌");
            System.out.println("玩家：" + playerList.get(1).name + "-拿牌");
            playerList.get(0).cards.add(cardToSelect.get(2 * j));
            playerList.get(1).cards.add(cardToSelect.get(2 * j + 1));
        }
        System.out.println("比赛前玩家各自的手牌为：\n" + playerList.get(0).name + "：" + playerList.get(0).cards
                         + "\n" + playerList.get(1).name + "：" + playerList.get(1).cards);
        System.out.println("--------------------发牌结束！------------------------" + "\n"
                + "--------------------开始游戏！------------------------");
    }

    /**
     * 开始游戏
     */
    public void playGame() {
        Collections.sort(playerList.get(0).cards);
        Collections.sort(playerList.get(1).cards);
        System.out.println("玩家：" + playerList.get(0).name + "最大的手牌为：" + playerList.get(0).cards.get(1));
        System.out.println("玩家：" + playerList.get(1).name + "最大的手牌为：" + playerList.get(1).cards.get(1));
        List<Card> cardMax = new ArrayList<Card>();
        cardMax.add(playerList.get(0).cards.get(1));
        cardMax.add(playerList.get(1).cards.get(1));
        Collections.sort(cardMax);

        if(playerList.get(0).cards.contains(cardMax.get(cardMax.size()-1))) {
            System.out.println("--------------------玩家：" + playerList.get(0).name + "获胜！------------------------");
        } else {
            System.out.println("--------------------玩家：" + playerList.get(1).name + "获胜！------------------------");
        }

        System.out.println("比赛后玩家各自的手牌为：\n" + playerList.get(0).name + "：" + playerList.get(0).cards
                + "\n" + playerList.get(1).name + "：" + playerList.get(1).cards);
    }

    /**
     * 简易棋牌游戏实现
     * @param args
     */
    public static void main(String[] args) {

        InitialCardGame icg = new InitialCardGame();

        // 创建一副牌
        icg.createCard();

        // 创建两位玩家
        icg.createPlayer();

        // 洗牌
        Collections.shuffle(icg.cardToSelect);
        // System.out.println("洗牌成功！：" + icg.cardToSelect);

        // 发牌
        icg.giveOutCard();

        // 开始游戏
        icg.playGame();
    }
}
