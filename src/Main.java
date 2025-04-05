import java.util.Scanner; /*Importo la biblioteca para usar el Scanner*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); /*Defino clases para capturar valores por teclado*/
        String nombreEmpleado = "";
        String documentoEmpleado = "";
        double salarioBruto = 0;
        double salarioNeto = 0;
        double valorHora = 0;
        double cantidadHoras = 0;
        double deduccionSalud = 0;
        double deduccionPension = 0;
        double horasExtras = 0;
        double valorHorasExtras = 0;
        double bonificacion = 0;
        double fondoSolidaridadPensional = 0;
        double valorRetencionFuente = 0;
        double auxilioTransporte = 0;
        double salarioMinimo = 0;

        System.out.println("Ingrese el nombre del empleado: ");
        nombreEmpleado = sc.nextLine();
        System.out.println("Ingrese el documento del empleado: ");
        documentoEmpleado = sc.nextLine();
        System.out.println("Ingese el valor de la hora: ");
        valorHora = sc.nextDouble();
        System.out.println("Ingrese la cantidad de horas: ");
        cantidadHoras = sc.nextDouble();
        System.out.println("Ingrese el valor del SMMLV actual");
        salarioMinimo = sc.nextDouble();

        if (cantidadHoras >= 24) {
            System.out.println("Se le puede pagar al empleado");
            salarioBruto = valorHora * cantidadHoras;
            deduccionPension = salarioBruto *0.04;
            deduccionSalud = salarioBruto * 0.04;
            if (salarioBruto <= (salarioMinimo*2)) {
                auxilioTransporte = 200000;
                bonificacion = salarioBruto*0.1;
            } else {
                auxilioTransporte = 0;
                bonificacion = 0;
            }
            if (cantidadHoras > 96) {
                horasExtras = cantidadHoras - 96;
                valorHorasExtras = (valorHora*0.25) * horasExtras;
            }
            System.out.println("Detalle de pago " + nombreEmpleado);
            System.out.println("El salario bruto del empleado " + nombreEmpleado + " es $" + salarioBruto);
            System.out.println("La deducción por salud es: $" + deduccionSalud);
            System.out.println("La deducción por pensión es: $" + deduccionPension);
            System.out.println("El auxilio de transporte es: $" + auxilioTransporte);
            System.out.println("La bonificación es: $" + bonificacion);
            System.out.println("El pago por horas extras es: $" + valorHorasExtras);
            System.out.println("el salario neto es: $" + (salarioBruto - deduccionSalud - deduccionPension + auxilioTransporte + bonificacion + valorHorasExtras));

        } else {
            System.out.println("Le faltan " + (24 - cantidadHoras) + " horas de trabajo");
        }
    }
}