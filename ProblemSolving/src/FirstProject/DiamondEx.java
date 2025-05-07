package FirstProject;
public class DiamondEx {
    public static void main(String[] args) {
        int n = 5; // Middle line row count (must be odd)
        int mid = n / 2 + 1;

        // Upper part including middle line
        for (int i = 1; i <= mid; i++) {
            // Print leading spaces
            for (int s = 1; s <= mid - i; s++) {
                System.out.print("  ");
            }
            // Print stars with tab space
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }

        // Lower part
        for (int i = mid - 1; i >= 1; i--) {
            // Print leading spaces
            for (int s = 1; s <= mid - i; s++) {
                System.out.print("  ");
            }
            // Print stars with tab space
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
