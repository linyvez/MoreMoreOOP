package lotr;

import java.util.Random;

import lotr.kickstrategy.NobleKick;

public class Noble extends Character {
    public Noble(int min, int max) {
        super(new Random().nextInt(max - min) + min, new Random().nextInt(max - min) + min, new NobleKick());
    }
}
