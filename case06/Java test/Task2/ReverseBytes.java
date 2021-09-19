/* 
    Write a function reverse_bytes taking one parameter and returning no result. The parameter
    is an array containing n contiguous bytes. The function should reverse the order of the bits in
    the n contiguous bytes, which is seen as a bit string of length 8n. For example, the first bit of
    the first byte should be swapped with last bit of the last byte.
*/

package Task2;

public class ReverseBytes {
    public static void main(String[] args) {
        byte[] temp = {1, 0, 0, 0, 1, 0};
        reverse_bytes(temp);
    }

    public static void reverse_bytes(byte[] anArray) {
        byte [] temp = new byte[anArray.length];
        for (int i = anArray.length-1; i > 0; i--) {
            temp[i] = anArray[i];
        }

        printMe("Input: ", anArray);
        printMe("Processed: ", temp);
    }
    
    public static void printMe(String type, byte[] array) {
        System.out.print("\n" + type);
        for (byte b : array) {
            System.out.print(b);
        }
    }
}