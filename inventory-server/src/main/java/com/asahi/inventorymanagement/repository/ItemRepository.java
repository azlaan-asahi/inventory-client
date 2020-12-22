package com.asahi.inventorymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asahi.inventorymanagement.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{

}
