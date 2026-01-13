package learning.C_data_and_variables;

public class Theory {
    public static void main(String[] args) {
        // 1. Что такое переменная? (Variable)
        // Это именованная ячейка памяти для хранения данных.

        // Этапы создания переменной:
        int myNumber; // Объявление (Declaration) - выделили память, но значение не задали.
        myNumber = 50; // Присваивание (Assignment) - положили значение в ячейку.

        int another = 10; // Инициализация (Initialization) - объявление + присваивание сразу.

        // 1.1 Строгая типизация (Strict Typing):
        // Это значит, что тип переменной указывается один раз при объявлении и не может
        // меняться дальше в программе.
        int age = 25;
        // age = "Twenty five"; // Если раскомментировать, то будет ошибка компиляции!

        // 2. Примитивные типы (Primitives) - 8 типов:

        // Целые числа (Integers):
        byte b = 100; // 8 бит, от -128 до 127
        short s = 30000; // 16 бит, от -32,768 до 32,767
        int i = 2000000000; // 32 бита (2 млрд), самый частый тип
        long l = 9000000000L; // 64 бита, нужен суффикс 'L' для больших чисел

        // Дробные числа (Floating Point):
        float f = 3.14f; // 32 бита, нужен суффикс 'f'
        double d = 3.14159; // 64 бита, стандарт для дробных

        // Символы (Characters):
        char letter = 'A'; // Один символ в одинарных кавычках ' '
        char code = 66; // Можно задать кодом из таблицы ASCII ('B')

        // Логический тип (Boolean):
        boolean isJavaFun = true;
        boolean isHard = false;

        System.out.println("Primitives: " + b + ", " + s + ", " + i + ", " + l);
        System.out.println("Floats: " + f + ", " + d);
        System.out.println("Chars: " + letter + ", " + code);

        // 3. Строки (String):
        // String - это ссылочный тип (Класс), а не примитив.
        // Этот тип данных пишется с большой буквы. А значение задается в двойных
        // кавычках " ".
        String greeting = "Hello, Java!";
        System.out.println(greeting);

        // 4. Именование (Naming Conventions):
        // camelCase для переменных: mySuperValue
        // PascalCase для классов: MySuperClass
        // snake_case НЕ используется в Java (только для констант, которые будут
        // рассмотрены позже)
        int validVariableName = 1;
    }
}
