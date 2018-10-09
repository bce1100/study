package com.ljj.o2o.util;

/**
 * @author bce1100
 * @date 2018/9/29.
 */
public class PathUtil {
    private static String seperator = System.getProperty("file.seperator");

    public static String getImgBasePath() {
        String os = System.getProperty("os.name");
        String basePath = "";
        if (os.toLowerCase().startsWith("win")) {
            basePath = "D:/";
        } else {
            basePath = "/usr/";
        }
        basePath = basePath.replace("/", seperator);
        return basePath;
    }

    public static String getShopImagePath(long shopId){
        String imagePath = "/upload/item/shop"+shopId+"/";
        return imagePath.replace("/",seperator);
    }
}
