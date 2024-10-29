package Lab_07;

/**
 * Класс, описывающий публикуемый материал
 * @author Tsimoshchenko M.V, Kudryavets D.E
 * @version 1.0
 */
public class Note {
    protected int numberNote;   //  порядковый  номер  материала
    private static int lastNumberNote = 0;  //  последний  порядковыйномер
    protected String noteTitle;   // название мате‐риала
    protected String authorNote;   // автор материала
    protected double numberAuthorsSheets;   //  количество  авторскихлистов
    /**
     * Конструктор для создания экземпляра публикуемого материала
     * @param noteTitle ‐ название материала
     * @param authorNote ‐ автор материала
     * @param numberAuthorsSheets ‐ количество авторских листов
     */
    public Note(String noteTitle, String authorNote,
                double numberAuthorsSheets) {
        numberNote = ++lastNumberNote; // порядковый номер материала
        this.noteTitle = noteTitle;
        this.authorNote = authorNote;
        this.numberAuthorsSheets = numberAuthorsSheets;
    }
    /**
     * Конструктор для создания экземпляра публикуемого материала
     * двух авторов
     * @param noteTitle ‐ название материала
     * @param author1Note ‐ 1 автор материала
     * @param author2Note ‐ 2 автор материала
     * @param numberAuthorsSheets ‐ количество авторских листов
     */
    public Note(String noteTitle, String author1Note, String author2Note,
                double numberAuthorsSheets) {
        numberNote = ++lastNumberNote; // порядковый номер материала
        this.noteTitle = noteTitle;
        this.authorNote = author1Note + ", " + author2Note;
        this.numberAuthorsSheets = numberAuthorsSheets;
    }
    /**
     * Конструктор для создания экземпляра публикуемого материала
     * трех авторов
     * @param noteTitle ‐ название материала
     * @param author1Note ‐ 1 автор материала
     * @param author2Note ‐ 2 автор материала
     * @param author3Note ‐ 3 автор материала
     * @param numberAuthorsSheets ‐ количество авторских листов
     */
    public Note(String noteTitle, String author1Note, String author2Note, String author3Note, double numberAuthorsSheets) {
// создаем порядковый номер материала 
        numberNote = ++lastNumberNote;
        this.noteTitle = noteTitle;
        this.authorNote = author1Note + ", " + author2Note + ", "
                + author3Note;
        this.numberAuthorsSheets = numberAuthorsSheets;
    }

    /**
     * Метод, формирующий информацию о публикуемом материале
     * @return the str ‐ возвращает строку
     */
    @Override
    public String toString() {
        String str = numberNote + " " + authorNote + " " + noteTitle +
                ", авт. листов: " + numberAuthorsSheets;
        return str;
    }

    /**
     * Метод для подсчета количества поступивших в издательство ма‐
     териалов
     * @return lastNumberNote
     */
    public static int getLastNumberNote() {
        return lastNumberNote;
    }
    /**
     * Метод чтения порядкового номера материала
     * @return numberNote
     */
    public int getNumberNote() {
        return numberNote;
    }
    /**
     * Метод чтения названия материала
     * @return noteTitle
     */
    public String getNoteTitle() {
        return noteTitle;
    }
    /**
     * Метод чтения автора материала
     * @return authorNote
     */
    public String getAuthorNote() {
        return authorNote;
    }
    /**
     * Метод чтения количества авторских листов
     * @return numberAuthorsSheets
     */
    public double getNumberAuthorsSheets() {
        return numberAuthorsSheets;
    }
    /**
     * Метод изменения названия материала
     * @param noteTitle ‐ новое название
     */
    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }
    /**
     * Метод изменения количества авторских листов
     * @param numberAuthorsSheets  ‐  новое  количество  авторских  ли‐
    стов
     */
    public void setNumberAuthorsSheets(double numberAuthorsSheets) {
        this.numberAuthorsSheets = numberAuthorsSheets;
    }

    /**
     * Метод подсчета количества страниц
     * @return int ‐ Кол‐во страниц
     */
    public int getNumberPages() {
        return (int) Math.round(numberAuthorsSheets * 40000 / 3700);
    }

}