package com.example.wsconsumer;

import com.example.wsconsumer.component.ResultadoBancoSangreComponent;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class WsconsumerApplication implements CommandLineRunner {

    private final ResultadoBancoSangreComponent resultadoBancoSangreComponent;

    public static void main(String[] args) {
        SpringApplication.run(WsconsumerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String value = "<order>\n" +
                "  <orderNumber>19937</orderNumber>\n" +
                "  <patient>\n" +
                "    <name>  MANUELA  CORREA </name>\n" +
                "    <documentNumber>40177452</documentNumber>\n" +
                "    <documentType>CC</documentType>\n" +
                "  </patient>\n" +
                "  <user>\n" +
                "    <name>DataBank</name>\n" +
                "  </user>\n" +
                "  <test>\n" +
                "    <code>911004</code>\n" +
                "    <result>NEGATIVO</result>\n" +
                "    <testNote></testNote>\n" +
                "    <sample>22594</sample>\n" +
                "    <validateDate>2020-02-10 18:21:08.0</validateDate>\n" +
                "    <usertest>\n" +
                "      <documentNumber>CC: 1065638121</documentNumber>\n" +
                "      <userName>JENNY PAOLA LOPEZ RUEDA</userName>\n" +
                "    </usertest>\n" +
                "  </test>\n" +
                "</order>";


        resultadoBancoSangreComponent.consumer(value);
    }
}
