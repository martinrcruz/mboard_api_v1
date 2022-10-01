package com.api.mboard_v1.modules.presupuesto.gastos;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GastosService {
  
  @Autowired
  private GastosRepository gastosRepository;

  // GET
  public ArrayList<Gastos> getGastos() {
    return (ArrayList<Gastos>) this.gastosRepository.findAll();
  }

  // GET BY ID
  public Optional<Gastos> getGastosById(int id) {
    return this.gastosRepository.findById(id);
  }

  // POST
  public Gastos createGastos(Gastos gastos) {
    return this.gastosRepository.save(gastos);
  }
  // PUT

  // DELETE
  public boolean deleteGastosById(int id) {
    try {
      this.gastosRepository.deleteById(id);
      return true;
    } catch (Exception e) {
      return false;
    }
  }
}
