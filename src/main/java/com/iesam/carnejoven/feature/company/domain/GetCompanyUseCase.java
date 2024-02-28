package com.iesam.carnejoven.feature.company.domain;

public class GetCompanyUseCase {
    private CompanyRepository companyRepository;

    public GetCompanyUseCase(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public Company execute(String id){
        return this.companyRepository.getCompany(id);
    }
}
