package by.itstep.elena.java.stages.stage20.photCenter.model.entity;

import java.util.Objects;

public class PhotoOfDocument {

    private int quantity;
    private String kind;

    enum kind{ PASSPORT, CERTIFICATE, MEDICALBOOK
   }


    public PhotoOfDocument() { //дефолтный конструктор
    }

    public PhotoOfDocument(int quantity) {
        this.quantity = quantity;
    }
        public PhotoOfDocument(int quantity, String kind) { //с параметрами конструктор
        this.kind = kind;
   }
    public String getKind() {
       return kind;
    }

   public void setKind(String kind) {
        this.kind = kind;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PhotoOfDocument)) return false;
        PhotoOfDocument photoDoc = (PhotoOfDocument) o;
        return Objects.equals(quantity, photoDoc.quantity) && Objects.equals(photoDoc, photoDoc.kind);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity, kind); //super.hashCode()
    }

    @Override
    public String toString() {
        return "PhotoOfDocument{" +
                "quantity=" + quantity +
                ", kind='" + kind + '\'' +
                '}';
    }
    //добавить компаратор сбда потом
}



