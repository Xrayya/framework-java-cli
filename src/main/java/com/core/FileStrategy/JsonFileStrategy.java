package com.core.FileStrategy;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.core.Model.Model;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

/**
 * JsonFileStrategy
 */
public class JsonFileStrategy<T extends Model> implements FileStrategy<T> {

    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Override
    public List<T> parse(String data) {
        Type listType = new TypeToken<ArrayList<T>>() {
        }.getType();
        List<T> list = gson.fromJson(data, listType);
        return list;
    }

    @Override
    public String stringify(List<T> data) {
        return gson.toJson(data);
    }

    @Override
    public String getFileExtension() {
        return "json";
    }
}
