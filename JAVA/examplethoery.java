public class examplethoery {
    public static void main(String[] args) {
        Short a = 10, b = 20;
       // byte c = a + b; //Error we can do it using explicit type conversion 
        byte d=(byte)(a+b);
       System.out.println(d);


        long longWithinIntRange = 2147483647L; // Maximum value of int
       // long longOutsideIntRange = 2147483648; // One more than the maximum value of int     The literal 2147483648 of type int is out of range
        System.out.println(longWithinIntRange);
        //System.out.println(longOutsideIntRange);


        //float u = 12.54; //Type mismatch: cannot convert from double to float
        double u = 12.54;
        System.out.println(u);


        int v = 23456789; // Integer number too large
        System.out.println(v);
        byte e = 9;  
        //byte e = 129; // Error : this value too long 
        //Type mismatch: cannot convert from int to byte
        System.out.println(e);
        float f = 12.456f;
        //Type mismatch: cannot convert from double to float
        System.out.println(f);


        char ch1 ='\u0041'; // A
        System.out.println(ch1);
        char ch2 ='\u0042'; // B
        System.out.println(ch2);
        char ch3 ='\u0043'; // C
        System.out.println(ch3);
        char ch4 ='\u0044'; // D
        System.out.println(ch4);
        char ch5 = '\u0045'; // E
        System.out.println(ch5);
         
         
        char ch6 = 't'; //
        char ch7 = 'f';
        System.out.println(ch6+ch7);
/*
* Letter	ASCII Code	Binary	Letter	ASCII Code	Binary
a	097	01100001	A	065	01000001
b	098	01100010	B	066	01000010
c	099	01100011	C	067	01000011
d	100	01100100	D	068	01000100
e	101	01100101	E	069	01000101
f	102	01100110	F	070	01000110
g	103	01100111	G	071	01000111
h	104	01101000	H	072	01001000
i	105	01101001	I	073	01001001
j	106	01101010	J	074	01001010
k	107	01101011	K	075	01001011
l	108	01101100	L	076	01001100
m	109	01101101	M	077	01001101
n	110	01101110	N	078	01001110
o	111	01101111	O	079	01001111
p	112	01110000	P	080	01010000
q	113	01110001	Q	081	01010001
r	114	01110010	R	082	01010010
s	115	01110011	S	083	01010011
t	116	01110100	T	084	01010100
u	117	01110101	U	085	01010101
v	118	01110110	V	086	01010110
w	119	01110111	W	087	01010111
x	120	01111000	X	088	01011000
y	121	01111001	Y	089	01011001
z	122	01111010	Z	090	01011010 */
    } 
}
