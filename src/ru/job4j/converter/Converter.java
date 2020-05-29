package ru.job4j.converter;

public class Converter {
        public static int rubleToEuro(int value) {
            int rsl = value / 70;
            return rsl;
        }

        public static int rubleToDollar(int value) {
            int rsl = value / 60;
            return rsl;
        }

        public static void main(String[] args) {
            int euro = Converter.rubleToEuro(140);
            //System.out.println("140 rubles are " + euro + " euro.");
            int dollar = Converter.rubleToDollar(60);
            //System.out.println("60 rubles are " + dollar + " dollar.");

            int expected = 2;
            boolean passed = euro == expected;
            System.out.println("140 rubles are 2. Test result : " + passed);

            int expected2 = 1;
            boolean passed2 = dollar == expected2;
            System.out.println("60 rubles are 1. Test result : " + passed);
        }
    }

