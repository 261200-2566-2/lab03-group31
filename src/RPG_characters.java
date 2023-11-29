<<<<<<< HEAD
public class RPG_characters {
     String name;
     int level = 1;
     int levelMax = 10;
     int maximumHP= 100 + 10 * level;
     int HP;
    double atk = 20;
    double def = 10;
    double spd = 5;
    int manaMax= 50 + 2 * level;
    int mana;

    void showStatus() {
        System.out.println("This is his/her current status now: ");
        System.out.println("name = " + name);
        System.out.println("level = " + level + " / " + levelMax);
        System.out.println("HP = " + HP + " / " + maximumHP);
=======
//design a class for an RPG character
//
public class RPG_characters {
    //how and where to store data
    //ออกแบบให้ class RPG_characters เก็บข้อมูล ของ characters

    String name;
    int level = 1;      //RPG character has a level
    int levelMax = 10;
    int maximum_HP = 100 + 10*level;    //level determines maximum HP
    int HP;
    double atk = 20;
    double def = 10;
    double spd = 5;
    int manaMax = 50 + 2*level;     //level determines maximum mana
    int mana;

    void showStatus() {
        System.out.println("------------------------------------");
        System.out.println("This is his/her current status now: ");
        System.out.println("------------------------------------");
        System.out.println("name = " + name);
        System.out.println("level = " + level + " / " + levelMax);
        System.out.println("HP = " + HP + " / " + maximum_HP);
>>>>>>> origin/working
        System.out.println("mana = " + mana + " / " + manaMax);
        System.out.println("atk = " + atk);
        System.out.println("def = " + def);
        System.out.println("spd = " + spd);
<<<<<<< HEAD


=======
        System.out.println("------------------------------------");
>>>>>>> origin/working
    }

    void createHero(String name) {
        this.name = name;
        mana = manaMax;
<<<<<<< HEAD
        HP = maximumHP;
=======
        HP = maximum_HP;
>>>>>>> origin/working
        level = 1;
        showStatus();
    }

<<<<<<< HEAD


    void trainHero(){
        level++;
        HP = maximumHP;
=======
    //compute information
    void trainHero(){
        level++;        //level can be upped
        HP = maximum_HP;
>>>>>>> origin/working
        mana = manaMax;
        atk += atk + (2*level);
        def += def + (2.5*level);
        spd += spd + (2*level);
        showStatus();
    }

<<<<<<< HEAD
}

=======
    //a character  have  equipment [sword , Shield , Shoes]
    int levelSword = 1;

    void levSwordUp(){
        levelSword++;
        equipSword();
    }

    int levelShield = 1;

    void levShieldUp(){
        levelShield++;
        equipShield();
    }

    int levelShoes = 1;

    void levShoesUp(){
        levelShoes++;
        equipShoes();
    }

    int myShield ;
    void equipSword(){

        atk = atk + (1.25*level);       //a character could be attacked by a sword
        spd = spd - spd *(0.25*level);  //Sword will reduce character's run speed
        showStatus();
        System.out.println("equipSword level:" + levelSword);
    }

    void equipShield(){
        def = def + (1.25*level);
        spd = spd - spd *(0.5*level);   //Shield will reduce character's run speed
        myShield++;
        showStatus();
        System.out.println("equipShield level:" + levelShield);
    }

    void equipShoes(){
        spd = spd + (2.5*level);
        showStatus();
        System.out.println("equipShoes level:" + levelShoes);
    }

}
>>>>>>> origin/working
