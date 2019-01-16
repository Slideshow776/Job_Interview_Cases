/* 
Task:   Implement (from scratch, without using Java library components) a doubly linked list (of
        integers) class which allows new integers to be added to either end of the list, and any
        referenced node to be removed.

Solution reference: https://stackoverflow.com/questions/6997524/the-declared-package-does-not-match-the-expected-package
                    Made the solution launcher <Integer>.
*/

package Task1;

public class DoublyLinkListDemo {
    public static void main(String[] args) {
        DoublyLinkList<Integer> newList = new DoublyLinkList<Integer>();
        newList.addFirst(1);
        newList.addFirst(2);
        newList.addFirst(3);
        newList.addFirst(4);
        newList.addFirst(5);
        newList.displayList();
        newList.removeFirst();
        newList.removeFirst();
        newList.removeFirst();
        newList.removeLast();

        newList.displayList();
    }
}