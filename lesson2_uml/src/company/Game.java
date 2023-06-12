package company;

import java.util.Scanner;

public class Game   {

    public Game(){
        deck = new Deck();
        player= new Player();
        dealer=new Dealer();
        playerWin=0;
        dealerWin=0;
        draws=0;
    }

    public void play() throws InterruptedException{

        Scanner in= new Scanner(System.in);
       // deck = new Deck();
      //  player= new Player();
      //  dealer=new Dealer();
        char answer='y';
        while(answer=='y'){
            deck = new Deck();

            player.play(deck);
            dealer.play(deck);

            //проверка как сыграл player
             if (player.calcScore() == 21) {
                 System.out.println("Player wins!");
                 playerWin++;

             }   else if (dealer.calcScore() == player.calcScore()) {
                 System.out.println("Draw");
                 draws++;

             } else if (player.calcScore() > 21) {
                 System.out.println("Player loses!");
                 dealerWin++;
             }
             //проверка как сыграл dealer
            else if (dealer.calcScore() == 21) {
                System.out.println("Dealer wins!");
                dealerWin++;

            } else if (dealer.calcScore() > 21) {
                System.out.println("Dealer loses!");
                playerWin++;
            } else if (player.calcScore() > dealer.calcScore()) {
                System.out.println("Player wins!");
                playerWin++;
            } else if (dealer.calcScore() > player.calcScore()) {
                System.out.println("Dealer wins!");
                dealerWin++;
            }
            System.out.println("PW ="+playerWin + " DW = "+dealerWin + " Draw = " +draws);
            System.out.println("try again?");
            answer = in.nextLine().charAt(0);


            while(player.hand.size()!=0){
            player.removeOneCard(deck);
            }
            while(dealer.hand.size()!=0){
            dealer.removeOneCard(deck);
            }


       }
    }

    private Deck deck;
    private Player player;
    private Dealer dealer;
    private int playerWin;
    private int dealerWin;
    private int draws;









}
