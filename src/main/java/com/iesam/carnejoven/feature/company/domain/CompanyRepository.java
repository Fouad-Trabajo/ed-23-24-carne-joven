package com.iesam.carnejoven.feature.company.domain;

public interface CompanyRepository {
    Company createCompany(Company company);

    Company getCompany(String id);
}
