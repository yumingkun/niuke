package s_offer;import java.util.ArrayList;import java.util.Arrays;import java.util.Collections;import java.util.Comparator;/** * Created by mingkunyu on 2019-12-02 */public class sort {    public static void main(String[] args) {//        Collections.sort(new ArrayList<Integer>(), new Comparator<Integer>() {//            @Override//            public int compare(Integer o1, Integer o2) {//                return 0;//            }//        });        Integer [] arr ={1,2,3};        Arrays.sort(arr, new Comparator<Integer>() {            @Override            public int compare(Integer o1, Integer o2) {                return 0;            }        });    }}