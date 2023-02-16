public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("3 мушкетера", "Александр Дюма");
        Book book2 = new Book("Шантарам", "Грегори Робертс");
        Book book3 = new Book("Преступление и наказание", "Фёдор Достоевский");
        Book[] books = new Book[3];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
       Reader reader = new Reader("Василий", "Петров", 3114234676l, "Менеджмент", "2001-12-02", 553325898);
       reader.takebook(3);
       reader.takebook(books);
       reader.returnbook(3);
       reader.returnbook(books);
    }
}