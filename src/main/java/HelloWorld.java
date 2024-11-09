import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        perimetre();
        mineureOuMajeur();
        launchPairOuPas();

    }

    static void launchPairOuPas() {
        int result;
        Scanner lectureClavier = new Scanner(System.in);
        System.out.print("Entrez un Chiffre : ");
        result = lectureClavier.nextInt();

        if (result % 2 == 0) {
            System.out.print("Pair");
        }else {
            System.out.print("Impair");
        }
    }
    static void perimetre() {
        int result;

        Scanner lectureClavier = new Scanner(System.in);
        System.out.print("Entrez une chaine : ");
        result = lectureClavier.nextInt();

        System.out.println(calculePerimetre(result));
    }
    public static double calculePerimetre (int r) {
        return 2 * Math.PI * r;
    }

    static void mineureOuMajeur () {
        int resultat;
        Scanner lectureClavier = new Scanner(System.in);
        System.out.print("Entrez une votre âge : ");
        resultat = lectureClavier.nextInt();

        if (resultat >= 18) {
            System.out.print("Tu est Majeur ");
        }else {
            System.out.print("Tu est Mineure ");
        }
    }
}
