public final class Palavra extends Variavel {

    public Palavra(String nome, Object valor) throws Erro {
        super(nome, Tipos.PALAVRA, valor);
    }

    // troca o valor se ele for do mesmo tipo que o da variável. se não, joga um erro
    public void setValor(Object valor) throws Erro {                                     
        // if(valor.getClass() != String.class)
        //     throw new Exception(); // trocar essa exceção por "tipo incompativel com a variavel na atribuição" ou algo do tipo
        this.valor = valor;
    }

    public Tipos getTipo() {
        return Tipos.PALAVRA;
    }

    public Palavra toInt() throws Erro {
        // nome = null pois o retorno é um literal (isto é, não é atrelado a alguma variável)
        return new Palavra(null, Integer.valueOf(valor.toString()));
    }

    public Flutuante toFlutuante() throws Erro {
        return new Flutuante(null, Double.valueOf(valor.toString()));
    }

}
