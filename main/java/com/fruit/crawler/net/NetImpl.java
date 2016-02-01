package com.fruit.crawler.net;

import sun.net.www.http.HttpClient;

import java.net.URL;
/**
 * Created by vincent
 * Created on 16/2/1  11:01.
 */
public class NetImpl implements  INet
{

    @Override
    public String getHtmlStr(URL url, NetConnectType type)
    {

        return null;
    }

    @Override
    public HttpClient getClient(ConnectConfig config)
    {

        return null;
    }

    @Override
    public ConnectConfig getConfig(String filePath)
    {

        return null;
    }
}
