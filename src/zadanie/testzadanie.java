package zadanie;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class testzadanie {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Commads cmnd = new Commads();
        while (true) {
            System.out.println("-----------------------------------------------\n" +
                    "Выберите команду: \n" +
                    "1. init array - инициализация списков набором значений array.\n" +
                    "2. print - печать всех списков.\n" +
                    "3. print type - печать конкретного списка, где type принимает значения X, S, M.\n" +
                    "4. anyMore - выводит на экран, были ли не вошедшие значения ни в один список, возможные значения true, false.\n" +
                    "5. clear type - чистка списка, где type принимает значения X, S, M.\n" +
                    "6. merge - слить все списки в один, вывести на экран и очистить все списки.\n" +
                    "7. help - вывод справки по командам.\n");

            String input = reader.readLine();
            switch (input) {
                case "1":
                    cmnd.initarray();
                    break;
                case "2":
                    cmnd.print();
                    break;
                case "3":
                    cmnd.printtype();
                    break;
                case "4":
                    cmnd.anymore();
                    break;
                case "5":
                    cmnd.cleartype();
                    break;
                case "6":
                    cmnd.merge();
                    break;
                case "7":
                    cmnd.help();
                    break;
                default:
                    System.out.println("Такой команды не существует.");
                    break;
            }
        }
    }
}
