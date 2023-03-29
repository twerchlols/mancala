/*
* Aiden Aldinger
* 15 February 2023
* Purpose: Program the mancala board
* */
public class Board {
    public static int[] stones = {4,4,4,4,4,4,0,4,4,4,4,4,4,0};
    public static void printLine(int number, boolean newLine){
        for (int i = 0; i < number; i++){
            System.out.print("-");
        }
        if (newLine) System.out.println();
    }
    public static void printBoard(){
        System.out.println("Mancala Board");
        //System.out.print("   ");
        for (int j = 13; j > 5; j--){
            if (j == 13){
                System.out.print("M2 ");
            } else if (j >= 10){
                System.out.print("  " + j + " ");
            } else if (j == 6){
                System.out.print("  M1");
            } else{
                System.out.print("  " + j + "  ");
            }
        }
        System.out.println();


        printLine(36, true);
        System.out.print("   ");
        for (int j = 12; j > 6; j --) {
            if (stones[j] >= 10){
                System.out.print("  " + stones[j] + " ");
            } else{
                System.out.print("  " + stones[j] + "  ");
            }
        }
        System.out.println();
        //printDots(1, false);
        if (stones[13] > 10){
            System.out.print(stones[13] + "   ");
        } else if(stones[13] < 10){
            System.out.print(stones[13] + "    ");
        }
        printLine(26, false);
        //printDots(1, true);
        System.out.print("    ");
        if (stones[6] > 10){
            System.out.print(stones[6] + "   ");
        } else if(stones[6] < 10){
            System.out.print(stones[6] + "    ");
        }
        System.out.println();
        System.out.print("   ");
        for (int j = 5; j > -1; j --) {
            if (stones[j] >= 10){
                System.out.print("  " + stones[j] + " ");
            } else{
                System.out.print("  " + stones[j] + "  ");
            }
        }
        System.out.println();
        printLine(36, true);
        System.out.print("   ");
        for (int j = 5; j > -1; j--){
            if (j == 13){
                System.out.print(j + " ");
            } else if (j >= 10){
                System.out.print("  " + j + " ");
            } else{
                System.out.print("  " + j + "  ");
            }
        }
        System.out.println();
    }
    int doMoves(int choice) {
        return choice;
    }
}