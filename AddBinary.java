class AddBinary {

    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder result = new StringBuilder();
        boolean carry = false;
        String tempResult = "";
        
        while (i >= 0 || j >= 0) {
            char charA = i >= 0 ? a.charAt(i) : '0';
            char charB = j >= 0 ? b.charAt(j) : '0';
            
            if (charA == '0' && charB == '0') {
                tempResult = carry ? "1" : "0";
                carry = false;
            } else if (charA == '1' && charB == '1') {
                tempResult = carry ? "1" : "0";
                carry = true;
            } else {
                tempResult = carry ? "0" : "1";
            }
            i--;
            j--;
            result.append(tempResult);
        }
        
        if (carry) {
            result.append("1");
        }
        
        return result.reverse().toString();
    }

}
