import javax.swing.JOptionPane;
public class TestaFibonacci {
   public static void main(String args[]) {
      Fibonacci obj = new Fibonacci();
      int     termo, resultado;
      String  msg = "";
      termo = Integer.parseInt( JOptionPane.showInputDialog("Calcular qual termo de Fibonacci?") );
      resultado = obj.fibR(termo);
      if (resultado == 0) msg = "Digite apenas numeros inteiros maiores que zero";
      else             msg = "O " + termo + "º termo de Fibonacci é " + resultado;
      JOptionPane.showMessageDialog(null, msg);
      System.exit(0);   
   }
}