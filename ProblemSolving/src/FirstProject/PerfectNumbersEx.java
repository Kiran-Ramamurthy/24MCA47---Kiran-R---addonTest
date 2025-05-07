package FirstProject;

public class PerfectNumbersEx {
	public static void main(String[] args) {
		System.out.println("Perfect numbers between 1 and 1000 are:");

        for (int number = 1; number <= 1000; number++) {
            if (isPerfect(number)) {
                System.out.println(number);
            }
        }
    }

    // Method to check if a number is perfect
    public static boolean isPerfect(int num) {
        int sum = 0;

        // Find all proper divisors and sum them up
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }
	}

