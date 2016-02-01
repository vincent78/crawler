package com.fruit.crawler.net;



import org.apache.http.client.HttpClient;

import java.net.URL;
/**
 * Created by vincent
 * Created on 16/2/1  10:27.
 */
public interface INet
{
    /**
     * 获取HTML的字符串
     * @param 指定的URL
     * @param 连接的方式
     * @return
     */
    public String getHtmlStr(URL url, NetConnectType type);



}
