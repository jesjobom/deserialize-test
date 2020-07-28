package br.com.bbts.impl;

import br.com.bbts.base.BaseService;
import com.fasterxml.jackson.core.type.TypeReference;

public class ServiceModel extends BaseService<Model> {

    @Override
    protected TypeReference<Model> getReceivedEnvelopeType() {
        return new TypeReference<Model>() {};
    }
}
