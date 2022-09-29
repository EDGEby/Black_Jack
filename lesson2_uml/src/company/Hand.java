package company;

import java.util.ArrayList;

public abstract class Hand {
    protected ArrayList<Card> hand;

    //? String name;
    Hand(){
        hand=  new ArrayList<>();
    }
    public void takeCard(Deck deck){
        hand.add(deck.sendCard());

    }

    public String toString(){
        String res="";
        for (int i=0;i<hand.size();i++){
            res += hand.get(i).toString();
        }
        return res;


    }

    public int calcScore(){
        int score=0;

        for (Card card:hand){
            score+=card.getRank();
        }
        return score;

    }

    public abstract void play();


}
