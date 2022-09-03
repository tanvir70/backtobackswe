package BacktoBackSwe;

public class AddTwoString {
    public static void main(String[] args) {
        String s1 = "95";
        String s2 = "7";

        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int carry = 0;

        StringBuilder result = new StringBuilder();

        while (i >= 0 || j >= 0){
            int sum = carry;

            if ( i >= 0){
                sum = sum + (s1.charAt(i) - '0');
                i--;
            }
            if ( j >= 0){
                sum = sum + (s2.charAt(j) - '0');
                j--;
            }

            result.append(sum % 10);
            carry = sum / 10;
        }
        if ( carry != 0){
            result.append(carry);
        }

        System.out.println("Sum of the Two String = " + result.reverse());

    }
}
