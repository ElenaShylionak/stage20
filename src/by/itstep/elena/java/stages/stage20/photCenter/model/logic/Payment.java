package by.itstep.elena.java.stages.stage20.photCenter.model.logic;
import by.itstep.elena.java.stages.stage20.photCenter.model.entity.abstracts.ServiceOrder;

import by.itstep.elena.java.stages.stage20.photCenter.model.entity.container.PhotoManager;

public class Payment { //оплата услуги, продавец
    ///

    public Payment() { //дефолтный конструктор
    }
    //главный метод, который считает цену услуги
        public static double calculateTotalPrice(PhotoManager photoManager) {

        double total = 0;

            for (int i = 0; i < photoManager.getServiceOrdersCount() ; i++) {
                total += photoManager.getServiceOrders(i).getPrice();
                
            }

        return total;

    }
}
