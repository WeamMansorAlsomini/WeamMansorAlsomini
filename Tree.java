import java.util.Iterator;

public interface Tree<E> {
    Position<E>root();
    Position<E>parent(Position<E>p);
    Iterable<Position<E>>children(Position<E> p);
    int numChildren(Position<E>p);
    int size();
    boolean isEmpty();
    boolean isInternal(Position<E>p);
    boolean isExternal(Position<E>p);
    boolean isRoot(Position<E>p);
    Iterator<E> iterator();
    Iterable<Position<E>>positions();

}
