/**
 * Проверка классов
 *
 * @author Tsimoshchenko M.V, Kudryavets D.E
 * @version 1.0
 */
public class CompositionExample {
    public static void main(String[] args) {
        Note_ noteVasilev1 = new Note_("Васильев П.И.", "Создание классов в Java", 3);
        Note_ noteVasilev2 = new Note_("Васильев П.И.", "Среда NetBeans", 42);

        Note_[] notes = new Note_[10];
        notes[0] = noteVasilev1;
        notes[1] = noteVasilev2;

        String PUBLISHING_HOUSE = "Эрудит";
        String PUBLISHING_LOCATION = "Минск";

        Magaz magazine = new Magaz("Программирование", 1, 2016,
                notes, PUBLISHING_HOUSE,
                PUBLISHING_LOCATION);

        // Вывод информации о журнале
        System.out.println(magazine.toString());

        // Вывод общего количества страниц
        System.out.println("Всего страниц: " + magazine.getNumberPage());
    }
}

class Magaz {
    private String magazineTitle;
    private int numberMagazine;
    private int publishingYear;
    private Note_[] notes;
    private String publishingHouse;
    private String publishingLocation;

    public Magaz(String magazineTitle, int numberMagazine,
                 int publishingYear, Note_[] notes,
                 String publishingHouse, String publishingLocation) {
        this.magazineTitle = magazineTitle;
        this.numberMagazine = numberMagazine;
        this.publishingYear = publishingYear;
        this.notes = notes;
        this.publishingHouse = publishingHouse;
        this.publishingLocation = publishingLocation;
    }

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

    // Метод для подсчета общего количества страниц
    public int getNumberPage() {
        int totalPages = 0;
        for (Note_ note : notes) {
            if (note != null) {
                totalPages += note.getPages();
            }
        }
        return totalPages;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Журнал " + magazineTitle + " № " +
                numberMagazine + " " + publishingYear + ". ‐ "
                + publishingLocation + ".: " + publishingHouse + "\nСодержание:");

        int index = 1; // Индекс для нумерации статей
        for (Note_ note : notes) {
            if (note != null) {
                str.append("\n").append(index++).append(" ").append(note.toString());
            }
        }

        return str.toString();
    }
}

class Note_ {
    private String author;
    private String title;
    private double pages;

    public Note_(String author, String title, double pages) {
        this.author = author;
        this.title = title;
        this.pages = pages;
    }

    public double getPages() {
        return pages; // Геттер для количества страниц
    }

    @Override
    public String toString() {
        return author + ". " + title + " " + (int)pages; // Приводим к целому числу для вывода
    }
}