package com.example.wsconsumer.config;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.tempuri.ResultadoDataBank;

@Configuration
public class ClientConfig {

    @Value("${client.ticketagent.address}")
    private String address;

    @Bean(name = "ResultadoDataBankProxy")
    public ResultadoDataBank resultadoDataBankProxy() {
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean =
                new JaxWsProxyFactoryBean();
        jaxWsProxyFactoryBean.setServiceClass(ResultadoDataBank.class);
        jaxWsProxyFactoryBean.setAddress(address);

        return (ResultadoDataBank) jaxWsProxyFactoryBean.create();
    }

}
