public interface QueueOp<T> {

    public void enqueue(T elem);
    public T dequeue();
    public T first();
    public boolean isEmpty();
    public int size();
    public String toString();
}
