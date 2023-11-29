public class RPG_characters {
    String name;
    int level = 0;
    int levelMax = 10;
    int maximumHP = 10;
    int HP;
    double atk = 20;
    double def = 10;
    double spd = 5;
    int manaMax = 10;
    int mana;

    void showStatus() {
        System.out.println("This is his/her current status now: ");
        System.out.println("name = " + name);
        System.out.println("level = " + level + " / " + levelMax);
        System.out.println("HP = " + HP + " / " + maximumHP);
        System.out.println("mana = " + mana + " / " + manaMax);
        System.out.println("atk = " + atk);
        System.out.println("def = " + def);
        System.out.println("spd = " + spd);


    }

    void createHero(String name) {
        this.name = name;
        mana = manaMax;
        HP = maximumHP;
        showStatus();
    }



    void trainHero(){
        maximumHP= 100 + 10 * level;
        manaMax= 50 + 2 * level;
        HP = maximumHP;
        mana = manaMax;
        atk += atk + (2*level);
        def += def + (2.5*level);
        spd += spd + (2*level);
        showStatus();
        if(level > levelMax){
            level = levelMax;
            System.out.println("You are already strong");
        }
    }

    void beAttacked(){
        System.out.println("""
                         //
                        ||
                |\\[][][]||-----------------------------\\
                |/[][][]||-----------------------------/
                        ||
                         \\\\""");

        //a character could be attacked by a sword
        System.out.println("You have been attacked by sword!! ");
    }


}
