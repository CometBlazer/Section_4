package Section_4_7;


public class OOPLinkedList {
    protected OOPLinkedListElement head;

    public OOPLinkedList() {
        this.head = null;
    }

    //add to front
    public void add(int value) {
        OOPLinkedListElement newElement = new OOPLinkedListElement(value);
        if (head == null) {
            head = newElement;
        } else {
            OOPLinkedListElement current = head;
            head = newElement;
            head.setNext(current);
        }
    }

    public void remove(){
        if (head != null) {
            head = head.getNext();
        }
    }

    public int getHead() {
        if (head != null) {
            return head.getValue();
        }
        else return -1;
    }

    public int getNth(int n){
        OOPLinkedListElement current = head;
        int count = 0;
        while (current != null) {
            if (count == n) {
                return current.getValue();
            }
            count++;
            current = current.getNext();
        }
        return -1; //not found
    }

    public int getLength(){
        OOPLinkedListElement current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }

}

