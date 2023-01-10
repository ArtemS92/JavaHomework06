public class Main {
    public static void main(String[] args) {
        System.out.println();

        Reader r1 = new Reader();
        r1.fullName = "Смагин А.А.";
        r1.readerTicket = "АК-4312";
        r1.birthday = "14.11.1992";
        r1.facility = "ФАСК";
        r1.phoneNumber = "+79250308683";
        System.out.println(r1);

        Reader r2 = new Reader("Харитонов А.В.", "М-9088",
                "МФ", "02.03.1991", "+79995656363");
        System.out.println(r2);

        Reader r3 = new Reader("Заболотников Е.И.", "М-3465",
                "МФ", "10.01.1983", "+79256899747");
        System.out.println(r3);

        Book b1 = new Book();
        b1.author = "Чекрыжев";
        b1.title = "Основы ТОиР";

        Book b2 = new Book("Масленников", "Авиационные газотурбинные двигатели");
        Book b3 = new Book("Кручинский", "Ремонт авиационной техники (теория и практика)");

        System.out.println();

        r1.takeBook(3);

        r3.takeBook(b2.title, b3.title, b1.title);

        String[] titles = { b1.title, b2.title, b3.title };
        r2.takeBook(r2.fullName, titles);

        System.out.println();

        r1.returnBook(3);

        r3.returnBook(b2.title, b1.title, b3.title);

        r2.returnBook(r2.fullName, titles);
    }
}
