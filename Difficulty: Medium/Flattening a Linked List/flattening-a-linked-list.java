/*
class Node {
    int data;
    Node next;
    Node bottom;

    Node(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}
*/
class Solution {
     public Node mergell(Node ll1,Node ll2) {
        Node dummy = new Node(-1);
        Node result = dummy;
        while(ll1!=null && ll2!=null ){
            if(ll1.data < ll2.data){
                result.bottom=ll1;
                result=ll1;
                ll1=ll1.bottom;
            }
            else{
                result.bottom=ll2;
                result=ll2;
                ll2=ll2.bottom;
            }
            result.next=null;
        }
        if(ll1 != null) result.bottom=ll1;
        else result.bottom=ll2;

        return dummy.bottom;
    }
    public Node flatten(Node head) {
        if(head==null||head.next==null) return head;
        Node mergedhead=flatten(head.next);
        return mergell(head,mergedhead);
    }
   
}