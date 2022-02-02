public class Binary_Search_Smallest_Letter_04 {
    public static void main(String[] args) {
        char letters[] = { 'c', 'f', 'j' };
        char target = 'a';
        char Ans = (char) NextGreatestLetter(letters, target);
        System.out.println(Ans);
    }

    static int NextGreatestLetter(char letters[], char target) {
        int low = 0;
        int High = letters.length - 1;

        while (low <= High) {

            // Find the middle Element
            // int mid = (low + High)/ 2; // Might be possible that (low + High)

            int mid = low + (High - low) / 2;

            if (target < letters[mid]) {
                High = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return letters[low % letters.length];
    }
}
