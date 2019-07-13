public class MegaBytesConverter {

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int YY = kiloBytes / 1024;
            int ZZ = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB " + "= " + YY + " MB and " + ZZ + " KB");

        }
    }
}
