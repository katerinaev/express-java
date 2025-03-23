package practice_2;
/**
1. Напишите класс Car
Поля:
String brand (марка машины),
int year (год выпуска).
Реализуйте:
Конструктор, который принимает brand и year.
Геттеры и сеттеры для обоих полей.
Метод print(), который выводит информацию о машине в формате:
"Марка: Toyota, Год выпуска: 2015".
В методе main создайте объект класса Car, установите значения через конструктор,
 измените год через сеттер и выведите информацию.

2. Напишите класс Rectangle
Поля:
int width (ширина),
int height (высота).
Реализуйте:
Конструктор для задания ширины и высоты.
Геттеры для получения значений ширины и высоты.
Сеттер для изменения ширины.
Метод calculateArea(), который возвращает площадь прямоугольника.
В методе main создайте прямоугольник, измените ширину через сеттер и
 выведите его площадь.

3. Создайте класс Book
Поля:
String title (название книги),
String author (автор).
Реализуйте:
Конструктор для задания названия и автора.
Геттеры и сеттеры для обоих полей.
Метод printInfo(), который выводит:
"Название: Гарри Поттер, Автор: Джоан Роулинг".
В методе main создайте объект книги, измените автора через сеттер и выведите информацию.

4. Реализуйте класс BankAccount
Поля:
String owner (владелец счёта),
double balance (баланс).
Реализуйте:
Конструктор, принимающий owner и balance.
Геттеры для получения данных.
Сеттер для изменения владельца.
Метод deposit(double amount) — увеличивает баланс на amount.
Метод withdraw(double amount) — уменьшает баланс на amount.
Метод printBalance() для вывода текущего баланса.
В методе main создайте банковский счёт, внесите депозит, снимите деньги и
 выведите текущий баланс.

5. Напишите класс Point
Поля:
int x (координата x),
int y (координата y).
Реализуйте:
Конструктор для задания координат.
Геттеры для получения значений координат.
Сеттер для изменения значения x.
Метод print() для вывода координат в формате:
"Координаты: x = 5, y = 10".
В методе main измените координату x и выведите новые координаты.

6. Создайте класс StudentGroup
Поля:
String groupName (название группы),
int studentCount (количество студентов).
Реализуйте:
Конструктор для задания названия группы и количества студентов.
Геттеры и сеттеры для обоих полей.
Метод printInfo() для вывода информации о группе:
"Группа: QA, Количество студентов: 25".
В методе main измените количество студентов через сеттер и выведите обновлённую информацию.

7. Напишите класс Circle
Поля:
double radius (радиус).
Реализуйте:
Конструктор для задания радиуса.
Геттер для получения радиуса.
Сеттер для изменения радиуса.
Метод calculateArea(), который возвращает площадь (πr2\pi r^2).
Метод calculateCircumference(), который возвращает длину окружности (2πr2 \pi r).
В методе main создайте круг, измените радиус через сеттер и выведите площадь и
 длину окружности.

8. Реализуйте класс Teacher
Поля:
String name (имя учителя),
String subject (предмет).
Реализуйте:
Конструктор для задания имени и предмета.
Геттеры и сеттеры для обоих полей.
Метод printInfo() для вывода:
"Учитель: Анна Ивановна, Предмет: Математика".
В методе main создайте объект учителя, измените предмет через сеттер и
 выведите информацию.

9. Напишите класс Product
Поля:
String name (название товара),
double price (цена).
Реализуйте:
Конструктор для задания имени и цены.
Геттеры для получения данных.
Сеттер для изменения цены.
Метод applyDiscount(double discount) для уменьшения цены на discount процентов.
Метод printInfo() для вывода:
"Товар: Хлеб, Цена: 50.0 руб.".
В методе main измените цену через сеттер, примените скидку и выведите новую цену.

10. Реализуйте класс Laptop
Поля:
String brand (бренд),
double price (цена).
Реализуйте:
Конструктор для задания бренда и цены.
Геттеры и сеттеры для обоих полей.
Метод printInfo() для вывода:
"Ноутбук: Lenovo, Цена: 70000.0 руб.".
В методе main измените цену через сеттер и выведите обновлённую информацию.
 */
public class    Main {
    public static void main(String[] args) {
        // проверка конструктора по умолчанию
        Student petya = new Student(18, "Петя");

        petya.print();

        Student kolya = new Student(20, "Коля");

        kolya.print();

        petya.setName("Ваня");
        petya.print();

        kolya.setAge(21);
        kolya.print();

        Car car1 = new Car("Wolkswagen", 2018);
        car1.print();

        car1.setYear(2025);
        car1.print();

        Rectangle rect1 = new Rectangle(5, 4);
        rect1.print();

        rect1.setWidth(15);
        rect1.print();

        Book book1 = new Book("Harry Potter", "Joanne Rowling");
        book1.printInfo();

        book1.setAuthor("Mark Twain");
        book1.setTitle("The adventures of Tom Sawyer");

        book1.printInfo();

        BankAccount account1 = new BankAccount("Ivanov", 0);
        account1.printBalance();

        account1.deposit(1000.55);
        account1.withdraw(50.77);

        account1.printBalance();

        Point point1 = new Point(5,7);
        point1.print();

        point1.setX(20);
        point1.print();

        StudentGroup group1 = new StudentGroup("QA", 25);
        group1.printInfo();

        group1.setStudentCount(30);
        group1.printInfo();

        Circle circle1 = new Circle(5.5);
        circle1.setRadius(10);
        System.out.println("Circle area: " + circle1.calculateArea() +
                ", Circumference: " + circle1.calculateCircumference());

        Teacher teacher1 = new Teacher("Nina Konstantinovna", "Mathematics");
        teacher1.printInfo();

        teacher1.setSubject("Literature");
        teacher1.printInfo();

        Product product1 = new Product("Meat", 50.0);
        product1.printInfo();
        product1.setPrice(30.0);
        product1.printInfo();
        product1.applyDiscount(78.65);
        product1.printInfo();

        Laptop laptop1 = new Laptop("Lenovo", 1500);
        laptop1.printInfo();

        laptop1.setPrice(1200);
        laptop1.printInfo();
    }
}
