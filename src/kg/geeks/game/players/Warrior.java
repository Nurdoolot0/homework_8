package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

public class Warrior extends Hero {
    public Warrior(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        int coefficient = RPG_Game.random.nextInt(5) + 2;  // 2, 3, 4, 5, 6
        boss.setHealth(boss.getHealth() - this.getDamage() * coefficient);
        System.out.println("Warrior " + this.getName() + " hits critically " +
                coefficient * this.getDamage());
    }

    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {

    }

    /**
     * @param heroes
     * @param boss
     */
    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {

    }
}
