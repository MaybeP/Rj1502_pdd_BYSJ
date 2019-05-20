package top.maybe123.tool;

import org.springframework.web.multipart.MultipartFile;

import java.io.*;

public class ImageOutPut implements Runnable {
    MultipartFile file;
    String param;

    public ImageOutPut(MultipartFile file, String param) {
        this.file=file;
        this.param=param;
    }

    public void ImageOutPut(MultipartFile f){
        this.file=f;
    }
    @Override
    public void run() {
       File fi=new File("/www/server/nginx/html/image/"+param);
      // File fi=new File("D:\\image\\"+param);
        FileOutputStream out= null;
            try {
                out = new FileOutputStream(fi);
                out.write(file.getBytes());
                out.flush();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
