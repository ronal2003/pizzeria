public class Clae1 {

    public static void main(String[] args) {

        int numero[] = new int[10];

        for(int i=0; i<numero.length; i++){
            numero[i] = (int) (Math.random()*100);
            System.out.println(numero[i]);
        }
    }
}
