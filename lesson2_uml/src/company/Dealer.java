package company;

 class Dealer extends Hand {

    @Override
    public void play(Deck deck) throws InterruptedException {

        takeOneCard(deck);
        takeOneCard(deck);

        while (calcScore() < 17) {
            System.out.println("Dealer hand: " + hand + " Dealer score: " + calcScore());

            takeOneCard(deck);
            Thread.sleep(600);
        }

        System.out.println("Dealer hand: " + hand + " Dealer score: " + calcScore());

    }

}
