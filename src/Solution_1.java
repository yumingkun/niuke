/** * Created by mingkunyu on 2019-08-30 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。 */public class Solution_1 {    public static String replaceSpace(StringBuffer str) {        String string=str.toString();        char[] chars=string.toCharArray();        StringBuffer out=new StringBuffer();        for (int i = 0; i <chars.length ; i++) {            if (chars[i]!=' '){                out.append(chars[i]);            }else {                out.append("%20");            }        }        return out.toString();    }    public static void main(String[] args) {        System.out.println(  replaceSpace(new StringBuffer("We Are Happy")));    }}