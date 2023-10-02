public class EsercizioN1 {
    public static void main(String[] args) {
        int risultatoMoltiplica = moltiplica (10, 3);
        System.out.println("Moltiplica" + "=" + " " + risultatoMoltiplica  );

        String risultatoConcatena = concatena ("10", 3 );
        System.out.println("IL TUO RISULTATO=" + risultatoConcatena  );
        
    }
    public static int moltiplica(int a, int b) {
        return a * b;
    }
    public static String concatena(String str, int num ) {
        return str + num;
    }
};
