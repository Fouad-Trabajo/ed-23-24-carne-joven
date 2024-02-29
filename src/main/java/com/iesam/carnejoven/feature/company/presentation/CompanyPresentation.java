package com.iesam.carnejoven.feature.company.presentation;

import com.iesam.carnejoven.feature.company.data.CompanyDataRepository;
import com.iesam.carnejoven.feature.company.domain.Company;
import com.iesam.carnejoven.feature.company.domain.CreateCompanyUseCase;
import com.iesam.carnejoven.feature.company.domain.GetCompanyUseCase;


public class CompanyPresentation {

    public static void createCompany(Company company){
        CompanyDataRepository companyDataRepository=  CompanyDataRepository.newInstance();
        CreateCompanyUseCase createCompanyUseCase= new CreateCompanyUseCase(companyDataRepository);
        createCompanyUseCase.execute(company);
    }

    public static  void obtainCompany(String id){
        GetCompanyUseCase getCompanyUseCase= new GetCompanyUseCase(CompanyDataRepository.newInstance());
        Company company= getCompanyUseCase.execute(id);
        System.out.println(company.id);
    }
}
