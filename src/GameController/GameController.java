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

        do{
            if(isMainMenu){
                input = mainMenu();
                if(input == 'D'){
                    if(mainMenuOption == 1){
                        mainMenuOption = 2;
                    } else if (input == 'U'){
                        if(mainMenuOption == 2){
                            mainMenuOption = 1;
                        }
                    }  else if (input == 'S') {
                        if(mainMenuOption == 1){
                            System.out.println("User can select game.");
                        }else{
                            System.out.println("User can play the game.");
                        }
                    }
                }
            }

            if(isGameSelect){
                // TODO
            }

            if(isGamePlay){
                // TODO
            }
            System.out.println("\n\n");
        }while(input != 'p');
    }

    // If we call method in static method the method have to be static as well.
    public static char mainMenu(){
        System.out.println("----------MAIN MENU----------");
        System.out.println("-------SELECTED GAME: -------");
        if(mainMenuOption == 1){
            System.out.println("\t -> Game Select <- ");
            System.out.println("Game Start");
        } else if(mainMenuOption == 2) {
            System.out.println("Game Select");
            System.out.println("\t -> Game Start <- ");
        }
        System.out.println("---(D)own--(U)p--(S)elect-----");
        return scan.next().charAt(0);
    }
}
