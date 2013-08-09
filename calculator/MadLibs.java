
/**
 * MadLib generator!
 */

import java.util.Scanner;

public class MadLibs
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a normal main character: ");
        String mainCharacter = keyboard.nextLine();

        System.out.print("Enter a monster: ");
        String funnycharacter = keyboard.nextLine();

        System.out.print("Enter a number: ");
        String number = keyboard.nextLine();

        System.out.print("Enter a something pretty and evil: ");
        String monster = keyboard.nextLine();

        System.out.print("Enter a positive adjective: ");
        String adjective = keyboard.nextLine();

        System.out.print("Enter a verb: ");  
        String verb= keyboard.nextLine();

        System.out.print("Enter a weapon: ");
        String weapon = keyboard.nextLine();

        System.out.print("Enter a negative adjective: ");
        String adjective2 = keyboard.nextLine();

        System.out.println("There once was a " + mainCharacter + " named Ria.");
        System.out.println("The " + mainCharacter + " turned out to be a " + funnycharacter + ".");
        System.out.println("Ria, the " + funnycharacter + " took a trip into the forest to empty her bladder.");
        System.out.println("Suddenly, she saw " + number + " she-devils, all coming to eat her!");
        System.out.println("The she-devils were obeying their master's commands, a " + monster + " named Ruhi.");
        System.out.println("Ruhi was ver very " + adjective + " and attracted all of the man-fairys");
        System.out.println("Ria started running away very quickly");
        System.out.println("The she-devils " + verb + "after her!");
        System.out.println("Shrieking, Ria started to fight back. She used a " + weapon + " to hit the she-devils and kill them.");
        System.out.println("Soon, all of the she-devils were dead. Ruhi realized she was being very " + adjective2 + " to Ria, and asked to be friends with her.");
        System.out.println("They became best of friends!");
        System.out.println("What an odd pair, a beautiful " + monster + " and a " + mainCharacter + " named Ria.");

    }
}
