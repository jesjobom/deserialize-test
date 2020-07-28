package com.jesjobom.impl;

import com.jesjobom.base.BaseService;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.Arrays;
import java.util.List;

public class ServiceList extends BaseService<List<Model>> {

    @Override
    protected TypeReference<List<Model>> getReceivedEnvelopeType() {
        return new TypeReference<List<Model>>() {};
    }

    @Override
    protected String toStringFromObject(List<Model> models) {
        return Arrays.toString(models.toArray());
    }
}
