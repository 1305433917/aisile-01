package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016101500691952";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCO7IH2FhOynO+E84OYhPpt7MZpAjz6KKMGfLWegJ65eWWQ2xYIY+yS7Q4rr3xTyNuQ0kSzJFECwYmyHuKyiCmAc8WnifxElqQUabmBSCO5Gw5lgcTG5/JvzlHSJxXH4vBu+vB1zMlc47WEDxKuq4amDFlVFpbKZ065g+lR8Wou4NdG3AqfT2bMDAkpy3fey7cMmEos0/uhkWsUbcqUjAeWn0peeJ0kkKDTcmfZIDzfK8s6Mz71sWPOkCo0cT8odr22evIPWX3lt9f4T3TN19heer3rKkFQMidg9EM/MNT15xPxwKLqF0cWsyJKuaylnZWOGpTEfiZuPvQBNlf9O1XtAgMBAAECggEACYnzao8ypVsgCUmPYOCPLkL9QwjpNPD9YHN2U6vV7B8UDkTxBYJVycCUj4nYzGa9cL734tTrqzlrjT3Od4fq7S3M5U+qTJGZRduAjAZajAIoRdIRZg0Y+ylUAKinJX4Z+e45mkMetVplRPkUkB/WjsKIO8uUKNIYSP1q1xM7uQEi+Egm1b29epcT5K13b6rsib/cxZUh+yg163KO5PQ2rPDKhXv4geqlTaX6nr/y73UHn1cvwTMPRVo5YATHdQ72prm4mKKQZb1auTbljvg0rxYJAmo63QPEUdASv7/YqcWmrb5cHJnf4PQG52oGMY5iZNBGpQjZj7sqKaWrvKqPqQKBgQDR8fl+f5tG+GJT8QW2iHrUwjEBN6p8DDOMW0QuLGyIJW5/f67l6u6qwzhiam0NjD9SY422pNwUqKJd8fl9KDPM4XHQfkr8lgXMsXjIOlbrPt/WJk7gGCvhT0JBQLqQUkWkTSxM1qnSk3FOv8ZoMiN+uKwi67K6g0Z+xA/obAoxpwKBgQCuRsXNrlxC7JApWt+AMCKEm2HetDO1LYcCreWy6O+k1RHr3R7Qv/HWrOOAajfxq6dYoGcT8K7jMvObqt9D8SMAazIj4wtmuNNgsZ2BgfWInUfKXJrsrQr+sKIsJPA3Mz012l02LjvpovwR2VKwwHcqbcxa08pzQiJet3uSMiAmSwKBgHzzdBdKoULq/7KP52OM9PX9oabk142+wUtO4lRM0kdxZ8NwXcqvOV7ek4dXahI/H0zMvYIvumB9QS2Cn4dSzwmoP9Hj6INOUqNSGN2qgyK9qADPifAr0qnlPzyQ5riQjqxL1grhU+9lG3HQB6jp9mAsTx71gsko6mL2E7Wz35lPAoGBAITG4O9Kt3o5l8AaPwwAIFxdsdwl+PtBe4pcCRQdCm/P8f58knzCsLM5N39f7c2PVUldtArqJaRt7lIchkvSTTOFeEcFNWuGx2z1BaZk6De0dLzFfzdww162Hmh5oBa+UBVWkAu2f+kKRvgmVizaBjBqRPayQ506tsrpChmhXQMvAoGAWktDL25lugcEDryYlFUfRfKJhyzVc8HQgPK4GkHB4FVxHGCIDDBBG7ym5cFlgI6PPrmGnVtZYFgYGr5zeQMa3iXBEN2KAT9qEDhecKf+V8ighNXIoEV3Ad2XnNBspDM+gBpdchQPi8CAwHzMkcoZxcR6t+o9kvoc0Woeld7In64=";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgqZWPbNLEFwPhTZWL60Z4ocLU8w+wIqgSOsQFCG0TyjWlEONlLESuM1OrBdFsaeaMz8pHypioviumjuu5C734KZVqkuoAwyabznmHJycJ6irIZNJn+KVXSstSEF4yDmwvGUZQMNYzYyy9zaJAzxlzju7KTHWdKo2GYVnEWihcFip0TJFbPokev+CjdtKChIeZMGEnVr1wR5tEsLTLL2h0LLNfdISIhpFcM52lx8y7JLOP03PGM54mDLrL7geaQm++/whvZSaNbzG34dm6hF0qZ3ROgWJlz9X7jmGRYeOU+TaHwTsirpxvvD8KcGMFHD1Z2slchrGUqRhHatdiD+9UQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://10.31.39.13:9090/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://10.31.39.13:9090/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

