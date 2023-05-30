

//Imagine you're developing a game that involves different types of characters.
//        Each character has specific  attributes and behaviors. In this scenario,
//        you can use inner classes to encapsulate and organize the related classes.


public class Game {
    // Outer class

    private List<Character> characters;

    public Game() {
        characters = new ArrayList<>();
        characters.add(new Character("Player 1", new Warrior()));
        characters.add(new Character("Player 2", new Mage()));
        characters.add(new Character("Player 3", new Archer()));
    }

    private class Character {
        // Inner class representing a game character

        private String name;
        private CharacterClass characterClass;

        public Character(String name, CharacterClass characterClass) {
            this.name = name;
            this.characterClass = characterClass;
        }

        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Class: " + characterClass.getClassName());
        }
    }

    private interface CharacterClass {
        // Inner interface representing character classes

        String getClassName();
    }

    private class Warrior implements CharacterClass {
        // Inner class representing the Warrior character class

        public String getClassName() {
            return "Warrior";
        }
    }

    private class Mage implements CharacterClass {
        // Inner class representing the Mage character class

        public String getClassName() {
            return "Mage";
        }
    }

    private class Archer implements CharacterClass {
        // Inner class representing the Archer character class

        public String getClassName() {
            return "Archer";
        }
    }

    public void displayCharacterInfo() {
        for (Character character : characters) {
            character.displayInfo();
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.displayCharacterInfo();
    }
}

In 