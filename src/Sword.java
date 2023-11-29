public class Sword {
            int levelSword = 1;
            double atk, spd;
       void statusSword() {
           System.out.println("Level Sword : " + levelSword);
           System.out.println("atk increase : " + "+" + atk);
           System.out.println("spd decrease  : "  + spd);
       }

       void equipSword() {
           atk = atk + (1.25*levelSword);
           spd = spd - (0.25*levelSword);
           statusSword();

       }
       void levSwordUp() {
           levelSword++;
           equipSword();
      }


    }

