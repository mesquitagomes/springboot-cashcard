package br.com.mesquitagomes.cashcard;

import org.springframework.data.annotation.Id;

record CashCard(
        @Id Long id,
        Double amount) {
}
