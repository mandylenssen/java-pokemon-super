public class Main {

    public static void main(String[] args) {

        FirePokemon Charmander = new FirePokemon("Charmander", 11, "char-char", true, false);
        Charmander.eats();
        Charmander.weakness();
        System.out.println(Charmander.getName() + " " + Charmander.isHasTrainer());

        ElectricPokemon Pikachu = new ElectricPokemon("Pickachu", 16, "pika-pika", "thunder", 5);
        Pikachu.sleep();

       WaterPokemon Squirtle = new WaterPokemon("Squirtle", 7, "squirtle-squirtle", 90);
        Squirtle.strongAgainst();

        GrassPokemon Bulbasaur = new GrassPokemon("Bulbasaur", 10, "Bulba", 30, 50);
        System.out.println(Bulbasaur.getName() + " has " + Bulbasaur.getHp() + " hp left");

        WaterPokemon Chinchou = new WaterPokemon("Chinchou", 22, "chin-chin", "Electric");
        System.out.println(Chinchou.getName() + " is also an " + Chinchou.getSecondType() + " type");
    }
}
