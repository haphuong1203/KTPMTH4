package com.example.ktpmth4.repository;

import com.example.ktpmth4.entity.NhanVien;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Optional;

public class NhanVienRepositoryImp implements NhanVienRepository{

    private void insertFourNhanViens(NhanVienRepository repository) {
        NhanVien nhanVien = NhanVien.builder()
                .ten("Phuonhg")
                .luong(200)
                .build();
        repository.save(nhanVien);
    }

    @Bean
    public void CommandLineRunner run(NhanVienRepository repository) {
        return(args -> {
            insertFourNhanViens(repository);
            System.out.println(repository.findAll());
        });
    }
    @Override
    public List<NhanVien> findNhanVienByTen(String ten) {
        return null;
    }

    @Override
    public <S extends NhanVien> S save(S entity) {
        return null;
    }

    @Override
    public <S extends NhanVien> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<NhanVien> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<NhanVien> findAll() {
        return null;
    }

    @Override
    public Iterable<NhanVien> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(NhanVien entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends NhanVien> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
