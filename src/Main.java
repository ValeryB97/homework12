public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Book captainDaughter = new Book("Капитанская дочка", pushkin, 1836);
        Author chekhov = new Author("Антон", "Чехов");
        Book chameleon = new Book("Хамелеон", chekhov, 1884);
        System.out.println(captainDaughter.getNameBook());
        System.out.print(captainDaughter.getAuthor().getFirstName() + " ");
        System.out.println(captainDaughter.getAuthor().getLastName());
        System.out.println(captainDaughter.getPublishingYear());
        System.out.println(chameleon.getNameBook());
        System.out.print(chameleon.getAuthor().getFirstName() + " ");
        System.out.println(chameleon.getAuthor().getLastName());
        System.out.println(chameleon.getPublishingYear());
        chameleon.setPublishingYear(1985);
        System.out.println(chameleon.getPublishingYear());
    }
}