
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

        if(AnsTwoCon.equals("Y")){
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

            }
            case "SHOES" -> {
                Shoes eSho = new Shoes();
                System.out.println("equip Shoes now");
                eSho.statusShoes();
                Item[1] = eSho;
            }
            case "SHIELD" -> {
                Shield eShi = new Shield();
                System.out.println("equip Shield now");
                eShi.statusShield();
                Item[2] = eShi;
            }
            default -> {
                return;
            }
        }


        System.out.println("------------------------------------");
        System.out.println(" choose to level up items? (Y/N)");
        String AnsFour = aa.next();
        String AnsFourCon = AnsFour.toUpperCase();

//        if(AnsFourCon.equals("Y")){
//            switch (AnsThreeCon) {
//                case "SWORD" -> {
//                    Item[0].levSwordUp();
//
//                }
//                case "SHIELD" -> a.levShieldUp();
//                case "SHOES" -> a.levShoesUp();
//                default -> {
//                    //no return
//                }
//            }
//            //Equipment has an effect on character's run speed (in total status already)
//        }

    }


    }




}

