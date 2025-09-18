package LinkedList;

public class SinglyLinkList
{
    public static void main(String[] args)
    {
//        AddToTheEnd addToTheEnd = new AddToTheEnd();
//        addToTheEnd.addToTheEnd(10);
//        addToTheEnd.addToTheEnd(20);
//        addToTheEnd.addToTheEnd(5);
//        addToTheEnd.diplay();

        AddToPosition addToPosition = new AddToPosition();
        addToPosition.addElements(10);
        addToPosition.addElements(40);
        addToPosition.addElements(50);
        addToPosition.addElements(20);
        addToPosition.addElements(80);
//        addToPosition.addToDesiredPosition(10, 25);
//        addToPosition.deleteNodeFromPosition(2);
        addToPosition.reverseLinkedList();
        addToPosition.deleteFrmEnd();
        addToPosition.display();
    }
}
