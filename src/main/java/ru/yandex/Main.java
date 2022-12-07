package ru.yandex;


//0) прочитать про диапазоны типов данных для вещественных / чисел с плавающей точкой

//1) поупражняться с математическими и логическими операторами, добиться переполнения при вычислениях, посмотреть результаты (вывести в консоль)
//
//2) попробовать вычисления комбинаций типов данных (int и double)
//
//3) прочитать про приоритет операторов в java

public class Main {

    public static void main(String[] args) {


        int d = 12;
        int d1 = 10;
        System.out.println("_____________________________________");
        System.out.println("d + d1 = " + (d + d1));
        System.out.println("d - d1 = " + (d - d1));


        int x = 3500;
        double y = 2.243;


        System.out.println("x * y = " + x * y);
        System.out.println("x / y = " + x / y);
        System.out.println("x % y = " + x % y);

        System.out.println("_____________________________________");
        int z = 350000;
        double dd = 2.243;


        for (int i = 0; i < 11; i++) {
            //System.out.println(i);
            if (i < 9)
                System.out.println( i + " z * "+ i +" = " + z * i);


            else if ((i == 9)) {
                System.out.println("_____________________________________");
                System.out.println( i + " dd * i "+ i + " = " + dd * i);
            } else {
                System.out.println("_____________________________________");
                System.out.println("Excuse  c = z * dd * dd + c :" + z * dd * dd);
            }
        }
        System.out.println("_____________________________________");

        System.out.println("Приоритет выполнения операций можно задавать с помощью скобок (операции в скобках выполняются раньше). Если скобки отсутствуют, выполняются сначала более приоритетные операции." +
                "Первый приоритет: постинкремент, постдекремент" +
                " Второй приоритет: булево «не» " +
                "далее приоритетность математческих операций, свдиги и тд" +
                "Последний приоритет у оператора присваивания "
        );
        System.out.println("_____________________________________");

        System.out.println("Hello,не понимаю переполнение");

        int a  = 127;
        byte b = 12;
        long l = 4000000000L;
        System.out.println("_____________________________________");
        System.out.println(b);
        System.out.println(b+1000);
        System.out.println(b +a); // переполнение переменная другого типа
        System.out.println("Long " + l+1000000000);
        System.out.println("_____________________________________");
    }
}