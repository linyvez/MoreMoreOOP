package lotr;

import java.util.Random;
import java.util.Set;

import org.reflections.Reflections;

public class CharacterFactory {
    public static Character creareCharacter() {
        try {
            Reflections reflections = new Reflections("lotr");

            Set<Class<? extends Character>> characters = reflections.getSubTypesOf(Character.class);
            Class<? extends Character>[] charactersArray = characters.toArray(new Class[0]);

            int r = new Random().nextInt(charactersArray.length);
            Class<? extends Character> randomCharacter = charactersArray[r];
    
            return randomCharacter.getDeclaredConstructor().newInstance();
        
        } catch (Exception e) { return null; }
        
    }
}
