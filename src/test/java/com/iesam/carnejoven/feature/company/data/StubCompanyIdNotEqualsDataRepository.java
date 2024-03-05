package com.iesam.carnejoven.feature.company.data;

import com.iesam.carnejoven.feature.company.domain.Company;
import com.iesam.carnejoven.feature.company.domain.CompanyRepository;

public class StubCompanyIdNotEqualsDataRepository implements CompanyRepository {
    @Override
    public void createCompany(Company company) {

    }

    @Override
    public Company getCompany(String id) {
        if("1".equals(id)){
            return new Company("1","Siaden","3JFK");
        }
        return null;
    }
}
