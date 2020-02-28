package com.example.wsconsumer.component;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.tempuri.FCVException_Exception;
import org.tempuri.IngresoResultados;
import org.tempuri.ObjectFactory;
import org.tempuri.ResultadoDataBank;

@Component
@RequiredArgsConstructor
public class ResultadoBancoSangreComponent {

    private static final Logger logger = LoggerFactory.getLogger(ResultadoBancoSangreComponent.class);

    private final ResultadoDataBank resultadoDataBankProxy;

    public String consumer(String value) throws FCVException_Exception {
        logger.info("Consuming service with input value {}", value);
        ObjectFactory objectFactory = new ObjectFactory();
        IngresoResultados ingresoResultados = objectFactory.createIngresoResultados();
        ingresoResultados.setTransmisionLISResult(value);
        String result = resultadoDataBankProxy.ingresoResultados(value);
        logger.info("Result value {}", result);
        return result;
    }


}
