public class ElectricPokemon extends Pokemon {

    //variabelen
    private String attack;
    private int weight;

    // constructor
    public ElectricPokemon(String name, int level, String sound, String attack, int weight) {
        super(name, level, sound);
        this.attack = attack;
        this.weight = weight;
    }

    // methode uit super class
    @Override
    public void eats() {
        System.out.println(getName() + " eats electric-berry");
    }


    // methodes
    public void weakness() {
        System.out.println(getName() + " has a weakness to Ground-type");
    }

    public void strongAgainst() {
        System.out.println(getName() + " is strong against Water-type");
    }

    public void sleep() {
        System.out.println(getName() + " sleeps 2 hrs a day");
    }


    // getters & setters
    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

