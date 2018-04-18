class ReverseInteger {

  public int reverse(int x) {

        int current = Math.abs(x);
        int reverse = 0;
        int lastDigit;
        while(current > 0){
            if(reverse > Integer.MAX_VALUE / 10){
                return 0;
            }
            reverse *= 10;
            lastDigit = current % 10;
            current = current / 10;
            reverse += lastDigit;
        }
        return reverse = x > 0 ? reverse : -reverse;
    }
    
}
