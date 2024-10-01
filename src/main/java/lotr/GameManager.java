package lotr;

public class GameManager {
    public static void fight(Character c1, Character c2) {
        System.out.println("Character 1: " + c1 + ". Character 2: " + c2);
        while (c1.isAlive() && c2.isAlive()) {
            if (c1.getHp() <= c2.getHp()) {
                System.out.println("Character 1 (" + c1.getHp() + " hp) kicks Character 2 (" + c2.getHp() + " hp)!");
                int hp = c2.getHp();
                c1.kick(c2);
                int damage = hp - c2.getHp();
                if (c1 instanceof Hobbit) {
                    c1.setHp(0);
                }
                else {
                    System.out.println("-" + damage + " hp to Character 2!");
                }
            }
            else {
                System.out.println("Character 2 (" + c2.getHp() + " hp) kicks Character 1 (" + c1.getHp() + " hp)!");
                int hp = c1.getHp();
                c2.kick(c1);
                int damage = hp - c1.getHp();
                if (c2 instanceof Hobbit) {
                    c2.setHp(0);
                }
                else {
                    System.out.println("-" + damage + " hp to Character 1!");
                }
                
            }
        }
        if (!c1.isAlive()) {
            System.out.println("Character 2 is the winner!");
        }
        else if (!c2.isAlive()) {
            System.out.println("Character 1 is the winner!");
        }
    }
    // public static void main(String[] args) {
    //     Character c1 = CharacterFactory.creareCharacter();
    //     Character c2 = CharacterFactory.creareCharacter();
    //     GameManager.fight(c1, c2);
    // }
}
