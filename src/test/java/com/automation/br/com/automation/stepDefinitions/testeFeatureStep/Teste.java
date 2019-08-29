package com.automation.br.com.automation.stepDefinitions.testeFeatureStep;

import com.automation.br.com.automation.config.configDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class Teste extends configDriver{	
	
  @Dado("^que eu navegue até a pagina do google$")
  public void iniciarNavegador() throws Throwable {
	  getDriver().get("http://www.google.com.br");
  }
   
  @Quando("realizar uma pesquisa")
  public void realizar_uma_pesquisa() {
     
  }

  @Entao("a pagina retornara o item pesquisado")
  public void a_pagina_retornara_o_item_pesquisado() {
     
  }


}
