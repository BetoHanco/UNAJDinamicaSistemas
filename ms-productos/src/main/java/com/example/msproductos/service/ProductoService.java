package com.example.msproductos.service;

import com.example.msproductos.entity.Producto;
import java.util.List;
import java.util.Optional;

public interface ProductoService {
    List<Producto> listar();
    Optional<Producto> buscarPorId(Integer id);
    List<Producto> buscarPorCategoria(Integer categoriaId);
    Producto guardar(Producto producto);
    Producto actualizar(Integer id, Producto producto);
    void eliminar(Integer id);
}
