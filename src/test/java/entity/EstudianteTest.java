package entity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EstudianteTest {
    private Estudiante e;


    @Before
    public void before() throws Exception {
        e = new Estudiante(210846,"maria ");

    }

    @Test
    public void testMetodoToString() {
        String esperado = "estudiante{carnet=210846, nombre='maria'}";
        String obtenido = e.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}