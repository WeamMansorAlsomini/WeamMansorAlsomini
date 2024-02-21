import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract  class AbstractBinaryTree <E> extends AbstractTree<E> implements BinaryTree<E>{
    @Override
    public Position<E> sibling(Position<E> p) {
        Position<E>parent=parent(p);
        if (parent==null)
            return null;
        if (p==left(parent))
            return right(parent);
     else    return left(parent);
    }

    @Override
    public Iterable<Position<E>> children(Position<E> p) {
        ArrayList<Position<E>>snap= new ArrayList<>();
        if (left(p)!=null)
            snap.add(left(p));
        if (right(p)!=null)
            snap.add(right(p));

        return snap;
    }

    @Override
    public int numChildren(Position<E> p) {
        int c=0;
        if (left(p)!=null)
            c++;
        if (right(p)!=null)
            c++;
        return c;
    }
}
