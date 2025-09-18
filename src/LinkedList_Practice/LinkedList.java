package LinkedList_Practice;

public class LinkedList
{
    class Node
    {
        int value;
        Node next;

        public Node(int value)
        {
            this.value = value;
            next = null;
        }
    }

    Node head;

    public void addNodeToTheEnd(int value)
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

    public void addNodeToTheGivenPosition(int value, int position)
    {
        Node currentNode = head;
        Node newNode = new Node(value);
        int i = 0;
        if (position == 0)
        {
            head = newNode;
            return;
        }
        while (i < position - 1 && currentNode != null)
        {
            currentNode = currentNode.next;
            i++;
        }
        if (currentNode == null)
        {
            System.out.println("Can't add to the desired Position");
            return;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }

    public void deleteFromTheEnd()
    {
        Node currentNode = head;
        if (currentNode == null || currentNode.next == null)
        {
            System.out.println("Can't Delete from the end");
            return;
        }

        while (currentNode.next.next != null)
        {
            currentNode = currentNode.next;
        }
        currentNode.next = null;

    }

    public void deleteByPosition(int position)
    {
        Node currentNode = head;
        if (currentNode == null || currentNode.next == null)
        {
            System.out.println("Can't Delete");
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
            System.out.println("Can't Delete, node is null");
            return;
        }
        currentNode.next = currentNode.next.next;
    }

    public void reverse()
    {

        Node previousNode = null;
        Node currentNode = head;

        if (currentNode == null || currentNode.next == null)
        {
            System.out.println("Can't reverse");
            return;
        }

        while (currentNode != null)
        {
            Node nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }

        head = previousNode;

    }

    public void displayLinkedList()
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
