package com.iesam.carnejoven.feature.company.data;

import com.iesam.carnejoven.feature.company.data.Local.FileLocalDataSourceCompany;
import com.iesam.carnejoven.feature.company.domain.Company;
import com.iesam.carnejoven.feature.company.domain.CompanyRepository;

import java.util.ArrayList;

public class CompanyDataRepository implements CompanyRepository {

    private static FileLocalDataSourceCompany fileLocalDataSourceCompany;

    private static CompanyDataRepository instance = null;

    public static CompanyDataRepository newInstance() {
        if (instance == null) {
            instance = new CompanyDataRepository();
            fileLocalDataSourceCompany= new FileLocalDataSourceCompany();
        }
        return instance;
    }


    @Override
    public void createCompany(Company company) {
        fileLocalDataSourceCompany.save(company);
    }

    @Override
    public Company getCompany(String id) {
        Company company = fileLocalDataSourceCompany.obtain();
        if(company !=null && company.id.equals(id)){
            return company;
        }

        return null;
    }

}
