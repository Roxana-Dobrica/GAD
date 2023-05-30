package Generics.linkedlist;


public class GenericNode<T> implements IGenericNode<T> {
    private T value;
    private IGenericNode<T> next;

    public GenericNode(T value) {
        this.value = value;
        this.next = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public IGenericNode<T> getNext() {
        return next;
    }

    public void setNext(IGenericNode<T> next) {
        this.next = next;
    }
}
