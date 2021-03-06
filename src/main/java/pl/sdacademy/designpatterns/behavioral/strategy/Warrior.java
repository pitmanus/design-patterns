package pl.sdacademy.designpatterns.behavioral.strategy;

public class Warrior {
    private String name;
    private HitStrategy hitStrategy;

    public Warrior (String name, HitStrategy hitStrategy) {
        this.name = name;
        this.hitStrategy = hitStrategy;
    }

    public String getName () {
        return name;
    }

    public void setHitStrategy (HitStrategy hitStrategy) {
        this.hitStrategy = hitStrategy;
    }

    public void hit() {
        hitStrategy.hit ();
    }
}
