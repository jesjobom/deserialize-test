package com.jesjobom.base;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class BaseService<T> {

    private ObjectMapper objectMapper = new ObjectMapper();

    public String getToStringFromJson(String json) throws JsonProcessingException {
        T t = objectMapper.readValue(json, getReceivedEnvelopeType());
        return toStringFromObject(t);
    }

    protected String toStringFromObject(T t) {
        return t.toString();
    }

    abstract protected TypeReference<T> getReceivedEnvelopeType();

}
