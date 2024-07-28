package kg.geeks.game.players;

import java.util.Random;

public class Ludoman extends Hero {
    private final Random random = new Random();

    public Ludoman(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.GAMBLER);
    }

    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {
        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 1;

        if (dice1 == dice2) {
            int damage = dice1 * dice2;
            boss.setHealth(boss.getHealth() - damage);
            System.out.println(dice1 + dice2 +  damage);
        } else {
            int damage = dice1 + dice2;
            Hero randomHero = heroes[random.nextInt(heroes.length)];
            if (randomHero != this) {
                randomHero.setHealth(randomHero.getHealth() - damage);
                System.out.println( dice1 + dice2 +  damage + randomHero.getClass().getSimpleName());
            }
        }
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {

    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {

    }
}


