package com.curso.ecommerce.repository;

import com.curso.ecommerce.model.DetalleOrden;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDetalleOrdenRepository extends JpaRepository<DetalleOrden, Integer> {

}
