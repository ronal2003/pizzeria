import javax.security.auth.callback.CallbackHandler;
import javax.swing.*;

public class pizze {

    int cantidadpizzas[][] = new int[2][2];
    String pedidos[][] = new String[3][2];
    int Valor_pizza = 5000, jamon = 500, peperoni = 900, pollo = 700, tomate = 300, atun = 1200, albaca = 400, champiñones = 800, pedido = 0;
    int cantPizza, cantingredientes;


    public pizze() {
    menuprincipal();
    }

    public void menuprincipal() {
        cantingredientes++;
        cantPizza = Integer.parseInt(JOptionPane.showInputDialog("Ingresa  la cantidad de pizzas"));
        if (cantPizza > 5) {
            JOptionPane.showMessageDialog(null, "Cantidad de pizzas no pueden ser mayor de 5");
        } else {
            menu();
        }

    }

    public void menu() {

        String opcion = JOptionPane.showInputDialog("Que Ingredientes desea elejir? \n\n" +
                "1. jamon \n" +
                "2. peperoni \n" +
                "3. pollo \n" +
                "4. tomate \n" +
                "5. atun \n" +
                "6. albaca \n" +
                "7. champiñones \n");

        switch (opcion) {

            case "1":
                if (cantingredientes > 0) {
                    cantingredientes++;
                }

                if (cantingredientes > 4) {
                    JOptionPane.showMessageDialog(null, "No puedes añadir mas de 4 ingredientes");
                } else {

                    Valor_pizza += jamon++;
                    if (JOptionPane.showConfirmDialog(null, "Desea elegir mas ingredinetes? ") == 0) {

                    } else {
                        int result = Valor_pizza += jamon++;

                        JOptionPane.showMessageDialog(null, "Total de pedidos" + result);
                    }
                }
                break;
            case "2":
                if (cantingredientes > 0) {
                    cantingredientes++;
                }
                if (cantingredientes > 4) {
                    JOptionPane.showMessageDialog(null, "No puedes añadir mas de 4 ingredientes");
                } else {
                    Valor_pizza += peperoni;
                    if (JOptionPane.showConfirmDialog(null, "Desea elegir mas ingredinetes? ") == 0) {

                    } else {
                        int result = Valor_pizza += peperoni;


                        JOptionPane.showMessageDialog(null, "Total de pedidos" + result);
                    }
                }
                break;
            case "3":
                if (cantingredientes > 0) {
                    cantingredientes++;
                }
                if (cantingredientes > 4) {
                    JOptionPane.showMessageDialog(null, "No puedes añadir mas de 4 ingredientes");
                } else {

                    if (JOptionPane.showConfirmDialog(null, "Desea elegir mas ingredinetes? ") == 0) {

                    } else {
                        int result = Valor_pizza++;
                        int ressult = +pollo++;
                        int total2 = Valor_pizza += pollo;


                        JOptionPane.showMessageDialog(null, "Total de pedidos" + total2);
                    }
                }
                break;
            case "4":
                if (cantingredientes > 0) {
                    cantingredientes++;
                }
                if (cantingredientes > 4) {
                    JOptionPane.showMessageDialog(null, "No puedes añadir mas de 4 ingredientes");
                } else {
                    if (JOptionPane.showConfirmDialog(null, "Desea elegir mas ingredinetes? ") == 0) {

                    } else {
                        int result = Valor_pizza++;
                        int ressult = +tomate++;

                        int total3 = result + ressult;


                        JOptionPane.showMessageDialog(null, "Total de pedidos" + total3);
                    }
                }
                break;
            case "5":
                if (cantingredientes > 0) {
                    cantingredientes++;
                }
                if (cantingredientes > 4) {
                    JOptionPane.showMessageDialog(null, "No puedes añadir mas de 4 ingredientes");
                } else {
                    if (JOptionPane.showConfirmDialog(null, "Desea elegir mas ingredinetes? ") == 0) {

                    } else {
                        int result = Valor_pizza++;
                        int ressult = +atun++;
                        int total4 = result + ressult;

                        JOptionPane.showMessageDialog(null, "Total de pedidos" + total4);
                    }
                }
                break;

            case "6":
                if (cantingredientes > 0) {
                    cantingredientes++;
                }
                if (cantingredientes > 4) {

                    Valor_pizza += albaca;
                    JOptionPane.showMessageDialog(null, "No puedes añadir mas de 4 ingredientes");
                } else {
                    if (JOptionPane.showConfirmDialog(null, "Desea elegir mas ingredinetes? ") == 0) {

                    } else {
                        int result = Valor_pizza++;
                        int ressult = +albaca++;
                        int total5 = result + ressult;

                        JOptionPane.showMessageDialog(null, "Total de pedidos" + total5);
                    }
                }
                break;
            case "7":
                Valor_pizza += champiñones;
                if (JOptionPane.showConfirmDialog(null, "Desea elegir mas ingredinetes? ") == 0) {

                } else {
                    int result = Valor_pizza++;
                    int ressult = +champiñones++;
                    int total6 = ressult + result;

                    JOptionPane.showMessageDialog(null, "Total de pedidos" + total6);
                }
                break;
            case "8":
                JOptionPane.showMessageDialog(null, "total");
                System.exit(0);
                break;
        }
    }

    public static void main(String[] args) {
        new pizze();
    }
}
