/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv22weatheriny;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {

    private final Scanner scanner;

    public App() {
       this.scanner = new Scanner(System.in);
    }

    public App(Scanner scanner){
        this.scanner = scanner;
    }

    @SuppressWarnings("empty-statement")
    void run() {
       System.out.println("-----WEATHER IN YEAR----");
       boolean repeat = true;
        do {
            System.out.println("Выберите номер задачи: ");
            System.out.println("0. Выход из программы");
            System.out.println("1. Погода в указонной дате");
            System.out.println("2. Дни, самая холодная и теплая погода");
            System.out.println("3. Среднея температура за месяц");
            System.out.println("4. Средная темп. за год");
            System.out.print("номер задачи: ");
            int task = scanner.nextInt(); scanner.nextLine();
            switch (task) {
                case 0:
                    System.out.println("Выход из программы");
                    repeat = false;
                    break;
                case 1:
                    WeatherInDate weatherInDate = new WeatherInDate(scanner);
                    weatherInDate.showWeather();
                    break;
                case 2:
                         
                    break;
                case 3:
                  
                    break;
                case 4:
                    ;
                    break;
                default:
                    System.out.println("Выбирете номер из списка");
        }while(repeat);
    }
    }
}
