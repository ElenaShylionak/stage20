package by.itstep.elena.java.stages.stage20.photCenter.model.entity.container;

import by.itstep.elena.java.stages.stage20.photCenter.model.entity.PhotoOfDocument;
import by.itstep.elena.java.stages.stage20.photCenter.model.entity.PhotoPrinting;
import by.itstep.elena.java.stages.stage20.photCenter.model.entity.Retouch;

import java.util.Arrays;

public class PhotoManager {
    PhotoOfDocument[] photoOfDocuments;
    PhotoPrinting[] photoPrintings;
    Retouch[] retouches;

    public PhotoManager() {
        photoOfDocuments = new PhotoOfDocument[0];
        // photoPrintings = new  PhotoPrinting[0];
        // retouches = new Retouch[0];
    }

    public PhotoManager(PhotoOfDocument[] photoOfDocuments , PhotoPrinting[] photoPrintings , Retouch[] retouches) {
        this.photoOfDocuments = photoOfDocuments;
        this.photoPrintings = photoPrintings;
        this.retouches = retouches;
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
}