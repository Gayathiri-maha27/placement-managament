package com.placementmanagement.management.certificate.controller;
import com.placementmanagement.management.certificate.entity.Certificate;
import com.placementmanagement.management.certificate.service.CertificateService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/certificates")
public class CertificateController {
    private final CertificateService service;

    public CertificateController(CertificateService service) {
        this.service = service;
    }

    @GetMapping
    public List<Certificate> getAll() { return service.getAll(); }

    @GetMapping("/{id}")
    public ResponseEntity<Certificate> getById(@PathVariable Long id) {
        return service.getById(id).map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Certificate> create(@RequestBody Certificate data) {
        return ResponseEntity.ok(service.create(data));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Certificate> update(@PathVariable Long id, @RequestBody Certificate data) {
        return service.update(id, data).map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        return service.delete(id) ? ResponseEntity.noContent().build()
                : ResponseEntity.notFound().build();
    }
}
