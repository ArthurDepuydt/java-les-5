package Pokemon;

import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {
    private final List<String> attacks = List.of("thunderPunch", "electroBall", "thunder", "voltTackle");
    private static final String type = "electric";

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public List<String> getAttacks() {
        return attacks;
    }

    public void thunderPunch(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with thunderPunch");
        int damage = switch (gymPokemon.getType()) {
            case "water" -> 35;
            case "grass" -> 25;
            case "fire" -> 15;
            default -> 5;
        };
        System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
        gymPokemon.setHp(gymPokemon.getHp() - damage);
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " hp left");
    }

    public void electroBall(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with electroBall");
        int damage = switch (gymPokemon.getType()) {
            case "water" -> 40;
            case "grass" -> 30;
            case "fire" -> 20;
            default -> 10;
        };
        System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
        gymPokemon.setHp(gymPokemon.getHp() - damage);
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " hp left");
    }

    public void thunder(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with thunder");
        if (gymPokemon.getType().equals("electric")) {
            int boost = 15;
            gymPokemon.setHp(gymPokemon.getHp() + boost);
            System.out.println(gymPokemon.getName() + " gains " + boost + " hp");
        } else {
            int damage = switch (gymPokemon.getType()) {
                case "water" -> 45;
                case "grass" -> 35;
                default -> 25;      // fire
            };
            System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
            gymPokemon.setHp(gymPokemon.getHp() - damage);
        }
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " hp left");
    }

    public void voltTackle(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with voltTackle");
        int damage = switch (gymPokemon.getType()) {
            case "water" -> 45;
            case "grass" -> 35;
            case "fire" -> 25;
            default -> 10;
        };
        System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
        gymPokemon.setHp(gymPokemon.getHp() - damage);
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " hp left");
    }

}
