import java.util.Scanner;

public class checkPermutation {
    public static boolean isPermutation(String str1, String str2) {
        int[] frequency = new int[26];

        for (int i = 0; i < 26; ++i) {
            frequency[i] = 0;
        }
        for (int i = 0; i<str1.length(); i++) {
            ++frequency[str1.charAt(i) - 97];
        }
        for (int i = 0; i<str2.length() ; ++i) {
            --frequency[str2.charAt(i) - 97];
        }
        for (int i = 0; i < 26; ++i) {
            if (frequency[i] != 0) {
                return false;
            }
        }
        return true;
    }

    // static Boolean isPermutation(String input1, String input2) {
        // int[] frequency = new int[256];

        // for (int i = 0; i < 256; ++i) {
        //     frequency[i] = 0;
        // }

        // for (int i = 0; i<input1.length(); i++) {
        //     ++frequency[input1.charAt(i)];
        // }

        // for (int i = 0; i<input2.length() ; ++i) {
        //     --frequency[input2.charAt(i)];
        // }

        // for (int i = 0; i < 256; ++i) {
        //     if (frequency[i] != 0) {
        //         return false;
        //     }
        // }

        // return true;
    // }

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		String str1 = sr.nextLine();
		String str2 = sr.nextLine();
		boolean ans = isPermutation(str1, str2);

		System.out.println(ans);
                sr.close();
	}
}
