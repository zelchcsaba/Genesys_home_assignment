package assignment;

import java.util.List;

public class Main {

    /**
    * Entry point of the application. Runs a sample input
    * and prints all possible letter combinations.
    */
    public static void main(String[] args) {
        String digits = "23";
        List<String> res = new Solver().mapping(digits);
        
        printResult(res);
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
