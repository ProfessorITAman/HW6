package HW6;

public class Main {
    public static void main(String[] args) {
        Weapon sword = new Weapon(WeaponType.Sword, "Excalibur");
        Weapon axe = new Weapon(WeaponType.Axe, "Battle Axe");
        Weapon spear = new Weapon(WeaponType.Spear, "Golden Spear");
        System.out.println(sword);
        System.out.println(axe);
        System.out.println(spear);

        sword.setName("Battle Axe");
        sword.setType(WeaponType.Axe);
        System.out.println("Updated: " + sword);

        GameEntity hero = new GameEntity("Hero", 250, 25, 1);
        GameEntity boss = new GameEntity("Boss", 600, 50, 5);

        System.out.println("Hero Info:");
        hero.displayInfo();
        System.out.println();

        System.out.println("Boss Info:");
        boss.displayInfo();
        System.out.println();

        hero.attack(boss);


          Weapon bossWeapon = new Weapon(WeaponType.Sword, "Excalibur");
              Boss boss1 = new Boss("Dragon King", 300, 30, 10, bossWeapon);


             GameEntity knight = new GameEntity("Knight", 100, 20, 1);

              System.out.println("Boss Info:");
              boss.displayInfo();
             System.out.println();

            System.out.println("Hero Info:");
            hero.displayInfo();
            System.out.println();

        boss.attack(hero);
        Boss boss2 = new Boss("Dark Overlord", 1000, 200, 10, bossWeapon);
        boss.displayInfo();

        GameEntity target = new GameEntity("Hero", 500, 50, 5);
        boss.attack(target);

        Skeleton skeleton = new Skeleton("Skeleton Archer", 100, 20, 5, 10);
        skeleton.printInfo();
        skeleton.attack(target);
        skeleton.attack(target);
        skeleton.printInfo();
        Skeleton skeleton1 = new Skeleton("Skeleton Magic Archer", 75, 15, 3, 6);
        skeleton1.printInfo();
        skeleton1.attack(target);
        skeleton1.attack(target);
        skeleton1.printInfo();
    }
}
