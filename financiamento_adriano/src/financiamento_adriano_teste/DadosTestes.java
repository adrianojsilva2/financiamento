package financiamento_adriano_teste;

import static org.junit.Assert.*;

import org.junit.Test;

import financiamento_adriano.Dados;


public class DadosTestes {

	@Test
	public void testGetNomeCliente() {
		
        Dados finan = new Dados();		
		finan.setNomeCliente("");
		String esperado = "";
		String atual = finan.getNomeCliente();		
		assertEquals(esperado, atual);		
		
	}
	
	@Test
	public void testGetModeloVeiculo(){
		
		Dados finan = new Dados();		
		finan.setModeloVeiculo("");
		String esperado = "";
		String atual = finan.getModeloVeiculo();		
		assertEquals(esperado, atual);
	}
	
	@Test
	public void testGetValorVeiculo(){
		
		Dados finan = new Dados();		
		finan.setValorVeiculo(-8);
		double esperado = 0.0;
		double atual = finan.getValorVeiculo();		
		assertEquals(esperado, atual, 0.0);
	}
	
	@Test
	public void testGetValorEntrada(){
		
		Dados finan = new Dados();		
		finan.setValorEntrada(-8);
		double esperado = 0.0;
		double atual = finan.getValorEntrada();		
		assertEquals(esperado, atual, 0.0);
	}
	
	@Test
	public void testTaxaJuro(){
		
		Dados finan = new Dados();
		finan.settaxaJuro(4);
		double esperado = 0.04;
		double atual = finan.gettaxaJuro();		
		assertEquals(esperado, atual, 0.00);
		
		
	}
	
	@Test
	public void testNumeroPrestacao(){
		
		Dados finan = new Dados();
		finan.setNumeroPrestacao(15);
		int esperado = 15;
		int atual = finan.getNumeroPrestacao();		
		assertEquals(esperado, atual, 0.00);
				
	}
	
	@Test
	public void testrendaMensa(){
		
		Dados finan = new Dados();
		finan.setrendaMensal(100);
		double esperado = 100;
		double atual = finan.getrendaMensal();		
		assertEquals(esperado, atual, 0.00);		
		
	}
/*	
 
	
	@Test
	public void testCalcularTaxaDeJuros(){
		
		Financiamento f = new Financiamento();
		f.setJuros(2);
		double esperado = 0.02;
		double atual = f.calcularTaxaDeJuros();
		
		assertEquals(esperado, atual, 0.00);
		
	}
	
	@Test
	public void testCalcularPrestacao(){
		Financiamento f = new Financiamento();
		f.setJuros(2);
		f.setNumPrestacoes(10);
		f.setValorEntrada(4000.00);
		f.setValorTotalVeiculo(50000.00);
		
		double esperado = 5121.02;
		double atual = f.calcularPrestacao();
		
		assertEquals(esperado, atual, 0.01);
		
	}
	
	@Test
	public void testCalcularTotalFinanciamento(){
		Financiamento f = new Financiamento();
		f.setJuros(2);
		f.setNumPrestacoes(10);
		f.setValorEntrada(4000.00);
		f.setValorTotalVeiculo(50000.00);
		
		double esperado = 51210.20;
		double atual = f.calcularTotalFinanciamento();
		
		assertEquals(esperado, atual, 0.01);
	
	}
	
	@Test
	public void testAutorizacao(){
		Financiamento f = new Financiamento();
		f.setJuros(2);
		f.setNumPrestacoes(10);
		f.setRendaMensalCliente(15000.0);
		f.setValorTotalVeiculo(50000.0);
		f.setValorEntrada(4000.0);
		
		boolean esperado = true;
		boolean atual = f.autorizacaoFinanciamento();
		
		assertEquals(esperado, atual);
		
		f.setRendaMensalCliente(5000.00);
		boolean esperado2 = false;
		boolean atual2 = f.autorizacaoFinanciamento();
		
		assertEquals(esperado2, atual2);
	}
	

}*/

}
	