package com.placementmanagement.management.certificate.service;
import com.placementmanagement.management.certificate.entity.Certificate;
import com.placementmanagement.management.certificate.repository.CertificateRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CertificateService {
    private final CertificateRepository repository;

    public CertificateService(CertificateRepository repository) {
        this.repository = repository;
    }

    public List<Certificate> getAll() { return repository.findAll(); }
    public Optional<Certificate> getById(Long id) { return repository.findById(id); }
    public Certificate create(Certificate data) { return repository.save(data); }

    public Optional<Certificate> update(Long id, Certificate data) {
        return repository.findById(id).map(existing -> {
            data.setId(id);
            return repository.save(data);
        });
    }

    public boolean delete(Long id) {
        if (!repository.existsById(id)) return false;
        repository.deleteById(id);
        return true;
    }
}
