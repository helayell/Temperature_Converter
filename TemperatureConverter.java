import java.util.Scanner;

public class TemperatureConverter {

  // based on the 0 of C
  int celsius = 0;
  int kelvin = 273;
  int fahrenheit = 32;

  private static double celsiusToFahrenheit(double celsius) {
    return (celsius * 9 / 5) + 32;
  }

  private static double fahrenheitToCelsius(double fahrenheit) {
    return (fahrenheit - 32) * 5 / 9;
  }
  private static double fahrenheitToKelvin(double fahrenheit){
    return (fahrenheit - 32) * 5/9 + 273.15;
  }

  private static double celsiusToKelvin(double celsius) {
    return celsius + 273.15;
  }

  private static double kelvinToCelsius(double kelvin) {
    return kelvin - 273.15;
  }
  private static double kelvinToFahrenheit(double kelvin) {
    return (kelvin - 273.15) * 9/5 + 32;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char continueConvert;

    do{
      System.out.println("Enter your temperature value:");
      double temperture = scanner.nextDouble();

      System.out.println("Enter the orginal unit (C for celsius, F for fahrenheit, K for kelvin");
      //Reads the user's first letter input and makes it uppercase
      char unit = scanner.next().toUpperCase().charAt(0);

      switch (unit) {
        case 'C':
          System.out.println("Celsius to Fahrenheit:" + celsiusToFahrenheit(temperture));
          System.out.println("Celsius to Kelvin:" + celsiusToKelvin(temperture));
          break;
        case 'F':
          System.out.println("Fahrenheit to Celsius:" + fahrenheitToCelsius(temperture));
          System.out.println("Fahrenheit to Kelvin:" + fahrenheitToKelvin(temperture));
          break;
        case 'K':
          System.out.println("Kelvin to Celsius:" + kelvinToCelsius(temperture));
          System.out.println("Kelvin to Fahrenheit:" + kelvinToFahrenheit(temperture));
        default:
          System.out.println("Invalid units bro!");
      }
      //Asking the user if they want to continue
      System.out.println("Want another conversion? Y/N ");
      continueConvert = scanner.next().toUpperCase().charAt(0);
    }while (continueConvert == 'Y');

      scanner.close();
    }
}
