package com.foticc.demo.graphql.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("resource")
public class Resource {

    @Id
    private Integer id;
    private String url;
    private String name;
    private Integer expire;
    private String expire_cst;
    private String data;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getExpire() {
        return expire;
    }

    public void setExpire(Integer expire) {
        this.expire = expire;
    }

    public String getExpire_cst() {
        return expire_cst;
    }

    public void setExpire_cst(String expire_cst) {
        this.expire_cst = expire_cst;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
