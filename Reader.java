public class Reader {
    String fullName;
    String readerTicket;
    String facility;
    String birthday;
    String phoneNumber;

    public Reader(String fullName, String readerTicket, String facility, String birthday, String phoneNumber) {

        this.fullName = fullName;
        this.readerTicket = readerTicket;
        this.facility = facility;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
    }

    public Reader() {

    }

    @Override
    public String toString() {

        return "Reader{" +
                "fullName='" + fullName + '\'' +
                ", readerTicket='" + readerTicket + '\'' +
                ", facility='" + facility + '\'' +
                ", birthday='" + birthday + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public void takeBook(int quantity) {

        System.out.printf("%s взял %s книги", this.fullName, quantity);
        System.out.println();
    }

    public void takeBook(String title1, String title2, String title3) {

        System.out.printf("%s взял книги: %s, %s, %s.", this.fullName, title1, title2, title3);
        System.out.println();
    }

    public void takeBook(String fullName, String... titles) {

        for (String title : titles) {
            System.out.printf("%s взял книги: %s.", fullName, title);
            System.out.println();
        }
    }

    public void returnBook(int quantity) {

        System.out.printf("%s вернул %s книги", this.fullName, quantity);
        System.out.println();
    }

    public void returnBook(String title1, String title2, String title3) {

        System.out.printf("%s вернул книги: %s, %s, %s.", this.fullName, title1, title2, title3);
        System.out.println();
    }

    public void returnBook(String fullName, String... titles) {

        for (String title : titles) {
            System.out.printf("%s вернул книги: %s.", fullName, title);
            System.out.println();
        }
    }
}
