package br.com.hmsystem.service;

import java.io.Serializable;

import javax.inject.Inject;

import br.com.hmsystem.model.Orcamento;
import br.com.hmsystem.repository.OrcamentosRepository;
import br.com.hmsystem.util.Transacional;

public class GestaoOrcamentos implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private OrcamentosRepository orcamentos;
	
	@Transacional
	public void salvar(Orcamento orcamento) {
		orcamentos.guardar(orcamento);
	}
	
}