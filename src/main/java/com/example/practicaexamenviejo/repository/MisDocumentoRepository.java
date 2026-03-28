package com.example.practicaexamenviejo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.practicaexamenviejo.model.Documento;
import com.example.practicaexamenviejo.model.MisDocumento;
import com.example.practicaexamenviejo.model.Usuario;
import java.util.List;
import java.util.Optional;

public interface MisDocumentoRepository extends JpaRepository<MisDocumento, Long> {
    List<MisDocumento> findByUsuarioId(Long usuarioId);
    Optional<MisDocumento> findByUsuarioAndDocumento(Usuario usuario, Documento documento);
}
