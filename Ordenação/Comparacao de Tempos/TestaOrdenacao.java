import javax.swing.JOptionPane;

public class TestaOrdenacao {
   public static void main(String args[]) {
      Ordenacao obj = new Ordenacao();
      int[]  vBub, vSel, vIns, vQui;
      int    i, tam;
      long   iniBub, iniSel, iniIns, iniQui;
      long   totBub, totSel, totIns, totQui;
      String msg = "";
      // total de elementos do vetor
      tam = Integer.parseInt( JOptionPane.showInputDialog("Quantos elementos no vetor?") );
      vBub = new int[tam];
      vSel = new int[tam];
      vIns = new int[tam];
      vQui = new int[tam];
      // gera numeros aleatários para os vetores
      System.out.println("Gerando vetores com " + tam + " posicoes");
      for (i = 0; i < vBub.length; i++) {
         vBub[i] = (int)(Math.random() * tam);
         vSel[i] = vBub[i];
         vIns[i] = vBub[i];
         vQui[i] = vBub[i];
      }
      // vetores gerados
      msg += "Vetores gerados:\n" +
             "\nBUBBLE\n"    + obj.showVetor(vBub) +
             "\nSELECTION\n" + obj.showVetor(vSel) +
             "\nINSERTION\n" + obj.showVetor(vIns) +
             "\nQUICK\n"     + obj.showVetor(vQui);
      // ordena vetor BUBBLE
      System.out.println("Classificando por BUBBLE...");
      iniBub = System.currentTimeMillis();
      obj.bubble(vBub);
      totBub = System.currentTimeMillis() - iniBub;
      // ordena vetor SELECTION
      System.out.println("Classificando por SELECTION...");
      iniSel = System.currentTimeMillis();
      obj.selection(vSel);
      totSel = System.currentTimeMillis() - iniSel;
      // ordena vetor INSERTION
      System.out.println("Classificando por INSERTION...");
      iniIns = System.currentTimeMillis();
      obj.insertion(vIns);
      totIns = System.currentTimeMillis() - iniIns;
      // ordena vetor QUICK
      System.out.println("Classificando por QUICK...");
      iniQui = System.currentTimeMillis();
      obj.quick(vQui);
      totQui = System.currentTimeMillis() - iniQui;
      // vetores ordenadose tempo em milissegundos
      msg += "\n\nVETORES ORDENADOS:\n" +
             "\nBUBBLE\n"    + obj.showVetor(vBub) + " - " + totBub + " ms" +
             "\nSELECTION\n" + obj.showVetor(vSel) + " - " + totSel + " ms" +
             "\nINSERTION\n" + obj.showVetor(vIns) + " - " + totIns + " ms" +
             "\nQUICK\n"     + obj.showVetor(vQui) + " - " + totQui + " ms";
      JOptionPane.showMessageDialog(null, msg);
      System.exit(0);
   }
}