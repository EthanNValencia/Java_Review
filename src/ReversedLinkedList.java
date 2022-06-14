public class ReversedLinkedList {

    public static void main(String[] args){
        CustomLL list = new CustomLL(1, new CustomLL(2, new CustomLL(3, new CustomLL(4, null))));
        printReversedLinkedList(list);
    }

    public static void printReversedLinkedList(CustomLL node){
        if(node == null) return;
        printReversedLinkedList(node.next);
        System.out.println(node.value);
    }

}

class CustomLL {

    public int value;
    public CustomLL next;

    public CustomLL(int value,CustomLL next) {
        this.value = value;
        this.next = next;
    }

}