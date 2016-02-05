package com.fruit.crawler.task.config;

/**
 * Created by vincent
 * Created on 16/2/2  13:52.
 */
public class TaskConfig
{
    private String name;
    private String type;
    private String desc;
    private int thread;
    private int interval;
    private String url;

    public String getName()
    {

        return name;
    }

    public void setName(String name)
    {

        this.name = name;
    }

    public String getType()
    {

        return type;
    }

    public void setType(String type)
    {

        this.type = type;
    }

    public String getDesc()
    {

        return desc;
    }

    public void setDesc(String desc)
    {

        this.desc = desc;
    }

    public int getThread()
    {

        return thread;
    }

    public void setThread(int thread)
    {

        this.thread = thread;
    }

    public int getInterval()
    {

        return interval;
    }

    public void setInterval(int interval)
    {

        this.interval = interval;
    }

    public String getUrl()
    {

        return url;
    }

    public void setUrl(String url)
    {

        this.url = url;
    }
}
