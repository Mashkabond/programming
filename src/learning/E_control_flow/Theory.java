package learning.E_control_flow;

public class Theory {
    public static void main(String[] args) {
        int x = 10;

        // 1. If-Else
        if (x > 5) {
            System.out.println("x is big");
        } else {
            System.out.println("x is small");
        }

        // Тернарный оператор (краткий if)
        String status = (x > 5) ? "Big" : "Small";

        // 2. Switch
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break; // Важно! Иначе выполнится и следующий case
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Other day");
        }

        // 3. Циклы (Loops)

        // For (известно количество повторений)
        System.out.print("For loop: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // While (пока условие true)
        int count = 0;
        while (count < 3) {
            System.out.println("While loop: " + count);
            count++;
        }

        // Do-While (сначала делает, потом проверяет -> выполнится минимум 1 раз)
        int k = 0;
        do {
            System.out.println("Do-While loop: " + k);
            k++;
        } while (k < 3);

        // 4. Break и Continue
        for (int i = 0; i < 10; i++) {
            if (i == 2)
                continue; // Пропустить итерацию 2
            if (i == 5)
                break; // Выйти из цикла совсем
            System.out.print(i + " "); // 0 1 3 4
        }
    }
}
