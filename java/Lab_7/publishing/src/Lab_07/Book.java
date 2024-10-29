package Lab_07;

/**
 * Класс, описывающий книгу
 *  @author Tsimoshchenko M.V, Kudryavets D.E
 * @version 1.0
 */
public class Book extends Note {
    private String publishingHouse;   // Издательство
    private String publishingLocation;   // Город
    private int publishingYear;   // Год издания
    private int numberPage;   // Кол‐во страниц
    /**
     * Конструктор для создания экземпляра книги
     * @param noteTitle ‐ название
     * @param authorNote ‐ автор
     * @param numberAuthorsSheets ‐ количество авторских листов
     * @param publishingHouse ‐ издательство
    67
     * @param publishingLocation ‐ город
     * @param publishingYear ‐ год издания
     */
    public Book(String noteTitle, String authorNote,
                double numberAuthorsSheets, String publishingHouse,
                String publishingLocation, int publishingYear) {
        super(noteTitle, authorNote, numberAuthorsSheets);
        this.publishingHouse = publishingHouse;
        this.publishingLocation = publishingLocation;
        this.publishingYear = publishingYear;
        numberPage = getNumberPages();
    }

    /**
     * Конструктор для создания экземпляра книги
     * двух авторов
     * @param noteTitle ‐ название
     * @param author1Note ‐ автор 1
     * @param author2Note ‐ автор 2
     * @param numberAuthorsSheets ‐ количество авторских листов
     * @param publishingHouse ‐ издательство
     * @param publishingLocation ‐ город
     * @param publishingYear ‐ год издания
     */
    public Book(String noteTitle, String author1Note, String author2Note,
                double numberAuthorsSheets, String publishingHouse,
                String publishingLocation, int publishingYear) {
        super(noteTitle, author1Note, author2Note, numberAuthorsSheets);
        this.publishingHouse = publishingHouse;
        this.publishingLocation = publishingLocation;
        this.publishingYear = publishingYear;
        numberPage = getNumberPages();
    }

    /**
     * Конструктор для создания экземпляра книги
     * трех авторов
     * @param noteTitle ‐ название
     * @param author1Note ‐ автор 1
     * @param author2Note ‐ автор 2
     * @param author3Note ‐ автор 3
     * @param numberAuthorsSheets ‐ количество авторских листов
     * @param publishingHouse ‐ издательство
     * @param publishingLocation ‐ город
    68
     * @param publishingYear ‐ год издания
     */
    public Book(String noteTitle, String author1Note, String author2Note,
                String author3Note, double numberAuthorsSheets,
                String publishingHouse, String publishingLocation,
                int publishingYear) {
        super(noteTitle, author1Note, author2Note, author3Note,
                numberAuthorsSheets);
        this.publishingHouse = publishingHouse;
        this.publishingLocation = publishingLocation;
        this.publishingYear = publishingYear;
        numberPage = getNumberPages();
    }

    /**
     * Метод, формирующий информацию о книге
     * @return the str ‐ возвращает строку
     */
    @Override
    public String toString() {
        String str = numberNote + " " + authorNote + " " + noteTitle +
                ". ‐ " + publishingLocation + ".: " + publishingHouse +
                ", " + publishingYear + ".‐ " + numberPage + " c.";
        return str;
    }

    /**
     * Метод для чтения названия издательства
     * @return publishingHouse
     */
    public String getPublishingHouse() {
        return publishingHouse;
    }
    /**
     * Метод для чтения места издания (города)
     * @return publishingLocation
     */
    public String getPublishingLocation() {
        return publishingLocation;
    }
/**
 * Метод для чтения года издания
 * @return publishingYear
 */
    public int getPublishingYear() {
        return publishingYear;
    }

    /**
     * Метод для изменения года издания
     * @param publishingYear
     */
    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}