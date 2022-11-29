package com.tw;

public class MultiplicationTable {
    public String create(int start, int end) {
        return null;
    }

    public Boolean isValid(int start, int end) {
        return isStartNotBiggerThanEnd(start,end) && isInRange(start) && isInRange(end);
    }

    public Boolean isInRange(int number) {
        return number<=1000 && number>=1;
    }

    public Boolean isStartNotBiggerThanEnd(int start, int end) {
        return start<=end;
    }

    public String generateTable(int start, int end) {

        String res = "";
        for(int i=start; i<=end; i++){
            res += generateLine(start,i);
            res+=System.lineSeparator();
        }

        return res.trim();
    }

    public String generateLine(int start, int row) {
        String res = "";
        for(int i=start; i<=row; i++){
            if(res.equals("")){
                res +=  generateSingleExpression(i,row);

            }
            else{
                res += "  " + generateSingleExpression(i,row);
            }

        }
        return res;
    }

    public String generateSingleExpression(int multiplicand, int multiplier) {
        int res = multiplicand*multiplier;

        return (multiplicand+ "*"+ multiplier +"=" + res);
    }
}
