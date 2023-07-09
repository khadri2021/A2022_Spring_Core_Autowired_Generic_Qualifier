package com.khadri.spring.core;

import com.khadri.spring.core.ev.Ev;
import com.khadri.spring.core.fuel.Car;
import com.khadri.spring.core.fuel.Car;
import com.khadri.spring.core.fuel.Fuel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Customer {

    @Autowired
    private List<Car<Fuel>> fuelCarList;

    @Autowired
    private List<com.khadri.spring.core.ev.Car<Ev>> evCarList;

    public void setEvCarList(List<com.khadri.spring.core.ev.Car<Ev>> evCarList) {
        this.evCarList = evCarList;
    }

    public void setFuelCarList(List<Car<Fuel>> fuelCarList) {
        this.fuelCarList = fuelCarList;
    }

    public List<com.khadri.spring.core.ev.Car<Ev>> getEvCarList() {
        return evCarList;
    }

    public List<Car<Fuel>> getFuelCarList() {
        return fuelCarList;
    }
}
