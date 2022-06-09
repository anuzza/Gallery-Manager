import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public  class LinkedQueue<T> implements  QueueOp<T>, Iterable<T> {

    protected LinearNode<T> rear;
    protected LinearNode<T> front;
    protected int size;
    protected int modCount;

    public LinkedQueue() {
        rear = null;
        front = null;
        size = 0;
        modCount = 0;

    }

    @Override
    public void enqueue(T elem) {
        LinearNode<T> node = new LinearNode<T>(elem);
        if (rear == null) {
            front = rear = node;

        } else {
            rear.setNext(node);
            rear = node;


        }
        size++;
        modCount++;

    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            System.out.println(" No paintings in the gallery! ");
            return null;
        } else {
            T s = front.getElement();
            front = front.getNext();
            size--;
            modCount++;
            return s;

        }



    }

    @Override
    public T first() {
        if (isEmpty()) {
            System.out.println(" No paintings in the gallery! ");
            return null;
        } else {

            return front.getElement();
        }
    }

    @Override
    public boolean isEmpty() {

        return size == 0;
    }

    @Override
    public int size() {

        return this.size;
    }


    public String toString() {
        String output = "";
        if (!isEmpty()) {

            LinearNode<T> temp = front;
            while (temp != null) {
                output += temp.getElement();
                temp = temp.getNext();

            }

        }
        return output;


    }

    @Override
    public Iterator<T> iterator() {
        return new QueueIterator();
    }

    private class QueueIterator implements Iterator<T> {
        private int iteratorModCount;
        private LinearNode<T> current;

        public QueueIterator(){
            current = front;
            iteratorModCount = modCount;
        }


        @Override
        public boolean hasNext() {
            if(iteratorModCount != modCount){
                throw  new ConcurrentModificationException();
            }
            return (current != null);
        }

        @Override
        public T next() {
            if(!hasNext()){
                throw new NoSuchElementException();
            }
            T result = current.getElement();
            current = current.getNext();
            return result;
        }


    }
}

