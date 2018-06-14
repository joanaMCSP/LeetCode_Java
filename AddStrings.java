class AddStrings {
    public String addStrings(String num1, String num2) {
        if(num1.length() == 0 && num2.length() == 0){
            return "";
        }
        if(num1.length() == 0 ){
            return num2;
        }
        if(num2.length() == 0){
            return num1;
        }
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int sum = 0;
        int num1Index = num1.length() - 1;
        int num2Index = num2.length() - 1;

        while(num1Index >= 0 || num2Index >= 0){
            sum += carry;

            if(num1Index >= 0){
                sum += num1.charAt(num1Index) - '0';
            }
            if(num2Index >= 0){
                sum += num2.charAt(num2Index) - '0';
            }
            if(sum >= 10){
                sum = sum % 10;
                carry = 1;
            }else{
                carry = 0;
            }
            result.append(sum);
            num1Index--;
            num2Index--;
            sum = 0;
        }
        if(carry > 0)result.append(carry);
        return result.reverse().toString();
    }
}
