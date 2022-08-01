package by.itstep.elena.java.stages.stage20.photCenter.model.entity.abstracts;
//Это базовый класс имеет важную переменную price
// 2 конструктора, гетеры и сетеры, так как поля приватные

import by.itstep.elena.java.stages.stage20.photCenter.model.entity.exceptions.ServiceOrderWrongPriceException;

import java.util.Objects; //аналог продуктов


public class ServiceOrder {
    private double price; //цена услуги

    public ServiceOrder() { //дефолтный конструктор
    }

    public ServiceOrder(double price) { //конструктор с параметрами
        this.price = price;
    }

    public double getPrice() { //так как поля приватные метод get
        return price;
    }

      public void setPrice(double price) throws ServiceOrderWrongPriceException{ //будем генерировать логический Exception
        //Если цена нормальная, то мы изменяем состояние, а если нет, то в нашем случае ничего не происходит - void
        //А это значит если клиент вводит значение неправильное, программа ничего не возвращает
        //Единственный способ что-то возвратить – это генерировать Ошибку. В нашем случае, логический Exception

        if (price > 0) {//защита от дурака, цена не может быть меньше нуля
            this.price = price;
        }else {
            throw new ServiceOrderWrongPriceException("Incorrect price data entered");
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ServiceOrder)) return false;
        ServiceOrder serviceOrder = (ServiceOrder) o;
        return Double.compare(serviceOrder.price , price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price);
    }

    @Override
    public String toString() {
        return "ServiceOrder{" +
                "price=" + price +
                '}';
    }
}
