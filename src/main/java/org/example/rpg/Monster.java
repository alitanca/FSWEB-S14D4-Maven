package org.example.rpg;

public abstract class Monster {
    private final String name;
    private final int hitPoints;
    private final double damage;

    public Monster(String name, int hitPoints, double damage) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.damage = damage;
    }

    public String getName() { return name; }
    public int getHitPoints() { return hitPoints; }
    public double getDamage() { return damage; }

    public double attack() {
        double extra = 0.0;
        if (this instanceof Bleedable) extra += ((Bleedable) this).bleed();
        if (this instanceof Poisonable) extra += ((Poisonable) this).poison();
        return getDamage() + extra;
    }
}



