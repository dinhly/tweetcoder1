import java.util.Scanner;

public class TweetDecoder4 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String origTweet = "";

      System.out.println("Enter abbreviation from tweet: ");
      origTweet = scnr.nextLine();

   origTweet = origTweet.replace("LOL", "laughing out loud");
   origTweet = origTweet.replace("BFN"," bye for now");
   origTweet = origTweet.replace("FTW", "For the win");
   origTweet = origTweet.replace("IRL", "in real life");
   origTweet = origTweet.replace("FYI", "for your information");
   origTweet = origTweet.replace("IDGI", "i dont get it ");
   origTweet = origTweet.replace("IDGT", "I dont get tired");
     
 
     
     
     
      System.out.println(origTweet);
   }
   }


