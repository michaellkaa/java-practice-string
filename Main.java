import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Metody startsWith(), endsWith() a contains()
        /*
        String slovo = "nejzdevetadevadesateronasobitelnejsiho";
        System.out.println(slovo.startsWith("nejz"));
        System.out.println(slovo.startsWith("nez"));
        System.out.println(slovo.contains("devet"));
        System.out.println(slovo.endsWith("siho"));
        */

        //Metoda isEmpty()
        /*
        String vstup1 = " ";
        String vstup2 = "";
        String vstup3 = "good";
        System.out.println(vstup1.isEmpty());
        System.out.println(vstup2.isEmpty());
        System.out.println(vstup3.isEmpty());
        */

        //Metody toUpperCase() a toLowerCase()
        /*
        String settings = "dArk fuLLsCreen AUTOSAVE";
        settings = settings.toLowerCase();
        System.out.println("Bude mít dark mode?");
        System.out.println(settings.contains("dark"));
        System.out.println("Bude mít shadows?");
        System.out.println(settings.contains("shadows"));
        System.out.println("Fullscreen?");
        System.out.println(settings.contains("fullscreen"));
        System.out.println("Bude mít autosave?");
        System.out.println(settings.contains("autosave"));
        */

        //Metoda trim()
        /*
        System.out.println("Zadejte číslo:");
        Scanner scanner = new Scanner(System.in, "Windows-1250");
        String vstup = scanner.nextLine();
        System.out.println("Zadal jste text: " + vstup);
        System.out.println("Text po funkci trim: " + vstup.trim());
        int cislo = Integer.parseInt(vstup.trim());
        System.out.println("Převedl jsem zadaný text na číslo parsováním, zadal jste: " + cislo);
        */

        //Metoda replace()
        /*
        String veta = "Nesnáším tě";
        veta = veta.replace("Nesnáším", "Miluju");
        System.out.println(veta);
        */

        //Metoda format()
        //%d pro celá čísla, %s pro String, %f pro float nebo double (reálná čísla). Můžeme taktéž definovat délku desetinné části, např. %.2f pro dvě desetinná místa
        /*
        int a = 20;
        int b = 10;
        int soucet = a+b;
        String veta =  String.format("Když sečteme %d a %d dostaneme %d.",a,b,soucet);
        System.out.println(veta);
        */

        //Metoda length()
        //těžší
        /*
        System.out.println("Zadejte vaše jméno: ");
        Scanner scanner = new Scanner(System.in, "Windows-1250");
        String jmeno = scanner.nextLine();
        int cislo = jmeno.length();
        String veta = String.format("Délka vašeho jména %s je %d znaků",jmeno, cislo);
        System.out.println(veta);
        */
        //lehčí
        /*
        System.out.println("Zadejte vaše jméno:");
        String jmeno = scanner.nextLine();
        System.out.printf("Délka vašeho jména je: %d znaků", jmeno.length()); //printf je formatovany text
        */
    }
}