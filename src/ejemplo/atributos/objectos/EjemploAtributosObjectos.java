package ejemplo.atributos.objectos;
/**
 * @author jborrajorodriguez
 */
public class EjemploAtributosObjectos {

    public static void main(String[] args) {
       Conta conta=new Conta("millonetis","100",1000);
        System.out.println(conta.toString());
        System.out.println(conta.getSaldoTotal());
        //System.out.println(Conta.getXuro());
        //System.out.println(conta.saldo);
        System.out.println("xuro = "+Conta.getXuro());
    }
    //Terminado
    
}
