package s_offer;/** * Created by mingkunyu on 2019-11-13 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。 */public class Merge {    public class ListNode {        int val;        ListNode next = null;        ListNode(int val) {            this.val = val;        }    }    public ListNode Merge(ListNode list1, ListNode list2) {        //1-2-5-6-9  //3-4-7        ListNode vhead=new ListNode(0);//虚拟头节点        ListNode node=vhead;        while (list1!=null && list2 !=null){//先整理  1-2-5  //3-4-7   --> 1-2-3-4-5-7       6-9            if (list1.val<=list2.val){                node.next=list1;                list1=list1.next;            }else {                node.next=list2;                list2=list2.next;            }            node=node.next;        }        //多余的6-9挂在后面满足单调不减规则        if (list1!=null) node.next=list1;        if (list2!=null) node.next=list2;        return vhead.next;    }}