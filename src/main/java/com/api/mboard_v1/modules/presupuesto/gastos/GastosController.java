package com.api.mboard_v1.modules.presupuesto.gastos;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/gastos")
public class GastosController {

  @Autowired
  private GastosService gastosService;

  // GET
  @GetMapping
  public ArrayList<Gastos> getGastos() {
    return this.gastosService.getGastos();
  }

  // GET BY ID
  @GetMapping(path = "/{id}")
  public Optional<Gastos> getGastosById(@PathVariable("id") int id) {
    return this.gastosService.getGastosById(id);
  }
  // POST

  @PostMapping()
  public void createGastos(@RequestBody Gastos gastos) {
    try {
      this.gastosService.createGastos(gastos);
      log.info("Creado con exito");
    } catch (Exception e) {
      log.error("Error al crear");
    }

  }

  // PUT
  @PutMapping(path = "/{id}")
  public Gastos updateGastos(@PathVariable("id") int id, @RequestBody Gastos updatedGastos) {
    return this.gastosService.getGastosById(id)
        .map(gastos -> {
          gastos.setDetalle(updatedGastos.getDetalle());
          gastos.setDescripcion(updatedGastos.getDescripcion());
          gastos.setFormaPago(updatedGastos.getFormaPago());
          gastos.setCuentaAsociada(updatedGastos.getCuentaAsociada());
          gastos.setFechaPago(updatedGastos.getFechaPago());
          gastos.setMonto(updatedGastos.getMonto());

          return this.gastosService.createGastos(gastos);
        }).orElseGet(() -> {
          updatedGastos.setId(id);
          return this.gastosService.createGastos(updatedGastos);
        });
  }

  // DELETE
  @DeleteMapping(path = "/{id}")
  public void deleteGastosById(@PathVariable("id") int id) {
    boolean ok = this.gastosService.deleteGastosById(id);
    if (ok) {
      log.info("Successfully deleted");
    } else {
      log.error("Error deleting");

    }
  }
}
