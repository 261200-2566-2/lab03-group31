public class Shoes {
    int levelShoes = 1;
    double  spd;


    void statusShoes() {

        System.out.println("Level Shoes : " + levelShoes);
        System.out.println("spd increase  : " + "+" + spd);
    }

    void equipShoes() {
        spd = spd + (2.5*levelShoes);
        statusShoes();

    }
    void levShoesUp() {
        levelShoes++;
        equipShoes();

    }
////
}
