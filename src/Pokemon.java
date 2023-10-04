public abstract class Pokemon {

    // variabelen
    private String name; //private: alleen iedereen binnen de pokemon klasse kan er bij
    private int level;
    private String sound;


    // constructor
    public Pokemon(String name, int level, String sound) {
        this.name = name;
        this.level = level;
        this.sound = sound;
    }


    // methodes
    public abstract void eats();

    public void speak(){
        System.out.println(sound);

    }


    // getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
