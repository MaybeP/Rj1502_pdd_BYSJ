package top.maybe123.tool;

import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;

public class ImageOutPut implements Runnable {
    MultipartFile file;

    public ImageOutPut(MultipartFile file) {
        this.file=file;
    }

    public void ImageOutPut(MultipartFile f){
        this.file=f;
    }
    @Override
    public void run() {
        File fi=new File("/www/server/nginx/html/image"+file.getOriginalFilename());
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
