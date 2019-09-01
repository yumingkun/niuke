/** * Created by mingkunyu on 2019-09-01 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分， * 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。 */public class Solution_13 {    public static void reOrderArray(int[] array) {        if (array != null) {            int[] even = new int[array.length];            int indexOdd = 0;            int indexEven = 0;            for (int num : array) {                if ((num & 1) == 1) {                    array[indexOdd++] = num;                } else {                    even[indexEven++] = num;                }            }            for (int i = 0; i < indexEven; i++) {                array[indexOdd + i] = even[i];            }        }    }    public static void main(String[] args) {    }}