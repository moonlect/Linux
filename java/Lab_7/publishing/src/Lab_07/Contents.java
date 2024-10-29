package Lab_07;

/**
 * Класс, формирующий содержание журнала
 *  @author Tsimoshchenko M.V, Kudryavets D.E
 * @version 1.0
 */
public class Contents {
    private Note notes [];   // массив статей
    // двумерный массив номеров страниц (оглавление)
    private int pageNumberNote [] [];
    private int numberPage;   // текущий номер страницы
    /**
     * Конструктор для создания содержания журнала
     * @param notes ‐ массив статей
     */
    public Contents(Note[] notes) {
        this.notes = notes;
// Массив pageNumberNote содержит для каждого материала:  
// 1. Номер начальной страницы материала 
// 2. Количество страниц, необходимых для размещения материала
                pageNumberNote = new int [notes.length] [2];
        createContents(notes);
    }

    /**
     * Метод формирования оглавления
     */
    public void createContents(Note[] notes){   ``
        int i;
// Очистка оглавления 
        for (i = 0; i < notes.length; i++){
            pageNumberNote[i][0] = 0;
            pageNumberNote[i][1] = 0;
        }
// первая страница ‐ титульная 
// вторая страница содержит оглавление 
// материалы начинаются с третьей страницы 
        numberPage = 3;
        i = 0;
        while (notes[i] != null){
            pageNumberNote[i][0] = numberPage; // начальный номер
// объем материала 
            pageNumberNote[i][1] = notes [i].getNumberPages();
// корректировка текущего номера страниц
            numberPage += pageNumberNote[i][1];
            i++;
        }
    }

    /**
     * Метод подсчета общего количества страниц в журнале
     * @return int ‐ Кол‐во страниц
     */
    public int getNumberPages() {
        return numberPage - 1;
    }

    /**
     * Метод, выводящий оглавление
     * @return the str ‐ возвращает строку
     */
    @Override
    public String toString() {
        String str = "\nСодержание:";
        int i = 0;
        while (notes[i] != null){
            str += "\n" + (i+1) + " " + notes[i].getAuthorNote() +
                    " " +
                    notes[i].getNoteTitle() + "\t" + pageNumberNote[i][0];
            i++;
        }
        return str;
    }

}