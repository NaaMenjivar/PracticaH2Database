package com.example.practicaexamenviejo.service;

import com.example.practicaexamenviejo.model.Usuario;
import com.example.practicaexamenviejo.model.Documento;
import com.example.practicaexamenviejo.model.MisDocumento;
import com.example.practicaexamenviejo.repository.MisDocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MisDocumentoService {
    @Autowired
    private MisDocumentoRepository misDocumentoRepository;

    public MisDocumento agregarDocumento(MisDocumento misDocumento) {
        return misDocumentoRepository.save(misDocumento);
    }

    public List<MisDocumento> obtenerPorUsuarioId(Long usuarioId) {
        return misDocumentoRepository.findByUsuarioId(usuarioId);
    }

    public void eliminarPorId(Long id) {
        misDocumentoRepository.deleteById(id);
    }

    public MisDocumento obtenerPorId(Long id) {
        return misDocumentoRepository.findById(id).orElse(null);
    }

    public Optional<MisDocumento> buscarPorUsuarioYDocumento(Usuario usuario, Documento documento) {
        return misDocumentoRepository.findByUsuarioAndDocumento(usuario, documento);
    }
}
