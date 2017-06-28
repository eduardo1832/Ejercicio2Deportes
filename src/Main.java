import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Deporte deportes[]=new Deporte[5];


        deportes[0]=new Deporte();
        deportes[0].setNombreDeporte("Futbool");
        deportes[1]=new Deporte();
        deportes[1].setNombreDeporte("Volliball");
        deportes[2]=new Deporte();
        deportes[2].setNombreDeporte("BaseBall");
        deportes[3]=new Deporte();
        deportes[3].setNombreDeporte("Ajedrez");
        deportes[4]=new Deporte();
        deportes[4].setNombreDeporte("PingPong");

        for(int i=0;i<deportes.length;i++){
            System.out.println("El deporte: "+ deportes[i].getNombreDeporte()+" ¿usa balon? S/N");
            if(scanner.next().equalsIgnoreCase("S"))
                deportes[i].setUsaBalon(true);
            else
                deportes[i].setUsaBalon(false);
        }

        System.out.println("Estos deportes son los que utilizan Balon");

        for (int i=0;i<deportes.length;i++){
            if(deportes[i].isUsaBalon())
                System.out.print(deportes[i].getNombreDeporte()+", ");
        }


    }
}
