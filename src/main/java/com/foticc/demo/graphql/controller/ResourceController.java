package com.foticc.demo.graphql.controller;


import com.foticc.demo.graphql.domain.Resource;
import com.foticc.demo.graphql.repos.ResourceRepos;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.relational.core.sql.In;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.Arguments;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.io.Serializable;
import java.util.Map;

@Controller("resource")
public class ResourceController {


    private final ResourceRepos resourceRepos;

    public ResourceController(ResourceRepos resourceRepos) {
        this.resourceRepos = resourceRepos;
    }

    @QueryMapping("resourceById")
    public Resource getById(@Argument Integer id) {
        return resourceRepos.findById(id).orElse(null);
    }
    //todo wrong
    // @Arguments @PageableDefault Pageable pageable
    //java.lang.IllegalStateException:
    // No primary or single unique constructor found for interface org.springframework.data.domain.Pageable
    // missmake
//    @QueryMapping("page")
//    public Page<Resource> page(@Arguments PageRecord page) {
//        return resourceRepos.findAll(PageRequest.of(page.getPageNumber(),page.getPageSize()));
//    }
//
//    public static class PageRecord implements Serializable {
//        private Integer pageNumber, pageSize;
//
//        public Integer getPageNumber() {
//            return pageNumber;
//        }
//
//        public void setPageNumber(Integer pageNumber) {
//            this.pageNumber = pageNumber;
//        }
//
//        public Integer getPageSize() {
//            return pageSize;
//        }
//
//        public void setPageSize(Integer pageSize) {
//            this.pageSize = pageSize;
//        }
//    }

}
