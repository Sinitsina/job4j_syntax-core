package ru.job4j.converter;

/**
 * Convert rubles to Euro and Dollars.
 * @author Olga Sinitsina
 */
public class Converter {
    /**
     * Method rubleToEuro
     * @param value - amount of rubles
     * @return result of division value by 70 (exchange rate of Euro)
     */
        public static int rubleToEuro(int value) {
            int rsl = value / 70;
            return rsl;
        }

    /**
     * Method rubleToDollar
     * @param value - amount of rubles
     * @return result of division value by 60 (exchange rate of Dollar)
     */
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

