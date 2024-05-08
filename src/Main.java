public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Book captainDaughter = new Book("Капитанская дочка", pushkin, 1836);
        Author chekhov = new Author("Антон", "Чехов");
        Book chameleon = new Book("Хамелеон", chekhov, 1884);
        System.out.println(captainDaughter.toString());
        System.out.println(chameleon.toString());
        chameleon.setPublishingYear(1985);
        System.out.println(chameleon.toString());
    }
}