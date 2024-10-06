package org.example.testhaibazo.service;

import org.example.testhaibazo.model.Size;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ISizeService {
    Page<Size> getSizes(Pageable pageable);
}
