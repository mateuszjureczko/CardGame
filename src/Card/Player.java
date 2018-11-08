package Card;

import java.util.List;

public class Player {
    String name;
    Integer lifePoint=100;
    Integer abilityPoint=100;
    Integer cash = 10;
    String playerClass;
    //warrior / mag
    List<Card> karty;

    public Player(String name, Integer lifePoint, Integer abilityPoint, Integer cash, String playerClass) {
        this.lifePoint = lifePoint;
        this.abilityPoint = abilityPoint;
        this.cash = cash;
        this.playerClass = playerClass;
        this.name = name;
    }
}
