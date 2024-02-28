package com.iesam.carnejoven.feature.company.domain;

public class CreateCompanyUseCase {
    private CompanyRepository companyRepository;

    public CreateCompanyUseCase(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public void execute(Company company){
        companyRepository.createCompany(company);
    }
}
