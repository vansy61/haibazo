package org.example.testhaibazo.service;

import org.example.testhaibazo.model.Color;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IColorService {
    Page<Color> getColors(Pageable pageable);
}
