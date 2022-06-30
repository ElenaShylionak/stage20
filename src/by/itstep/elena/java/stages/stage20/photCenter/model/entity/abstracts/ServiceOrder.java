package by.itstep.elena.java.stages.stage20.photCenter.model.entity.abstracts;
//Это базовый класс имеет важную переменную price, productionTime(время иготовления,
// 2 конструктора, гетеры и сетеры, так как поля приватные

import by.itstep.elena.java.stages.stage20.photCenter.model.entity.exceptions.ServiceOrderWrongPriceException;

public class ServiceOrder {
    private double price; //цена услуги

    private double productionTime; //время иготовления
     enum productionTime { URGENTLY, FORTOMORROW;
         }

    public ServiceOrder() { //дефольный конмструктор
    }

    public ServiceOrder(double price, double productionTime) { //конструктор с параметрами
        this.price = price;
        this.productionTime = productionTime;
    }
    // Методы суперкласса

    public double getPrice() {
        return price;
    }

    public void setPrice(double price)  throws ServiceOrderWrongPriceException {
        this.price = price;
        if (price > 0) {//защита от дурака, цена не может быть мельше нуля
            this.price = price;
        }else {
            throw new ServiceOrderWrongPriceException("Incorrect price data entered"); 
        }
    }

    public double getProductionTime() {
        return productionTime;
    }

    public void setProductionTime(double productionTime) {
        this.productionTime = productionTime;
    }
}
