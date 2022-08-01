package by.itstep.elena.java.stages.stage20.photCenter.controller;
import by.itstep.elena.java.stages.stage20.photCenter.model.entity.abstracts.ServiceOrder;

import by.itstep.elena.java.stages.stage20.photCenter.model.entity.Retouch;
import by.itstep.elena.java.stages.stage20.photCenter.model.entity.PhotoOfDocument;
import by.itstep.elena.java.stages.stage20.photCenter.model.entity.PhotoPrinting;
import by.itstep.elena.java.stages.stage20.photCenter.model.entity.container.PhotoManager;
import by.itstep.elena.java.stages.stage20.photCenter.model.logic.Payment;


public class Main {


    public static void main(String[] args) {

        PhotoOfDocument photoOfDocument = new PhotoOfDocument(5, "PASSPORT", 15); //мои продукты, которые заказывает клиент
        PhotoOfDocument photoOfDocument2= new PhotoOfDocument(10 ,   "VISA" , 20);
        PhotoOfDocument photoOfDocument3= new PhotoOfDocument(13 ,   "VISA" , 22);
        PhotoPrinting photoPrinting = new PhotoPrinting("Matt", 9.13, 33);
        Retouch retouch = new Retouch();
        //

       System.out.println(photoOfDocument);
       System.out.println(photoPrinting);


        PhotoManager photoManager = new PhotoManager(); //создает корзину заказов
        System.out.println(photoManager); //

        photoManager.add(photoOfDocument); //
        photoManager.add(photoOfDocument2);
        photoManager.add(photoOfDocument3);
        photoManager.add(photoPrinting);


        double total = Payment.calculateTotalPrice(photoManager);

        System.out.println(total);
    }
}
