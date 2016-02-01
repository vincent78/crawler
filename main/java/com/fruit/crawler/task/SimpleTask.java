package com.fruit.crawler.task;

import com.fruit.crawler.net.INet;
import com.fruit.crawler.net.NetConnectType;
import com.fruit.crawler.net.NetImpl;
import com.fruit.crawler.parse.IPaser;
import com.fruit.crawler.parse.PaserImpl;
import com.fruit.crawler.serialize.ISerialize;
import com.fruit.crawler.serialize.SerializeImpl;

import java.net.URL;
/**
 * Created by vincent
 * Created on 16/2/1  10:57.
 */
public class SimpleTask
{
    public void doTask(URL url)
    {
        //连接网络获取内容
        INet net = new NetImpl();
        String htmlStr = net.getHtmlStr(url, NetConnectType.get);
        //解析内容
        IPaser parser = new PaserImpl();
        String retVal = parser.getContent("", htmlStr);
        //将得到的内容序列化
        ISerialize serialize = new SerializeImpl();
        serialize.serialize(retVal);
    }

}
