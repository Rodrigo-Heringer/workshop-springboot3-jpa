package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.OrderItem;

// Não precisa da annotation @Repository, 
// pois já está herdando da JpaRepository que tem a annotation.
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {}
