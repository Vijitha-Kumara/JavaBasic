public class Operator {
    public static void main(String[] args) {
        int temprature = 55;
        boolean isWarm = temprature >20 && temprature < 30; /*AND*/
        System.out.println(isWarm);

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible =  (hasHighIncome || hasGoodCredit ) && !hasCriminalRecord;
        System.out.println(isEligible);    
        
    }
    
}
