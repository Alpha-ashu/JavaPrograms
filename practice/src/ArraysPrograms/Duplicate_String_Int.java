package ArraysPrograms;
public class Duplicate_String_Int {

    public static void main(String[] args) {
        int num[] = {1, 1, 2, 2, 4, 5, 6, 7, 8, 9, 3, 10};
        String str[] = {"apple", "banana", "grape", "orange", "pineapple", "watermelon", "apple", "grape"};

        // Find duplicates in integer array
        System.out.println("Duplicate numbers:");
        findDuplicateNumbers(num);

        // Find duplicates in string array
        System.out.println("Duplicate strings:");
        findDuplicateStrings(str);
    }

    // Method to find duplicates in an integer array
    public static void findDuplicateNumbers(int[] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    System.out.println(num[i]);
                    break;  // To avoid printing the same duplicate multiple times
                }
            }
        }
    }

    // Method to find duplicates in a string array
    public static void findDuplicateStrings(String[] str) {
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j])) {  // Use .equals() for string comparison
                    System.out.println(str[i]);
                    break;  // To avoid printing the same duplicate multiple times
                }
            }
        }
    }
}
