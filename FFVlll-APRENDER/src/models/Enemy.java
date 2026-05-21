package models;

public class Enemy {
    
    private int HP;

    public Enemy(int HP) {
        this.HP = HP;
    }

    public int getHP() {
        return HP;
    }

    public int setHP(int HP) {
        this.HP = HP;
        return HP;
    }

}
