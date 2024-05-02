package com.luisdev.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luisdev.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
