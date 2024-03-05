package com.iesam.carnejoven.feature.user.domain;


import com.iesam.carnejoven.feature.user.data.StubUserNifEqualsDataRepository;
import com.iesam.carnejoven.feature.user.data.StubUserNifNotEqualsDataRepository;
import com.iesam.carnejoven.feature.user.data.StubUserNullDataRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GetUserUseCaseTest {
    private GetUserUseCase getUserUseCase;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
        getUserUseCase = null;
    }

    @Test
    public void cuandoElClienteEsNulo_elClienteNoExiste_entoncesRetornarNull() {
        //Given: Declaración de variables
        GetUserUseCase getUserUseCase = new GetUserUseCase(new StubUserNullDataRepository());
        String nif = ".";

        //when
        User result = getUserUseCase.execute(nif);
        boolean esNulo = (result == null);

        //then
        Assertions.assertTrue(esNulo);
    }

    @Test
    public void cuandoElClienteNoExiste_elNifNOCoincide_entoncesRetornarNull() {
        //Given: Declaracion de variables
        GetUserUseCase getUserUseCase = new GetUserUseCase(new StubUserNifNotEqualsDataRepository());
        String nif = "2";

        //when
        User result = getUserUseCase.execute(nif);
        boolean noCoincide = (result!=null && result.nif.equals(nif));

        //then
        Assertions.assertFalse(noCoincide);
        //Creo que para el nulo se puede hacer uso del método assertNull();
    }

    @Test
    public void cuandoElClienteExiste_elNifCoincide_entoncesRetornarCliente() {
        //Given
        GetUserUseCase getUserUseCase = new GetUserUseCase(new StubUserNifEqualsDataRepository());
        String nif = "1";

        //when
        User result = getUserUseCase.execute(nif);
        boolean coincide = (result != null && result.nif.equals(nif));

        //then
        Assertions.assertTrue(coincide);
        //Creo que para el nulo se puede hacer uso del método assertEquals();
    }
}