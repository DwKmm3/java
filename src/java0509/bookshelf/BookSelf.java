<<<<<<< HEAD
package java0509.bookshelf;

public class BookSelf extends Shelf implements Queue{
    @Override
    public void enQueue(String title) {
        shelf.add(title);
    }

    @Override
    public String dequeue() {
        return shelf.remove(0);
    }

    @Override
    public int getSize() {
        return getCount();
    }
}
=======
package java0509.bookshelf;

public class BookSelf extends Shelf implements Queue{
    @Override
    public void enQueue(String title) {
        shelf.add(title);
    }

    @Override
    public String dequeue() {
        return shelf.remove(0);
    }

    @Override
    public int getSize() {
        return getCount();
    }
}
>>>>>>> github/master
