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
        builder.append("List [").append(head.getValue())
                .append(" ")
//                .append(head.getNext())
                .append("]");
        return builder.toString();
    }



//    @Override
//    public String toString() {
//        StringBuffer sb = new StringBuffer();
//        sb.append("[");
//        Node<T> p = head;
//        while (p != null) {
//            sb.append(p.getValue() + " ");
//            p = p.getNext();
//        }
//        sb.append("]");
//        return sb.toString();
//    }

}
