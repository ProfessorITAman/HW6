package HW6;
public class Boss extends GameEntity {
    private Weapon weaponboss;

    public Boss(String name, int healthPoints, int damage, int level, Weapon weapon) {
        super(name, healthPoints, damage, level);
        this.weaponboss = weapon;
    }

    public Boss(String name, int healthPoints, int damage, int level) {
        super(name, healthPoints, damage, level);
        this.weaponboss = null;
    }

    public Weapon getWeapon() {
        return weaponboss;
    }

    public void setWeapon(Weapon weapon) {
        this.weaponboss = weapon;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        if (weaponboss != null) {
            System.out.println("Weapon Type: " + weaponboss.getType());
            System.out.println("Weapon Damage: " + weaponboss);
        } else {
            System.out.println("No weapon equipped.");
        }
    }

    @Override
    public void attack(GameEntity target) {
        int totalDamage = getDamage();
        if (weaponboss != null) {
            totalDamage += getDamage();
        }

        System.out.println(getName() + " attacks " + target.getName() +
                " with " + (weaponboss != null ? weaponboss.getType() : "bare hands") +
                " for " + totalDamage + " damage.");

        target.setHealthPoints(target.getHealthPoints() - totalDamage);
        System.out.println(target.getName() + "'s new health: " + target.getHealthPoints());
    }
}
