public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = 100;
        Long iniLong = 1000L;

        Byte iniByte = null;

        System.out.println(iniByte);

        iniByte = 100;
        System.out.println(iniByte);


        System.out.println("===== cara konversi tipe data primitif ke bukan primitif =====");
        // cara konversi tipe data primitif ke bukan primitif
        int iniInt =  100;
        Integer iniObject = iniInt;

        short iniShort = iniObject.shortValue();
        long iniLong2 = iniObject.byteValue();
        float iniFloat = iniObject.floatValue();

        System.out.println(iniObject);
        System.out.println(iniShort);
        System.out.println(iniLong2);
        System.out.println(iniFloat);
    }
}
