package Lab_07;

/**
 * Класс, описывающий журнал
 *  @author Tsimoshchenko M.V, Kudryavets D.E
 * @version 1.0
 */
public class Magazine {
    private String magazineTitle;   // название журнала
    private int numberMagazine;   // номер выпуска
    private int publishingYear;   // Год издания
    private Note notes [];   // массив статей
    private String publishingHouse;   // Издательство
    private String publishingLocation;   // Город
    private int numberPage;   // Кол‐во страниц
    private Contents contents;   // Содержание журнала
    /**
     * Конструктор для создания экземпляра журнала
     * @param magazineTitle ‐ название
     * @param numberMagazine ‐ номер выпуска
     * @param publishingYear ‐ год издания
     * @param notes ‐ массив статей
     * @param publishingHouse ‐ издательство
     * @param publishingLocation ‐ город
     */
    public Magazine(String magazineTitle, int numberMagazine,
                    int publishingYear, Note[] notes, String publishingHouse,
                    String publishingLocation) {
        this.magazineTitle = magazineTitle;
        this.numberMagazine = numberMagazine;
        this.publishingYear = publishingYear;
        this.notes = notes;
        this.publishingHouse = publishingHouse;
        this.publishingLocation = publishingLocation;
// Формирование оглавления
        contents = new Contents(notes);
    }

    /**
     * Метод, формирующий информацию о журнале
     * @return str ‐ возвращает строку
     */
    @Override
    public String toString() {
        String str = "Журнал " + magazineTitle + "  № " + numberMagazine +
                " " + publishingYear + ". ‐ " + publishingLocation + ".: "
                + publishingHouse;
        str += contents.toString();
        return str;
    }
    /**
     * Метод для чтения названия журнала
     * @return magazineTitle
     */
    public String getMagazineTitle() {
        return magazineTitle;
    }
    /**
     * Метод для чтения номера журнала
     * @return numberMagazine
     */
    public int getNumberMagazine() {
        return numberMagazine;
    }
    /**
     * Метод для чтения года издания
     * @return publishingYear
     */
    public int getPublishingYear() {
        return publishingYear;
    }
    /**
     * Метод для получения массива статей журнала
     * @return notes
     */
    public Note[] getNotes() {
        return notes;
    }
    /**
     * Метод для изменения массива статей журнала
     * @param notes the notes to set
     */
    public void setNotes(Note[] notes) {
        this.notes = notes;
        contents.createContents(notes);
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
     * Метод, вычисляющий количество страниц в журнале
     * @return numberPage
     */
    public int getNumberPage() {
        numberPage = contents.getNumberPages();
        return numberPage;
    }
}