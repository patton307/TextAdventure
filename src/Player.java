import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by landonkail on 10/9/15.
 */
public class Player extends Character {
    String area;
    ArrayList<String> = new ArrayList();

    public Player () {
        health = 100;
        damage = 20;
    }


    void chooseName() {
        System.out.println("What is your name, traveler?");
        name = Game.nextLine();
        System.out.println(String.format("Good luck, %s", name));
    }

    void chooseWeapon() throws Exception {
        System.out.println("[1] Pick up the sword");
        System.out.println("[2] Pick up a mallet");
        int choiceNum = Integer.valueOf(Game.nextLine());
        if (choiceNum == 1) {
            weapon = new Weapon();
            weapon.name = "Sword";
            weapon.damage = 10;
        } else if (choiceNum == 2) {
            weapon = new Weapon();
            weapon.name = "Mallet";
            weapon.damage = 10;
        } else {
            throw new Exception("Invalid weapon.");
        }
        System.out.println(String.format("That's a fine %s!", weapon.name.toLowerCase()));

    }

    void chooseArea() throws Exception {
        System.out.println("[1] Enter the forest");
        System.out.println("[2] Enter the underground tunnel");
        area = Game.nextLine();
        int areaNum = Integer.valueOf(area);
        if (areaNum == 1) {
            System.out.println("Entering the forest...");
        } else if (areaNum == 2) {
            System.out.println("Entering the tunnel...");
        } else {
            throw new Exception("invalid area.");
        }
    }

    void findItem(String item) {
        System.out.println("Found item!  Pick it up? [y/n]");
        String s = Game.nextLine();
        if (s.equals("y")) {
            System.out.println(String.format("Yodu found a %s",  item));
            items.add(item);
        }
    }
}

