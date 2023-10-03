/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

import java.util.Random;

/**
 *
 * @author pupil
 */
public class InitProject {

    public void init() {
        int[][] weatherInY = new int[12][];
        weatherInY[0] = new int[31];
        weatherInY[1] = new int[28];
        weatherInY[2] = new int[31];
        weatherInY[3] = new int[30];
        weatherInY[4] = new int[31];
        weatherInY[5] = new int[30];
        weatherInY[6] = new int[31];
        weatherInY[7] = new int[31];
        weatherInY[8] = new int[30];
        weatherInY[9] = new int[31];
        weatherInY[10] = new int[30];
        weatherInY[11] = new int[31];
        int max = 40;
        int min = -30;
        Random random = new Random();
        for (int i = 0; i < weatherInY.length; i++) {
            for (int j = 0; i < weatherInY.length; j++) {
                weatherInY[i][j] = random.nextInt(max - min +1)+min;
                
            }
            
        }
        for (int i = 0; i < weatherInY.length; i++) {
            for (int j = 0; i < weatherInY.length; j++) {
                System.out.printf("%3d", weatherInY[i][j]);
            }
            System.out.println("");
        }
    }
    
}
