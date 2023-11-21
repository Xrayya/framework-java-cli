package com.core.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.core.Accessor.FileAccessor;
import com.core.Accessor.FileStrategy;
import com.core.Model.Model;

/**
 * Service
 */
public class Service {
    protected Map<Class<? extends Model>, List<? extends Model>> models = new HashMap<>();
    private FileStrategy<? extends Model> fileStrategy;

    public Service() {
    }

    public Service(FileStrategy<? extends Model> fileStrategy) {
        this.fileStrategy = fileStrategy;
    }

    public void setFileStrategy(FileStrategy<? extends Model> fileStrategy) {
        this.fileStrategy = fileStrategy;
    }

    public <T extends Model> void addModel(T key) {
        models.put(key.getClass(), new FileAccessor<>(fileStrategy, key.getFileName()).getAllData());
    }
}
