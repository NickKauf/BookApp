public class BookApp {
    public static void main(String[] args){
        BookClass book1 = new BookClass("The Book", "The Author", "an interesting book.", 5.99, true);
        book1.getDisplayText();

        BookClass book2 = new BookClass();
        book2.setAuthor("Nick");
        book2.setTitle("My book");
        book2.setDescription("A book by me");

        book2.getDisplayText();
    }
}
