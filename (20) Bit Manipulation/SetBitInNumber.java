
public class SetBitInNumber {

    public static void main(String[] args) {
        int n = 16;
        int count = -0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }

        System.out.println("The count of set bits is : "+count);
    }
}
