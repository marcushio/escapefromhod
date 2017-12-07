import java.util.Scanner;

/**
 * Takes raw String input and turns it into something that is relevant to the game.
 *
 * @author Colton Trujillo
 * @version 12/5/2017
 */
public class InputParser
{
 
 Scanner scanner = new Scanner(System.in);
 public static final String go = Dialog.GO+"";
 public static final String interact = Dialog.INTERACT+"";
 public String get(){  
     String input = scanner.nextLine();
     input = input.toLowerCase();
     String[] tokens = input.split(" ");
     if (tokens.length > 2) return null;
     switch(tokens[0]){
         case "go": return input;
         case "use": return input;
         default: return null;
        }
     
    }

}
