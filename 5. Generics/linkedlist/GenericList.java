package Generics.linkedlist;

 
public class GenericList<T> implements IGenericList<T> {
    private IGenericNode<T> head;

    public GenericList(T rootValue) {
        this.head = new GenericNode<>(rootValue);
    }

    public void insert(T element) {
        IGenericNode<T> newNode = new GenericNode<>(element);
        IGenericNode<T> current = head;

        while (current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(newNode);
    }

    public void println() {
        IGenericNode<T> current = head;

        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
}
