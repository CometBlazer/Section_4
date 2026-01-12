package Section_4_7;

public class OOPSortedLinkedList extends OOPLinkedList {
    
    @Override
    public void add(int value) {
        OOPLinkedListElement newElement = new OOPLinkedListElement(value);
        
        // If list is empty or new value should be first
        if (head == null || value < head.getValue()) {
            newElement.setNext(head);
            head = newElement;
            return;
        }
        
        // Find the position to insert
        OOPLinkedListElement current = head;
        while (current.getNext() != null && current.getNext().getValue() < value) {
            current = current.getNext();
        }
        
        // Insert the new element
        newElement.setNext(current.getNext());
        current.setNext(newElement);
    }
}
