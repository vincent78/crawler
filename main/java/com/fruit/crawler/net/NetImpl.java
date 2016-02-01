package com.fruit.crawler.net;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.net.URL;
/**
 * Created by vincent
 * Created on 16/2/1  11:01.
 */
public class NetImpl implements  INet
{

    public String getHtmlStr(URL url, NetConnectType type)
    {

        return null;
    }

    private HttpClient getClient(ConnectConfig config)
    {

        CloseableHttpClient client = HttpClients.createDefault();

        return client;
    }

    private ConnectConfig getConfig(String filePath)
    {

        return null;
    }
}
