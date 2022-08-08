package rikkei.academy;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size = 0;

    public BST() {
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public BST(E[] objects) {
        for (int i = 0; i < objects.length; i++)
            insert(bjects[i]);
    }

    @Override
    public boolean insert(E e) {
        return false;
    }

    @Override
    public int getSize() {
        return 0;
    }
    @Override
    public boolean insert(E e) {
        if (root == null)
            root = createNewNode(e);

            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else
                    return false;
            }
            if (e.compareTo(parent.element) < 0)
                parent.left = createNewNode(e);
            else
                parent.right = createNewNode(e);
        return false;
    }
        size++;
            return true; /*element inserted successfully*/
}

    protected TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }
    @Override
    public int getSize() {
        return size;
    }



}


