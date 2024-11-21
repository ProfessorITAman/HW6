package HW6;

// Класс Skeleton
public class Skeleton extends Boss {
    private int arrows;

    public Skeleton(String name, int healthPoints, int damage, int level, int arrows) {
        super(name, healthPoints, damage, level);
        this.arrows = arrows;
    }

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    public void printInfo() {
        System.out.println("Arrows: " + arrows);
    }

    public void attack(GameEntity target) {
        if (arrows > 0) {
            System.out.println(getName() + " attacks " + target.getName() + " with a bow!");
            arrows--;
            System.out.println("Remaining arrows: " + arrows);
        } else {
            System.out.println(getName() + " has no arrows left to attack!");
        }
    }
}

