package HW6;

public class GameEntity {
        private String name;
        private int healthPoints;
        private int damage;
        private int level;

        public GameEntity(String name, int healthPoints, int damage, int level) {
            this.name = name;
            this.healthPoints = healthPoints;
            this.damage = damage;
            this.level = level;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getHealthPoints() {
            return healthPoints;
        }

        public void setHealthPoints(int healthPoints) {
            this.healthPoints = Math.max(0, healthPoints);
        }

        public int getDamage() {
            return damage;
        }

        public void setDamage(int damage) {
            this.damage = Math.max(0, damage);
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Health Points: " + healthPoints);
            System.out.println("Damage: " + damage);
            System.out.println("Level: " + level);
        }

        public void attack(GameEntity target) {
            System.out.println(name + " attacks " + target.getName() + " for " + damage + " damage.");
            target.setHealthPoints(target.getHealthPoints() - damage);
            System.out.println(target.getName() + "'s new health: " + target.getHealthPoints());
        }
    }

