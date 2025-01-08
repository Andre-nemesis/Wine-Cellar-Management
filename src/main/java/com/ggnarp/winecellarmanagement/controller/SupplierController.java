package com.ggnarp.winecellarmanagement.controller;

import com.ggnarp.winecellarmanagement.dto.ProductDTO;
import com.ggnarp.winecellarmanagement.dto.SupplierDTO;
import com.ggnarp.winecellarmanagement.entity.Product;
import com.ggnarp.winecellarmanagement.entity.Supplier;
import com.ggnarp.winecellarmanagement.service.SupplierService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("api/supplier")
public class SupplierController {

    private final SupplierService supplierService;

    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getSupplier(@PathVariable UUID id) {
        try{
            Supplier supplier = supplierService.getById(id);
            return ResponseEntity.status(HttpStatus.OK).body(supplier);
        }
        catch(Exception e){
            Map<String, String> errorResponse = new HashMap<>();
            errorResponse.put("error", "Error in searching the supplier with this id: " + id);
            errorResponse.put("message", e.getMessage());
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
        }
    }

    @PostMapping
    public ResponseEntity<?> register(@RequestBody @Valid SupplierDTO supplierDTO) {
        try{
            Supplier supplier = supplierService.save(supplierDTO);
            return ResponseEntity.status(HttpStatus.CREATED).body(supplier);
        }
        catch (Exception e){
            Map<String, String> errorResponse = new HashMap<>();
            errorResponse.put("error", "Error in creating the supplier");
            errorResponse.put("message", e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
        }

    }

    @GetMapping
    public ResponseEntity<?> list() {
        try{
            List<SupplierDTO> suppliers = supplierService.listAll();
            return ResponseEntity.status(HttpStatus.OK).body(suppliers);
        }
        catch (Exception e) {
            Map<String, String> errorResponse = new HashMap<>();
            errorResponse.put("error", "Error in found all suppliers");
            errorResponse.put("message", e.getMessage());
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
        }

    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable UUID id, @RequestBody SupplierDTO supplierDTO) {
        try{
            Supplier updatedSupplier = supplierService.update(id, supplierDTO);
            return ResponseEntity.status(HttpStatus.OK).body(updatedSupplier);
        }
        catch (Exception e) {
            Map<String, String> errorResponse = new HashMap<>();
            errorResponse.put("error", "Error in updating the supplier with this id: " + id);
            errorResponse.put("message", e.getMessage());
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable UUID id) {
        try{
            this.supplierService.delete(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (Exception e) {
            Map<String, String> errorResponse = new HashMap<>();
            errorResponse.put("error", "Error in deleting supplier with this id: " + id);
            errorResponse.put("message", e.getMessage());
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
        }
    }
}