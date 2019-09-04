//合并两个有序链表
class Node{
   public  int value;
   public Node next;
   Node(int value){
       this.value=value;
   }
}
class A{
    public static Node together(Node n1,Node b1) {
       Node cur1=n1;
       Node cur2=b1;
       Node newList=null;
       while(cur1!=null&&cur2!=null){
           if(cur1.value>=cur2.value){
               if(newList==null){
               newList=cur1;
               }
               else{
                   while(newList.next!=null){
                       newList=newList.next;
                   }
               }
           }
           else{
               if(newList==null){
                   newList=cur2;
               }
               else{
                   while(newList.next!=null){
                       newList=newList.next;
                   }
               }
           }
           cur1=cur1.next;
           cur2=cur2.next;
       }
       return newList;
    }
}
public class HolleWrold {
   public static void main(String[] args) {
       Node n1=new Node(1);
       Node n2=new Node(3);
       Node n3=new Node(5);
       Node n4=new Node(7);
       Node n5=new Node(9);
       n1.next=n2;
       n2.next=n3;
       n3.next=n4;
       n4.next=n5;
       n5.next=null;
       Node b1=new Node(0);
       Node b2=new Node(2);
       Node b3=new Node(4);
       Node b4=new Node(6);
       Node b5=new Node(8);
       b1.next=b2;
       b2.next=b3;
       b3.next=b4;
       b4.next=b5;
       b5.next=null;
       A a=new A();
       Node result=a.together(n1,b1);
       for(Node cur=result;cur!=null;cur=cur.next){
           System.out.printf("(%d)-->",cur.value);
       }
   }
}
/*class Node {
    public  int value;
    public Node next;
    Node(int value){
        this.value=value;
    }
}
public class HolleWrold {
    //创建链表
    public static Node createdLinkedList() {
        Node n1=new Node(5);
        Node n2=new Node(3);
        Node n3=new Node(7);
        Node n4=new Node(1);
        Node n5=new Node(9);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=null;
        return n1;
    }
    //打印链表
    public static void displayLinkedList(Node head){
        for(Node cur=head;cur!=null;cur=cur.next) {
            System.out.printf("(%d)-->",cur.value);
        }
        System.out.println();
    }
    //用x区分链表，小的在前面，大的在后面
    public static Node cutList(Node head ,int x) {
        Node cur=head;
        Node small=null;
        Node big=null;
        while(cur!=null) {
            if(cur.value<x){
                //xiao
                if(small==null) {
                    small=cur;
                }else{
                    while(cur.next!=null){
                        cur=cur.next;
                    }
                    small.next=
                }
            }else{
                //da
            }
        }
    }
    public static void main(String[] args) {
        Node head=createdLinkedList();
        displayLinkedList(head);
        cutList(head,3);
    }
}*/