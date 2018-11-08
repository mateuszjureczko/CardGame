package Card;

import java.util.List;
import java.util.Scanner;

public class TableTop {
    public static void main(String[] args){
        String pOneClass;
        String pTwoClass;

        Scanner scanner = new Scanner(System.in);
        System.out.println("insert first player name");
        String pOneName = scanner.nextLine();
        System.out.println("choose your class, M (magician) or W (warrior)");


        String pOneClassCode = scanner.nextLine();
        if(pOneClassCode=="M"){
            pOneClass="Magician";
        }
        else{
            pOneClass="Warrior";
        }


        System.out.println("insert second player name");
        String pTwoName = scanner.nextLine();
        System.out.println("choose your class, M (magician) or W (warrior)");
        String pTwoClassCode = scanner.nextLine();


        if(pTwoClassCode=="M"){
            pTwoClass="Magician";
        }
        else{
            pTwoClass="Warrior";
        }


        System.out.println("p1: "+pOneName+" \n class: "+pOneClassCode+" \n\n\n p2: "+pTwoName+" \nclass: "+pOneClass);



        Player playerOne = new Player(pOneName,100,100,100,pOneClass);
        Player playerTwo = new Player(pTwoName,100,100,100,pTwoClass);
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
