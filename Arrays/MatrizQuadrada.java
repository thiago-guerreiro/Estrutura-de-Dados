import javax.swing.JOptionPane;

public class MatrizQuadrada {

   public int geraRand(int limite) {
      return (int)(Math.random() * limite);
   }

   public void matriz() {
      int    mat[][] = new int[5][5];
      int    lin, col, somaDPrin = 0, somaDSecu = 0, somaAcDPrin = 0, somaAbDPrin = 0;
      double medDPrin, medDSecu, medAcDPrin, medAbDPrin;
      String msg = "";
      // preenche matriz
      for (lin = 0; lin < mat.length; lin++) {
         for (col = 0; col < mat[0].length; col++) {
            mat[lin][col] = geraRand(10);
         }
      }
      for (lin = 0; lin < mat.length; lin++) {
         for (col = 0; col < mat[0].length; col++) {
            if (lin == col)                  somaDPrin   += mat[lin][col]; // elemento na diagonal principal
            if (lin + col == mat.length - 1) somaDSecu   += mat[lin][col]; // elemento na diagonal secundaria
            if (lin < col)                   somaAcDPrin += mat[lin][col]; // elemento acima da diagonal principal
            if (lin > col)                   somaAbDPrin += mat[lin][col]; // elemento abaixo da diagonal principal
         }
      }
      // c�lcula medias
      medDPrin   = (double)somaDPrin / mat.length;
      medDSecu   = (double)somaDSecu / mat.length;
      medAcDPrin = somaAcDPrin / ((Math.pow(mat.length, 2) - mat.length) / 2);
      medAbDPrin = somaAbDPrin / ((Math.pow(mat.length, 2) - mat.length) / 2);
      // exibi matriz
      msg += showMatriz(mat);
      // cria e exibe resposta
      msg += "\nM�dia Diagonal Principal: "        + medDPrin   +
             "\nM�dia Diagonal Secundaria: "       + medDSecu   +
             "\nM�dia Acima Diagonal Principal: "  + medAcDPrin +
             "\nM�dia Abaixo Diagonal Principal: " + medAbDPrin;
      JOptionPane.showMessageDialog(null, msg);
   }
   // retorna String com conte�do da matriz
   public String showMatriz(int m[][]) {
      String resp = "";
      int    l, c;
      for (l = 0; l < m.length; l++) {
         for (c = 0; c < m[0].length; c++) {
            resp += "   " + m[l][c];
         }
         resp += "\n";
      }
      return resp + "\n\n";
   }
}