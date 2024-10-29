package Lab_07;

/**
 *
 * @author Tsimoshchenko M.V, Kudryavets D.E
 * @version 1.0
 */
public class Publishing {
    private static final String PUBLISHING_HOUSE = "Эрудит";//Издательство
    private static final String PUBLISHING_LOCATION = "Мн"; //Город Минск

    public static void main(String[] args) {

        // Создание автора
        System.out.println("Авторы:");
        Author vasilev = new Author("Васильев", "Павел", "Ильич",
                "11, выдан 18.05.2011", "г. Минск, ул. Васнецова, д. 45, кв. 79",
                "6666666666");

        System.out.println(vasilev.toString());
        String shortNamevasilev = vasilev.getShortName(vasilev.getSurname(), vasilev.getName(), vasilev.getSecondName());
        System.out.println("Фамилия и инициалы: " + shortNamevasilev);

        Author vasilevskiy = new Author("Василевский", "Павел", "Эдуардович",
                "22, выдан 21.08.2015",
                "г. Минск, ул. Васнецова, д. 45, кв. 79", "7777777777");
        System.out.println(vasilevskiy.toString());

        Author vilson = new Author("Вилсон", "Альгис", "", "33, выдан 02.11.2001", "г. Минск, ул. Плеханова, д. 112, кв. 125", "8(029)44‐854‐05‐91");
        System.out.println(vilson.toString());
        String shortNameVilson = vilson.getShortName(vilson.getSurname(), vilson.getName());
        System.out.println("Фамилия и инициалы: " + shortNameVilson);

        // Создание материала
        System.out.println("\nПубликуемые материалы:");
        Note notevasilev1 = new Note("Создание классов в Java", shortNamevasilev, 3.6);
        Note notevasilev2 = new Note("Среда NetBeans", shortNamevasilev, 2.8);
        System.out.println(notevasilev1.toString());
        System.out.println("Кол‐во  страниц  " + notevasilev1.getNumberPages());
        System.out.println(notevasilev2.toString());
        System.out.println("Кол‐во  страниц  " + notevasilev2.getNumberPages());

        String shortNamevasilevskiy = vasilevskiy.getShortName(vasilevskiy.getSurname(), vasilevskiy.getName(), vasilevskiy.getSecondName());

        // Создание журнала
        System.out.println("\nЖурналы:");
        Note notes[] = new Note[10]; // массив статей
        notes[0] = notevasilev1;
        notes[1] = notevasilev2;
        Magazine magazine = new Magazine("Программирование", 1, 2016, notes, PUBLISHING_HOUSE, PUBLISHING_LOCATION);
        System.out.println(magazine.toString());
        System.out.println("Всего  страниц: " + magazine.getNumberPage());

        // Перегрузка конструкторов
        System.out.println("\nСтатья двух авторов:");
        Note notevasilev3 = new Note("Реализация принципов ООП", shortNamevasilev, shortNamevasilevskiy, 2.4);
        System.out.println(notevasilev3.toString());
        // Добавим ее в журнал
        notes[2] = notevasilev3;
        magazine.setNotes(notes);
        System.out.println(magazine.toString());
        System.out.println("Всего  страниц: " + magazine.getNumberPage());
    }

}