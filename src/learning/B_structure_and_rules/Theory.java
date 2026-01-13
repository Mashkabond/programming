package learning.B_structure_and_rules;

public class Theory {
    public static void main(String[] args) {
        // 1. Точка входа в программу (Entry Point):
        // Любая программа на Java начинается с метода main.
        // Он должен быть public (доступен всем), static (существует без создания
        // объекта) и void (ничего не возвращает) по правилам языка согласно спецификации.
        System.out.println("Hello from Theory!");

        // 2. Файл и Класс (File & Class):
        // Имя файла с кодом на Java должно иметь расширение .java и совпадать с именем публичного класса.
        // Этот файл называется Theory.java, поэтому класс называется Theory.

        // 3. Регистрозависимость (Case Sensitivity):
        // Java различает большие и маленькие буквы.
        int number = 5;
        int Number = 10; // Это разные переменные!
        System.out.println("number: " + number);
        System.out.println("Number: " + Number);

        // 4. Блоки кода (Code Blocks):
        // Фигурные скобки { ... } определяют область видимости.
        {
            // Эта переменная видна только внутри этого блока
            String secret = "I am hidden";
            System.out.println(secret);
        }
        // System.out.println(secret); // Если раскомментировать, то будет ошибка: переменную secret здесь не видно

        // 5. Завершение команд (Semicolons):
        // Каждая команда заканчивается точкой с запятой.
        int x = 10; // ; обязательна

        // 6. Как писать комментарии в коде (Comments):
        // Однострочные: // ...
        /*
         * Многострочные:
         * можно писать сколько
         * угодно строк
         */

        // 7. Вывод данных в терминал (Output):
        // print печатает и остается на той же строке
        // println печатает и переводит на новую строку
        System.out.print("This is ");
        System.out.print("one line. ");
        System.out.println("Now new line.");

        // 8. Пробелы (Whitespace):
        // Java все равно на количество пробелов.
        int y = 20        ; // Это ок, но некрасиво

        // 9. Ключевые слова (Keywords):
        // Нельзя называть переменные зарезервированными словами языка (int, class, void...)
        // int class = 5; // Ошибка!

        // 10. Этот файл можно запустить и увидеть, что будет выведено в терминале
    }
}
