package com.study.strings;

public class BaseTranslations{


    public static String convertBase(String numAsString, int b1, int b2){
        boolean isNegative = numAsString.startsWith("-");
        int numAsInt = 0;
        for(int i = (isNegative? 1:0); i<numAsString.length(); ++i){
            numAsInt*=b1;
            numAsInt+=Character.isDigit(numAsString.charAt(i))
                    ?numAsString.charAt(i) -'0'
                    : numAsString.charAt(i) - 'A'+10;

        }
        return (isNegative?"-":"")
                +(numAsInt == 0? "0": constructFromBase( numAsInt, b2));
    }

    private static String constructFromBase( int numAsInt, int base){
        return numAsInt == 0
                ?""
                :constructFromBase( numAsInt /base, base)
                +(char)(numAsInt% base>=10? 'A'+numAsInt%base -10
                : '0' + numAsInt%base);
    }



    public static void main(String[] args) {
//        StringBuilder s = new StringBuilder();
//        s.append((char)('0'+Math.abs(10/5)));
//        s.append((char)('0'+Math.abs(10/2)));
//        s.reverse();
//        System.out.println(s.toString());
//        System.out.println(convertFromInt(-354));
//        String s = "B";
//        System.out.println(s.charAt(0)-'A'+10);
        System.out.println((char)('A'+ 306%13 - 10));

//        System.out.println(306%13);
//        System.out.println(306/13);
//        System.out.println(23%13);
//        System.out.println(23/13);
//        System.out.println(1%13);
//        System.out.println(1/13);
    }
}
