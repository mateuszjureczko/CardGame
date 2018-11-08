package Card;

import java.util.List;
import java.util.Scanner;

public class UserInteface {

    public static void chooseFirstCards(Player player, List<Card> deck){
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<5; i++){
            System.out.println("choose card (1-10)");
            int cardNum = scanner.nextInt();
            Card card = deck.get(cardNum-1);
            if(card == null){
                i--;
                System.out.println("choose proper card!");
            }else{
                player.addCard(card);
                deck.set(cardNum,null);
            }
        }
    }
}
