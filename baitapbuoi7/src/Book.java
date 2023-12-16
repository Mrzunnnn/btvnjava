public class Book {
    private String id;
    private String title;
    private String author;
    private String category;
    private String publisher;
    private int year;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Book(){
    }
    public Book(String id,String title,String author,String publisher, int year,String category){
        this.year = year;
        this.id = id;
        this.author = author;
        this.category = category;
        this.publisher = publisher;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", Tên sách là : '" + title + '\'' +
                ", Tác giả là : " + author +
                ", thể loại là : '" + category + '\'' +
                ", Nhà xuất bản là : '" + publisher + '\'' +
                ", Năm xuất bản là : '" + year + '\'' +
                '}';
    }
}
