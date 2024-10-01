package lotr.kickstrategy;

import lotr.Character;

public class ElfKick implements KickStrategy {
    @Override
    public void kick(Character whoKick, Character whoIsKicked) {
        if (whoKick.getPower() > whoIsKicked.getPower()) {
            whoIsKicked.setHp(0);
        }
        else {
            whoIsKicked.setPower(whoIsKicked.getPower() - 1);
        }
    }
}
