package StrategyPattern;

public class GameApp {
    public static void main(String[] args) {

        Character archer = new Character("Archer", new Archer(), null);
        Character knight = new Character("Knight", new Knight(), new Knight());
        Character wizard = new Character("Wizard", new Wizard(), new Wizard());


        displayActions(archer);
        displayActions(knight);
        displayActions(wizard);
    }

    public static void displayActions(Character character) {
        System.out.println("Character: " + character.character);
        System.out.println("Attack Strategy:");
        if (character.attackStrat != null) {
            System.out.println(character.attackStrat.castSpell());
            System.out.println(character.attackStrat.shootArrow());
            System.out.println(character.attackStrat.swingSword());
        } else {
            System.out.println("No attack strategy defined for this character.");
        }

        System.out.println("Defense Strategy:");
        if (character.defenseStrat != null) {
            System.out.println(character.defenseStrat.shield());
            System.out.println(character.defenseStrat.dodge());
            System.out.println(character.defenseStrat.createMagic());
        } else {
            System.out.println("No defense strategy defined for this character.");
        }
        System.out.println();
    }
}
