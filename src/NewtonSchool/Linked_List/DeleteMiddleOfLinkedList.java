package NewtonSchool.Linked_List;

public class DeleteMiddleOfLinkedList {

    class Node {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
            next = null;
        }
    }

    private static void deleteAtPosition (Node head, int position){

        Node temp  = head;
        int currentposition = 1;

        while(currentposition != (position - 1)){
            temp = temp.next;
            currentposition++;
        }
        Node delete = temp.next;
        temp.next = delete.next;

        delete.next = null;
    }

    private static int findlength(Node head){

        int length = 0;
        Node temp = head;

        while (temp != null){
            temp = temp.next;
            length++;
        }
        return length;
    }

    public static Node deleteMiddleElement(Node head) {

        int length = findlength(head);

        if(length == 1){
            head.val = -1;
        }
        else{

            int position = length/2 + 1;

            deleteAtPosition(head, position);
        }

        return head;
    }
}
