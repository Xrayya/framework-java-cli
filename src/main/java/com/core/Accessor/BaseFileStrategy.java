package com.core.Accessor;

import java.util.List;

import com.core.Model.Model;

/**
 * BaseFileStrategy
 */
public class BaseFileStrategy implements FileStrategy<Model> {

    @Override
    public List<Model> parse(String data) {
        return null;
    }

    @Override
    public String stringify(List<Model> data) {
        return data.toString();
    }

    @Override
    public String getFileExtension() {
        return "";
    }

    
}
