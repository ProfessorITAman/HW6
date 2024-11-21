package HW6;

public class WeaponsBoss {
        private String type;
        private int damage;

        public WeaponsBoss(String type, int damage) {
            this.type = type;
            this.damage = damage;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getDamage() {
            return damage;
        }

        public void setDamage(int damage) {
            this.damage = damage;
        }

        public void displayInfo() {
            System.out.println("Weapon Type: " + type);
            System.out.println("Weapon Damage: " + damage);
        }
    }
