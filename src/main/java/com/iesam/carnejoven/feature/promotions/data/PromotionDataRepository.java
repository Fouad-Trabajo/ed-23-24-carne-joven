package com.iesam.carnejoven.feature.promotions.data;

import com.iesam.carnejoven.feature.promotions.data.Local.FileLocalDataSourcePromotions;
import com.iesam.carnejoven.feature.promotions.domain.PromotionRepository;
import com.iesam.carnejoven.feature.promotions.domain.models.Promotion;

import java.util.ArrayList;

public class PromotionDataRepository implements PromotionRepository {


    //Instancia de fichero
    private static FileLocalDataSourcePromotions fileLocalDataSourcePromotions;

    //Instancia de patrón Singleton
    private static PromotionDataRepository instance = null;

    //Implementación de patrón de dieseño: SingleTon
    public static PromotionDataRepository newInstance() {
        if (instance == null) {
            instance = new PromotionDataRepository();
            fileLocalDataSourcePromotions= new FileLocalDataSourcePromotions();
        }   //Inicialización de fichero

        return instance;
    }


    @Override
    public void createPromotion(Promotion promotion) {
        fileLocalDataSourcePromotions.save(promotion); // Guardar la promoción en el archivo
    }

    @Override
    public void deletePromotion(String id) {
        fileLocalDataSourcePromotions.deleteById(id);
    }

    @Override
    public Promotion getPromotion(String id) {
        return fileLocalDataSourcePromotions.obtain(id);
    }




    @Override
    public ArrayList<Promotion> getPromotions() {
       return fileLocalDataSourcePromotions.obtainAll();
    }
}
