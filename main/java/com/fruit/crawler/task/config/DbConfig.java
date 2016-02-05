package com.fruit.crawler.task.config;

/**
 * Created by vincent
 * Created on 16/2/2  13:57.
 */
public class DbConfig
{
    private String Server;
    private String port;
    private String name;
    private String user;
    private String pwd;
    private String colection;

    public String getServer()
    {

        return Server;
    }

    public void setServer(String server)
    {

        Server = server;
    }

    public String getPort()
    {

        return port;
    }

    public void setPort(String port)
    {

        this.port = port;
    }

    public String getName()
    {

        return name;
    }

    public void setName(String name)
    {

        this.name = name;
    }

    public String getUser()
    {

        return user;
    }

    public void setUser(String user)
    {

        this.user = user;
    }

    public String getPwd()
    {

        return pwd;
    }

    public void setPwd(String pwd)
    {

        this.pwd = pwd;
    }

    public String getColection()
    {

        return colection;
    }

    public void setColection(String colection)
    {

        this.colection = colection;
    }
}
