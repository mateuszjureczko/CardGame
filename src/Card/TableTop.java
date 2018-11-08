package Card;

import java.util.List;

public class TableTop {
    public static void main(String[] args){

        cardGenerator generator = new cardGenerator();
        generator.prepareBase();
        System.out.println(generator.getProbablyOfStrong());
        List<Card> talia = generator.generate(10);
        for(Card karta: talia){
            System.out.println(karta);
        }
       // System.out.println(talia);


    }


}
