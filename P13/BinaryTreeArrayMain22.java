package P13;

public class BinaryTreeArrayMain22 {
    public static void main(String[] args) {
        BinaryTreeArray22 bta = new BinaryTreeArray22();
        int[] data = {6, 4, 8, 3, 5, 7, 9, 0, 0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        System.out.print("\nInorder Traversal : ");
        bta.traverseInOrder(0);
        System.out.println("\n");
    }
}
