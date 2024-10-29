package Lab_07;

/**
 * Класс, описывающий автора публикуемого материала
* @author Tsimoshchenko M.V, Kudryavets D.E
  * @version 1.0
 */
public class Author {
    private String surname; // фамилия
    private String name; // имя
    private String secondName; // отчество
    private String passportData; // паспортные данные
    private String address; // адрес
    private String phoneNumber; // контактный телефон
    /**
     * Конструктор для создания экземпляра автора
     * @param surname ‐ фамилия
     * @param name ‐ имя
     * @param secondName ‐ отчество
     * @param passportData ‐ паспортные данные
     * @param address ‐ адрес
     * @param phoneNumber ‐ контактный телефон
     */
    public Author(String surname, String name, String secondName,
                  String passportData, String address, String phoneNumber) {
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.passportData = passportData;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Метод, формирующий полную информацию об авторе
     * @return the str ‐ возвращает строку
     */
    @Override
    public String toString() {
        String str = surname + " " + name + " " + secondName + ", " +

        "паспортные данные: " + passportData + ", " +
                "\nадрес: " + address + ", конт. телефон: " + phoneNumber;
        return str;
    }

    /**
     * Метод, возвращающий фамилию и инициалы автора
     * @param surname ‐ фамилия
     * @param name ‐ имя
     * @param secondName ‐ отчество
     * @return the str ‐ возвращает строку типа Иванов И.И.
     */
    String getShortName(String surname, String name, String secondName) {
        String str = surname + " " + name.substring(0, 1) + "." +
                secondName.substring(0, 1) + ".";
        return str;
    }
    /**
     * Перегруженный метод, возвращающий фамилию и инициалы автора
     * @param surname ‐ фамилия
     * @param name ‐ имя
     * @return the str ‐ возвращает строку типа Иванов И.
     */
    String getShortName(String surname, String name) {
        String str = surname + " " + name.substring(0, 1) + ".";
        return str;
    }
    /**
     * Метод, возвращающий фамилию автора
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }
    /**
     * Метод, возвращающий имя автора
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * Метод, возвращающий отыество автора
     * @return the secondName
     */
    public String getSecondName() {
        return secondName;
    }
    /**
     * Метод, возвращающий поспортные данные
     * @return the passportData
     */
    public String getPassportData() {
        return passportData;
    }
    /**
     * Метод, возвращающий адрес автора
     * @return the address
     */
    public String getAddress() {
        return address;
    }
    /**
     * Метод, возвращающий телефон автора
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }
    /**
     * Метод, изменяющий фамилию автора
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }
    /**
     * Метод, изменяющий паспортные данные
     * @param passportData the passportData to set
     */
    public void setPassportData(String passportData) {
        this.passportData = passportData;
    }
    /**
     * Метод, изменяющий адрес автора
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
    /**
     * Метод, изменяющий телефон автора
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}