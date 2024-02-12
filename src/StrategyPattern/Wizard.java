package StrategyPattern;

public class Wizard implements DefenseStrat, AttackStrat{

    @Override
    public String createMagic() {
        String output = new String();
        output += "Creating magic barrier!";
        return output;
    }

    @Override
    public String dodge() {
        return null;
    }

    @Override
    public String shield() {
        return null;
    }

    @Override
    public String castSpell() {
        String output = new String();
        output += "Casting Powerful Spell!";
        return output;
    }

    @Override
    public String shootArrow() {
        return null;
    }

    @Override
    public String swingSword() {

        return null;
    }



}