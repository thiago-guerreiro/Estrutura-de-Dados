public class PilhaInt {
   private int v[];
   private int topo;

   public PilhaInt(int tam) {
      v    = new int[tam];
      topo = 0;
   }

   public boolean isFull() {
      return (topo == v.length);
   }

   public boolean isEmpty() {
      return (topo == 0);
   }

   public boolean push(int elem) {
      if (isFull()) return false;
      else {
         v[topo++] = elem;
         return true;
      }
   }

   public int top() {
      return v[topo - 1];
   }

   public int size() {
      return topo;
   }

   public int pop() {
      return v[--topo];
   }
}