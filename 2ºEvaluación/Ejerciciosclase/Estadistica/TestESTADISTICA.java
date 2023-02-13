import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestESTADISTICA {
    @Test
    public void testMayor(){
        ESTADISTICA estadistica = new ESTADISTICA();

          assertEquals(5, estadistica.mayor());
    }

}
