package com.iesam.carnejoven.feature.company.domain;

public interface CompanyRepository {
    void createCompany(Company company);

    Company getCompany(String id);
}
