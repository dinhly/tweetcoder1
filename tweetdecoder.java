
import java.util.Scanner;

public class TweetDecoder {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String origTweet = "";

      System.out.println("Enter abbreviation from tweet: ");
      origTweet = scnr.next();

      if (origTweet.equals("LOL")) {
         System.out.println("LOL = laughing out loud");
      }
      else if (origTweet.equals("BFN")) {
         System.out.println("BFN = bye for now");
       }
       else if (origTweet.equals("BEN")) {
         System.out.println("Did you mean BFN? BFN = bye for now");
      }
      else if (origTweet.equals("FTW")) {
         System.out.println("FTW = for the win");
       }
         else if (origTweet.equals("FWT")) {
         System.out.println("Did you mean FTW? FTW = for the win");
      }
      else if (origTweet.equals("IRL")) {
         System.out.println("IRL = in real life");
      }
      else if (origTweet.equals("LRI")) {
         System.out.println("Did you mean IRL ? IRL = in real life");
      }
      else if (origTweet.equals("FYI")) {
         System.out.println("FYI = for your information");
       }
      else if (origTweet.equals("FIY")) {
         System.out.println("Did you mean FYI ? FYI = for your information");
       }
       else if (origTweet.equals("IDGT")) {
         System.out.println("IDGT = i dont get tired");
        }
       else if (origTweet.equals("IDTG")) {
         System.out.println("did you mean IDGT ?IDGT = i dont get tired");
         }
       else if (origTweet.equals("ITDG")) {
         System.out.println("did you mean IDGT ?IDGT = i dont get tired");
        }
       else if (origTweet.equals("IGDT")) {
         System.out.println("did you mean IDGT ?IDGT = i dont get tired");
       }
       else if (origTweet.equals("IDGI")) {
         System.out.println("IDGI = i dont get it");
       }
       else if (origTweet.equals("IGDI")) {
         System.out.println("Did you mean IDGI ? IDGI = i dont get it");
        }
       else if (origTweet.equals("IDIG")) {
         System.out.println("Did you mean IDGI ? IDGI = i dont get it");
        }
       else if (origTweet.equals("IDC")) {
         System.out.println("IDC = i dont care");
         }
       else if (origTweet.equals("ICD")) {
         System.out.println("Did you mean IDC ? IDC = i dont care");
         }
       else {
         System.out.println("Sorry, don't know that one.");
         }
}
}