
// Modificações concluidas...

public class Pilha {

    public Object[] pilha; 
    public int posicaoPilha;
    public int tamMax;

    //Citar as diretrizes para escrever o código em Ingles
    //Alterar de public para private e construir os gets e sets
    //Falar sobre o nome da variavel top ou topo (Mas que não é necessário)
    
    // Renomear alguns variaveis ou método

    public Pilha() {
        this.posicaoPilha = -1;
        this.pilha = new Object[10];
        tamMax = 10;
    }

    public boolean pilhaVazia() {
        //isEmpty
        if (this.posicaoPilha == -1) {
            return true;
        }
        return false;
    }
    
    public boolean pilhaCheia() {
    	//isFull
    	if (this.posicaoPilha == tamMax){ 
    		return true;
    	} else {
    		return false;
    	}
    }
    

    public int tamanho() {
        //is
        if (this.pilhaVazia()) {
            return 0;
        }
        return this.posicaoPilha; //retirar o this.posicaoPilha + 1, para ficar errado;
    }

    
    public Object exibeUltimoValor() {
        //top
        if (this.pilhaVazia()) {
            return null;
        }
        return this.pilha[this.posicaoPilha];
    }

    public Object desempilhar() {
        //pop
        if (pilhaVazia()) {
            return null;
        }
        return this.pilha[this.posicaoPilha--];
    }

    public void empilhar(Object valor) {
        // push
        if (this.posicaoPilha < this.tamMax) {          //Código duplicado, Já existe o método pilhaCheia;
            this.pilha[++posicaoPilha] = valor;
        } 
        // Falta um Else para avisar que não foi possivel empilhar por que a pilha já está cheia;
    }
	
	  
    
    public static void main(String args[]) {
        Pilha p = new Pilha();
        p.empilhar("Portuguesa ");
        p.empilhar("Frango com catupiry ");
        p.empilhar("Calabresa ");
        p.empilhar("Quatro queijos ");
        p.empilhar(10);
                while (p.pilhaVazia() == false) {
            System.out.println(p.desempilhar());
        }
    }
	
}