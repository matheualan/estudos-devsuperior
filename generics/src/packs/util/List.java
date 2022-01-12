package packs.util;

public class List<T> {

    private Node<T> head;

    public void add(T value) {
        Node node = new Node();
        node.setValue(value);
        node.setNext(head);
        head = node;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("List [").append(head.getValue()).append("]");
        return builder.toString();
    }

}
