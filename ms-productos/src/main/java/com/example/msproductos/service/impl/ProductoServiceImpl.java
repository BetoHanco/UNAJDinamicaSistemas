package com.example.msproductos.service.impl;

import com.example.msproductos.entity.Producto;
import com.example.msproductos.repository.ProductoRepository;
import com.example.msproductos.service.ProductoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductoServiceImpl implements ProductoService {

    private final ProductoRepository productoRepository;

    @Override
    public List<Producto> listar() {
        return productoRepository.findAll();
    }

    @Override
    public Optional<Producto> buscarPorId(Integer id) {
        return productoRepository.findById(id);
    }

    @Override
    public List<Producto> buscarPorCategoria(Integer categoriaId) {
        return productoRepository.findByCategoriaId(categoriaId);
    }

    @Override
    public Producto guardar(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Producto actualizar(Integer id, Producto producto) {
        producto.setId(id);
        return productoRepository.save(producto);
    }

    @Override
    public void eliminar(Integer id) {
        productoRepository.deleteById(id);
    }
}
