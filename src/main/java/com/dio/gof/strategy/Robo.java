package com.dio.gof.strategy;

import lombok.Setter;

@Setter
public class Robo {
    private Comportamento comportamento;

    public void mover(){
        comportamento.mover();
    }
}
