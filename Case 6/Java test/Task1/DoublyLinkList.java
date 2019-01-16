/* 
Task:   Implement (from scratch, without using Java library components) a doubly linked list (of
        integers) class which allows new integers to be added to either end of the list, and any
        referenced node to be removed.

Solution reference: https://stackoverflow.com/questions/6997524/the-declared-package-does-not-match-the-expected-package
                    Solution reference now uses generified class versions everywhere.
*/

package Task1;
public class DoublyLinkList<T> {
    private static class Node<T> {
        private T data;
        private Node<T> next;
        private Node<T> prev;

        public Node(T data) { this.data = data; }
        public void displayNode() { System.out.print(data + " ");}
        public String toString() { return data.toString(); }
    }

    public Node<T> first = null;
    public Node<T> last = null;

    public void addFirst(T data) {
        Node<T> newNode = new Node<T>(data);

        if (isEmpty()) {
            newNode.next = null;
            newNode.prev = null;
            first = newNode;
            last = newNode;

        } else {
            first.prev = newNode;
            newNode.next = first;
            newNode.prev = null;
            first = newNode;
        }
    }

    public boolean isEmpty() { return (first == null); }

    public void displayList() {
        Node<T> current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

    public void removeFirst() {
        if (!isEmpty()) {
            Node<T> temp = first;

            if (first.next == null) {
                first = null;
                last = null;
            } else {
                first = first.next;
                first.prev = null;
            }
            System.out.println(temp.toString() + " is popped from the list");
        }
    }

    public void removeLast() {
        Node<T> temp = last;

        if (!isEmpty()) {

            if (first.next == null) {
                first = null;
                last = null;
            } else {
                last = last.prev;
                last.next = null;
            }
        }
        System.out.println(temp.toString() + " is popped from the list");
    }
}