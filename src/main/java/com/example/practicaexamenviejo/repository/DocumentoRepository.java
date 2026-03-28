package com.example.practicaexamenviejo.repository;

import com.example.practicaexamenviejo.model.Documento;
import com.example.practicaexamenviejo.model.TipoDocumento;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DocumentoRepository extends JpaRepository<Documento, String> {
    List<Documento> findByTipoDocumento(TipoDocumento tipoDocumento);
}
