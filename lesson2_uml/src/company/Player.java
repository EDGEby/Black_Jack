package company;

import java.util.Scanner;

class Player extends Hand{
    @Override
     public void play(Deck deck){
        Scanner in = new Scanner(System.in);
        char answer = 'y';

        takeOneCard(deck);
        takeOneCard(deck);

        while(calcScore()<21 && answer =='y'){
            System.out.println("your hand: "+hand+ " your score: "+ calcScore());
            System.out.println("Do you want another card? (y/n)");
            answer = in.nextLine().charAt(0);
            if (answer=='y'){
                takeOneCard(deck);
            }

        }
        System.out.println("your hand: "+hand+ " your score: "+ calcScore());
    /*    if (calcScore()==21)
            System.out.println("Player wins!");
        else if (calcScore()>21)
            System.out.println("Player loses!");
        */
    }


}
