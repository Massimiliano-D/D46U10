public class EsercizioN1 {
    public static void main(String[] args) {
        int risultatoMoltiplica = moltiplica (10, 3);
        System.out.println("Moltiplica" + "=" + " " + risultatoMoltiplica  );

        String risultatoConcatena = concatena ("10", 3 );
        System.out.println("IL TUO RISULTATO=" + risultatoConcatena  );

        String[] arrayIniziale = { "1", "2", "3", "4", "5"};
        String elementoInserito = "elementoInserito";
        String[] nuovoArray = inserisciInArray(arrayIniziale, elementoInserito );
        System.out.println("Nuovo Array:");
        for (String elemento : nuovoArray){
            System.out.println(elemento);
        }

    }
    public static int moltiplica(int a, int b) {
        return a * b;
    }
    public static String concatena(String str, int num ) {
        return str + num;
    }
    public static String[] inserisciInArray(String[] array, String elemento){
        String[] nuovoArray = new String[6];
        nuovoArray[0] = array[0];
        nuovoArray[1] = array[1];
        nuovoArray[2] = elemento;
        nuovoArray[3] = array[3];
        nuovoArray[4] = array[4];

        return  nuovoArray;
    }
};
