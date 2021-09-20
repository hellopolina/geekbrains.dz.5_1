public class Main {

    public static void main(String[] args){
        employee firstEmployee = new employee("Иванов Иван Иванович", "менеджер", "test@mail.ru", "8(999)999-99-99", 50000, 30);

        employee[] empArray = new employee[5]; // Вначале объявляем массив объектов
        empArray[0] = new employee("Petrov Petr", "QA", "test1@mail.ru", "8(999)999-99-91", 60000, 40);
        empArray[1] = new employee("Sidorov Vasiliy", "DevOps", "test2@mail.ru", "8(999)999-99-92", 70000, 37);
        empArray[2] = new employee("Kuznetsov Andrey", "Teemlead", "test3@mail.ru", "8(999)999-99-93", 80000, 45);
        empArray[3] = new employee("Mikhailova Tatiana", "Designer", "test4@mail.ru", "8(999)999-99-94", 70000, 30);
        empArray[4] = new employee("Alekseeva Marina", "Marketolog", "test5@mail.ru", "8(999)999-99-95", 80000, 35);

        for(int i = 0; i < 5; i++){
            if(empArray[i].age > 40){
                System.out.println(empArray[i]);
        }
        }
    }
}
