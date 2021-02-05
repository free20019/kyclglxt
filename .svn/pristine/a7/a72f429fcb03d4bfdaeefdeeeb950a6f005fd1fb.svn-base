package tw.util;
import org.apache.commons.codec.binary.Base64;
import javax.crypto.Cipher;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;

public class RSAEncrypt {
    private static Map<Integer, String> keyMap = new HashMap<Integer, String>();  //用于封装随机产生的公钥与私钥
    public static void main(String[] args) throws Exception {
        //生成公钥和私钥
//        genKeyPair();
//        //加密字符串
//        String message = "df723820";
////        System.out.println("随机生成的公钥为:" + keyMap.get(0));
////        System.out.println("随机生成的私钥为:" + keyMap.get(1));
//        String messageEn = encrypt(message,"MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCqCWi79UBezfY37nOHO8p2bAzw0qmBY42OZEd0nLqHLbJwQXOkskSbGFB5D3wLvpDOc72PlClg/C9QckN4D2mx6ZbjkBW08GEFpCWHPBLRqSpcBCLEaqxf+lt0oEVvXecGguDTLnmF94j9KDsuSxr8d61NNlXqcxJySvltNh3JwQIDAQAB");
//        System.out.println(message + "\t加密后的字符串为:" + messageEn);
//        String messageDe = decrypt(messageEn,"MIICeQIBADANBgkqhkiG9w0BAQEFAASCAmMwggJfAgEAAoGBAKoJaLv1QF7N9jfuc4c7ynZsDPDSqYFjjY5kR3ScuoctsnBBc6SyRJsYUHkPfAu+kM5zvY+UKWD8L1ByQ3gPabHpluOQFbTwYQWkJYc8EtGpKlwEIsRqrF/6W3SgRW9d5waC4NMueYX3iP0oOy5LGvx3rU02VepzEnJK+W02HcnBAgMBAAECgYEAhcChAjkJSYn6BEUt21LNEBouk8EiVQVadIetLa2bjHoFwwe5T/RqwxV9N71WdmaQwdWJZ0fExOWa0k0PhYGaQW+laaRcS83gEfM8DrGlbcjXAsvUkQjXGMBTuazsfO4iAl7pLmOVh0mQ3UkkdqOfiVdFGGGCts7yOM7vhgFgE4ECQQDha88elD5P3RgdO6xF3TZU1DrLi3oY+zh3tIig6vp5wkDKCT7crmnjf+1PpqePrUv7lJAtTo642H8zsPAlYvITAkEAwRpE3JRzt1bMiYudFCSbQjJ6CUeIyFsEwJBjBBcH6EfPF8+6E3txaoUid8v8cUR3zOirrnnPUwzws5tVkobvWwJBAIU4/fOIkTsJ49KDDdFMZ2vC8eyRxds1va2hWI4h0V5cW4YL6MbrnVECrfHBAI59UMaiioL8RoUgDi0yiPrPe1kCQQCOYpRMIZqBoZsIAM4+QA/La/TYSsrtEVAbvVuFdIX8HJbzc9Q88VTbuneD5gGqc1Xy3c1Zxa++CVii1vLuLFjpAkEAoQF4+zgH5otYcRoIo9MrwLQhccz9Ma9Wu/Hphjy2bxbY8Ufi84v9YYiHG5A1LH6jc8OB+SPbxbd3o4TQ6WgYsQ==");
//        System.out.println("还原后的字符串为:" + messageDe);
        System.out.println(RSAEncryption("123456"));
        System.out.println(RSADecrypt("Nfgq5ftaYHw+EkfoBi9KEooNz+4Yj44kkHQOMlJD9DXnaZF9BpR0jYhlTtx6uyyjkGe8c2hPonCjVLGDXjCPUNpi+AfeIdOZSoPTAe4frUTSspVhj5e3JGXYy20EAm7j4XVWVQD2GOzjS2xyOOWRAdX2/W9qMVEj2z1ex0k3eFs="));
    }
    public static String RSAEncryption(String message) {
        String messageEn = "";
        try{
            messageEn = encrypt(message,"MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCqCWi79UBezfY37nOHO8p2bAzw0qmBY42OZEd0nLqHLbJwQXOkskSbGFB5D3wLvpDOc72PlClg/C9QckN4D2mx6ZbjkBW08GEFpCWHPBLRqSpcBCLEaqxf+lt0oEVvXecGguDTLnmF94j9KDsuSxr8d61NNlXqcxJySvltNh3JwQIDAQAB");
        }catch (Exception e) {
            e.printStackTrace();
        }
        return messageEn;
    }
    public static  String RSADecrypt(String message) {
        String messageDe = "";
        try{
            messageDe = decrypt(message,"MIICeQIBADANBgkqhkiG9w0BAQEFAASCAmMwggJfAgEAAoGBAKoJaLv1QF7N9jfuc4c7ynZsDPDSqYFjjY5kR3ScuoctsnBBc6SyRJsYUHkPfAu+kM5zvY+UKWD8L1ByQ3gPabHpluOQFbTwYQWkJYc8EtGpKlwEIsRqrF/6W3SgRW9d5waC4NMueYX3iP0oOy5LGvx3rU02VepzEnJK+W02HcnBAgMBAAECgYEAhcChAjkJSYn6BEUt21LNEBouk8EiVQVadIetLa2bjHoFwwe5T/RqwxV9N71WdmaQwdWJZ0fExOWa0k0PhYGaQW+laaRcS83gEfM8DrGlbcjXAsvUkQjXGMBTuazsfO4iAl7pLmOVh0mQ3UkkdqOfiVdFGGGCts7yOM7vhgFgE4ECQQDha88elD5P3RgdO6xF3TZU1DrLi3oY+zh3tIig6vp5wkDKCT7crmnjf+1PpqePrUv7lJAtTo642H8zsPAlYvITAkEAwRpE3JRzt1bMiYudFCSbQjJ6CUeIyFsEwJBjBBcH6EfPF8+6E3txaoUid8v8cUR3zOirrnnPUwzws5tVkobvWwJBAIU4/fOIkTsJ49KDDdFMZ2vC8eyRxds1va2hWI4h0V5cW4YL6MbrnVECrfHBAI59UMaiioL8RoUgDi0yiPrPe1kCQQCOYpRMIZqBoZsIAM4+QA/La/TYSsrtEVAbvVuFdIX8HJbzc9Q88VTbuneD5gGqc1Xy3c1Zxa++CVii1vLuLFjpAkEAoQF4+zgH5otYcRoIo9MrwLQhccz9Ma9Wu/Hphjy2bxbY8Ufi84v9YYiHG5A1LH6jc8OB+SPbxbd3o4TQ6WgYsQ==");
        }catch (Exception e) {
            e.printStackTrace();
        }
        return messageDe;
    }
    /**
     * 随机生成密钥对
     * @throws NoSuchAlgorithmException
     */
    public static void genKeyPair() throws NoSuchAlgorithmException {
        // KeyPairGenerator类用于生成公钥和私钥对，基于RSA算法生成对象
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
        // 初始化密钥对生成器，密钥大小为96-1024位
        keyPairGen.initialize(1024,new SecureRandom());
        // 生成一个密钥对，保存在keyPair中
        KeyPair keyPair = keyPairGen.generateKeyPair();
        RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();   // 得到私钥
        RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();  // 得到公钥
        String publicKeyString = new String(Base64.encodeBase64(publicKey.getEncoded()));
        // 得到私钥字符串
        String privateKeyString = new String(Base64.encodeBase64((privateKey.getEncoded())));
        // 将公钥和私钥保存到Map
        keyMap.put(0,publicKeyString);  //0表示公钥
        keyMap.put(1,privateKeyString);  //1表示私钥
    }
    /**
     * RSA公钥加密
     *
     * @param str
     *            加密字符串
     * @param publicKey
     *            公钥
     * @return 密文
     * @throws Exception
     *             加密过程中的异常信息
     */
    public static String encrypt( String str, String publicKey ) throws Exception{
        //base64编码的公钥
        byte[] decoded = Base64.decodeBase64(publicKey);
        RSAPublicKey pubKey = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decoded));
        //RSA加密
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, pubKey);
        String outStr = Base64.encodeBase64String(cipher.doFinal(str.getBytes("UTF-8")));
        return outStr;
    }

    /**
     * RSA私钥解密
     *
     * @param str
     *            加密字符串
     * @param privateKey
     *            私钥
     * @return 铭文
     * @throws Exception
     *             解密过程中的异常信息
     */
    public static String decrypt(String str, String privateKey) throws Exception{
        //64位解码加密后的字符串
        byte[] inputByte = Base64.decodeBase64(str.getBytes("UTF-8"));
        //base64编码的私钥
        byte[] decoded = Base64.decodeBase64(privateKey);
        RSAPrivateKey priKey = (RSAPrivateKey) KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(decoded));
        //RSA解密
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, priKey);
        String outStr = new String(cipher.doFinal(inputByte));
        return outStr;
    }
}
