import javax.swing.*;

public class pizza {
    String pizza[][] = new String[3][2];
    int pedidos[][] = new int[3][3];
    int Valor_pizza = 5000, jamon = 500, peperoni = 900, pollo = 700, tomate = 300, atun = 1200, albaca = 400, champiñones = 800, pedido=0;
    int Pizza;

    public pizza() {
        menu();
    }

    public void menup(){
        String opcion = JOptionPane.showInputDialog("Ingredientes \n\n" +
                "1. jamon $ 500 \n" +
                "2. peperoni $ 900 \n" +
                "3. pollo $ 700 \n" +
                "4. tomate $ 300 \n" +
                "5. atun $ 1200 \n" +
                "6. albaca $ 400 \n" +
                "7. champiñones $ 800\n" +
                "8. dejar de pedir \n");

        switch (opcion) {

            case "1":



                Valor_pizza += jamon++;
                if (JOptionPane.showConfirmDialog(null, "Desea elegir mas ingredinetes? ") == 0) {
                    menup();
                } else {
                    int result =  Valor_pizza += jamon++;


                    JOptionPane.showMessageDialog(null, "Total de pedidos"+ result);
                }

                if(pedido > 0){
                    pedido++;
                    if(pedido > 6){
                        JOptionPane.showMessageDialog(null, "No puedes hacer mas de 5 pedidos");
                    } else {
                        menup();
                    }
                    if(opcion.equals(4)){
                        JOptionPane.showMessageDialog(null, "No puede pedir mas de 4 ingrdientes");
                    }
                }
                break;
            case "2":
                Valor_pizza += peperoni;
                if (JOptionPane.showConfirmDialog(null, "Desea elegir mas ingredinetes? ") == 0) {
                    menup();
                } else {
                    int result =  Valor_pizza += peperoni;



                    JOptionPane.showMessageDialog(null, "Total de pedidos"+ result);
                }
                break;
            case "3":
                if (JOptionPane.showConfirmDialog(null, "Desea elegir mas ingredinetes? ") == 0) {
                    menup();
                } else {
                    int result =  Valor_pizza ++;
                    int ressult =+ pollo++;
                    int total2 = Valor_pizza += pollo;


                    JOptionPane.showMessageDialog(null, "Total de pedidos"+ total2);
                }
                break;
            case "4":
                if (JOptionPane.showConfirmDialog(null, "Desea elegir mas ingredinetes? ") == 0) {
                    menup();
                } else {
                    int result =  Valor_pizza ++;
                    int ressult =+ tomate++;

                    int total3 = result + ressult;


                    JOptionPane.showMessageDialog(null, "Total de pedidos"+ total3);
                }
                break;
            case "5":
                if (JOptionPane.showConfirmDialog(null, "Desea elegir mas ingredinetes? ") == 0) {
                    menup();
                } else {
                    int result =  Valor_pizza ++;
                    int ressult =+ atun++;
                    int total4 = result + ressult;

                    JOptionPane.showMessageDialog(null, "Total de pedidos"+ total4);
                }
                break;

            case "6":
                if (JOptionPane.showConfirmDialog(null, "Desea elegir mas ingredinetes? ") == 0) {
                    menup();
                } else {
                    int result =  Valor_pizza ++;
                    int ressult =+ albaca++;
                    int total5 = result + ressult;

                    JOptionPane.showMessageDialog(null, "Total de pedidos"+ total5);
                }
                break;
            case "7":
                if (JOptionPane.showConfirmDialog(null, "Desea elegir mas ingredinetes? ") == 0) {
                    menup();
                } else {
                    int result =  Valor_pizza ++;
                    int ressult =+ champiñones++;
                    int total6 =  ressult + result;

                    JOptionPane.showMessageDialog(null, "Total de pedidos"+ total6);
                }
                break;
            case "8":
                JOptionPane.showMessageDialog(null, "total");
                System.exit(0);
                break;
        }
    }

    public void menu() {

        Pizza = Integer.parseInt(JOptionPane.showInputDialog("Cuantas pizzas deseas?"));
        menup();



    }

    public static void main(String[] args) {
        new pizza();
    }
}
