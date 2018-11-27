import java.time.LocalDateTime;

public class Main {
  public static void main(String[] args) {
    pluralize("dog", 1);
    pluralize("cat", 2);
    pluralize("turtle", 0);
    flipNHeads(2);
    clock();
  }
  
  //**********************************************************************************

  public static void pluralize(String aThingYouMayOrMayNotOwn, int howManyOfTheThingOrThingsYouMayOrMayNotOwn) {
    String possessions = "I own " + howManyOfTheThingOrThingsYouMayOrMayNotOwn + " " + aThingYouMayOrMayNotOwn;

    if (howManyOfTheThingOrThingsYouMayOrMayNotOwn == 0 || howManyOfTheThingOrThingsYouMayOrMayNotOwn > 1) {
      possessions += "s";
    }

    System.out.println(possessions);
  }

  //**********************************************************************************

  public static void flipNHeads(int howManyTimesYouWantHeadsToBeFlippedInARow) {
    int numberOfTimesHeadsHasBeenFlippedconsecutively = 0;
    int coinTossCount = 0;
    String headsOrTailsResult = "";

    while (numberOfTimesHeadsHasBeenFlippedconsecutively != howManyTimesYouWantHeadsToBeFlippedInARow) {
      coinTossCount++;
      headsOrTailsResult = headsOrTails();
      System.out.println(headsOrTailsResult);

      if (headsOrTailsResult == "Heads") {
        numberOfTimesHeadsHasBeenFlippedconsecutively++;
      } else {
        numberOfTimesHeadsHasBeenFlippedconsecutively = 0;
      }
    }

    System.out.println("It took " + coinTossCount + " flips to flip " + howManyTimesYouWantHeadsToBeFlippedInARow + " heads in a row.");
  }

  public static String headsOrTails() {
    double randomNumber = Math.random();

    if (randomNumber < .5) {
      return "Heads";
    } else {
      return "Tails";
    }
  }

  //**********************************************************************************

  public static void clock() {
    LocalDateTime now = LocalDateTime.now();
    int secondToCompareTo = now.getSecond();

    while (true) {
      now = LocalDateTime.now();
      int hour = now.getHour();
      int minute = now.getMinute();
      int second = now.getSecond();

      if (secondToCompareTo != second) {
        System.out.println(hour + ":" + minute + ":" + second);
        secondToCompareTo = second;
      }
    }
  }
}