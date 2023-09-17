//find product of last "k" number of elements of the array
class ProductOfNumbers {
    final List<Integer> list;
    int lastProduct;

    public ProductOfNumbers() {
        this.list = new ArrayList<Integer>();
        lastProduct = 1;
    }
    
    public void add(int num) {
        if(num == 0){
            list.clear();
            lastProduct = 1;
        }
        else {
            lastProduct = lastProduct * num;
            list.add(lastProduct);
        }
    }
    
    public int getProduct(int k) {
        int index = list.size() - k;
        if(index>0) {
            return lastProduct / list.get(index - 1);
        }
        if(index ==0) {
            return lastProduct;
        }
        return 0;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
