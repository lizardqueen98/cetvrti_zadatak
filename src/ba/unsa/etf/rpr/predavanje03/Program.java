package ba.unsa.etf.rpr.predavanje03;
import java.util.*;
public class Program {
    public static void main(String[] args) {
        int br_predmeta = 0, br_studenata = 0;
        Student[] studenti = new Student[100];
        Predmet[] predmeti = new Predmet[100];
        for (int k = 0; k < 100; k++) {
            System.out.println("1-unos predmeta\n2-unos studenta\n3-upis studenta na predmet\n4-ispis studenta sa predmeta\n5-brisanje predmeta\n6-brisanje studenta\n7-lista\n8-izlaz");
            Scanner ulaz = new Scanner(System.in);
            int unos = ulaz.nextInt();
            ulaz.nextLine();
            switch (unos) {
                case 1: {
                    System.out.println("Unesite naziv, sifru i maksimalan broj upisanih studenata.");
                    String naziv = ulaz.nextLine();
                    int sifra = ulaz.nextInt();
                    int max = ulaz.nextInt();
                    predmeti[br_predmeta] = new Predmet(naziv, sifra, max);
                    br_predmeta++;
                }
                break;
                case 2: {
                    System.out.println("Unesite ime, prezime i broj indeksa.");
                    String ime = ulaz.nextLine();
                    String prezime = ulaz.nextLine();
                    int br = ulaz.nextInt();
                    studenti[br_studenata] = new Student(ime, prezime, br);
                    br_studenata++;
                }
                break;
                case 3: {
                    System.out.println("Unesi broj indeksa.");
                    int ind = ulaz.nextInt();
                    System.out.println("Unesi sifru predmeta.");
                    int sifra = ulaz.nextInt();
                    for (int i = 0; i < br_predmeta; i++) {
                        if (predmeti[i].getSifra_predmeta() == sifra) {
                            for (int j = 0; j < br_studenata; j++) {
                                if (studenti[j].getBroj_indeksa() == ind) {
                                    predmeti[i].upisi(studenti[j]);
                                }
                            }
                        }
                    }
                }
                break;
                case 4: {
                    System.out.println("Unesi broj indeksa.");
                    int ind = ulaz.nextInt();
                    System.out.println("Unesi sifru predmeta.");
                    int sifra = ulaz.nextInt();
                    for (int i = 0; i < br_predmeta; i++) {
                        if (predmeti[i].getSifra_predmeta() == sifra) {
                            for (int j = 0; j < br_studenata; j++) {
                                if (studenti[j].getBroj_indeksa() == ind) {
                                    predmeti[i].ispisi(studenti[j]);
                                }
                            }
                        }
                    }
                }
                break;
                case 5: {
                    System.out.println("Unesi sifru predmeta.");
                    int sifra = ulaz.nextInt();
                    for (int i = 0; i < br_predmeta; i++) {
                        if (predmeti[i].getSifra_predmeta() == sifra) {
                            for (int j = i; j < br_predmeta - 1; j++) {
                                predmeti[j] = predmeti[j + 1];
                            }
                        }
                    }
                    br_predmeta--;
                }
                break;
                case 6: {
                    System.out.println("Unesi broj indeksa.");
                    int ind = ulaz.nextInt();
                    for (int i = 0; i < br_studenata; i++) {
                        if (studenti[i].getBroj_indeksa() == ind) {
                            for (int j = i; j < br_studenata - 1; j++) {
                                studenti[j] = studenti[j + 1];
                            }
                        }
                    }
                    br_studenata--;
                }
                break;
                case 7: {
                    System.out.println("Unesi sifru predmeta.");
                    int sifra = ulaz.nextInt();
                    for (int i = 0; i < br_predmeta; i++) {
                        if (predmeti[i].getSifra_predmeta() == sifra) {
                            predmeti[i].ispisSpisakStudenata();
                        }
                    }
                }
                break;
                case 8:{
                    System.exit(0);
                }
            }
        }
    }
}
