package httpclientDemo;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;

public class clientDemo {

    /*public String url = "http://hao.haolingsheng" +
            ".com/ring/000/993/d915a1c149bb3076a32dfdab923f8c21.mp3";*/
    public String url = "http://fs.w.kugou.com/201901111701/02bb9f36333b79dc21210815a6ea44f2/G083/M08/00/04/84YBAFhks0aAYGsBADl8RUL2DXQ825.mp3";
    public String content = "E:\\";

    @Test
    /**
     * 小爬虫,抓取单个图片或歌曲
     * */
    public void demo1() throws Exception{

        // 创建默认的客户端实例
        CloseableHttpClient httpclient =  HttpClients.createDefault();
        // 创建get请求实例
        //HttpGet httpGet = new HttpGet("http://localhost:8080/400.jpg");
        HttpGet httpGet = new HttpGet(url);
        // 客户端执行get请求返回响应
        CloseableHttpResponse response = httpclient.execute(httpGet);
        try {

            // 服务器响应状态行
            System.out.println(response.getStatusLine());
            if(response.getStatusLine().getStatusCode() == 200){
                HttpEntity entity = response.getEntity();

                File file = new File("3.mp3");
                FileOutputStream fos = new FileOutputStream(file);
                entity.writeTo(fos);
                fos.flush();
                fos.close();
                System.out.println("下载成功");
            }else{
                System.out.println("连接失败");
            }
        }finally {
            response.close();
        }
    }
}
