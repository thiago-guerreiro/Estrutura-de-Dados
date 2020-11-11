public class FilaInt {
   private int     v[];
   private int     ini;
   private int     fim;
   private boolean full;

   public FilaInt(int tam) {
      v    = new int[tam];
      ini  = 0;
      fim  = 0;
      full = false;
   }
   // mostra se a fila está cheia
   public boolean isFull() {
      return full;
   }
   // insere um elemento no fim da fila
   public boolean insert(int elem) {
      if (isFull()) return false;
      else {
         v[fim++] = elem;
         if (fim == v.length) fim  = 0;
         if (fim == ini)      full = true;
         return true;
      }
   }
   // retorna o elemento do início da fila
   public int front() {
      return v[ini];
   }
   // quantidade de elementos da fila
   public int size() {
      if (fim >= ini && !full) return fim - ini;
      else                     return v.length + fim - ini;
   }
   // retira o elemento do início da fila
   public int remove() {
      int aux = v[ini++];
      full    = false;
      if (ini == v.length) ini = 0;
      return aux;
   }
   // verifica se a fila está vazia
   public boolean isEmpty() {
      if (size() == 0) return true;
      else             return false;
   }
   // retorna String contendo os elementos por ordem de chegada
   public String show() {
      String resp = "";
      int    iAux = ini;
      if (isEmpty() ) resp = "Fila vazia";
      else {
         do  {
            resp += v[iAux++] + "   ";
            if (iAux == v.length) iAux = 0;
         } while (iAux != fim);
      }
      return resp;
   }
}