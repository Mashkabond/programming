package learning.D_operators;

public class Theory {
    public static void main(String[] args) {
        // 1. Арифметика (Arithmetic):
        int sum = 10 + 5;
        int diff = 10 - 5;
        int mult = 10 * 5;

        // Деление целых чисел! Дробная часть отбрасывается.
        int div = 10 / 3; // Результат 3, а не 3.333
        System.out.println("10 / 3 = " + div);

        // Остаток от деления.
        int mod = 10 % 3; // 10 = 3*3 + 1 (остаток 1)
        System.out.println("10 % 3 = " + mod);

        // 2. Инкремент и Декремент (Increment/Decrement)
        int counter = 0;
        counter++; // counter = 1
        counter--; // counter = 0

        // 3. Сравнение (Comparison) -> boolean
        boolean isGreater = 10 > 5; // true
        boolean isEqual = 10 == 10; // true
        boolean isNotEqual = 10 != 5; // true

        // 4. Логические операторы (Logical)
        // && (И) - оба должны быть true
        boolean and = (5 > 0) && (10 > 5); // true
        // || (ИЛИ) - хотя бы один true
        boolean or = (5 > 0) || (0 > 5); // true
        // ! (НЕ) - инверсия
        boolean not = !(5 > 0); // false

        // 5. Сравнение строк (String Comparison) !!! ВАЖНО
        String str1 = "Java";
        String str2 = new String("Java");

        // Неправильно для объектов (сравнивает ссылки в памяти)
        System.out.println("Using == : " + (str1 == str2)); // false

        // Правильно (сравнивает содержимое)
        System.out.println("Using .equals() : " + str1.equals(str2)); // true
    }
}
