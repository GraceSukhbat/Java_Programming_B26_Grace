package day03_04_18_2022;

public class Book {
    /*
    Task 01 :

   -Create a class named Book,
        -5 Instance variables : String name, category, author, bookID;
                              int shelfNum(assign it with respect to categories );

        -1 Static variable :    int bookCount; (initiate it in a static block)

        -3 constructors : name /// name + category /// name + category + author  (implement constructor chaining)

        -2 methods : 1- toString()
                     2- IDgenerator() -> assign shelfNum and assign bookID with that format; ShelfNum_AuthorNameInitial_BookNameFirst2letters
                     (eg: adventure book =>  Moby Dick / Herman Melville; bookID= 1_H_Mo)

                                        Categories:  - Adventure (shelfNum = 1)
                                                     - Classics (shelfNum = 2)
                                                     - Comics (shelfNum = 3)
                                                     - Fantasy (shelfNum = 4)
                                                     - History (shelfNum = 5)
                                                     - Otherwise (shelfNum = 0)
     */
    String name;
    String category;
    String author;
    String bookID;
    int shelfNum;

    static int bookCount;
    static{
        bookCount = 0;
    }

    public Book(String name) {
        this.name = name;
        bookCount++;
    }

    public Book(String name, String category) {
        this(name);
        this.category = category;
    }

    public Book(String name, String category, String author) {
        this(name, category);
        this.author = author;
        IDgenerator();
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", author='" + author + '\'' +
                ", bookID='" + bookID + '\'' +
                ", shelfNum=" + shelfNum +
                '}';
    }
    public void IDgenerator(){
        switch (category.toLowerCase()){
            case "adventure":
                this.shelfNum = 1;
                break;
            case "classics":
                this.shelfNum = 2;
                break;
            case "comics":
                this.shelfNum = 3;
                break;
            case "fantasy":
                this.shelfNum = 4;
                break;
            case "history":
                this.shelfNum = 5;
                break;
            default: this.shelfNum = 0;
        }
        bookID = shelfNum + "_" + author.toUpperCase().charAt(0) + "_" + name.toUpperCase().charAt(0) + name.substring(1,2);

    }
}
