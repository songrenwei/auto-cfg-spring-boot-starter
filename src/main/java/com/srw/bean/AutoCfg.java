package com.srw.bean;

import com.srw.config.AutoCfgProperties;

public class AutoCfg {

    public AutoCfg(AutoCfgProperties autoCfgProperties) {
        this.host = autoCfgProperties.getHost();
        this.port = autoCfgProperties.getPort();
    }

    private String host;

    private int port;

    @Override
    public String toString() {
        return "AutoCfg{" +
                "host='" + host + '\'' +
                ", port=" + port +
                '}';
    }
}
