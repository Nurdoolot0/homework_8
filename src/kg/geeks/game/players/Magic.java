package kg.geeks.game.players;

public class Magic extends Hero {
    private int attackIncrease;

    public Magic(int health, int damage, String name) {
        super(health, damage, name,SuperAbility.ATTAC_INCREASE);
        this.attackIncrease = attackIncrease;
    }

    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {

    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        for (Hero hero : heroes) {
            if (hero != this) {
                hero.setDamage(hero.getDamage() + attackIncrease);
                System.out.println(hero.getClass().getSimpleName() +attackIncrease);
            }
        }
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {

    }
}




