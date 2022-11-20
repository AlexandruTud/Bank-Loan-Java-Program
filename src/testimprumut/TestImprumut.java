package testimprumut;
import java.util.Scanner;
public class TestImprumut {
    public static void main(String[] args) {
        System.out.println("Mini-program pentru imprumut bancar!");
        System.out.println("----------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduceti numele: ");
        String nume = sc.nextLine();
        System.out.print("Introduceti prenumele: ");
        String prenume = sc.nextLine();
        System.out.print("Introduceti adresa: ");
        String adresa = sc.nextLine();
        System.out.print("Introduceti ID-ul de client: ");
        int id = sc.nextInt();
        System.out.print("Introduceti numarul contului: ");
        int nr = sc.nextInt();
        Persoana p = new Persoana();
        Imprumut imp = new Imprumut();
        p.setNume(nume);
        p.setPrenume(prenume);
        p.setAdresa(adresa);
        imp.setId(id);
        imp.setNumarCont(nr);
        System.out.print("Introduceti suma pe care doriti sa o imprumutati: ");
        double s = sc.nextDouble();
        imp.setSuma(s);
        System.out.print("Introduceti 1 pentru Apartament sau 2 pentru Produs Casnic: ");
        int n = sc.nextInt();
        System.out.println("----------------------------------");
        System.out.println("Nume: "+p.getNume()+"\nPrenume: "+p.getPrenume()+"\nAdresa: "+p.getAdresa()+"\nID Cont: "+imp.getId()+"\nNumar cont: "+imp.getNumarCont());
        System.out.println("----------------------------------");
        switch (n) {
            case 1 : {
                System.out.println("Ati selectat optiunea Apartament!");
                System.out.println("La cate luni doriti sa platiti(la o luna sau la 3 luni)! ");
                System.out.print("Scrieti 1 sau 3: ");
                int frec = sc.nextInt();
                int f;
                System.out.println("----------------------------------");
                if(frec == 1){
                    System.out.println("Imprumut: "+imp.suma+"\nRata pe luna timp de un an: "+imp.calculeazaRataImprumutPeLuna());
                    System.out.println("----------------------------------");
                    System.out.print("Scrieti 0 daca NU vreti sa platiti sau 1 daca VRETI sa platiti prima luna: ");
                    f = sc.nextInt();
                    switch (f) {
                        case 0:
                            imp.setFrecventa(f);
                            System.out.println("Suma ramasa pentru plata: "+ imp.getSumaNeplatita());
                            System.out.println("Mai aveti de platit 12 luni!");
                            break;
                        case 1:
                            imp.setFrecventa(f);
                            System.out.println("Suma ramasa pentru plata: "+ imp.getSumaNeplatita());
                            System.out.println("Mai aveti de platit 11 luni!");
                            break;
                        default:
                            System.out.println("Introduceti numarul corect!");
                            break;
                    }
                }else if(frec == 3){
                    System.out.println("Imprumut: "+imp.suma+"\nRata pe luna (cu plata clientului la 3 luni timp de un an): "+imp.calculeazaRataImprumutApartament());
                    System.out.println("----------------------------------");
                    System.out.print("Scrieti 0 daca NU vreti sa platiti sau 3 daca VRETI sa platiti primele 3 luni: ");
                    f = sc.nextInt();
                    switch (f) {
                        case 0:
                            imp.setFrecventa(f);
                            System.out.println("Suma ramasa pentru plata: "+ imp.getSumaNeplatita());
                            System.out.println("Mai aveti de platit 12 luni!");
                            break;
                        case 3:
                            imp.setFrecventa(f);
                            System.out.println("Suma ramasa pentru plata: "+ imp.getSumaNeplatita());
                            System.out.println("Mai aveti de platit 9 luni!");
                            break;
                        default:
                            System.out.println("Introduceti numarul corect!");
                            break;
                    }
                }else{
                    System.out.println("Introduceti 1 sau 3");
                }
                break;
            }
            case 2 : {
                System.out.println("Ati selectat optiunea Produs Casnic!");
                System.out.println("La cate luni doriti sa platiti(la o luna sau la 6 luni)! ");
                System.out.print("Scrieti 1 sau 6: ");
                int frec = sc.nextInt();
                int f;
                System.out.println("----------------------------------");
                if(frec == 1){
                    System.out.println("Imprumut: "+imp.suma+"\nRata pe luna timp de un an: "+imp.calculeazaRataImprumutPeLuna());
                    System.out.println("----------------------------------");
                    System.out.print("Scrieti 0 daca NU vreti sa platiti sau 1 daca VRETI sa platiti prima luna: ");
                    f = sc.nextInt();
                    switch (f) {
                        case 0:
                            imp.setFrecventa(f);
                            System.out.println("Suma ramasa pentru plata: "+ imp.getSumaNeplatita());
                            System.out.println("Mai aveti de platit 12 luni!");
                            break;
                        case 1:
                            imp.setFrecventa(f);
                            System.out.println("Suma ramasa pentru plata: "+ imp.getSumaNeplatita());
                            System.out.println("Mai aveti de platit 11 luni!");
                            break;
                        default:
                            System.out.println("Introduceti numarul corect!");
                            break;
                    }
                }else if(frec == 6){
                    System.out.println("Imprumut: "+imp.suma+"\nRata pe luna (cu plata clientului la 6 luni timp de un an): "+imp.calculeazaRataImprumutProdusCasnic());
                    System.out.println("----------------------------------");
                    System.out.print("Scrieti 0 daca NU vreti sa platiti sau 6 daca VRETI sa platiti primele 6 luni: ");
                    f = sc.nextInt();
                    switch (f) {
                        case 0:
                            imp.setFrecventa(f);
                            System.out.println("Suma ramasa pentru plata: "+ imp.getSumaNeplatita());
                            System.out.println("Mai aveti de platit 12 luni!");
                            break;
                        case 6:
                            imp.setFrecventa(f);
                            System.out.println("Suma ramasa pentru plata: "+ imp.getSumaNeplatita());
                            System.out.println("Mai aveti de platit 6 luni!");
                            break;
                        default:
                            System.out.println("Introduceti numarul corect!");
                            break;
                    }
                    break;
                }else{
                    System.out.print("Introduceti 1 sau 6");
                }
            }
            default : {
                System.out.println("Nu ati introdus 1 sau 2!");
                break;
            }
        }

    }
    
}
