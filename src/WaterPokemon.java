public class WaterPokemon extends Pokemon {

    //variabelen
    private String secondType;
    private int defence;

    //constructors
    public WaterPokemon(String name, int level, String sound, int defence) {
        super(name, level, sound);
        this.defence = defence;
    }

    public WaterPokemon(String name, int level, String sound, String secondType) { //second type constructor
        super(name, level, sound);
        this.secondType = secondType;
    }


    // methodes
    @Override
    public void eats() {
        System.out.println(getName() + " eats water-berry");
    }

    public void weakness() {
        System.out.println(getName() + " has a weakness to Fire-type");
    }

    public void strongAgainst() {
        System.out.println(getName() + " is strong against Electric-type");
    }



    // getters & setters
    public String getSecondType() {
        return secondType;
    }

    public void setSecondType(String secondType) {
        this.secondType = secondType;
    }


    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }
}

