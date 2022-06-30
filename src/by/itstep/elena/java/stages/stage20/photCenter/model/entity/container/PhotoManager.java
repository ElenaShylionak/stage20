package by.itstep.elena.java.stages.stage20.photCenter.model.entity.container;

import by.itstep.elena.java.stages.stage20.photCenter.model.entity.PhotoOfDocument;
import by.itstep.elena.java.stages.stage20.photCenter.model.entity.abstracts.ServiceOrder;

import java.util.Arrays; //аналог Корзины

public class PhotoManager {
///дописать и исправить ошибки. НЕ ХВАТАЕТ МЕТОДОВ
    ServiceOrder serviceOrder;

    public PhotoManager() { // дефолтный
        serviceOrder = new ServiceOrder[0];
    }
    public PhotoManager(ServiceOrder serviceOrders) { // с параметрами
        this ();
        if (serviceOrders == null){
            this.serviceOrder = serviceOrders;
        }
    }

    // нужно создать метод добавить - add
    public void add(PhotoOfDocument photoOfDocument) {
        PhotoOfDocument[] temp = new PhotoOfDocument[photoOfDocuments.length + 1];
        int i = 0;
        for (; i < photoOfDocuments.length; i++) {
            temp[i] = photoOfDocuments[i];
        }
        temp[i] = photoOfDocument;
        photoOfDocuments = temp;
    }

    //нужно создать метод удалить - remove

    public void removePhotoOfDocument(int index) {

        PhotoOfDocument[] temp = new PhotoOfDocument[photoOfDocuments.length - 1];
        for (int i = 0, j = 0; i < photoOfDocuments.length; i++) {
            if (i != index) {
                temp[j] = photoOfDocuments[i];
                j++;
            }
        }
        photoOfDocuments = temp;
    }

    @Override
    public String toString() {
        return "PhotoManager{" +
                "photoOfDocuments=" + Arrays.toString(photoOfDocuments) +
                ", photoPrintings=" + Arrays.toString(photoPrintings) +
                ", retouches=" + Arrays.toString(retouches) +
                '}';
    }
    // @Override
    //Если больше 2 сток – однозначно лучше использовать StringBuilder.
    //класс StringBuilder не потокобезопасный, но при этом работает быстрее, чем StringBuffer в однопоточных приложениях.

   // public String toString() {

//        StringBuilder builder = new StringBuilder();
//
//        //проверка не пустой ли заказ
//        if ((photoOfDocuments == null || photoPrintings == null || retouches == null) ||
//                (photoOfDocuments.length == 0 && photoPrintings.length == 0 && retouches.length == 0)) {
//            builder.append("Order is empty");
//        } else {
//            builder.append("Order\n");
//        }
//        for (PhotoOfDocument photoOfDocuments : photoOfDocuments){
//                builder.append("\n").append(photoOfDocuments);
//        for (PhotoPrinting photoPrintings: photoPrintings) {
//            builder.append("\n").append(photoPrintings);
//        }
//
//    }
//    return builder.toString();

    }
