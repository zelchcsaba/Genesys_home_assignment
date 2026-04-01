package assignment;

import java.util.List;
import java.util.Scanner;

public class Main {

    /**
     * Entry point of the application. Reads digits from console
     * and prints all possible letter combinations.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digits = ");
        String digits = scanner.nextLine().trim();
        List<String> res = new Solver().mapping(digits);
        
        printResult(res);
        scanner.close();
    }

    /**
     * Prints the list of combinations in formatted form.
     *
     * @param res list of letter combinations
     */
    private static void printResult(List<String> res){
        if(res.isEmpty()){
            System.out.println("[]");
            return;
        }

        System.out.print("[");
        for(int i = 0; i < res.size()-1; i++){
            System.out.print(res.get(i) + ", ");
        }
        System.out.println(res.get(res.size()-1) + "]");
    }
}
