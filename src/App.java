import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Kovács Dorina, 2022-02-23, Szoft I/N");
        Scanner sc = new Scanner(System.in);

        //kezdet

        String valasztott = "";
        do {

            System.out.println("---------------------");
            System.out.println("1) Program inditas");
            System.out.println("2) Nevjegy");
            System.out.println("3) Kilep");

            System.out.println();
            System.out.println("Valasztas: ");
            valasztott = sc.nextLine();
            switch(valasztott){
                case "1":
                    System.out.println("Program...");
                    
                    double szam = 0;
    
                    do{
                        System.out.print("Szam:");
                        szam = sc.nextDouble();
                            if(szam != 0){
                                double ngyok= Math.sqrt(szam);
                                System.out.printf("Négyzetgyök:%.2f\n", ngyok);
                                }
        }while(szam != 0);
                System.out.println("Folytatashoz enter...");
                sc.nextLine();//Enter olvasas
                sc.nextLine();//Enter varas
                    break;
                case "2":
                    System.out.println("---Nevjegy---");
                    System.out.println("Kovacs Dorina");
                    System.out.println("2022-03-01");
                    System.out.println("Szoft I N");
                    System.out.println("Gyokszamitas");
                    System.out.println("Folytatashoz Enter");
                    sc.nextLine();
                    break;
                case "3":
                    System.out.println("Kilepes...");
                    break;
    
            }
        }while(!valasztott.equals("3"));
        
        //vege
        sc.close();
        
    }
}
