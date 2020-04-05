class HappyNumber {
    public boolean isHappy(int n) {
        if (n < 0) {
            return false;
        }
        int sum = 0;
        int curr = n;
        Set<Integer> seen = new HashSet<>();
        
        while (curr != 1) {
            while (curr > 0) {
                sum += Math.pow(curr % 10, 2);
                curr /= 10;
            }
            curr = sum;
            sum = 0;
            if (seen.contains(curr)) {
                break;
            } 
            seen.add(curr);
        }
        return curr == 1;
    }
}
