package Proxy.eg2;

import java.net.URL;

/**
 * @author wengyinbing
 * @data 2021/5/26 22:26
 **/
public class client {
    public static void main(String[] args) throws Exception {
        String image = "http://image.jpg";
        URL url = new URL(image);
        HighResolutionImage highResolutionImage = new HighResolutionImage(url);
        ImageProxy imageProxy = new ImageProxy(highResolutionImage);
        imageProxy.showImage();
    }
}
