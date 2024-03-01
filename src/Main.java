import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" PRADUGTY");
        System.out.printf("1 SAXAR" + "\n", Glavnyi.saxar);
        System.out.printf("2 TUZ" + "\n", Glavnyi.tuz);
        System.out.printf("3 KALBAZA" + "\n", Glavnyi.kalbaza);
        switch (scanner.nextInt()){

            case 1:
                System.out.println(Glavnyi.saxar + "  SOM  SAXAR");
                System.out.println("PIN KOD JAZ");
                new Scanner(System.in);
                int pin =  1111;
                if (pin==scanner.nextInt()){
                    System.out.println(pin+"\n"+
                            "**********************"+"\n"+ Glavnyi.saxar+" SOM"+
                            "  SAXAR"+"\n"+"DATA 1.02.2024"+"\n"+"💕"+"\n"+"KYRGYZSTAN❤️"+"\n"+ "*******************");



                }

                break;
                    case 2:
                        System.out.println(Glavnyi.tuz + "  SOM ");
                        System.out.println("SOM BEREM ");
                break;

            case 3:
                System.out.println(Glavnyi.kalbaza + "  som KALBASA");
                System.out.println("PIN KOD JAZ");
                new Scanner(System.in);
                int aa =  1111;
                if (aa==scanner.nextInt()){
                    System.out.println(aa+"\n"+
                         "**********************"+"\n"+ Glavnyi.kalbaza+" SOM"+
                            "  KALBASA"+"\n"+"DATA 1.02.2024"+"\n"+"💕"+"\n"+"ZALAL"+"\n"+ "*******************");



                    break;





        }

        }
        }}



