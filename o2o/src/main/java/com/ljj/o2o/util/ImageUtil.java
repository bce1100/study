package com.ljj.o2o.util;

import net.coobird.thumbnailator.Thumbnails;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @author bce1100
 * @date 2018/9/29.
 */
public class ImageUtil {
    private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyyMMddHHmmss");

    private static final Random R = new Random();

    public static String generateThumbnail(CommonsMultipartFile thumbnail, String targetAddr) {
        String realFileName = getRandomFileName();
        String extension = getFileExtension(thumbnail);
        makeDirPath(targetAddr);
        String relativeAddr = targetAddr + realFileName + extension;
        File dest = new File(PathUtil.getImgBasePath() + relativeAddr);
        try {
            Thumbnails.of(thumbnail.getInputStream()).size(200, 200)
                    .outputQuality(0.8f).toFile(dest);
        } catch (IOException e) {
            throw new RuntimeException("创建缩略图失败：" + e.toString());
        }
        return relativeAddr;
    }

    /**
     * 生成随机文件名，当前年月日小时分钟秒钟+五位随机数
     *
     * @return
     */
    private static String getRandomFileName() {
        //获取随机五位数
        int rannum = R.nextInt(89999) + 10000;
        String nowTimeStr = SIMPLE_DATE_FORMAT.format(new Date());
        return nowTimeStr + rannum;
    }

    /**
     * 创建目标路径所涉及的目录，即/usr/aa/bb/xxx.jpg，那么xxx.jpg路径上的usr aa bb……这些文件夹都得自动创建
     * @param targetAddr
     */
    private static void makeDirPath(String targetAddr) {
        String realFileParentPath = PathUtil.getImgBasePath() + targetAddr;
        File dirPath = new File(realFileParentPath);
        if (!dirPath.exists()) {
            dirPath.mkdirs();
        }
    }

    /**
     * 获取输入流文件扩展名
     * @param cFile
     * @return
     */
    private static String getFileExtension(CommonsMultipartFile cFile) {
        String originalFileName = cFile.getOriginalFilename();
        return originalFileName.substring(originalFileName.lastIndexOf("."));
    }

    public static void main(String[] args) {

    }
}
