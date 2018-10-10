package com.lin.test.common.utils;

/**
 * @author linjun.li@quvideo.com
 * @date 2018-09-27 10:45
 **/
public class ShortLinkGenerate {
    public static void main(String[] args) {
        String sLongUrl = "8" ;
        String[] aResult = shortUrl (sLongUrl);
        for ( int i = 0; i < aResult. length ; i++) {
            System. out .println( "[" + i + "]:::" + aResult[i]);
        }
    }

    public static String[] shortUrl(String url) {
        String key = "wuguowei" ;
        String[] chars = new String[] {
                // 要使用生成URL的字符
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n",
                "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B",
                "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N",
                "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
        String hex = CMyEncrypt.md5(key + url);
        String[] resUrl = new String[4];
        for ( int i = 0; i < 4; i++) {
            String sTempSubString = hex.substring(i * 8, i * 8 + 8);
            long lHexLong = 0x3FFFFFFF & Long.parseLong (sTempSubString, 16);
            String outChars = "" ;
            for ( int j = 0; j < 6; j++) {
                long index = 0x0000003D & lHexLong;
                outChars += chars[( int ) index];
                lHexLong = lHexLong >> 5;
            }
            resUrl[i] = outChars;
        }
        return resUrl;
    }
}
