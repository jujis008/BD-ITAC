package br.ita.bditac.ws.client.alerta;

import junit.framework.TestCase;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.ita.bditac.ws.client.CategoriasClient;
import br.ita.bditac.ws.model.Categorias;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CategoriasTest extends TestCase {

    private static final String HOST_URL = "http://localhost:8081";

    @Test
    public void test01GetCategorias() {
        CategoriasClient categoriasClient = new CategoriasClient(HOST_URL);
        Categorias categorias = categoriasClient.getCategorias();
        assertNotNull(categorias);
    }

}
