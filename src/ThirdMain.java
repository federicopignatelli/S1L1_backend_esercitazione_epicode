public class ThirdMain {
    public static void main(String[] args){

        int perimetro = perimetroRettangolo(20, 30);
        System.out.println(perimetro);

        int PariODispari = pariDispari(30);
        System.out.println(PariODispari);
    }

    public static int perimetroRettangolo (int base, int altezza) {
        return base*2 + altezza*2;
    }

    public static int pariDispari (int number){
        if (number % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }

}
