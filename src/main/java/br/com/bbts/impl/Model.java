package br.com.bbts.impl;

class Model {

    private String body;

    public Model() {
    }

    public Model(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Model body: \"" + body + "\"";
    }
}
