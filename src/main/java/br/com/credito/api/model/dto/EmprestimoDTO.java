package br.com.credito.api.model.dto;

import java.time.LocalDateTime;

import br.com.credito.api.model.entity.Emprestimo;

public class EmprestimoDTO {

    public EmprestimoDTO(Emprestimo emprestimo) {
        this.id = emprestimo.getId();
        this.clienteId = emprestimo.getClienteId();
        this.valor = emprestimo.getValor();
        this.inicioVigencia = emprestimo.getInicioVigencia();
        this.fimVigencia = emprestimo.getFimVigencia();
    }

    private Long id;
    private Long clienteId;
    private Double valor;
    private LocalDateTime inicioVigencia;
    private LocalDateTime fimVigencia;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public LocalDateTime getInicioVigencia() {
        return inicioVigencia;
    }

    public void setInicioVigencia(LocalDateTime inicioVigencia) {
        this.inicioVigencia = inicioVigencia;
    }

    public LocalDateTime getFimVigencia() {
        return fimVigencia;
    }

    public void setFimVigencia(LocalDateTime fimVigencia) {
        this.fimVigencia = fimVigencia;
    }
   
}
