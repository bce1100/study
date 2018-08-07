import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author bce1100
 * @date 2018/8/6.
 */
public class Main {
    /**
     * POI读取学生文件EXCEL
     * 控制台输入点名人数n(不大于总人数)
     * 输出n名同学的姓名(不重复)
     */
    public static void main(String[] args) {
        while (true) {
            System.out.println("输入人数：");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            print(num);
        }
    }

    private static void print(int num) {
        HashSet<Integer> nameSet = new HashSet<Integer>();
        File file = new File("name.xlsx");
        FileInputStream fis = null;
        Workbook wb = null;
        try {
            fis = new FileInputStream(file);
            wb = WorkbookFactory.create(fis);
            Sheet sheet = wb.getSheetAt(0);
            int rowNum = sheet.getLastRowNum() + 1;
            if (rowNum < num) {
                System.out.println("输入数比人数还多玩毛线，重新输入↓");
                return;
            } else {
                randomSet(0, rowNum, num, nameSet);
            }
            Row row = null;
            Cell cell = null;
            for (int i : nameSet) {
                row = sheet.getRow(i);
                cell = row.getCell(0);
                System.out.println(cell.getStringCellValue());
            }
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                wb.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 随机指定范围内N个不重复的数
     * 利用HashSet的特征，只能存放不同的值
     *
     * @param min 指定范围最小值
     * @param max 指定范围最大值
     * @param n   随机数个数
     * @param set 随机数结果集
     */
    public static void randomSet(int min, int max, int n, HashSet<Integer> set) {
        if (n > (max - min + 1) || max < min) {
            return;
        }
        for (int i = 0; i < n; i++) {
            // 调用Math.random()方法
            int num = (int) (Math.random() * (max - min)) + min;
            // 将不同的数存入HashSet中
            set.add(num);
            if (set.size() == n) {
                break;
            }
        }
        int setSize = set.size();
        // 如果存入的数小于指定生成的个数，则调用递归再生成剩余个数的随机数，如此循环，直到达到指定大小
        if (setSize < n) {
            // 递归
            randomSet(min, max, n, set);
        }
    }

}
