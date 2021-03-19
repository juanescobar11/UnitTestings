package co.com.sofka.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App
{
    private static final Logger logger = LoggerFactory.getLogger(App.class );

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in ) );

        System.out.println( "Ingresa un número " );
        String textNumber1 = bufferedReader.readLine();

        System.out.println( "Ingresa un segundo número " );
        String textNumber2 = bufferedReader.readLine();

        Long number1 = Long.valueOf( textNumber1 );
        Long number2 = Long.valueOf( textNumber2 );

        BasicCalculator calculator = new BasicCalculator();
        Long resultSuma = calculator.suma( number1, number2 );
        Long resultResta = calculator.resta( number1, number2 );
        Long resultMultiplicacion = calculator.multiplicacion( number1, number2 );
        Long resultDivision = calculator.division( number1, number2 );

        System.out.println( number1 + " + " + number2 + " = " + resultSuma);
        System.out.println( number1 + " - " + number2 + " = " + resultResta);
        System.out.println( number1 + " * " + number2 + " = " + resultMultiplicacion);
        System.out.println( number1 + " / " + number2 + " = " + resultDivision);
    }
}
