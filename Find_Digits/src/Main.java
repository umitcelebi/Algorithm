
public class Main {
    public static void main(String[] args) {
        findDigits(1012);
        findDigits(12);
    }

    public static int findDigits(int n) {
        int number = n;
        int count = 0;
        while(number > 0) {
            int kalan = number % 10;
            number /= 10;
            if(kalan != 0 && n % kalan == 0) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}
