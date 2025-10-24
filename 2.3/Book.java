public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty = 0;
    private String isbn;

    public Book(String name, Author author, double price, String isbn) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }
    public Book(String isbn,String name,Author author, double price,int qty){
        this.isbn=isbn;
        this.name=name;
        this.author=author;
        this.price=price;
        this.qty=qty;
    }
    public String getIsbn() {
        return this.isbn;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return this.qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorName() {
        return this.name;
    }

    public String toString() {
        return "Book[name= ," + "isbn=" + this.isbn + this.name + "Author[name=" + author.getName() + ",email=" + author.getEmail() + "]" + "price=" + this.price + "qty=" + this.qty + "]";
    }
}