
import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        RPG_characters a = new RPG_characters();
        Scanner aa = new Scanner(System.in);
        Scanner two = new Scanner(System.in);
        System.out.println("Let's create your character please gimme ur name: ");
        String AnsOne = aa.next();
        a.createHero(AnsOne);
        System.out.println("What level do you want to up (1-10)");
        int AnsTwo = two.nextInt();
        if (AnsTwo >= 1 && AnsTwo < 10) {
            a.level = AnsTwo;
            a.trainHero();
        }
        /////////////////////////////
        System.out.println(" choose to wear (sword / shield / shoes)");
        String AnsThree = aa.next();
        String AnsThreeCon = AnsThree.toUpperCase();


        switch (AnsThreeCon) {
            case "SWORD" -> {
                Sword eSw = new Sword();
                System.out.println("equip sword now");
                eSw.equipSword();

                System.out.println("level up items? (1-3)");
                int AnsFour = aa.nextInt();

                if (AnsFour >= 1 && AnsFour < 4) {
                    eSw.levSwordUp();
                }

                a.atk += eSw.atk;
                a.spd += eSw.spd;
                a.beAttacked();
                a.HP -= 55;
                a.mana -= 15/eSw.levelSword;
                a.showStatus();
            }
            case "SHOES" -> {
                Shoes eSho = new Shoes();
                System.out.println("equip Shoes now");
                eSho.equipShoes();

                System.out.println("level up items? (1-3)");
                int AnsFour = aa.nextInt();

                if (AnsFour >= 1 && AnsFour < 4) {
                    eSho.levShoesUp();
                }
                a.spd += eSho.spd;
                a.beAttacked();
                a.HP -= 50;
                a.mana -= 60/eSho.levelShoes;
                a.showStatus();
            }
            case "SHIELD" -> {
                Shield eShi = new Shield();
                System.out.println("equip Shield now");
                eShi.equipShield();

                System.out.println("level up items? (1-3)");
                int AnsFour = aa.nextInt();

                if (AnsFour >= 1 && AnsFour < 4) {
                    eShi.levShieldUp();
                }

                a.atk += eShi.def;
                a.spd += eShi.spd;
                a.beAttacked();
                a.HP -= 20/eShi.levelShield;
                a.mana -= 10/eShi.levelShield;
                a.showStatus();
            }


        }

    }
}

