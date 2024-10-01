package lotr;

import java.util.Random;

import lotr.kickstrategy.NobleKick;

public class King extends Character {
    public King() {
        super(new Random().nextInt(5, 16), new Random().nextInt(5, 16), new NobleKick());
    }
}
