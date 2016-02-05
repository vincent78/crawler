package com.fruit.crawler.net;

import com.fruit.crawler.task.config.ConfigObject;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.*;
import java.net.URL;
/**
 * Created by vincent
 * Created on 16/2/1  11:01.
 */
public class NetImpl implements  INet
{

    public String getHtmlStr(URL url, NetConnectType type)
    {

        getClient(null);
        return null;
    }

    private HttpClient getClient(ConfigObject config)
    {
        String configStr = getConfig("main/res/config.json");

        CloseableHttpClient client = HttpClients.createDefault();
//        HttpGet httpGet = new HttpGet()
        return client;
    }

    private String getConfig(String filePath)
    {
        String configStr = "";
        if (StringUtils.isNotEmpty(filePath))
        {
            try
            {
                File file = new File(filePath);
                System.out.println(file.getAbsoluteFile());
                configStr = FileUtils.readFileToString(file);
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        //读取jar中的默认文件
        if (StringUtils.isEmpty(configStr))
        {
            InputStream is=this.getClass().getResourceAsStream("config.json");
            BufferedReader br=new BufferedReader(new InputStreamReader(is));

            try
            {
                String tmp = "";
                while((tmp=br.readLine())!=null)
                {
                    configStr += tmp;
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }

        return configStr;
    }
}
