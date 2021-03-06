package com.orizon_poc.guiarestproject;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Guia implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "codigoPrestador")
	private int codigoPrestador;
	@org.kie.api.definition.type.Label(value = "codigoOperadora")
	private int codigoOperadora;
	@org.kie.api.definition.type.Label(value = "tipoGuia")
	private java.lang.String tipoGuia;
	@org.kie.api.definition.type.Label(value = "beneficiario")
	private com.orizon_poc.guiarestproject.Beneficiario beneficiario;
	@org.kie.api.definition.type.Label(value = "procedimentosRealizados")
	private java.util.List<com.orizon_poc.guiarestproject.ProcedimentoRealizado> procedimentosRealizados;

	public Guia() {
	}

	public int getCodigoPrestador() {
		return this.codigoPrestador;
	}

	public void setCodigoPrestador(int codigoPrestador) {
		this.codigoPrestador = codigoPrestador;
	}

	public int getCodigoOperadora() {
		return this.codigoOperadora;
	}

	public void setCodigoOperadora(int codigoOperadora) {
		this.codigoOperadora = codigoOperadora;
	}

	public java.lang.String getTipoGuia() {
		return this.tipoGuia;
	}

	public void setTipoGuia(java.lang.String tipoGuia) {
		this.tipoGuia = tipoGuia;
	}

	public com.orizon_poc.guiarestproject.Beneficiario getBeneficiario() {
		return this.beneficiario;
	}

	public void setBeneficiario(
			com.orizon_poc.guiarestproject.Beneficiario beneficiario) {
		this.beneficiario = beneficiario;
	}

	public java.util.List<com.orizon_poc.guiarestproject.ProcedimentoRealizado> getProcedimentosRealizados() {
		return this.procedimentosRealizados;
	}

	public void setProcedimentosRealizados(
			java.util.List<com.orizon_poc.guiarestproject.ProcedimentoRealizado> procedimentosRealizados) {
		this.procedimentosRealizados = procedimentosRealizados;
	}

	public Guia(
			int codigoPrestador,
			int codigoOperadora,
			java.lang.String tipoGuia,
			com.orizon_poc.guiarestproject.Beneficiario beneficiario,
			java.util.List<com.orizon_poc.guiarestproject.ProcedimentoRealizado> procedimentosRealizados) {
		this.codigoPrestador = codigoPrestador;
		this.codigoOperadora = codigoOperadora;
		this.tipoGuia = tipoGuia;
		this.beneficiario = beneficiario;
		this.procedimentosRealizados = procedimentosRealizados;
	}

}