package br.com.wmfood.pagamentos.repository;

import br.com.wmfood.pagamentos.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
}
