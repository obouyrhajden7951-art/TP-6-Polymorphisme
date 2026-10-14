package exercice2;

public class MediaLibrary {
    private Media[] items = new Media[4];
    private int count = 0;

    public MediaLibrary() {
    }

    public void add(Media m) {
        // si le tableau est plein, on le agrandit
        if (count == items.length) {
            Media[] tmp = new Media[items.length * 2];
            for (int i = 0; i < items.length; i++) {
                tmp[i] = items[i];
            }
            items = tmp;
        }
        items[count] = m;
        count++;
    }

    public void playAll() {
        System.out.println("=== Lecture de la bibliothèque ===");
        for (int i = 0; i < count; i++) {
            items[i].lire();
        }
    }

    public int totalDuration() {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            int d = items[i].getDuree();
            if (d > 0) {
                sum = sum + d; // on ignore les -1
            }
        }
        return sum;
    }
}