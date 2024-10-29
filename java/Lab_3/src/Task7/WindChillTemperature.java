package Task7;

import java.util.Scanner;

/**
 * @author Tsimoshchenko M.V, Kudryavets D.E
 * @version 1.0
 */
public class WindChillTemperature {

    public static void main(String[] args) {

        Scanner inputTemperature = new Scanner(System.in);
        System.out.print("Температура в градусах Цельсия: ");
        double temperature = inputTemperature.nextDouble(); // Температура в градусах Цельсия
        Scanner inputWindSpeed = new Scanner(System.in);
        System.out.print("Скорость ветра в м/с: ");
        double windSpeed = inputWindSpeed.nextDouble(); // Скорость ветра в м/с
        Scanner inputHumidity = new Scanner(System.in);
        System.out.print("Влажность в процентах: ");
        double humidity = inputHumidity.nextDouble(); // Влажность в процентах

        double effectiveTemperature = calculateEffectiveTemperature(temperature, windSpeed, humidity);
        System.out.println("Эффективная температура согласно формуле Б.А.Айзенштата: " + effectiveTemperature + " °C");
    }

    public static double calculateEffectiveTemperature(double temperature, double windSpeed, double humidity) {
        // Пример формулы для расчета эффективной температуры
        double EET = temperature * (1-0.003*(100-humidity))-0.385*Math.pow(windSpeed, 0.59)*((36.6-temperature)+0.622*(windSpeed-1))+((0.0015*windSpeed+0.008)*(36.6-temperature)-0.0167)*(100-humidity);

        return EET;
    }
}

