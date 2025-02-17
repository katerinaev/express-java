package practice_3;
/**
 Практика к уроку: static, final и модификаторы доступа

 1.Создайте класс Company:
 Поля:
 static String companyName — название компании (общее для всех сотрудников).
 final int employeeID — уникальный идентификатор сотрудника (задан при создании объекта).
 String employeeName — имя сотрудника.

 Реализуйте:
 Конструктор для инициализации полей employeeID и employeeName.
 Статический метод printCompanyName(), который выводит название компании.
 Геттеры и сеттеры для employeeName (поля employeeID менять нельзя).

 В main создайте несколько сотрудников и проверьте:
 Изменение companyName для всех объектов.
 Ошибку при попытке изменить employeeID.

 2.Создайте класс MathConstants:
 Поля:
 final double PI = 3.14159 — значение числа Пи.
 final double E = 2.71828 — значение числа Эйлера.

 Реализуйте:
 Статические методы для вычисления:
 Площади круга (πr2\pi r^2πr2).
 Длины окружности (2πr2 \pi r2πr).
 В main протестируйте методы с разными значениями радиуса.

 3.Модификаторы доступа:

 Создайте класс Library с полями:
 private String bookTitle — название книги.
 protected String author — автор.
 Default поле int year — год издания.
 public String category — категория книги.

 Реализуйте геттеры и сеттеры для каждого поля.

 В другом классе создайте объект Libraryи проверьте доступ к полям в зависимости от модификаторов доступа.

 Задача 4: Класс University
 Поля:
 static String universityName — название университета (общее для всех студентов).
 final int studentID — уникальный идентификатор студента.
 String studentName — имя студента.

 Реализуйте:
 Конструктор для инициализации studentID и studentName.
 Статический метод changeUniversityName(String newName) для изменения названия университета.
 Геттер для studentName и метод printStudentInfo(), который выводит информацию о студенте и университете.

 В методе main:
 Создайте 3 объекта студентов.
 Измените название университета через статический метод.
 Выведите информацию о каждом студенте.


 Задача 5: Класс GameSettings
 Поля:
 static int maxPlayers — максимальное количество игроков (общее для всех игр).
 final String gameName — название игры.
 int currentPlayers — текущее количество игроков.

 Реализуйте:
 Конструктор для инициализации gameName и начального количества игроков.
 Статический метод setMaxPlayers(int newMax) для изменения максимального количества игроков.
 Метод addPlayer(), который увеличивает текущее количество игроков на 1, если не превышен maxPlayers.
 Метод printGameStatus(), который выводит название игры, текущее количество игроков и максимальное количество.

 В методе main:
 Создайте 2 игры, установите разные начальные параметры.
 Измените максимальное количество игроков для всех игр.
 Добавьте игроков в каждую игру и выведите её статус.


 Задача 6: Класс Person
 Поля:
 private String firstName — имя.
 private String lastName — фамилия.
 private final String ssn — номер социального страхования.

 Реализуйте:
 Конструктор для инициализации всех полей.
 Геттеры для всех полей.
 Сеттеры для firstName и lastName (поле ssn менять нельзя).
 Метод printPersonInfo(), который выводит:
 "Имя: Иван, Фамилия: Иванов, SSN: 123-45-6789".

 В методе main:
 Создайте несколько объектов класса Person.
 Измените имя и фамилию одного из них через сеттеры.
 Выведите информацию о каждом человеке.
 */
public class Main {
    public static void main(String[] args) {
        // создали переменную
        // присвоили переменной экземпляр класса Студент
        // вызвав дефолтный конструктор

        System.out.println(Student.studentCount);

        Student petya = new Student(18,"petya");

        System.out.println(Student.studentCount);

        Student kolya = new Student(20, "kolya");

        System.out.println(Student.studentCount);

        Company emp1 = new Company(101, "Vania");
        Company emp2 = new Company(102, "Artem");

        Company.printCompanyName();

        emp1.printEmployeeInfo();
        emp2.printEmployeeInfo();

        Company.companyName = "Disney";

        emp1.printEmployeeInfo();
        emp2.printEmployeeInfo();

        Library book1 = new Library("The Adventures of Tom Sawyer", "Mark Twain", 2020, "Adventures");
;
        String author1 = book1.author;
        int year1 = book1.year;
        String category1 = book1.category;

        String bookTitle1 = book1.getBookTitle();

        System.out.println(author1);
        System.out.println(year1);
        System.out.println(category1);

        System.out.println(bookTitle1);

        book1.setBookTitle("Dune");
        System.out.println(book1.getBookTitle() );

        Person person1 = new Person("Ivan", "Ivanov", "123-45-6789");
        Person person2 = new Person("Petr", "Petrov", "987-65-4321");

        person2.setFirstName("John");
        person2.setLastName("Doe");

        person1.printPersonInfo();
        person2.printPersonInfo();
    }
}
