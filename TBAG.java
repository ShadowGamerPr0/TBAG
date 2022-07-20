import java.util.Scanner;

public class TBAG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        startGame(scanner);
    }//main()
    
    public static void startGame(Scanner scanner){
        System.out.print("Would you like to start the game? (Y / N): ");//asks to start game
        String startGame = scanner.nextLine();
        
        if(startGame.equalsIgnoreCase("Y")){
            createCharacter(scanner);
        }
        else if(startGame.equalsIgnoreCase("N")){
            confirmExit(scanner);
        }
        else{
            System.out.println("You have an invalid answer, please type it again");
            startGame(scanner);
        }
    }//startGame()
    
    static void createCharacter(Scanner scanner){
        System.out.println();
        
        System.out.print("Please Enter your character's name: ");
        String characterName = scanner.nextLine();
        Character player = new Character(characterName);
        
        
        
    }//createCharacter()
    
    
    static void confirmExit(Scanner scanner){
        System.out.println();
        
        System.out.print("Are you sure you would like to exit the application (Y / N): ");
        String answer = scanner.nextLine();
        
        
        if(answer.equalsIgnoreCase("Y")){
            System.exit(0);
        }
        else if(answer.equalsIgnoreCase("N")){
            System.out.println();
            startGame(scanner);
        }
        else{
            System.out.println("You have an invalid answer, please type it again");
            confirmExit(scanner);
        }
    }//confirmExit()
}
