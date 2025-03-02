package Prototype;

public class Monster implements Prototype{
    private String name;
    private int hp;
    private int damage;

    public Monster(String name, int hp, int damage){
        this.setDamage(damage);
        this.setName(name);
        this.setHp(hp);
        System.out.println("Spawning monster " + this);
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    public int getHp() {return hp;}

    public void setDamage(int damage) {
        if (damage > 150 || damage < 0){
            this.damage = 5;
        }
        this.damage = damage;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setHp(int hp) {
        if (hp < 0 || hp > 500) {
            this.hp = 100;
        }
        this.hp = hp;
    }

    public Monster doClone(){
        return new Monster(this.name, this.hp, this.damage);
    }

    @Override
    public String toString(){
        return "Name: " + this.getName() + " Hp: " + this.getHp() + " Damage: " + this.getDamage();
    }
}
