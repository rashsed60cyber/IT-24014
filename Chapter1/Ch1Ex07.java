public class Ch1Ex07 {
    public static void main(String[] args) {
        // Formula 1: 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11)
        System.out.print("Result 1: ");
        System.out.println(4 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11)));

        // Formula 2: 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13)
        System.out.print("Result 2: ");
        System.out.println(4 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11) + (1.0 / 13)));
    }
}
