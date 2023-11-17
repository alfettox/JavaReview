public class Main {
    public static void main(String[] args) {
        LL.run();
    }

    private static class LL {
        public static void run() {
            LinkedList ll1 = new LinkedList();

            ll1.add(2);
            ll1.add(3);
            ll1.add(4);
            ll1.add(5);

            ll1.remove(4);

            System.out.println(ll1);
        }

        private static class LinkedList {
            private Node head;
            private Node tail;

            public void add(int value) {  //add at end
                Node newNode = new Node(value);
                if (head == null) {
                    head = newNode;
                } else {
                    tail.next = newNode;
                }
                tail = newNode;
            }

            @Override
            public String toString() {
                StringBuilder res = new StringBuilder();
                Node current = head;
                while (current != null) {
                    res.append(current.value);
                    if (current.next != null) {
                        res.append(">");
                    }
                    current = current.next;
                }
                return res.toString();
            }

            public void remove(int value) {
                Node current = head;
                Node prev = null;

                while (current != null && current.value != value) {
                    prev = current;
                    current = current.next;
                }

                if (current != null) {
                    if (prev == null) {
                        head = current.next;
                    } else {
                        prev.next = current.next;
                    }
                    if (current == tail) {

                        tail = prev;
                    }
                }
            }
            }

            private static class Node {
                private int value;
                private Node next;

                public Node(int value) {
                    this.value = value;
                    this.next = null;
                }
            }
        }
    }
}
