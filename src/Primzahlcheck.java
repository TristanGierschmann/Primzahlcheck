public class Primzahlcheck {

    // Methode die Überpfrüft ob übergebene Zahl eine Primzahl ist
    public static boolean istPrimzahl(int zahl) {
        if (zahl <= 1){     // 1 ist keine Primzahl --> false
            return false;
        }
        else if (zahl > 1) {
            for (int i = 2; i < zahl; i++) {     // Wenn zahl > 1: Primzahlprüfung
                if (zahl % i == 0) return false;
            }
        }
    return true;
    }
    public static void main(String[] args){
        System.out.println(istPrimzahl(6));
    }
}
