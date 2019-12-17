package s_offer;import java.util.ArrayList;import java.util.Comparator;import java.util.PriorityQueue;/** * Created by mingkunyu on 2019-11-25 */public class GetLeastNumbers_Solution {    public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {        ArrayList<Integer> arrayList = new ArrayList<>();        if (input == null || input.length <= 0 || k > input.length || k<=0 ) {            return arrayList;        }        //使用基于堆的优先队列        PriorityQueue<Integer> queue = new PriorityQueue<>(k, new Comparator<Integer>() {            //因为要满足大根堆需求，所以使用自定义比较器，比较策略为o1大于o2时，o1放o2的前面            @Override            public int compare(Integer o1, Integer o2) {                return o2 - o1;            }        });        for (int i = 0; i < input.length; i++) {            if (i < k) {                queue.add(input[i]);            } else if (input[i] < queue.peek()) {                queue.poll();                queue.add(input[i]);            }        }        arrayList.addAll(queue);        return arrayList;    }    public static void main(String[] args) {        int[] arr={2,1,6,4,5};        System.out.println(GetLeastNumbers_Solution(arr,3));//  output [4, 1, 2]    }}