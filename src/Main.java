import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Deporte deportes[]=new Deporte[100];


        //String deportes[]={"Futbol","Volliball","Baseball","ajedres"};
        deportes[0].setNombreDeporte("Futbool");
        String UsaBalon[]=new String[deportes.length];
        int j=0;
        for(int i=0;i<deportes.length;i++){
            System.out.println("El deporte: "+ deportes[i]+" ¿usa balon? S/N");
            if(scanner.next().equalsIgnoreCase("S")){
                UsaBalon[j]=deportes[i];
                j++;
            }
        }

        System.out.println("Estos deportes son los que utilizan Balon");
        for (int i=0;i<UsaBalon.length;i++){
            System.out.print(UsaBalon[i]+", ");
        }


    }
}
