package s_offer;import org.omg.PortableInterceptor.INACTIVE;import java.util.LinkedList;import java.util.Queue;/** * Created by mingkunyu on 2019-11-13 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分， * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。 * * 思路 * 使用两个队列，一个存奇数，一个存偶数，然后依次将数赋值回原数组 */public class reOrderArray {    public static void reOrderArray(int[] array) {        int[] arr = new int[array.length];        Queue<Integer> odd=new LinkedList<>();        Queue<Integer> even=new LinkedList<>();        for (int i = 0; i < array.length; i++) {            if (array[i]%2==1){                odd.offer(array[i]);            }else {                even.offer(array[i]);            }        }        int i=0;        while (!odd.isEmpty()){            arr[i++]=odd.poll();        }        while (!even.isEmpty()){            arr[i++]=even.poll();        }        for (int j = 0; j < arr.length; j++) {            System.out.print(arr[j]+" ");        }    }    public static void main(String[] args) {        int[] arr = {1, 3, 4, 7, 4, 6, 8};//{1, 3, 7,4, 4, 6, 8}        reOrderArray(arr);    }}