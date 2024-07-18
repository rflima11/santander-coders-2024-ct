public class TiposPrimitivos {

    public static void main(String[] args) {

        //byte, short, int, long

        //tipoVariavel nome = 1

        //(1 byte): -128 a 127
        byte b1 = 4;
        //(2 bytes): -32.768 a 32.767
        short s1 = 2;
        //(4 bytes): -2.147.483.648 a 2.147.483.647
        int i = 3;
        //(8 bytes): -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
        long l = 4;

        l = s1;

        //float, double

        //(4 bytes): aprox. +- 3.40282347E+38F (6-7 dígitos decimais significativos)
        float f = 1.0F;
        //(8 bytes): aprox. +- 1.797691313486231570E+308 (15 dígitos decimais significativos)
        double d = 1.0;

        //char caracters unicos 'A' ou 'B'

        char c = 'A';
        char c1 = 35;

        //boolean verdadeiros e falsos

        boolean verdadeiro = true;
        boolean falso = false;

        System.out.println(c1);



    }
}
