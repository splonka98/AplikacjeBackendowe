package com.company;

public class Main {

    public static int [] CRC_TABLE=new int[256];
     static{
        for (int i = 0; i < 256; ++i) {
            int code = i;
            for (int j = 0; j < 8; ++j) {
                code = ((code & 0x01) !=0 ? 0xEDB88320 ^ (code >>> 1) : (code >>> 1));
            }
            CRC_TABLE[i] = code;
        }
    }
    public static long crc32  (String text)  {
        long crc = -1;
        for (int i = 0; i < text.length(); ++i) {
            int code = (text.charAt(i));
            crc = CRC_TABLE[(int) ((code ^ crc) & 0xFF)] ^ (crc >>> 8);
        }
        return (int) ((-1 ^ crc) >>> 0) & 0xFFFFFFFF;
    };


    public static void main(String[] args) {
System.out.println(crc32("This is example text ..."));
    }
}
