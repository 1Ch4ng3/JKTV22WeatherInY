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
public class JKTV22WeatherInY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        App app;
        app = new App(scanner);
        app.run();
    }
    
}
