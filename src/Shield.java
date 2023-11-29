public class Shield {

    int levelShield = 1;
    double def, spd;

    void statusShield() {
        System.out.println("Level Shield : " + levelShield);
        System.out.println("def increase : " + "+" + def);
        System.out.println("spd decrease  : " + spd);
    }

    void equipShield() {
        def = def + (1.25*levelShield);
        spd = spd - spd *(0.5*levelShield);
        statusShield();

    }
    void levShieldUp() {
        levelShield++;
        equipShield();

    }


////
}
