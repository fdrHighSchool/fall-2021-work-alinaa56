import java.util.Scanner;

public class RandomGame {
  public static void main(String[] args) {
    // step 1: ask a person what level he/she is choosing
    Scanner input = new Scanner(System.in);
    System.out.println("What level are you choosing: easy,medium or hard?");
    String level = input.nextLine();

    System.out.println("cool, welcome to " + level + " level!");

    int maximum = 0;

    // step 2: give the range to the person,who is playing the game
    if (level.equals("easy")) {
      System.out.println("choose a number from 1 - 5");
      maximum = 5;
    }
    if (level.equals("medium")) {
      System.out.println("choose a number from 1 - 15");
      maximum = 15;
    }
    if (level.equals("hard")) {
      System.out.println("choose a number from 1 - 25");
      maximum = 25;
    }

    // step 3: create a number
    int randomChoice = (int)(Math.random()*maximum + 1);
    System.out.println(randomChoice);

    System.out.println("You have three tries to guess the correct number,depends on your level");
    int number = input.nextInt();

    //step 4: person either lose or win
    if (randomChoice == number) {
      System.out.println("You are the winner!");
    }

    if (randomChoice != number) {
      System.out.println("Try again");

      number = input.nextInt();
      if (randomChoice == number) {
        System.out.println("You are the winner!");
      }
      if (randomChoice != number) {
        System.out.println("You have the last chance,be careful!");

        number = input.nextInt();
        if (randomChoice == number) {
          System.out.println("You are the winner!");
        }
        if (randomChoice != number) {
          System.out.println("Unfortuntely, you are out of game:c");
          //step 5: show the correct number
          System.out.println("The correct number was " + randomChoice);
        }
      }
    }

  } //closes main method




} //closes class
