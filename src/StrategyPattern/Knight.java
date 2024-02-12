package StrategyPattern;

public class Knight implements DefenseStrat, AttackStrat{

    @Override
    public String createMagic() {
        String output = new String();
        output += "Creating magic barrier!";
        return output;
    }

    @Override
    public String dodge() {
        String output = new String();
        output += "Character Dodging!";
        return output;
    }

    @Override
    public String shield() {
        String output = new String();
        output += "Using shield!";
        return output;
    }

    @Override
    public String castSpell() {

        return null;
    }

    @Override
    public String shootArrow() {
        return null;
    }

    @Override
    public String swingSword() {
        String output = new String();
        output += "Swinging sword!";
        return output;
    }

}