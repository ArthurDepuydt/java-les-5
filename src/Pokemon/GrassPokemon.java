package Pokemon;

import java.util.List;

public class GrassPokemon extends Pokemon {
    private final List<String> attacks = List.of("leafStorm", "solarBeam", "leechSeed", "leaveBlade");
    private static final String type = "grass";

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public List<String> getAttacks() {
        return attacks;
    }


    public void leafStorm(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with leafStorm");
        int damage = switch (gymPokemon.getType()) {
            case "electric" -> 40;
            case "fire" -> 30;
            case "water" -> 20;
            default -> 10;
        };
        System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
        gymPokemon.setHp(gymPokemon.getHp() - damage);
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " hp left");
    }

    public void solarBeam(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with solarBeam");
        int damage = switch (gymPokemon.getType()) {
            case "electric" -> 45;
            case "fire" -> 35;
            case "water" -> 25;
            default -> 10;
        };
        System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
        gymPokemon.setHp(gymPokemon.getHp() - damage);
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " hp left");
    }

    public void leechSeed(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with leechSeed");
        int damage = switch (gymPokemon.getType()) {
            case "electric" -> 25;
            case "fire" -> 20;
            case "water" -> 15;
            default -> 5;
        };
        System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
        gymPokemon.setHp(gymPokemon.getHp() - damage);
        pokemon.setHp(pokemon.getHp() + damage);
        System.out.println(pokemon.getName() + " gains " + damage + " hp and now has " + pokemon.getHp() + " hp");
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " hp left");
    }

    public void leaveBlade(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with leaveBlade");
        int damage = switch (gymPokemon.getType()) {
            case "electric" -> 35;
            case "fire" -> 25;
            case "water" -> 15;
            default -> 5;
        };
        System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
        gymPokemon.setHp(gymPokemon.getHp() - damage);
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " hp left");
    }
}
