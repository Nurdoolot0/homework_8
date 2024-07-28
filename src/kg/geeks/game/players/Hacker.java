package kg.geeks.game.players;

import java.util.Random;

public class Hacker extends Hero {
    private int stealAmount;
    private int roundCounter = 0;
    private Random random = new Random();

    public Hacker(int health, int damage, String name, int stealAmount) {
        super(health, damage, name, SuperAbility.HACK);
        this.stealAmount = stealAmount;
    }

    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {

    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        roundCounter++;
        if (roundCounter % 2 == 0) {
            boss.setHealth(boss.getHealth() - stealAmount);
            Hero randomHero = heroes[random.nextInt(heroes.length)];
            randomHero.setHealth(randomHero.getHealth() + stealAmount);
            System.out.println( stealAmount +  randomHero.getClass().getSimpleName());
        }
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {

    }
}
