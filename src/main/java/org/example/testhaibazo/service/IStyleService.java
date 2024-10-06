package org.example.testhaibazo.service;

import org.example.testhaibazo.model.Style;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IStyleService {
    Page<Style> getStyles(Pageable pageable);
}
