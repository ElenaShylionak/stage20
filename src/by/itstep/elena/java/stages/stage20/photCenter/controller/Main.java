package by.itstep.elena.java.stages.stage20.photCenter.controller;
import by.itstep.elena.java.stages.stage20.photCenter.model.entity.abstracts.ServiceOrder;

import by.itstep.elena.java.stages.stage20.photCenter.model.entity.Retouch;
import by.itstep.elena.java.stages.stage20.photCenter.model.entity.PhotoOfDocument;
import by.itstep.elena.java.stages.stage20.photCenter.model.entity.PhotoPrinting;
import by.itstep.elena.java.stages.stage20.photCenter.model.entity.container.PhotoManager;
import by.itstep.elena.java.stages.stage20.photCenter.model.logic.Payment;


public class Main {


    public static void main(String[] args) {

        PhotoOfDocument photoOfDocument = new PhotoOfDocument(5 ,   4 , "PASSPORT"); //мои продукты, которые заказывает клиент
        PhotoOfDocument photoOfDocument2= new PhotoOfDocument(10 ,   6 , "PASSPORT");
        PhotoOfDocument photoOfDocument3= new PhotoOfDocument(13 ,   10 , "VISA");
        PhotoPrinting photoPrinting = new PhotoPrinting(3.5, "Matt" , 9.13);
        Retouch retouch = new Retouch(15,"Art");

        System.out.println(photoOfDocument);
       System.out.println(photoPrinting);
       System.out.println(retouch);

        PhotoManager photoManager = new PhotoManager(); //создает корзину заказов
        System.out.println(photoManager); //

        photoManager.add(photoOfDocument); //
        photoManager.add(photoOfDocument2);
        photoManager.add(photoOfDocument3);
        photoManager.add(photoPrinting);
        photoManager.add(retouch);

        double total = Payment.calculateTotalPrice(photoManager);

        System.out.println(total);
    }
}
