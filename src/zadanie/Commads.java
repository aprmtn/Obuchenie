package zadanie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Commads {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Integer> listX = new ArrayList<>();
    ArrayList<Integer> listS = new ArrayList<>();
    ArrayList<Integer> listM = new ArrayList<>();
    ArrayList<Integer> anyMore = new ArrayList<>();

    public void initarray() throws IOException {
        System.out.println("Введите числа...");
        int[] array = new int[5]; //размер массива для примера
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(array);

        for (int i : array) {
            if (i % 21 == 0 && i % 7 == 0 && i % 3 == 0 && i != 0) {
                listX.add(i);
                listS.add(i);
                listM.add(i);
            }
            else if (i % 3 == 0 && i != 0)
                listX.add(i);
            else if (i % 7 == 0 && i != 0)
                listS.add(i);
            else anyMore.add(i);
        }
    }
    public void print() {
        if (listX.isEmpty()) {
            System.out.println("Список X пуст.");
        }
        else
            System.out.println(listX);
        if (listS.isEmpty()) {
            System.out.println("Список S пуст.");
        }
        else
            System.out.println(listS);
        if (listM.isEmpty()) {
            System.out.println("Список M пуст.");
        }
        else
            System.out.println(listM);
    }
    public void printtype() throws IOException {
        System.out.println("Введите тип списка (X, S, M).");
        String xsm = reader.readLine();
        switch (xsm) {
            case "X":
            case "x":
                if (listX.isEmpty()) {
                    System.out.println("Список X пуст.");
                }
                else
                    System.out.println(listX);
                break;
            case "S":
            case "s":
                if (listS.isEmpty()) {
                    System.out.println("Список S пуст.");
                }
                else
                    System.out.println(listS);
                break;
            case "M":
            case "m":
                if (listM.isEmpty()) {
                    System.out.println("Список M пуст.");
                }
                else
                    System.out.println(listM);
                break;
            default:
                System.out.println("Вы ввели неверный тип.");
                break;
        }
    }
    public void anymore() {
        boolean a = (anyMore.size() > 0);
        System.out.println(a);
    }
    public void cleartype() throws IOException {
        System.out.println("Введите тип списка (X, S, M).");
        String xsm = reader.readLine();
        switch (xsm) {
            case "X":
            case "x":
                listX.clear();
                break;
            case "S":
            case "s":
                listS.clear();
                break;
            case "M":
            case "m":
                listM.clear();
                break;
            default:
                System.out.println("Вы ввели неверный тип.");
                break;
        }
    }
    public void merge() {
        ArrayList<Integer> listMerge = new ArrayList<>();
        listMerge.addAll(listX);
        listMerge.addAll(listS);
        listMerge.addAll(listM);
        System.out.println(listMerge);
        listX.clear();
        listS.clear();
        listM.clear();
    }
    public void help() {
        System.out.println("Список команд: \n" +
                "1. init array - инициализация списков набором значений array.\n" +
                "2. print - печать всех списков.\n" +
                "3. print type - печать конкретного списка, где type принимает значения X, S, M.\n" +
                "4. anyMore - выводит на экран, были ли не вошедшие значения ни в один список, возможные значения true, false.\n" +
                "5. clear type - чистка списка, где type принимает значения X, S, M.\n" +
                "6. merge - слить все списки в один, вывести на экран и очистить все списки.\n" +
                "7. help - вывод справки по командам.\n");
    }
}

