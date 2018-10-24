import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class ChatbotSend {

        public static String WEBHOOK_TOKEN = "https://oapi.dingtalk.com/robot/send?access_token=d13d26a812d33811044317f7421a786e3ad96571d6ebf99257dea46c2b914439";

        public static void main(String args[]) throws Exception{

            HttpClient httpclient = HttpClients.createDefault();

            HttpPost httppost = new HttpPost(WEBHOOK_TOKEN);
            httppost.addHeader("Content-Type", "application/json; charset=utf-8");
            String textMsg = "{ \"msgtype\": \"text\", \"text\": {\"content\": \"Sunny小姐姐说了，群里的每个小仙女今天需要看下自己有没有在jira上记录phase2的title、课程完成图标、地图的遗留bug，今天要整理给项目管理哦！我们的phase3（unit）快开启啦，这些工作也要注重起来啦啦啦~宇嘉小仙女负责来整理这块的信息哈\"}}";

            StringEntity se = new StringEntity(textMsg, "utf-8");
            httppost.setEntity(se);

            HttpResponse response = httpclient.execute(httppost);
            if (response.getStatusLine().getStatusCode()== HttpStatus.SC_OK){
            String result= EntityUtils.toString(response.getEntity(), "utf-8");
            System.out.println(result);
            }
        }
}