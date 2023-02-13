
    
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Calculadoratest {
    @Test
    public void testSuma() {
        Calculadora miCalculadora = new Calculadora();
        assertEquals(10, miCalculadora.suma(8, 2));

    }

    @Test
    public void testresta() {
        Calculadora miCalculadora = new Calculadora();
        assertEquals(6, miCalculadora.resta(8 , 2));
    }

    @ParameterizedTest
    @CsvSource({
        "39,10,29",
        "110,40,70",
        "16,6,10"
    })
    @DisplayName ("Test Suma")

    public void testSuma(int resultado, int a , int b ){
        Calculadora miCalculadora = new Calculadora();
        assertEquals(resultado , miCalculadora.suma(a,b));
    }
}
