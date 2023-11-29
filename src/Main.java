
import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        RPG_characters a = new RPG_characters();
        Scanner aa = new Scanner(System.in);
        System.out.println("Let's create your character please gimme ur name: ");
        String AnsOne = aa.next();
        a.createHero(AnsOne);
        System.out.println("Train Hero? (Y/N)");
        String AnsTwo = aa.next();
        String AnsTwoCon = AnsTwo.toUpperCase();
        if (AnsTwoCon.equals("Y")) {
            a.trainHero();
        }
        /////////////////////////////
        System.out.println(" choose to wear (sword / shield / shoes)");
        String AnsThree = aa.next();
        String AnsThreeCon = AnsThree.toUpperCase();

        Object[] Item = new Object[3];

        switch (AnsThreeCon) {
            case "SWORD" -> {
                Sword eSw = new Sword();
                System.out.println("equip sword now");
                eSw.statusSword();
                Item[0] = eSw;
                System.out.println(Item[0]);
                eSw.equipSword();

                System.out.println("level up items? (Y/N)");
                String AnsFour = aa.next();
                String AnsFourCon = AnsFour.toUpperCase();

                if (AnsFourCon.equals("Y")) {
                    eSw.levSwordUp();
                }

            }
            case "SHOES" -> {
                Shoes eSho = new Shoes();
                System.out.println("equip Shoes now");
                eSho.statusShoes();
                Item[1] = eSho;
                eSho.equipShoes();

                System.out.println("level up items? (Y/N)");
                String AnsFour = aa.next();
                String AnsFourCon = AnsFour.toUpperCase();

                if (AnsFourCon.equals("Y")) {
                    eSho.levShoesUp();
                }

            }
            case "SHIELD" -> {
                Shield eShi = new Shield();
                System.out.println("equip Shield now");
                eShi.statusShield();
                Item[2] = eShi;
                eShi.equipShield();

                System.out.println("level up items? (Y/N)");
                String AnsFour = aa.next();
                String AnsFourCon = AnsFour.toUpperCase();

                if (AnsFourCon.equals("Y")) {
                    eShi.levShieldUp();
                }
            }


        }

    }
}

