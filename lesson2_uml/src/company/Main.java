package company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

   /*     int pw=0;
        int dw=0;
        Scanner inGame = new Scanner(System.in);
        char answerStartGame = 'y';

        while(answerStartGame == 'y') {


        Deck deck =new Deck();
        System.out.println(deck );

        Player player = new Player();
        player.play(deck);
        Dealer dealer = new Dealer();
        dealer.play(deck);









           //проверка как сыграл player
           if (player.calcScore() == 21) {
               System.out.println("Player wins!");
               pw += 1;
               continue;
           } else if (player.calcScore() > 21) {
               System.out.println("Player loses!");
               dw += 1;
               continue;
           }


           //проверка как сыграл dealer
           if (dealer.calcScore() == 21) {
               System.out.println("Dealer wins!");
               dw += 1;

           } else if (dealer.calcScore() > 21) {
               System.out.println("Dealer loses!");
               pw += 1;
           } else if (player.calcScore() > dealer.calcScore()) {
               System.out.println("Player wins!");
               pw += 1;
           } else if (dealer.calcScore() > player.calcScore()) {
               System.out.println("Dealer loses!");
               pw = +1;
           } else if (dealer.calcScore() == player.calcScore())
               System.out.println("Draw");


           System.out.println("try again?");
           answerStartGame = inGame.nextLine().charAt(0);

       }
        System.out.println("PW ="+pw + " DW = "+dw);*/

        Game game=new Game();
        game.play();

    }
}
