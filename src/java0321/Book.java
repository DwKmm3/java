package java0321;

public class Book {//this<-사용은 잘 안 함, 먼저 초기 값을 줄 때 사용
    String title;
    String author;
    void show(){
        System.out.println(title+""+author);
    }
    public Book(){
        this("","홍길동");//""<-파라메타가 들어올 자리라는 것을 알림
    }
    public Book(String title){
        //this.title=title;//<-아래로 고친 이유?
        this(title,"작가 미상");
    }
    public Book(String title,String author){
        this.title=title;
        this.author=author;
    }
    public static void main(String []args){
        Book empthBook=new Book("자바를 배우자 ");
        empthBook.show();
    }
}
