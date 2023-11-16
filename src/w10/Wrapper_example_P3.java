package w10;

public class Wrapper_example_P3 {
    //Create a static method named extractDoubleNumber() that takes two parameters: a String containing company information with numeric data and delimiters, and a String delimiter. The method should extract the first double value located between the delimiters in the company information and return it as a double data. If no valid double is found, return 0.0.
//
//Return Type: Double
//
//Example #1:
//
//Parameters:
//
//String companyInfo = "Acme Inc.,123456.78,7890.120,123456"
//String delimiter = ","
//
//Return:
//
//123456.78
//
//Example #2:
//
//Parameters:
//
//String companyInfo = "Acme Inc.$123456.78$7890.120$123456"
//String delimiter = "$"
//
//Return:
//
//123456.78
//
//Example #3:
//
//Parameters:
//
//String companyInfo = "Acme Inc.#123456.78#7890.120#123456"
//String delimiter = "@"
//
//Return:
//
//0.0
    public static void main(String[] args) {
        String companyInfo1 = "Acme Inc.,123456.78,7890.120,123456";
        String companyInfo2 = "Acme Inc.$123456.78$7890.120$123456";
        String companyInfo3 = "Acme Inc.#123456.78#7890.120#123456";
        String delimiter = ",";

        System.out.println(extractDoubleNumber(companyInfo1, delimiter));
        System.out.println(extractDoubleNumber(companyInfo2, "$"));
        System.out.println(extractDoubleNumber(companyInfo3, "@"));
    }

    public static Double extractDoubleNumber(String companyInfo, String delimiter) {
        String[] parts = companyInfo.split(delimiter);
        for (String part : parts){
            if (part.matches("[-+]?[0-9]*\\.?[0-9]+")){
                return  Double.parseDouble(part);
            }
        }
        return 0.0;
    }
}
