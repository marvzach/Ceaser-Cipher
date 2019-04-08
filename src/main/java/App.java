import java.io.Console;
public class App {
    public static void main(String [] args){
        Console myConsole = System.console();
        System.out.println("Welcome to Ceaser cypher,it embraces both encoding and decoding of words.");
        System.out.println("Please select the type of operation. ");
        System.out.println("1. encrypt ");
        System.out.println("2. decrypt ");
        String userChoice = myConsole.readLine();
        if (userChoice.equalsIgnoreCase("1")){
            System.out.println("Enter text to encrypt");
            String userEncryptionText = myConsole.readLine();
            System.out.println("Please enter shift key");
            String stringCypherKey = myConsole.readLine();
            int intCypherKey = Integer.parseInt(stringCypherKey);
            CeaserCypher ceaserCypher = new CeaserCypher();
            String encryptedText = ceaserCypher.cypher(userEncryptionText, intCypherKey);
            System.out.println(encryptedText);
            System.out.println("-------------------------------------------");
        } else if (userChoice.equalsIgnoreCase("2")){
            System.out.println("Enter text to decrypt");
            String userDecryptionText = myConsole.readLine();
            System.out.println("Please enter shift key");
            String stringDecypherKey = myConsole.readLine();
            int intDecypherKey = Integer.parseInt(stringDecypherKey);
            CeaserCypher ceaserCypher = new CeaserCypher();
            String decryptedText = ceaserCypher.decypher(userDecryptionText, intDecypherKey);
            System.out.println(decryptedText);
            System.out.println("-------------------------------------------");
        } else {
            System.out.println("Sorry, your input is invalid");
        }

    }
}