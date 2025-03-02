package Prototype;

public class Hero {
    int killedMonsters = 0;
    public Hero(){}

    public int getKilledMonsters() {
        return killedMonsters;
    }

    public void setKilledMonsters(int killedMonsters) {
        this.killedMonsters = killedMonsters;
    }

    public void killMonster(Monster monster){
        System.out.println(monster.getName() + " get killed");
        killedMonsters++;
        monster.doClone();//поки не станеться, якийсь івент монстри будуть спавнитись і герой повинен їх вбивати
    }
}
