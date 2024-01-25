package com.foticc.demo.graphql.repos;

import com.foticc.demo.graphql.domain.Resource;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.graphql.data.GraphQlRepository;

@GraphQlRepository
public interface ResourceRepos extends ListPagingAndSortingRepository<Resource,Integer>, CrudRepository<Resource,Integer> {
}
