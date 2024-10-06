package org.example.testhaibazo.service.impl;

import org.example.testhaibazo.model.Size;
import org.example.testhaibazo.repository.SizeRepository;
import org.example.testhaibazo.service.ISizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class SizeService implements ISizeService {
    @Autowired
    private SizeRepository sizeRepository;

    @Override
    public Page<Size> getSizes(Pageable pageable) {
        return sizeRepository.findAll(pageable);
    }
}
