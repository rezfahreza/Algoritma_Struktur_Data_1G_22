package P13;

public class BinaryTree22 {
    Node22 root;
    int size;

    public BinaryTree22() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(int input) {
        if (isEmpty()) {
            root = new Node22(input);
        } else {
            Node22 current = root;
            while (true) {
                if (input < current.data) {
                    if (current.left == null) {
                        current.left = new Node22(input);
                        break;
                    } else {
                        current = current.left;
                    }
                } else if (input > current.data) {
                    if (current.right == null) {
                        current.right = new Node22(input);
                        break;
                    } else {
                        current = current.right;
                    }
                } else {
                    System.out.println("Data sudah ada");
                    break;
                }
            }
        }
    }

    public boolean find(int input) {
        boolean result = false;
        Node22 current = root;
        while (current != null) {
            if (current.data == input) {
                result = true;
                break;
            } else if (input < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return result;
    }

    public void traversePreOrder(Node22 node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traverseInOrder(Node22 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    public void traversePastOrder(Node22 node) {
        if (node != null) {
            traversePastOrder(node.left);
            traversePastOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    public Node22 getSuccessor(Node22 del) {
        Node22 successor = del.right;
        Node22 successorParent = del;
        while (successor.left != null) {
            successorParent = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.left = del.right;
        }
        return successor;
    }

    public void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree masih kosong");
            return;
        }
        Node22 current = root;
        Node22 parent = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
            }
        }
        if (current == null) {
            System.out.println("Couldn't find data");
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else if (isLeftChild) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            } else if (current.left == null) {
                if (isLeftChild) {
                    parent.left = current.right;
                } else {
                    parent.right = current.right;
                }
            } else if (current.right == null) {
                if (isLeftChild) {
                    parent.left = current.left;
                } else {
                    parent.right = current.left;
                }
            } else {
                Node22 successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }
}