package com.company;

import java.util.Arrays;

public class EquilateralTriangles {
    private  EquilateralTriangle[] equilateralTriangles;
    private int current_equilateralTriangles_number;

    public EquilateralTriangles(int equilateralTriangles_number) {
        this.equilateralTriangles= new EquilateralTriangle[equilateralTriangles_number];
        current_equilateralTriangles_number=-1;
    }
    public void addEquilateralTriangles(EquilateralTriangle equilateralTriangle){
        if(++current_equilateralTriangles_number<equilateralTriangles.length)
        equilateralTriangles[current_equilateralTriangles_number]=equilateralTriangle;
    }

    public int get_number_equilateralTriangles_square_lager_average_square(){
        int number_equilateralTriangles_square_lager_average_square=0;
        for (EquilateralTriangle equilateralTriangle : equilateralTriangles) {
            if (equilateralTriangle.get_square()>average_square()){
                number_equilateralTriangles_square_lager_average_square++;
            }
        }
        return number_equilateralTriangles_square_lager_average_square;
    }
    private double average_square(){
        double result=0;
        for (EquilateralTriangle equilateralTriangle : equilateralTriangles) {
            result += equilateralTriangle.get_square();
        }
        return result/(double) equilateralTriangles.length;
    }

/**    @Override
    public String toString() {
        String result="";
        for (EquilateralTriangle equilateralTriangle : equilateralTriangles) {
            result += equilateralTriangle.get_square()+"; ";
            System.out.println(result);
        }

        return "EquilateralTriangles{" +
                "equilateralTriangles=" + result +
                '}';
}
*/
}
