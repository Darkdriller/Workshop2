public class Main {
    public static void main(String[] args) {

        // I/P: 67->89>45->98->67->45
        // O/P: 67->89->45->98
        LinkedList<Integer> list = new LinkedList<>();
        list.add(67);
        list.add(89);
        list.add(45);
        list.add(98);
        list.add(67);
        list.add(45);
        System.out.println("Original List: ");
        list.printList();
        list.removeDuplicates();
        System.out.println("List after duplicates are removed");
        list.printList();
    }
}
