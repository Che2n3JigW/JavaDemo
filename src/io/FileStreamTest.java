package io;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileStreamTest {
    public static void main(String[] args) throws IOException {
        File f = new File("test.txt");

        // 构建FileOutputStream对象,文件不存在会自动新建
        FileOutputStream fos = new FileOutputStream(f);

        // 构建OutputStreamWriter对象,参数可以指定编码,默认为操作系统默认编码,windows上是gbk
        OutputStreamWriter writer = new OutputStreamWriter(fos, StandardCharsets.UTF_8);

        // 写入到缓冲区
        writer.append("中文输入");

        // 换行
        writer.append("\r\n");

        // 刷新缓存冲,写入到文件,如果下面已经没有写入的内容了,直接close也会写入
        writer.append("English");

        // 关闭写入流,同时会把缓冲区内容写入文件,所以上面的注释掉
        writer.close();

        // 关闭输出流,释放系统资源
        fos.close();

        FileInputStream fip = new FileInputStream(f);
        // 构建FileInputStream对象

        // 构建InputStreamReader对象,编码与写入相同
        InputStreamReader reader = new InputStreamReader(fip, StandardCharsets.UTF_8);

        StringBuffer sb = new StringBuffer();
        while (reader.ready()) {
            // 转成char加到StringBuffer对象中
            sb.append((char) reader.read());
        }

        System.out.println(sb.toString());
        // 关闭读取流
        reader.close();

        // 关闭输入流,释放系统资源
        fip.close();

    }
}
