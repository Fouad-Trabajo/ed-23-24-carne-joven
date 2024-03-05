package com.iesam.carnejoven.feature.company.data;

import com.iesam.carnejoven.feature.company.domain.Company;
import com.iesam.carnejoven.feature.company.domain.CompanyRepository;

public class StubCompanyNullDataRepository implements CompanyRepository {
    @Override
    public void createCompany(Company company) {

    }

    @Override
    public Company getCompany(String id) {
        return null;
    }
}
