/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Repositorio;

import com.example.demo.CrudRepository.BikeInterface;
import com.example.demo.Entities.Bike;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USUARIO
 */
@Repository

public class BikeRepositorio {
    @Autowired
    private BikeInterface bikeCrudRepository;
    
      public List<Bike> getAll(){
        return (List<Bike>) bikeCrudRepository.findAll();
    }
     public Optional<Bike> getBike(int id){
        return bikeCrudRepository.findById(id);
    }

    public Bike save(Bike bike){
        return bikeCrudRepository.save(bike);
    }
     
    public void delete (Bike bike){
        bikeCrudRepository.delete(bike);
    }   
}
