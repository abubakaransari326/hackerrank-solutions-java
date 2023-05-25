package Advanced;


public class HuffmanDecoding {
  void decode(String s, Node root) {
    Node copy = root;
    for (char val : s.toCharArray()) {
      if (val == '1')
        copy = copy.right;
      else
        copy = copy.left;

      if (copy.data != 0) {
        System.out.print(copy.data);
        copy = root;
      }
    }
  }
}
