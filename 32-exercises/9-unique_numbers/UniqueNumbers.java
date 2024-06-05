public class UniqueNumbers {
    //Unique numbers are numbers in which each digit is different from the others within that number
    public static void main(String[] args) {
        int counter = 0; // Counter for unique numbers
        
        // Loop through each digit from 1 to 9
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= 9; j++){
                for(int k = 1; k <= 9; k++){
                    // Check if all digits are unique
                    if(k != i && k != j && i != j){
                        counter++;
                        // Print the unique three-digit number
                        System.out.println(i + "" + j + "" + k);
                    }
                }
            }
        }
        
        // Print the total count of unique numbers
        System.out.println("Total unique numbers: " + counter);
    }
}
