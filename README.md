# InnerClasss
real-life example for inner class
In this example, the Game class represents the overall game structure…
…, and it contains an inner class called Character. The Character class represents a game character and has attributes like name and characterClass. The Character class also has a method called displayInfo() that displays the character's name and class.

Inside the Game class, there are additional inner classes (Warrior, Mage, and Archer) that implement the CharacterClass interface. Each inner class represents a specific character class and provides an implementation of the getClassName() method.

By using inner classes, you can maintain a clear relationship between the game characters and their character classes. The Character inner class can access the private members of the outer class (characters list), and each character class implementation has access to the outer class's private members as well.

The Game class's main method creates an instance of the game and displays information about each character by calling the displayCharacterInfo() method.

This example demonstrates how inner classes can help organize related classes, achieve encapsulation, and represent hierarchical relationships between different entities in a real-life scenario, such as a game development project.
