package by.itstep.elena.java.stages.stage20.photCenter.model.entity;

//класс сущность

import by.itstep.elena.java.stages.stage20.photCenter.model.entity.abstracts.ServiceOrder;

import java.util.Objects;

public class PhotoPrinting extends ServiceOrder {
   private String photoPaper; //параметр фотобумага
    enum photoPaper{MATT, GLOSSY
    }
    private double photoSize; //параметр формат фото

    public PhotoPrinting() { //дефолтный
    }

    public PhotoPrinting( String photoPaper , double photoSize, double price) { //c параметрами
        super();
        this.photoPaper = photoPaper;
        this.photoSize = photoSize;
    }

    public String getPhotoPaper() {
        return photoPaper;
    }

    public void setPhotoPaper(String photoPaper) {
        this.photoPaper = photoPaper;
    }

    public double getPhotoSize() {
        return photoSize;
    }

    public void setPhotoSize(double photoSize) {
        this.photoSize = photoSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PhotoPrinting)) return false;
        PhotoPrinting photoPrinting = (PhotoPrinting) o;
        return Objects.equals(photoPaper, photoPrinting.photoPaper) && Objects.equals (photoSize, photoPrinting.photoSize );

    }

    @Override
    public int hashCode() {
        return Objects.hash(photoPaper, photoSize);
    }

    @Override
    public String toString() {
        return "PhotoPrinting { " +
                "photoPaper = " + photoPaper + '\'' +
                ", photoSize = " + photoSize + super.toString()+
                '}';
    }
}



