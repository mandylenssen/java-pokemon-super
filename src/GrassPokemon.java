public class GrassPokemon extends Pokemon {

    //variabelen
    private int xp;
    private int hp;


    // constructor
    public GrassPokemon(String name, int level, String sound, int xp, int hp) {
        super(name, level, sound);
        this.xp = xp;
        this.hp = hp;
    }

    // methodes

    @Override
    public void eats() {
        System.out.println(getName() + " eats grass-berry");
    }

    public void weakness() {
        System.out.println(getName() + " has a weakness to Fire-type");
    }

    public void strongAgainst() {
        System.out.println(getName() + " is strong against Water-type");
    }


    // getters & setters
    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    }

