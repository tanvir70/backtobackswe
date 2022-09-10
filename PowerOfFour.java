package BacktoBackSwe;

import java.util.Scanner;

public class PowerOfFour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int input = scan.nextInt();

        int bitMask = 0x55555555; // 1010101010101010101010101010101
        // The number 0x55555555 is a 32 bit number with all odd bits set as 1 and all even bits as 0
        // We also check if input>0 and input is power of 2

        /*Observe that the binary representation of a power of two contains exactly one bit turned on.
        For example, the first few powers of two are 1 (which is 1 in binary), 2 (which is 10 in binary),
        and 4 (which is 100 in binary). Thus, it suffices to check whether the provided integer has exactly
        one bit turned on. This can be done by verifying that the quantity x & (x - 1) equals zero.
        If x is a power of two, then x & (x - 1) equals zero since the binary representation of (x - 1)
        will have ones in the positions leading up to the only bit turned on in x (and zero everywhere else).
        Conversely, if x is a positive number that is not a power of two, then there are at least two positions turned on.
        Performing the logical AND operator on x with (x - 1) will produce a non-zero quantity since subtracting one will not turn off both bits.
        There is one special case: this verification will not detect that zero is not a power of two due to how negative numbers are represented
        using two's complement. Thus, we verify this case separately.*/

        boolean isNonZero = input != 0;
        boolean hasSingleLeadingOneBit = (input & (input - 1)) == 0;
        boolean hasOnlyOddPositionedBits = (input & bitMask) == input;

        System.out.println(isNonZero && hasSingleLeadingOneBit && hasOnlyOddPositionedBits);


    }
}
