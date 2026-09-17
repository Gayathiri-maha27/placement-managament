package com.placementmanagement.management.certificate.repository;
import com.placementmanagement.management.certificate.entity.Certificate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CertificateRepository extends JpaRepository<Certificate, Long> {
}
