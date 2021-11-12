public class Pilha {

    public Object[] pilha; 
    public int posicaoPilha;
    public int tamMax;

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
        return this.posicaoPilha; 
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
        if (this.posicaoPilha < this.tamMax) {  
            this.pilha[++posicaoPilha] = valor;
        } 
    }
	
	  
    public static void main(String args[]) {
        Pilha p = new Pilha();
        p.empilhar("https://www.google.com.br/");
        p.empilhar("https://www.uol.com.br/");
        p.empilhar("https://www.ufba.br/");
        p.empilhar("https://ifbaiano.edu.br/portal/");
                while (p.pilhaVazia() == false) {
            System.out.println(p.desempilhar());
        }
    }
}
