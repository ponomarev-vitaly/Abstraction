package GameController;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class GameController {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Game> games = new ArrayList<>();
    static boolean isMainMenu = true;
    static int mainMenuOption = 1;
    static boolean isGameSelect = false;
    static int gameMenuOption = 1;
    static boolean isGamePlay = false;
    static int selectedGame = 0;
    static char input = 'z';

    public static void main(String[] args) {

        games.add(new Sonic());
        games.add(new Mario());
        games.add(new Contra());
        games.get(0).down();


        /*
        UP          -> U
        DOWN        -> D
        RIGHT       -> R
        LEFT        -> L
        A           -> A
        B           -> B
        Selection   -> S
         */

        do {
            if (isMainMenu) {
                input = mainMenu();
                if (input == 'D') {
                    if (mainMenuOption == 1) {
                        mainMenuOption = 2;
                    }
                } else if (input == 'U') {
                        if (mainMenuOption == 2) {
                            mainMenuOption = 1;
                        }
                    } else if (input == 'S') {
                        if (mainMenuOption == 1) {
                            isGameSelect = true;
                            isMainMenu = false;
                            mainMenuOption = 1;
                        } else {
                            isGamePlay = true;
                            isMainMenu = false;
                            mainMenuOption = 1;
                        }
                    }
            }

            if (isGameSelect) {
                input = gameMenu();
                if (input == 'D') {
                    if (gameMenuOption != 3) {
                        gameMenuOption++;
                    } else if (input == 'U') {
                        if (gameMenuOption != 1) {
                            gameMenuOption--;
                        }
                    }
                } else if (input == 'S') {
                    isMainMenu = true;
                    isGameSelect = false;
                    selectedGame = gameMenuOption - 1;
                    gameMenuOption = 1;
                }
            }

            if (isGamePlay) {
                input = gamePlay();
                switch (input){
                    case 'U':
                        games.get(selectedGame).up();
                        break;
                    case 'D':
                        games.get(selectedGame).down();
                        break;
                    case 'R':
                        games.get(selectedGame).right();
                        break;
                    case 'L':
                        games.get(selectedGame).left();
                        break;
                    case 'A':
                        games.get(selectedGame).A();
                        break;
                    case 'B':
                        games.get(selectedGame).B();
                        break;
                    case 'S':
                        isGamePlay = false;
                        isMainMenu = true;
                        break;
                }
            }
            System.out.println("\n\n");
        }while (input != 'p');
    }


    // If we call method in static method the method have to be static as well.
    public static char mainMenu(){
        System.out.println("----------MAIN MENU----------");
        System.out.println("- SELECTED GAME: " + (selectedGame == 0 ? "SONIC": (selectedGame == 1 ? "MARIO" : "CONTRA")) + " -");
        if(mainMenuOption == 1){
            System.out.println("\t -> Game Select <- ");
            System.out.println("Game Start");
        } else if(mainMenuOption == 2) {
            System.out.println("Game Select");
            System.out.println("\t -> Game Start <- ");
        }
        System.out.print("---(D)own--(U)p--(S)elect-----");
        return scan.next().charAt(0);
    }

    public static char gameMenu(){
        System.out.println("----------GAME MENU----------");
        System.out.println("- SELECTED GAME: " + (selectedGame == 0 ? "SONIC": (selectedGame == 1 ? "MARIO" : "CONTRA")) + " -");
        if(gameMenuOption == 1){
            System.out.println("\t -> SONIC <- ");
            System.out.println("MARIO");
            System.out.println("CONTRA");
        } else if(gameMenuOption == 2) {
            System.out.println("SONIC");
            System.out.println("\t -> MARIO <- ");
            System.out.println("CONTRA");
        } else if(gameMenuOption == 3) {
            System.out.println("SONIC");
            System.out.println("MARIO");
            System.out.println("\t -> CONTRA <- ");
        }
        return scan.next().charAt(0);
    }

    public static char gamePlay(){
        System.out.println("----------GAME PLAY----------");
        System.out.println("- SELECTED GAME: " + (selectedGame == 0 ? "SONIC": (selectedGame == 1 ? "MARIO" : "CONTRA")) + " -");
        System.out.println("---(D)own--(U)p--Button(A)-----");
        System.out.println("---(D)own--(U)p--Button(B)-----");
        System.out.println("-----(S)witch to Main Menu-----");

        return scan.next().charAt(0);
    }
}
