import javax.swing.JOptionPane;

public class TestaFatorial {
   public static void main(String args[]) {
      Fatorial obj = new Fatorial();
      int     nroDig;
      long    resultado;
      String  msg = "";
      try {
         nroDig = Integer.parseInt( JOptionPane.showInputDialog("Calcular o fatorial de qual numero?") );
         resultado = obj.fatR(nroDig);
         msg = nroDig + "! = " + resultado;
      }
      catch (StackOverflowError exc) {
         msg = "Número muito grande. Não foi possível calcula o fatorial";
      }
      catch (NumberFormatException exc) {
         msg = "Digite apenas numeros inteiros.";
      }
      catch (Exception exc) {
         msg = exc.getMessage();
      }

      JOptionPane.showMessageDialog(null, msg);
      System.exit(0);   
   }
}