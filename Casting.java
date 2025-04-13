package com.xworkz.casting.primitivetypecasting;

public class Casting
{
    public static void main(String[] args) {
        //WIDENING TYPE CASTING
        //BYTE TO HIGHER TYPES
        //byte to short
        byte value=127;
        System.out.println(value);
        short shortValue=value;
        System.out.println(shortValue);

        //byte to int
        int intValue=value;
        System.out.println(intValue);

        //byte to long
        long longValue=value;
        System.out.println(longValue);

        //byte to  float
        float floatValue=value;
        System.out.println(floatValue);

        //byte to  double
        double doubleValue=value;
        System.out.println(doubleValue);

        //SHORT TO HIGHER TYPES
        shortValue=1789;
        //short to int
        intValue=shortValue;
        System.out.println(intValue);

        //short to long
        longValue=shortValue;
        System.out.println(longValue);

        //short to  float
         floatValue=shortValue;
        System.out.println(floatValue);

        //short to  double
        doubleValue=shortValue;
        System.out.println(doubleValue);

        //INT TO HIGHER TYPES
        intValue=1562832843;
        //int to long
        longValue=intValue;
        System.out.println(longValue);

        //int to  float
        floatValue=intValue;
        System.out.println(floatValue);

        //int to  double
        doubleValue=intValue;
        System.out.println(doubleValue);

        //LONG TO HIGHER TYPES
        longValue=647832894201768L;
        //long to  float
        floatValue=longValue;
        System.out.println(floatValue);

        //long to  double
        doubleValue=longValue;
        System.out.println(doubleValue);

        //FLOAT TO HIGHER TYPE
        floatValue=1234.578f;
        //float to  double
        doubleValue=floatValue;
        System.out.println(doubleValue);

        //Narrowing Type Casting
        //short to byte
        shortValue=128;
        value=(byte)shortValue;
        System.out.println(value);

        //int to lowertypes
        intValue=498412334;

        //int to short
        shortValue=(short)intValue;
        System.out.println(shortValue);

        //int to byte
        value=(byte)intValue;
        System.out.println(value);


        //long to lower types
        longValue=1567L;
        //long to int
        intValue=(int)longValue;
        System.out.println(intValue);


        //long to short
        shortValue=(short)longValue;
        System.out.println(shortValue);

        //long to byte
        value=(byte) longValue;
        System.out.println(value);

        //float to lower types
        floatValue=145.0000f;

        //float to byte
        value=(byte)floatValue;
        System.out.println(value);

        //float to short
        shortValue=(short)floatValue;
        System.out.println(shortValue);

        //float to int
        intValue=(int)floatValue;
        System.out.println(intValue);

        //float to long
        longValue=(long)floatValue;
        System.out.println(longValue);

        //double to lower types
        doubleValue=142903.000000000;

        //double to byte
        value=(byte)doubleValue;
        System.out.println(value);

        //double to short
        shortValue=(short)doubleValue;
        System.out.println(shortValue);

        //double to int
        intValue=(int)doubleValue;
        System.out.println(intValue);

        //double to long
        longValue=(long)doubleValue;
        System.out.println(longValue);

        //double to float
        floatValue=(float)doubleValue;
        System.out.println(floatValue);









    }
}
