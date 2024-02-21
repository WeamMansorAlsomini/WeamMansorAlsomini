import java.util.Iterator;

public class LinkedBinaryTree <E> extends AbstractBinaryTree<E>{
    private static class Node<E>implements Position<E>{
E element;
Node<E>parent;
Node<E>left;
Node<E>right;
        @Override
        public E getElement() {
            return element;
        }

        public Node(E element, Node<E> parent, Node<E> left, Node<E> right) {
            this.element = element;
            this.parent = parent;
            this.left = left;
            this.right = right;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getParent() {
            return parent;
        }

        public void setParent(Node<E> parent) {
            this.parent = parent;
        }

        public Node<E> getLeft() {
            return left;
        }

        public void setLeft(Node<E> left) {
            this.left = left;
        }

        public Node<E> getRight() {
            return right;
        }

        public void setRight(Node<E> right) {
            this.right = right;
        }
    }

    private Node<E>root=null;
    private int size=0;
    public LinkedBinaryTree() {}

    protected Node<E> createNode(E e, Node<E>p,Node<E>l,Node<E>r)
    {
        return new Node(e,p,l,r);
    }
protected Node<E>validate(Position<E>p)
{
    if (!(p instanceof Node))
        throw new IllegalArgumentException(" invalid pos");
    Node<E>n= (Node<E>) p;
    if (n.getParent()==n)
        throw new IllegalArgumentException(" p is not in the tree");
    return n;

}
    @Override
    public Position<E> left(Position<E> p) {
      Node<E>n= validate(p);
      return n.left;
    }

    @Override
    public Position<E> right(Position<E> p) {
        Node<E>n= validate(p);
        return n.right;
    }

    @Override
    public Position<E> root() {
        return root;
    }

    @Override
    public Position<E> parent(Position<E> p) {
        Node<E>n= validate(p);
        return n.parent;
    }

    @Override
    public int size() {
        return size;
    }

    Position<E> addRoot(E e)
    {
        if (!isEmpty())
            throw new IllegalStateException("Tree has already root");
        root= createNode(e,null,null,null);
        size=1;
        return root;
    }
    Position<E>addLeft(Position<E>p,E e)
    {
        Node<E>parent=validate(p);
        if (parent.getLeft()!=null)
            throw new IllegalArgumentException("there is already left child");
        Node<E>child=createNode(e,parent,null,null);
        parent.setLeft(child);
        size++;
        return child;
    }
    Position<E>addRight(Position<E>p,E e)
    {
        Node<E>parent=validate(p);
        if (parent.getRight()!=null)
            throw new IllegalArgumentException("there is already right child");
        Node<E>child=createNode(e,parent,null,null);
        parent.setRight(child);
        size++;
        return child;
    }
public E set(Position<E>p,E e)
{
    Node<E>n= validate(p);
    E old = n.element;
    n.setElement(e);
    return old;
}
public E remove(Position<E>p)
{
    Node<E>n=validate(p);
    if (numChildren(p)==2)
        throw new IllegalStateException("there are two children");
    Node<E>child=(n.getLeft()!=null?n.getLeft():n.getRight());
    if (child!=null)
        child.setParent(n.getParent());
    if(n==root)
        root=child;
    else {
        Node<E>parent= n.getParent();
        if (n==parent.getLeft())
            parent.setLeft(child);
        else
            parent.setRight(child);
    }
    size--;
    E del= n.element;
    n.element=null;
    n.left=null;
    n.right=null;
    n.setParent(n);
    return del;
}






    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Iterable<Position<E>> positions() {
        return null;
    }
}
