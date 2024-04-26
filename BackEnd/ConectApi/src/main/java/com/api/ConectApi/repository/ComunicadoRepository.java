package com.api.ConectApi.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.ConectApi.Model.ComunicadoModel;

public interface ComunicadoRepository extends JpaRepository<ComunicadoModel, UUID>{

}