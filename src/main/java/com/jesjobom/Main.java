package com.jesjobom;

import com.jesjobom.impl.ServiceList;
import com.jesjobom.impl.ServiceModel;
import com.fasterxml.jackson.core.JsonProcessingException;

public class Main {

    public static void main(String[] args) throws JsonProcessingException {

        System.out.println("=== TESTE DE DESERIALIZAÇÃO ===");

        String jsonModel = "{ \"body\":\"Este é um model simples\" }";
        System.out.println("jsonModel: " + jsonModel);
        System.out.println("toString: " + new ServiceModel().getToStringFromJson(jsonModel));

        System.out.println();

        String jsonList = "[{ \"body\":\"Este é um model lista 1\" }, { \"body\":\"Este é um model lista 2\" }]";
        System.out.println("jsonList: " + jsonList);
        System.out.println("toString: " + new ServiceList().getToStringFromJson(jsonList));

    }
}
