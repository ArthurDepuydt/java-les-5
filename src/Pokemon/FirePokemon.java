package Pokemon;

import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {
    private final List<String> attacks = List.of("inferno", "pyroBall", "fireLash", "flameThrower");
    private static final String type = "fire";

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public List<String> getAttacks() {
        return attacks;
    }

    public void inferno(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with inferno");
        int damage = switch (gymPokemon.getType()) {
            case "grass" -> 40;
            case "water" -> 30;
            case "electric" -> 20;
            default -> 10;
        };
        System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
        gymPokemon.setHp(gymPokemon.getHp() - damage);
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " hp left");
    }

    public void pyroBall(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with pyroBall");
        int damage = switch (gymPokemon.getType()) {
            case "grass" -> 35;
            case "water" -> 25;
            case "electric" -> 15;
            default -> 5;
        };
        System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
        gymPokemon.setHp(gymPokemon.getHp() - damage);
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " hp left");
    }

    public void fireLash(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with fireLash");
        int damage = switch (gymPokemon.getType()) {
            case "grass" -> 30;
            case "water" -> 20;
            case "electric" -> 15;
            default -> 5;
        };
        System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
        gymPokemon.setHp(gymPokemon.getHp() - damage);
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " hp left");
    }

    public void flameThrower(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with flameThrower");
        int damage = switch (gymPokemon.getType()) {
            case "grass" -> 45;
            case "water" -> 35;
            case "electric" -> 25;
            default -> 10;
        };
        System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
        gymPokemon.setHp(gymPokemon.getHp() - damage);
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " hp left");
    }
}
