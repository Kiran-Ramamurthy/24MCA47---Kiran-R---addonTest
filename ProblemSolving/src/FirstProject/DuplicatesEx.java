package FirstProject;

public class DuplicatesEx {

    public static void main(String[] args) {
        String s = "programming";
        String result = removeDuplicates(s);
        System.out.println("Original string: " + s);
        System.out.println("String after removing duplicates: " + result);
    }

    public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!seen[c]) {
                seen[c] = true;
                result.append(c);
            }
        }

        return result.toString();
    }
}