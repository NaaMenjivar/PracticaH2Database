package com.example.practicaexamenviejo.service;

import com.example.practicaexamenviejo.model.TipoDocumento;
import com.example.practicaexamenviejo.repository.TipoDocumentoRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class TipoDocumentoService {

    @Autowired
    private TipoDocumentoRepository tipoDocumentoRepository;

    public List<TipoDocumento> listarTodos() {
        return tipoDocumentoRepository.findAll();
    }

    public TipoDocumento buscarPorCodigo(String codigo) {
        return tipoDocumentoRepository.findById(codigo).orElse(null);
    }

}
