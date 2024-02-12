package StrategyPattern;

public class Archer implements DefenseStrat, AttackStrat{

    @Override
    public String createMagic() {
        return null;
    }

    @Override
    public String dodge() {
        String output = new String();
        output += "Dodging..!";
        return output;
    }

    @Override
    public String shield() {
        return null;
    }

    @Override
    public String castSpell() {
        return null;
    }

    @Override
    public String shootArrow() {
        String output = new String();
        output += "Shooting Arrow!";
        return output;
    }

    @Override
    public String swingSword() {
        return null;
    }

}