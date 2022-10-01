package com.api.mboard_v1.modules.presupuesto.gastos;

import java.time.LocalDateTime;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.*;

import lombok.Data;


@Entity
@Data
@Table(name = "gastos")
public class Gastos {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column( name = "id_gasto")
  private Integer Id;

  private String detalle;
  private String descripcion;

  @Column( name = "forma_pago")
  private String formaPago;

  @Column( name = "id_cuenta_asociada")
  private int cuentaAsociada;

  @Column( name = "fecha_pago")
  private LocalDateTime fechaPago;

  private int monto;

  @CreationTimestamp
  private LocalDateTime created_at;

  private LocalDateTime modified_at;

  private LocalDateTime deleted_at;




}
