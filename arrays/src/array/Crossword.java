package array;



import java.util.*;

public class Crossword {

    public static void main(String[] args) {
        int size = 5;
        char[][] arr = new char[size][size];
        Scanner in = new Scanner(System.in);


        System.out.println("Enter 5x5 crossword characters:");
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                arr[row][col] = in.next().charAt(0);
            }
        }


        String findText = "GRASS";
        System.out.println("Word to find: " + findText);
        System.out.println("Data Stored Successfully\n");

        char startCh = findText.charAt(0);
        boolean wordFound = false;

        for (int i = 0; i < size && !wordFound; i++) {
            for (int j = 0; j < size && !wordFound; j++) {

                if (arr[i][j] == startCh) {

         
                    if (j + findText.length() <= size) {
                        boolean match = true;
                        for (int k = 0; k < findText.length(); k++) {
                            if (arr[i][j + k] != findText.charAt(k)) {
                                match = false;
                                break;
                            }
                        }
                        if (match) {
                            System.out.println("Word found horizontally at row " + i + ", column " + j);
                            wordFound = true;
                            break;
                        }
                    }

                    if (i + findText.length() <= size) {
                        boolean match = true;
                        for (int k = 0; k < findText.length(); k++) {
                            if (arr[i + k][j] != findText.charAt(k)) {
                                match = false;
                                break;
                            }
                        }
                        if (match) {
                            System.out.println("Word found vertically at row " + i + ", column " + j);
                            wordFound = true;
                            break;
                        }
                    }
                }
            }
        }

        if (!wordFound) {
            System.out.println("Word not found in the crossword.");
        }

        in.close();
    }
}