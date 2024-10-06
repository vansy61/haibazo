package org.example.testhaibazo.controller;

import org.example.testhaibazo.mapper.SizeMapper;
import org.example.testhaibazo.model.Size;
import org.example.testhaibazo.model.dto.SizeDTO;
import org.example.testhaibazo.service.ISizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/sizes")
public class SizeController {
    @Autowired
    private ISizeService sizeService;

    @GetMapping
    public ResponseEntity<Page<SizeDTO>> getSizes(Pageable pageable) {
        Page<Size> sizes = sizeService.getSizes(pageable);
        Page<SizeDTO> sizesDto = sizes.map(SizeMapper.INSTANCE::sizeToSizeDTO);
        return ResponseEntity.ok(sizesDto);
    }

}
