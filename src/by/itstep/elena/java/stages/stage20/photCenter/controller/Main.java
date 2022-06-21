package by.itstep.elena.java.stages.stage20.photCenter.controller;

import by.itstep.elena.java.stages.stage20.photCenter.model.entity.PhotoOfDocument;
import by.itstep.elena.java.stages.stage20.photCenter.model.entity.PhotoPrinting;

public class Main {


    public static void main(String[] args) {

        PhotoOfDocument photoOfDocument = new PhotoOfDocument(10 , 4 , "PASSPORT");
        PhotoPrinting photoPrinting = new PhotoPrinting(3.5 , "Matt" , 9.13);

        System.out.println(photoOfDocument);
        System.out.println(photoPrinting);

    }
}
