public class SerializeAndDeserializeBST {

  // Encodes a tree to a single string.
  public String serialize(TreeNode root) {
    List<String> data = new LinkedList();
    serializeHelper(root, data);
    return String.join(",", data);
  }

  private void serializeHelper(TreeNode root, List<String> data) {
    if (root == null) {
      data.add("*");
      return;
    }
    data.add(root.val + "");
    serialize(root.left, data);
    serialize(root.right, data);
  }

  // Decodes your encoded data to tree.
  public TreeNode deserialize(String data) {
    List<String> list = new LinkedList();
    String[] tokens = data.split(",");
    for (String s : tokens) {
      list.add(s);
    }
    return deserializeHelper(list);
  }

  private TreeNode deserializeHelper(List<String> data) {
    if (data.size() == 0) {
      return null;
    }
    String val = data.remove(0);
    if (val.equals("*")) {
      return null;
    }
    TreeNode n = new TreeNode(Integer.parseInt(val));
    n.left = deserializeHelper(data);
    n.right = deserializeHelper(data);
    return n;
  }
}

// Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
