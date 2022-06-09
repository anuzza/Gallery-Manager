public class LinearNode<T> {

    private LinearNode<T> next;
    private T element;

    public  LinearNode(){ //empty constructor
        next = null;
        element = null;

    }

    public LinearNode(T elem){// non-empty constructor
        next = null;
        element = elem;

    }

    //getters and setters

    public LinearNode<T> getNext() {
        return next;
    }

    public void setNext(LinearNode<T> next) {

        this.next = next;
    }

    public T getElement() {

        return element;
    }

    public void setElement(T element) {

        this.element = element;
    }
}
