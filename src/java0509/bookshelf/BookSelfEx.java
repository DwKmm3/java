package java0509.bookshelf;

public class BookSelfEx {
    public static void main(String[] args) {
        Queue shelfQueue=new BookSelf();
        shelfQueue.enQueue("태백산백 1");
        shelfQueue.enQueue("태백산백 2");
        shelfQueue.enQueue("태백산백 3");

        System.out.println(shelfQueue.dequeue());
        System.out.println(shelfQueue.dequeue());
        System.out.println(shelfQueue.dequeue());
        //3개까지만 출력가능
        //그 이상은 없기 때문
    }
}
