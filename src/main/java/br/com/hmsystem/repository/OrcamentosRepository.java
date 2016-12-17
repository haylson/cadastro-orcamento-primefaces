package br.com.hmsystem.repository;

import java.io.Serializable;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.hmsystem.model.Orcamento;

public class OrcamentosRepository implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager manager;
	
	public Orcamento guardar(Orcamento orcamento) {
		return manager.merge(orcamento);
	}

}