public class BinaryTreeString {

    NodeString root;

    public void add(String data) {

        if (root == null) {
            root = new NodeString(data);
            return;
        }

        root.add(data);
    }

    public void preTraverse(NodeString node) {

        if (node == null) return;

        System.out.printf("[%s]", node.data);
        preTraverse(node.left);
        preTraverse(node.right);
    }

    public void inTraverse(NodeString node) {

        if (node == null) return;

        inTraverse(node.left);
        System.out.printf("[%s]", node.data);
        inTraverse(node.right);
    }

    public void postTraverse(NodeString node) {

        if (node == null) return;

        postTraverse(node.left);
        postTraverse(node.right);
        System.out.printf("[%s]", node.data);
    }

    public static void main(String[] args) {

        BinaryTreeString tree = new BinaryTreeString();

        tree.add("Budi");
        tree.add("Andi");
        tree.add("Caca");
        tree.add("Doni");
        tree.add("Eko");

        System.out.print("Preorder : ");
        tree.preTraverse(tree.root);

        System.out.println();

        System.out.print("Inorder : ");
        tree.inTraverse(tree.root);

        System.out.println();

        System.out.print("Postorder : ");
        tree.postTraverse(tree.root);
    }
}