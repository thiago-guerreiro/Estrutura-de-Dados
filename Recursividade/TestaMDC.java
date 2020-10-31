import javax.swing.JOptionPane;
public class TestaMDC {
   public static void main(String args[]) {
      MaximoDivisorComum obj = new MaximoDivisorComum();
      int     num1, num2, resultado;
      String  msg = "";
      num1 = Integer.parseInt( JOptionPane.showInputDialog("Informe o primeiro número:") );
      num2 = Integer.parseInt( JOptionPane.showInputDialog("Informe o segundo número:") );
      resultado = obj.mdcR(num1, num2);
      msg = "MDC(" + num1 + "; " + num2 + ") = " + resultado;
      JOptionPane.showMessageDialog(null, msg);
      System.exit(0);   
   }
}