public class HashTable {
    private Integer[] table;
    private int size;

    public HashTable(int m) {
        this.size = m;
        this.table = new Integer[m];
    }

    public void insert(int key) {
        int index = key % size;
        int originalIndex = index;
        int i = 0;

        while (table[index] != null) {
            index = (originalIndex + ++i) % size;
            if (i == size) {
                System.out.println("Table is full! Cannot insert: " + key);
                return;
            }
        }
        table[index] = key;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println("Index " + i + ": " + (table[i] == null ? "empty" : table[i]));
        }
    }
}