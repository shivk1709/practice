package LinkedList;

public class AddToPosition
{
    class Node
    {
        int value;
        Node next;

        public Node(int value)
        {
            this.value = value;
            this.next = null;
        }
    }

    Node head;

    public void addElements(int value)
    {
        Node currentNode = head;
        Node newNode = new Node(value);
        if (currentNode == null)
        {
            head = newNode;
            return;
        }

        while (currentNode.next != null)
        {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;

    }

    public void addToDesiredPosition(int value, int position)
    {
        Node currentNode = head;
        Node newNode = new Node(value);
        if (position == 0)
        {
            head = newNode;
            return;
        }
        int index = 0;
        while (index < position - 1 && currentNode != null)
        {
            currentNode = currentNode.next;
            index++;
        }

        if (currentNode == null)
        {
            System.out.println(("Position out of range."));
            return;
        }

        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }

    void deleteNodeFromPosition(int position)
    {
        Node current = head;
        if (current == null)
        {
            System.out.print("Deletion Aborted - Position not found");
            return;
        }

        int index = 0;
        while (index < position - 1 && current != null)
        {
            current = current.next;
            index++;
        }

        if (current == null || current.next == null)
        {
            System.out.print("Positions out of Range.");
            return;
        }

        current.next = current.next.next;
    }

    void deleteFrmEnd()
    {
        Node current = head;
        if (current == null || current.next == null)
        {
            System.out.println("Can't delete");
            return;
        }

        while (current.next.next != null)
        {
            current = current.next;
        }

        current.next = null;

    }

    void reverseLinkedList()
    {
        Node current = head;
        Node previous = null;

        if (current == null || current.next == null)
        {
            System.out.println("Can't reverse");
            return;
        }

        while (current != null)
        {
            Node nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }

        head = previous;

    }

    void display()
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
