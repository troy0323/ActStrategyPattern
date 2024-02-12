package StrategyPattern;

public class Character {
    public AttackStrat attackStrat;
    public DefenseStrat defenseStrat;
    public String character;
    public Knight knight;

    public Character(String character, AttackStrat attackStrat, DefenseStrat defenseStrat) {
        this.character = character;
        this.attackStrat = attackStrat;
        this.defenseStrat = defenseStrat;
    }


}