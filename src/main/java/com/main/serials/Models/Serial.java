package com.main.serials.Models;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Document(value = "Serial")
public class Serial {
    @Id
    private String id;
    @Field(value = "created_by")
    private List<Object> created_by;
    @Field(value = "name")
    private String name;
    @Field(value = "vote_average")
    private String mark;

    public Serial(String name, List<Object> created_by, String mark) {
        this.name = name;
        this.created_by=created_by;
        this.mark = mark;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Object> getCreated_by() {
        return created_by;
    }

    public void setCreated_by(List<Object> created_by) {
        this.created_by = created_by;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}
