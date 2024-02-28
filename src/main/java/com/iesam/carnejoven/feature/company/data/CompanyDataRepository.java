package com.iesam.carnejoven.feature.company.data;

import com.iesam.carnejoven.feature.company.domain.Company;
import com.iesam.carnejoven.feature.company.domain.CompanyRepository;

public class CompanyDataRepository implements CompanyRepository {

    private static CompanyDataRepository instance= null;

    public static CompanyDataRepository newInstance(){
        if(instance==null){
            instance= new CompanyDataRepository();
        }
        return instance;
    }


    @Override
    public Company createCompany(Company company) {
        return null;
    }

    @Override
    public Company getCompany(String id) {
        return null;
    }
}
