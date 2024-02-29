package com.iesam.carnejoven.feature.buy.data;

import com.iesam.carnejoven.feature.buy.data.Local.FileLocalDataSourceBuy;
import com.iesam.carnejoven.feature.buy.domain.Buy;
import com.iesam.carnejoven.feature.buy.domain.BuyRepository;

import java.util.ArrayList;

public class BuyDataRepository implements BuyRepository {
    private static BuyDataRepository instance = null;

    public static BuyDataRepository newInstance() {
        if (instance == null) {
            instance = new BuyDataRepository();
        }
        return instance;
    }

    private FileLocalDataSourceBuy fileLocalDataSourceBuy;

    @Override
    public void createBuy(Buy buy) {
        fileLocalDataSourceBuy.save(buy);
    }

    @Override
    public ArrayList<Buy> getBuys() {
        ArrayList<Buy> buys = new ArrayList<>();
        Buy buy = fileLocalDataSourceBuy.obtain();
        if (buy != null) {
            buys.add(buy);
        }
        return buys;
    }

}
