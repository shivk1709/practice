package LinkedList;

public class AddToTheEnd
{

    class Node
    {
        int value;
        Node next;

        Node(int valueTobeAdded)
        {
            this.value = valueTobeAdded;
            this.next = null;
        }
    }

    Node head;

    public void addToTheEnd(int value)
    {
        Node current = head;
        Node newNode = new Node(value);
        if (current == null)
        {
            head = newNode;
            return;
        }
        while (current.next != null)
        {
            current = current.next;
        }
        current.next = newNode;
    }

    public void diplay()
    {
        Node currentNode = head;
        while (currentNode != null)
        {
            System.out.print(currentNode.value + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");

    }

}
