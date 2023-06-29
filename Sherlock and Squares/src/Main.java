
public class Main {
    public static void main(String[] args) {
        squares(17,24);
        squares(3,9);
    }

    public static int squares(int a, int b) {
        int count = 0;
        int sqrtA = (int)Math.sqrt(a);
        int sqrtB = (int)Math.sqrt(b);
        for(int i = sqrtA; i <= sqrtB; i++) {
            if(i * i > b) {
                break;
            } else if(i * i >= a && i * i <= b) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}
