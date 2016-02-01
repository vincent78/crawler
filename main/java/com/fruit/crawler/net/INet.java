package com.fruit.crawler.net;

import sun.net.www.http.HttpClient;

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

    /**
     * 按配置获取客户端的对象
     * @param config
     * @return
     */
    public HttpClient getClient(ConnectConfig config);

    /**
     * 按指定的路径加载配置
     * @param filePath
     * @return
     */
    public ConnectConfig getConfig(String filePath);



}
