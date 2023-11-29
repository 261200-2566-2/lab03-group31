public class Shoes {
    int levelShoes = 1;
    double atk, spd;


    void statusShoes() {
        equipShoes();
        System.out.println("Level Sword : " + levelShoes);
        System.out.println("spd increase  : " + "+" + spd);
    }

    void equipShoes() {
        spd = spd + (2.5*levelShoes);
        statusShoes();

    }
    void levShoesUp() {
        levelShoes++;
        statusShoes();
    }
}
