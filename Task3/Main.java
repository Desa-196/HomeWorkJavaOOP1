package Task3;
/*
 * Реализуйте систему управления библиотекой. Создайте классы "Книга" (Book) и "Библиотека" (Library) 
со следующими свойствами и методами:

Класс "Книга" (Book):

Приватные поля "название" (title) и "автор" (author) типа String для хранения названия и автора книги соответственно.
Приватное поле "доступность" (available) типа boolean для указания доступности книги.
Публичные методы доступа (геттеры и сеттеры) для полей "название" и "автор".
Публичные методы доступа (геттеры и сеттеры) для поля "доступность".
Публичный метод "показать информацию" (displayInfo), который выводит на консоль информацию о книге (название, автор, доступность).
Класс "Библиотека" (Library):

Приватное поле "каталог" (catalog) типа ArrayList<Book> для хранения списка книг в библиотеке.
Публичный метод "добавить книгу" (addBook), который принимает объект типа Book и добавляет его в каталог библиотеки.
Публичный метод "удалить книгу" (removeBook), который принимает объект типа Book и удаляет его из каталога библиотеки.
Публичный метод "показать доступные книги" (displayAvailableBooks), который выводит на консоль информацию 
о доступных книгах в библиотеке.
Публичный метод "поиск книги по автору" (searchByAuthor), который принимает имя автора в качестве параметра 
и выводит на консоль информацию о книгах данного автора, находящихся в каталоге библиотеки.
 * 
 */

public class Main {
    public static Library library = new Library();
    public static void main(String[] args){

        ConsolPrinter printer = new ConsolPrinter();

        Book book1 = new Book("Война и мир, Том 1", "Л.Н.Толстой", true, printer);
        library.addBook(book1);
        Book book2 = new Book("Python, Django и Bootstrap для начинающих", "Анатолий Постолит ", true, printer);
        library.addBook(book2);
        Book book3 = new Book("JavaScript. Рецепты для разработчиков ", "Мэтью Макдоналд,  Адам Д. Скатт", true, printer);
        library.addBook(book3);
        Book book4 = new Book("Linux. Командная строка. Лучшие практики", "Барретт Дэниел Джей", true, printer);
        library.addBook(book4);
        Book book5 = new Book("Высоконагруженные приложения. Программирование, масштабирование, поддержка", "Клеппман Мартин", true, printer);
        library.addBook(book5);
        Book book6 = new Book("Олимпиадное программирование", "Лааксонен Антти", false, printer);
        library.addBook(book6);
        Book book7 = new Book("Грокаем алгоритмы.", "Бхаргава А.", true, printer);
        library.addBook(book7);
        Book book8 = new Book("Изучаем Java", "Кэти Сьерра, Берт Бэйтс", true, printer);
        library.addBook(book8);

        printer.print("Вывод результата поиска по автору:  Лааксонен Антти\n");
        library.searchByAuthor("Лааксонен Антти");

        printer.print("Вывод всех доступных книг:\n");
        library.displayAvailableBooks();

        //Удаляем книгу
        library.removeBook(book3);

        printer.print("Вывод всех доступных книг:\n");
        library.displayAvailableBooks();
    }
}
