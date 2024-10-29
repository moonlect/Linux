/**
 * Проверка классов
 *
 * @author Tsimoshchenko M.V, Kudryavets D.E
 * @version 1.0
 */
public class AggregationExample {
    public static void main(String[] args) {
        // Создание статей
        Note_ noteVasilev1 = new Note_("Васильев П.И.", "Создание классов в Java", 3.6);
        Note_ noteVasilev2 = new Note_("Васильев П.И.", "Среда NetBeans", 2.8);

        // Создание массива статей
        Note_[] notes = new Note_[10];
        notes[0] = noteVasilev1;
        notes[1] = noteVasilev2;

        // Создание журнала
        String PUBLISHING_HOUSE = "Эрудит";
        String PUBLISHING_LOCATION = "Минск";

        Magaz magazine = new Magaz("Программирование", 1, 2016,
                notes, PUBLISHING_HOUSE,
                PUBLISHING_LOCATION);
        System.out.println(magazine.toString());
    }
}

/**
 * Класс для представления журнала
 */
class Magazine {
    private String magazineTitle;   // название журнала
    private int numberMagazine;     // номер выпуска
    private int publishingYear;     // год издания
    private Note_[] notes;           // массив статей
    private String publishingHouse;  // издательство
    private String publishingLocation; // город
    private int numberPage;         // количество страниц

    /**
     * Конструктор для создания экземпляра журнала
     * @param magazineTitle - название
     * @param numberMagazine - номер выпуска
     * @param publishingYear - год издания
     * @param notes - массив статей
     * @param publishingHouse - издательство
     * @param publishingLocation - город
     */
    public Magazine(String magazineTitle, int numberMagazine,
                    int publishingYear, Note_[] notes,
                    String publishingHouse, String publishingLocation) {
        this.magazineTitle = magazineTitle;
        this.numberMagazine = numberMagazine;
        this.publishingYear = publishingYear;
        this.notes = notes;
        this.publishingHouse = publishingHouse;
        this.publishingLocation = publishingLocation;
    }

    // Геттеры для всех полей класса
    public String getMagazineTitle() {
        return magazineTitle;
    }

    public int getNumberMagazine() {
        return numberMagazine;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public Note_[] getNotes() {
        return notes;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public String getPublishingLocation() {
        return publishingLocation;
    }

    public int getNumberPage() {
        return numberPage;
    }

    // Метод для изменения содержания журнала
    public void setNotes(Note_[] notes) {
        this.notes = notes;
    }

    /**
     * Метод, формирующий информацию о журнале
     * @return str - возвращает строку
     */
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Журнал " + magazineTitle + " № " +
                numberMagazine + " " + publishingYear + ". ‐ "
                + publishingLocation + ".: " + publishingHouse);

        for (Note_ note : notes) {
            if (note != null) {
                str.append("\n").append(note.toString());
            }
        }

        return str.toString();
    }
}

/**
 * Класс для представления статьи
 */
class Note {
    private String author;
    private String title;
    private double pages;

    public Note(String author, String title, double pages) {
        this.author = author;
        this.title = title;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return author + ". " + title + ", авт. листов: " + pages;
    }
}