package com.iesam.carnejoven.feature.company.domain;

import com.iesam.carnejoven.feature.company.data.StubCompanyIdEqualsDataRepository;
import com.iesam.carnejoven.feature.company.data.StubCompanyIdNotEqualsDataRepository;
import com.iesam.carnejoven.feature.company.data.StubCompanyNullDataRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GetCompanyUseCaseTest {

    private GetCompanyUseCase getCompanyUseCase;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
        getCompanyUseCase =null;
    }

    @Test
    public void cuandoLaCompaniaNoExiste_retornarNull(){
        //Given
        GetCompanyUseCase getCompanyUseCase= new GetCompanyUseCase(new StubCompanyNullDataRepository());
        String id = "";

        //when
        Company result= getCompanyUseCase.execute(id);
        boolean esNulo= (result==null);

        //then
        Assertions.assertTrue(esNulo);
    }
    @Test
    public void cuandoElIdNoCoincide(){
        //Given
        GetCompanyUseCase getCompanyUseCase= new GetCompanyUseCase(new StubCompanyIdNotEqualsDataRepository());
        String id = "2";

        //when
        Company result= getCompanyUseCase.execute(id);
        boolean esNulo= (result!=null && result.id.equals(id));

        //then
        Assertions.assertFalse(esNulo);
    }

    @Test
    public void cuandoElIddeLaComaniaYElIdQueBuscamosCoincide(){
        //Given
        GetCompanyUseCase getCompanyUseCase= new GetCompanyUseCase(new StubCompanyIdEqualsDataRepository());
        String id = "1";

        //when
        Company result= getCompanyUseCase.execute(id);
        boolean esNulo= (result!=null && result.id.equals(id));

        //then
        Assertions.assertTrue(esNulo);
    }
}