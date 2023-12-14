public class LoopInspector {

  public int loopSize(Node node) {
    int count = 0;
    Node n = node;
    Node m = node;
    do  {
      m = m.getNext();
      m = m.getNext();
      n = n.getNext();
    } while (n!=m) ;
    
    do {
      n = n.getNext();
      count+=1;
    } while (n!=m) ;
  return count;
  }

}
