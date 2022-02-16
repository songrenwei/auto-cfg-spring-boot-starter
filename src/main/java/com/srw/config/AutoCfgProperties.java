package com.srw.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("auto.cfg")
public class AutoCfgProperties {

    private String host;

    private int port;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
