package com.khadri.spring.core.fuel;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TeslaFuel implements Car<Fuel> {
}
