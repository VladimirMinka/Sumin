package lesson138;

public class Worker {
    /* Создать класс Работник с полями имя, должность и зарплата. В конструкторе проинициализировать все поля.
    Добавить метод с int, тип возвращаемого значения  String который возвращает информацию о сотруднике,
    а также о сумме зарплаты которую он получает за i месяцев(передается в качестве параметра).
    Продемонстритровать в методе main
     */
    String name;
    String position;
    int salary;

    public Worker(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    String dateWorker(int month) {
        return "работник " + name + " его должность " + position + " его зарплата " + salary * month + " рублей";
    }
}
