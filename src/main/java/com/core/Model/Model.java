package com.core.Model;

/**
 * Model
 */
public class Model {
    protected Long id;

    protected transient String fileName;
    
    public Model() {}

    public Model(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
