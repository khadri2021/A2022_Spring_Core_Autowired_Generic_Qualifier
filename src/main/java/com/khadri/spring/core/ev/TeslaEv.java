package com.khadri.spring.core.ev;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TeslaEv implements  Car<Ev>{
}
