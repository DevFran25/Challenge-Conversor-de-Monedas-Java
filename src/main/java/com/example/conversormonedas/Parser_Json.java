package com.example.conversormonedas;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


public class Parser_Json {

    public double extraerMonto(String json) {
        JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();
        return jsonObject.get("conversion_result").getAsDouble();
    }

}
