package company;

import java.util.ArrayList;

public abstract class Hand {
    protected ArrayList<Card> hand;

    //? String name;
    Hand(){
        hand=  new ArrayList<>();
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

    public abstract void play(Deck deck) throws InterruptedException;

    public void takeOneCard(Deck deck){
        hand.add(deck.sendCard());

    }
    public Card removeOneCard(Deck deck){
        Card t = hand.get(hand.size()-1);
        hand.remove(hand.size()-1);
        return t;
    }


}
