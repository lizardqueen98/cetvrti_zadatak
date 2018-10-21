package ba.unsa.etf.rpr.predavanje03;
import java.util.*;
public class Program {
    public static void main(String[] args) {
        int br_predmeta=0,br_studenata=0;
        Student[] studenti=new Student[100];
        Predmet[] predmeti = new Predmet[100];
        System.out.println("1-unos predmeta\n2-unos studenta\n3-upis studenta na predmet\n4-ispis studenta sa predmeta\n5-brisanje predmeta\n6-brisanje studenta\n7-lista");
        Scanner ulaz=new Scanner(System.in);
        int unos=ulaz.nextInt();
        switch (unos){
            case 1:{
                System.out.println("Unesite naziv, sifru i maksimalan broj upisanih studenata.");
                        String naziv=ulaz.nextLine();
                int sifra=ulaz.nextInt();
                int max=ulaz.nextInt();
              predmeti[br_predmeta]=new Predmet(naziv,sifra,max);
              br_predmeta++;
            }
            case 2:{
                System.out.println("Unesite ime, prezime i broj indeksa.");
                String ime=ulaz.nextLine();
                String prezime=ulaz.nextLine();
                int br=ulaz.nextInt();
                studenti[br_studenata]=new Student(ime,prezime,br);
            }
            case 3:{

            }
            case 4:{

            }
            case 5:{

            }
            case 6:{

            }
            case 7:{

            }
        }
    }
}
