package com.company;


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String [] args ) {
        /**
         * Создать класс равносторонний треугольник, член класса – длина стороны. Предусмотреть в
         * классе методы вычисления и вывода сведений о фигуре – высота, биссектриса, периметр, площадь.
         * Создать производный класс – правильная пирамида с апофемой h (апофема – высота какой-либо
         * боковой стороны), добавить в класс метод определения объема фигуры, перегрузить методы расчета
         * площади и вывода сведений о фигуре. Написать программу, демонстрирующую работу с классом: дано
         * N треугольников и M пирамид, найти количество треугольников с площадью, большей средней площади
         * всех треугольников, и пирамиду с наибольшим объемом.
         */
        Scanner scanner=new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите количевство треугольников (N):");
        int number_triangles= scanner.nextInt();
        EquilateralTriangles equilateralTriangles=new EquilateralTriangles(number_triangles);
        for (int i = 0; i < number_triangles; i++) {
            equilateralTriangles.addEquilateralTriangles(new EquilateralTriangle(random.nextInt(5)));
        }
        System.out.println("Количество треугольников с площадью, большей средней площади всех треугольников:"
                +equilateralTriangles.get_number_equilateralTriangles_square_lager_average_square());
        System.out.println("Введите количевство пирамид (M):");
        int number_pyramid= scanner.nextInt();
        RightPyramids rightPyramids=new RightPyramids(number_pyramid);
        for (int i = 0; i < number_pyramid; i++) {
            rightPyramids.addRightPyramids(new RightPyramid(random.nextInt(5),random.nextInt(5)+1));
        }
        System.out.println("Пирамида с наибольшим объемом:"+rightPyramids.get_RightPyramid(rightPyramids.get_index_max_valume()));
        //System.out.println(rightPyramids);
    }
}






