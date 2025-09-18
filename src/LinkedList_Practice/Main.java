package LinkedList_Practice;

public class Main
{
    public static void main(String[] args)
    {
        LinkedList linkedList = new LinkedList();
        linkedList.addNodeToTheEnd(5);
        linkedList.addNodeToTheEnd(3);
        linkedList.addNodeToTheEnd(1);
        linkedList.addNodeToTheGivenPosition(2, 2);
        linkedList.deleteFromTheEnd();
        linkedList.deleteByPosition(2);
        linkedList.reverse();
        linkedList.displayLinkedList();

    }
}
