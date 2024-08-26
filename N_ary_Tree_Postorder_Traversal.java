//Leetcode question 590. N-ary Tree Postorder Traversal

class N_ary_Tree_Postorder_Traversal {
    public List<Integer> postorder(Node root) {
        if(root == null)    return new ArrayList<>();

        List<Integer> ls = new ArrayList<>();
        check(root, ls);
        return ls;
    }

    public void check(Node root, List<Integer> ls) {
        for(Node child : root.children) {
            check(child, ls);
        }
        ls.add(root.val);
    }
}
