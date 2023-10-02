import java.util.Scanner;
public class EsercizioN2 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci la tua Casa");
        String casa = input.nextLine();
        System.out.println("Inserisci il tuo Patronus");
        String patronus = input.nextLine();
        System.out.println("Inserisci la tua Bacchetta");
        String bacchetta = input.nextLine();
        String concatenaInOrdine= casa + " ," + patronus + " ," + bacchetta;
        String concatenaOpposto= bacchetta + ", " + casa + " ," + patronus;
        System.out.println("Concatena in ordine:" + " " +concatenaInOrdine  );
        System.out.println("Concatena in disordine:" + " " +concatenaOpposto  );
        input.close();
    }
}
