package Arrays.Problems;
/**
 * Complexity Analysis:
 * To Convert Array to LinkedList;
 * Time Complexity: O(n)
 * Space Complexity: O(n) 
 *  Node Creation :O(1)
 * Node linking: O(1) 
 * Since nodes are created in constant time space increases linearly with Linked List Size , hence O(N)
 */
public class ConvertArrayToLinkedList {

    public class MyLinkedList {
        int data;
        MyLinkedList next;
        public MyLinkedList() {

        }

        public MyLinkedList(int data) {
            this.data= data;
            this.next= null;
        }

    }

    ConvertArrayToLinkedList() {

    }

   
    public MyLinkedList convertToLinkedList(int[] arr) {

        MyLinkedList head= null;
        MyLinkedList current = null;
        for (int i = 0; i < arr.length; i++) {
            // System.out.println(arr[i]);
            MyLinkedList node = new MyLinkedList(arr[i]);
            if( current == null){
                current= node;
                head= current;
            }
            else{
                current.next = node;
                current = node;
            }
        }
        return head;
    }
    public void traverseLinkedList(MyLinkedList linkedList){
        MyLinkedList current = linkedList;
        while(current!=null ){
            System.out.println(current.data);
            current=current.next;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 100, 2, 3, 4, 5 };
        ConvertArrayToLinkedList atoL = new ConvertArrayToLinkedList();
       MyLinkedList myLinkedList=  atoL.convertToLinkedList(arr);
       atoL.traverseLinkedList(myLinkedList);

    }
}
