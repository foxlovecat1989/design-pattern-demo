package behavior.strategy;

import behavior.strategy.algorithm.AxeBehavior;
import behavior.strategy.algorithm.BowAndArrowBehavior;
import behavior.strategy.algorithm.SwordBehavior;
import behavior.strategy.domain.Character;
import behavior.strategy.domain.King;
import behavior.strategy.domain.Queen;

public class Client {
    public static void main(String[] args) {
        Character king = new King(new SwordBehavior());
        Character queen = new Queen(new BowAndArrowBehavior());
        Character knight = new Queen(new SwordBehavior());
        Character troll = new Queen(new AxeBehavior());
        System.out.print("King ");
        king.attack();
        System.out.print("Queen ");
        queen.attack();
        System.out.print("Knight ");
        knight.attack();
        System.out.print("Troll ");
        troll.attack();
    }
}
