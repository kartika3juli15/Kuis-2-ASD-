public class Method17 {
    Node17 head;
    Node17 tail;

    public void add(Pasien17 data) {
        Node17 hm = new Node17 (data);
        if (head == null) {
            head = tail = hm;
        } else {
            tail.next = hm;
            hm.prev = tail;
            tail = hm;
        }
    }

    public void remove(String id) {
        Node17 current = head;
        while (current != null) {
            if (current.data.getId().equals(id)) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
                return;
            }
            current = current.next;
        }
    }

    public Pasien17 find(String id) {
        Node17 current = head;
        while (current != null) {
            if (current.data.getId().equals(id)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    public void printAll() {
        Node17 current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void sort() {
        if (head == null) {
            return;
        }

        boolean tukar;
        do {
            Node17 current = head;
            tukar = false;
            while (current.next != null) {
                if (current.data.getId().compareTo(current.next.data.getId()) > 0) {
                    Pasien17 temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    tukar = true;
                }
                current = current.next;
            }
        } while (tukar);
    }
}
