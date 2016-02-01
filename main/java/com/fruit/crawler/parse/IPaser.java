package com.fruit.crawler.parse;

/**
 * Created by vincent
 * Created on 16/2/1  10:36.
 */
public interface IPaser
{
    /**
     * 按正则的方法获取指定的内容
     * @param reg
     * @param source
     * @return
     */
    public String getContent(String reg,String source);

    /**
     * 按正则的方法获取指定的内容数组
     * @param reg
     * @param source
     * @return
     */
    public String[] getContents(String reg,String source);

}
