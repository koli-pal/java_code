package codes;

public class Assignment_operator {
    public static void main(String[]args){
        int x = 5;
        x &= 3;
        System.out.println("x="+x);

        /* Bitwise AND Assignment Operator &=
           Binary representation of 5 (x): 0101
           Binary representation of    3 : 0011
           The bitwise AND operation compares each
           bit of x and 3, returning 1 if both bits are 1,
           otherwise returning 0*/

        int y =5;
        y |=3;
        System.out.println("y="+y);

        /*Bitwise OR Assignment Operator |=
           Binary representation of 5 (y): 0101
           Binary representation of    3 : 0011
           The bitwise OR operation compares each
           bit of Y and 3, returning 1 if either bit is 1,
           otherwise returning 0
        * */

        int z =5;
        z ^=3;
        System.out.println("z="+z);

        /*Bitwise XOR Assignment Operator &=
        Binary representation of 5 (z): 0101
        Binary representation of    3 : 0011
        The bitwise XOR operation compares each
        bit of z and 3, returning 1 if both bits are different,
                otherwise returning 0 */

        int k =5;
        k >>=3;
        System.out.println("k="+k);
        /*Bitwise Right Shift Assignment Operator >>=
        The >> operator performs a signed right shift on the binary
        representation of k, shifting the bits to the right by 3 positions.
        Binary representation of 5 (k): 00000000 00000000 00000000 00000101
        (32-bit integer representation)
        Right shifting by 3 positions moves the bits to the right by 3,
        filling the leftmost bits with the sign bit (0 for positive numbers
        and 1 for negative numbers)
        Original: 00000000 00000000 00000000 00000101  (binary for 5)
        Shifted:  00000000 00000000 00000000 00000000  (binary for 0)
        The right shift (>>) moves bits to the right, dividing the number by 2^n, where 𝑛
        is the number of positions shifted.
        For x = 5,5>>3 is equivalent to 5/2^3= 5/8=0,(integer division). Hence, the result is 0
        * */

        int m =5;
        m <<=3;
        System.out.println("m="+m);

        /*Bitwise Left Shift Assignment Operator <<=
        The << operator performs a signed Left shift on the binary
        representation of m, shifting the bits to the left by 3 positions.
        Binary representation of 5 (m): 00000000 00000000 00000000 00000101
        (32-bit integer representation)
        Left shifting by 3 positions moves the bits to the left by 3,
        filling the rightmost bits with the sign bit 0
        Original: 00000000 00000000 00000000 00000101  (binary for 5)
        Shifted:  00000000 00000000 00000000 00101000  (binary for 0)
        The left shift (<<) moves bits to the left, multiplies the number by 2^n, where 𝑛
        is the number of positions shifted.
        For x = 5,5>>3 is equivalent to 5*2^3= 5*8=40,(integer division). Hence, the result is 40*/

    }
}
