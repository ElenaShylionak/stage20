package by.itstep.elena.java.stages.stage20.photCenter.model.entity;

import by.itstep.elena.java.stages.stage20.photCenter.model.entity.abstracts.ServiceOrder;

import java.util.Objects;

public class Retouch extends ServiceOrder {

    private String typeRetouch;
    enum typeRetouch{RECOVERY,ARTISTIC,COLLAGE,CALENDAR
    }

    public Retouch() {
      }

    public Retouch( String typeRetouch, double price) {
        super(price);
        this.typeRetouch = typeRetouch;
    }

    public String getTypeRetouch() {
        return typeRetouch;
    }

    public void setTypeRetouch(String typeRetouch) {
        this.typeRetouch = typeRetouch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Retouch)) return false;
        if (!super.equals(o)) return false;
        Retouch retouch = (Retouch) o;
        return Objects.equals(retouch.typeRetouch, typeRetouch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode() , typeRetouch);
    }

    @Override
    public String toString() {
        return "Retouch{" +
                "typeRetouch='" + typeRetouch + '\'' + super.toString()+
                '}';
    }
    //РЕАЛИЗОВАТЬ КОМПОРАТОР
}
