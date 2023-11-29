import java.util.Scanner;
//implement a class RPG_character form RPG_character.java
public class Main extends RPG_characters {
    public static void main(String[] args) {
        RPG_characters a = new RPG_characters();
        Scanner aa = new Scanner(System.in);
        System.out.println("Let's create your character! please give me your name: ");
        String AnsOne = aa.next();
        a.createHero(AnsOne);

        System.out.println("Train Hero? (Y/N)");
        String AnsTwo = aa.next();
        String AnsTwoCon = AnsTwo.toUpperCase();

        if(AnsTwoCon.equals("Y")){
            a.trainHero();
        }

        System.out.println(" choose to wear (sword / shield / shoes)");
        String AnsThree = aa.next();
        String AnsThreeCon = AnsThree.toUpperCase();

        switch (AnsThreeCon) {
            case "SWORD" -> a.equipSword();
            case "SHIELD" -> a.equipShield();
            case "SHOES" -> a.equipShoes();
            default -> {
                return;
            }
        }
        System.out.println("------------------------------------");
        System.out.println(" choose to level up items? (Y/N)");
        String AnsFour = aa.next();
        String AnsFourCon = AnsFour.toUpperCase();

        if(AnsFourCon.equals("Y")){
            switch (AnsThreeCon) {
                case "SWORD" -> a.levSwordUp();
                case "SHIELD" -> a.levShieldUp();
                case "SHOES" -> a.levShoesUp();
                default -> {
               //no return
                }
            }
            //Equipment has an effect on character's run speed (in total status already)
        }

        System.out.println("""
                         //
                        ||
                |\\[][][]||-----------------------------\\
                |/[][][]||-----------------------------/
                        ||
                         \\\\""");

        //a character could be attacked by a sword
        System.out.println("You have been attacked by sword!! ");

        if(a.myShield >= 1){
            a.HP -= 10;     //but can lessen damage with a shield
        }
        else{
            a.HP -= 20;
        }
        a.showStatus();
    }
}
/*
 Reference : 1.https://codereview.stackexchange.com/questions/148133/generating-rpg-characters-objects
 2.https://www.asciiart.eu/weapons/swords
 */