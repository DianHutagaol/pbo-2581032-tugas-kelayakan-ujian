import java.util.Scanner;

public class KelayakanUjian{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kehadiran (%) : ");
        int kehadiran = scanner.nextInt();

        System.out.print("Nilai tugas : ");
        int nilaiTugas = scanner.nextInt();

        System.out.print("Dispensasi : ");
        boolean dispensasi = scanner.nextBoolean();

        System.out.println("\n-----Kelayakan Ujian-----");
        System.out.println("Kehadiran   : " + kehadiran + "%");
        System.out.println("Nilai tugas : " + nilaiTugas);
        System.out.println("Dispensasi  : " + dispensasi);
        System.out.println();

        boolean a = kehadiran >= 75 && nilaiTugas >= 60 || dispensasi;
        boolean b = (kehadiran >= 75 && nilaiTugas >= 60) || dispensasi;
        boolean c = kehadiran >= 75 && (nilaiTugas >= 60) || dispensasi;

        boolean tidakDispensasi = !dispensasi;

        System.out.println("a (tanpa kurung) : " + a);
        System.out.println("b (kurung precedence) : " + b);
        System.out.println("c (kurung digeser) : " + c);
        System.out.println("!dispensasi : " + tidakDispensasi);

        /*Berdasarkan hasil pengujian program, operator && (AND) memiliki prioritas (precedence) yang lebih tinggi dibandingkan operator || (OR). Jadi 'a' ditulis mengunakan tanpa tanda kurung sedangkan 'b' menggunakan tanda kurung*/

        scanner.close();
    }
}

