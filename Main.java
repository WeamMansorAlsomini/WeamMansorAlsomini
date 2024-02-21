public class Main {
    public static void main(String[] args) {
        LinkedBinaryTree<Integer>t= new LinkedBinaryTree<>();
        t.addRoot(1);
        t.addLeft(t.root(), 2);
        t.addRight(t.root(),3);
        System.out.println(t.root().getElement());
        System.out.println(t.left(t.root()).getElement());
        System.out.println(t.right(t.root()).getElement());
    }
}