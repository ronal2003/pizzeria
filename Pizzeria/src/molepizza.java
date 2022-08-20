import javax.swing.*;

public class molepizza {

    int cantidad_pizzas, cant_ingredientes;
    int Valor_pizza = 5000, valor_jamon = 0, valor_peperoni = 0, valor_pollo = 0, valor_tomate = 0, valor_atun = 0, valor_albaca = 0, valor_champiñones = 0, valor_pedido = 0;
    int valor1 = 0, valor2 = 0, valor3 = 0, valor4 = 0, valor5 = 0, valor6 = 0, valor7 = 0, total_pizzas = 0;
    int Cantpizzas[] = new int[6];
    int ingredientes[] = new int[8];

    public molepizza() {
        menu();
    }

    public void menu() {


        String menu = "Pizzeria la 21 \n\n" +
                "1. pizzas\n" +
                "2. Ingredientes \n" +
                "3. total \n" +
                "4. salir";

        String entrada = JOptionPane.showInputDialog(menu);

        switch (entrada) {

            case "1":
                cantidad_pizzas = Integer.parseInt(JOptionPane.showInputDialog("Diguite la cantidad de pizzas que desea ordenar"));

                if (cantidad_pizzas > 4) {
                    JOptionPane.showMessageDialog(null, "No se puede pedir mas de 5 pizzas");
                    menu();
                } else if (cantidad_pizzas > 0) {

                    System.out.println("Cantidad de pizza(s) ");
                    Cantpizzas[0] = cantidad_pizzas;
                    Cantpizzas[1] = total_pizzas;
                }
                total_pizzas = cantidad_pizzas *= Valor_pizza;
                menu();


                break;
            case "2":

                String sms = "Ingredientes \n\n";

                sms += "1. jamon 500\n";
                sms += "2. peperoni 900\n";
                sms += "3. pollo 700\n";
                sms += "4. tomate 300\n";
                sms += "5. atun 1200\n";
                sms += "6. albaca 400\n";
                sms += "7. champiñones 800\n";
                sms += "8. salir \n";

                String opcion = JOptionPane.showInputDialog(sms);

                switch (opcion) {
                    case "1":
                        cant_ingredientes += 1;
                        if (cant_ingredientes > 4) {
                            JOptionPane.showMessageDialog(null, "no puede agregar mas de 4 ingredientes ");

                        } else {

                            valor1 = valor_jamon += 500;
                            ingredientes[0]= valor1;

                        }
                        menu();
                        break;
                    case "2":
                        cant_ingredientes += 1;
                        if (cant_ingredientes > 5) {
                            JOptionPane.showMessageDialog(null, "no se puede agregar mas de 4 ingredientes ");
                        } else {
                            valor2 = valor_peperoni += 900;
                            ingredientes[1] = valor2;

                        }
                        menu();

                        break;
                    case "3":
                        cant_ingredientes += 1;
                        if (cant_ingredientes > 4) {
                            JOptionPane.showMessageDialog(null, "no se puede agregar mas de 4 ingredientes");
                        } else {
                            valor3 = valor_pollo += 700;
                            ingredientes[2] = valor3;


                        }
                        menu();
                        break;

                    case "4":
                        cant_ingredientes += 1;
                        if (cant_ingredientes > 4) {
                            JOptionPane.showMessageDialog(null, "no se puede agregar mas de 4 ingredientes");
                        } else {
                            valor4 = valor_tomate += 300;
                            ingredientes[3] = valor4;


                        }
                        menu();
                        break;
                    case "5":
                        cant_ingredientes += 1;
                        if (cant_ingredientes > 4) {
                            JOptionPane.showMessageDialog(null, "nno se puede agregar mas de 4 ingredientes");
                        } else {
                            valor5 = valor_atun += 1200;
                            ingredientes[4] = valor5;

                        }
                        menu();
                        break;
                    case "6":
                        cant_ingredientes += 1;
                        if (cant_ingredientes > 4) {
                            JOptionPane.showMessageDialog(null, "no se puede agregar mas de 4 ingredientes");
                        } else {
                            valor6 = valor_albaca += 400;
                            ingredientes[5] = valor6;
                        }
                        menu();
                        break;
                    case "7":
                        cant_ingredientes += 1;
                        if (cant_ingredientes > 4) {
                            JOptionPane.showMessageDialog(null, "no se puede agregar mas de 4 ingredientes");
                        } else {
                            valor7 = valor_champiñones += 800;
                            ingredientes[6] = valor7;

                        }
                        menu();
                        break;
                    case "8":
                        System.exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion fuera del menu ");

                }
                menu();
                break;

            case "3":
                //int Cantpizzas[] = new int[6];
                //int ingredientes[] = new int[8];

                System.out.println("Lista de menu ordenado de pizzas");
                int Total = ingredientes[0] + ingredientes[1] + ingredientes[2] + ingredientes[3] + ingredientes[4] + ingredientes[5] + ingredientes[6];
                        if(ingredientes[0] > 0){

                            System.out.print(" | "+"Pizza " + Cantpizzas[0] + " | ");
                            System.out.print(" | "+"Jamon " +ingredientes[0] + "| ");
                            System.out.print(" | "+"peperoni " +ingredientes[1]+ " | ");
                            System.out.print(" | "+"pollo " +ingredientes[2] + " | ");
                            System.out.print(" | "+"tomate  " +ingredientes[3] + " | ");
                            System.out.print(" | "+"atun " +ingredientes[4] + " | ");
                            System.out.print(" | "+"albaca " +ingredientes[5] + " | ");
                            System.out.print(" | "+"champiñones " +ingredientes[6] + " | ");
                            System.out.print(" | "+"Total " + Total + " | ");

                        } else {

                        }
                menu();
                break;

            case "4":
                System.exit(0);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opcion no disponible por el momento ");

        }
    }

    public static void main(String[] args) {
        new molepizza();
    }


}
