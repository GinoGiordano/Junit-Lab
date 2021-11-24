import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class mathFunctionsTest {

    private mathFunctions mathfunctions = new mathFunctions();

    @Test
    public void esPrimoTest(){
        boolean result = mathfunctions.esPrimo(5);
        assertTrue(result);
    }

    @Test
    public void noesPrimoTest0(){
        boolean result = mathfunctions.esPrimo(0);
        assertFalse(result);
    }

    @Test
    public void esPrimoTest2(){
        boolean result = mathfunctions.esPrimo(6);
        assertFalse(result);
    }

    @Test
    public void esmultiplo(){
        boolean result = mathfunctions.esMultiplo(4,2);
        assertTrue(result);
    }

    @Test
    public void esmultiplo2(){
        boolean result = mathfunctions.esMultiplo(3,2);
        assertFalse(result);
    }

    @Test
    public void esmultiploNegative(){
        boolean result = mathfunctions.esMultiplo(-4,2);
        assertTrue(result);
    }
    @Test
    public void estaPresente(){
        boolean result = mathfunctions.estaPresente(4256,3);
        assertTrue(result);
    }

    @Test
    public void noestaPresente(){
        boolean result = mathfunctions.estaPresente(456,2);
        assertFalse(result);
    }
}
