package com.example.ex01.demo.repository;

import com.example.ex01.demo.model.Coffee;
import org.springframework.data.repository.CrudRepository;

public interface CoffeeRepository extends CrudRepository<Coffee, Long> {
}
