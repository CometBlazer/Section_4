package Section_4_7;

public class OOPLazySortedLinkedList extends OOPSortedLinkedList {
    private boolean isSorted;
    
    public OOPLazySortedLinkedList() {
        super();
        this.isSorted = true;
    }
    
    @Override
    public void add(int value) {
        // Add to front WITHOUT sorting (bypass parent's sorted add)
        OOPLinkedListElement newElement = new OOPLinkedListElement(value);
        newElement.setNext(head);
        head = newElement;
        isSorted = false;
    }
    
    private void sortIfNeeded() {
        if (!isSorted) {
            sort();
            isSorted = true;
        }
    }
    
    private void sort() {
        if (head == null || head.getNext() == null) {
            return;
        }
        
        // Build a new sorted list using insertion sort
        OOPLinkedListElement sortedHead = null;
        OOPLinkedListElement current = head;
        
        while (current != null) {
            OOPLinkedListElement next = current.getNext();
            sortedHead = sortedInsert(sortedHead, current);
            current = next;
        }
        
        head = sortedHead;
    }
    
    private OOPLinkedListElement sortedInsert(OOPLinkedListElement sortedHead, OOPLinkedListElement element) {
        if (sortedHead == null || element.getValue() < sortedHead.getValue()) {
            element.setNext(sortedHead);
            return element;
        }
        
        OOPLinkedListElement current = sortedHead;
        while (current.getNext() != null && current.getNext().getValue() < element.getValue()) {
            current = current.getNext();
        }
        
        element.setNext(current.getNext());
        current.setNext(element);
        
        return sortedHead;
    }
    
    @Override
    public int getHead() {
        sortIfNeeded();
        return super.getHead();
    }
    
    @Override
    public int getNth(int n) {
        sortIfNeeded();
        return super.getNth(n);
    }
    
    @Override
    public int getLength() {
        // Length doesn't require sorting
        return super.getLength();
    }
    
    @Override
    public String toString() {
        sortIfNeeded();
        return super.toString();
    }
}