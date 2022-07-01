package by.itstep.elena.java.stages.stage20.photCenter.model.entity.container;

import by.itstep.elena.java.stages.stage20.photCenter.model.entity.abstracts.ServiceOrder;
//когда код зависит от абстракции - одна связь, один импорт


public class PhotoManager { //принимает заказ у клиента (так называемая корзина)

    private ServiceOrder[] serviceOrders; //принимаем массив


    public PhotoManager() { // дефолтный конструктор
        serviceOrders = new ServiceOrder[0];
    }

   public PhotoManager(ServiceOrder[] serviceOrders) { // с параметрами
       this();

       if (serviceOrders != null) { //проверяем если не null передаем serviceOrders
            this.serviceOrders = serviceOrders;
       }
    }



      public int getServiceOrdersCount() { //
      return serviceOrders.length;
    }
   public ServiceOrder getServiceOrder(int index) {
        return serviceOrders[index];
   }

    public void setServiceOrders(ServiceOrder[] serviceOrders) {
        this.serviceOrders = serviceOrders;
    }


//    // нужно создать метод добавить - add
    public void add(ServiceOrder serviceOrder) {
        if (serviceOrder == null) {
            return;
       }
        ServiceOrder[] temp = new ServiceOrder[serviceOrders.length + 1];
        int i = 0;
        for (; i < serviceOrders.length; i++) {
       }
        temp[i] = serviceOrder;
        serviceOrders = temp;
    }

    // нужно создать метод удалить - remove

    public void remove(int index) {

       ServiceOrder[] temp = new ServiceOrder[serviceOrders.length - 1];
        for (int i = 0, j = 0; i < serviceOrders.length; i++) {
            if (i != index) {
                temp[j] = serviceOrders[i];
               j++;
           }
        }
        serviceOrders = temp;
    }

    @Override
     //Если больше 2 сток – однозначно лучше использовать StringBuilder.
    // класс StringBuilder не потокобезопасный, но при этом работает быстрее, чем StringBuffer в однопоточных приложениях.

   public String toString() {

        StringBuilder builder = new StringBuilder();

       //проверка не пустой ли заказ
       if (serviceOrders.length == 0) {
            builder.append("Order is empty");
        } else {
           builder.append("Order\n");
       }
       for (ServiceOrder serviceOrder : serviceOrders) {
           builder.append("\n").append(serviceOrder);

        }
        return builder.toString();

    }
}
