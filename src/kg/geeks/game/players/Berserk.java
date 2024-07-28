package kg.geeks.game.players;

public class Berserk extends Hero {
    private int blockedDamage;

    public Berserk(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BLOCK_DAMAGE_AND_REVERT);
    }

    public void setBlockedDamage(int blockedDamage) {
        this.blockedDamage = blockedDamage;
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        boss.setHealth(boss.getHealth() - this.blockedDamage);
        System.out.println("Berserk " + this.getName() + " reverted "
                + this.blockedDamage + " damage");
    }

    /**
     * @param heroes
     * @param boss
     */
    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {

    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {

    }
}