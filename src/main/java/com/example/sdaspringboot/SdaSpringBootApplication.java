package com.example.sdaspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Kontener Springa -
//Beany :
//@Component - nie zaleca się stosowania bo jest bardzo ogólną adnotacją
// i nie będzie wiadomo co robie dana klasa
//@Repository - oznaczamy takiego beana interfejsy
//@Service - jest to adnotacja dla klasy która dostarcza usługi,
// wykonywania zadań, logika biznesowa
//@Controller - warstwa prezentacja, bean który określa ruch międzye jednym a drugim elementem
// ( współpracuje z MVC)
//@RestController - typowo pod REST-a

//Rozomowa rekrutacja - czym różnią się oprócz nazwy?
//ODP: Niczym jest to tylko oznaczenie żeby inni
// widzieli co robie dana klasa


@SpringBootApplication
public class SdaSpringBootApplication {

    public static void main(String[] args) {

        SpringApplication.run(SdaSpringBootApplication.class, args);
    }

}
