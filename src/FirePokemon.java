public class FirePokemon extends Pokemon {

    // variabelen
    private boolean hasExternalFlame;
    private boolean hasTrainer;


    //constructor
    public FirePokemon(String name, int level, String sound, boolean hasExternalFlame, boolean hasTrainer) {
        super(name, level, sound); // variabelen uit de superklas --> Pokemon
        this.hasExternalFlame = hasExternalFlame;
        this.hasTrainer = hasTrainer;
    }

    // Methode afkomstig van super class
    @Override
    public void eats() {
        System.out.println(getName() + " eats fire-berry");

    }

    // methodes
    public void weakness() {
        System.out.println(getName() + " has a weakness to Water-type");
    }

    public void strongAgainst() {
        System.out.println(getName() + " is strong against Grass-type");
    }


    // getters & setters
    public boolean isHasExternalFlame() {
        return hasExternalFlame;
    }

    public void setHasExternalFlame(boolean hasExternalFlame) {
        this.hasExternalFlame = hasExternalFlame;
    }

    public String isHasTrainer() {

        if (hasTrainer) {
            return "has a trainer";
        } else {
            return "is a wild Pokemon";
        }
    }

    public void setHasTrainer(boolean hasTrainer) {
        this.hasTrainer = hasTrainer;
    }
}
