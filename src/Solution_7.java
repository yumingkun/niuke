import java.util.*;/** * Created by mingkunyu on 2019-09-01 * 最K大数 */public class Solution_7 {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        String s = sc.next();        String str = s.substring(1, s.length() - 1);        String ss[] = str.split(",");        int a[] = new int[ss.length];        for (int i = 0; i < ss.length; i++) {            a[i] = Integer.parseInt(ss[i]);        }        List<Integer> list = new ArrayList<Integer>();        for (int i : a) {            list.add(i);        }        Collections.sort(list);        System.out.println(list.get(list.size() - 3));    }}