package com.ggnarp.winecellarmanagement.dto;

import com.ggnarp.winecellarmanagement.entity.Client;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaleDTO {

    private UUID id;

    @NotNull
    private UUID clientId;

    private Optional<Client> client;

    @NotNull
    private Long productId;

    @NotNull(message = "A quantidade do produto deve ser informada!")
    private Integer quantity;

    private BigDecimal totalValue;

    private BigDecimal discount;

    @NotNull(message = "Método de pagamento deve ser informado!")
    private String paymentMethod;

    private LocalDateTime purchaseDate;
}
