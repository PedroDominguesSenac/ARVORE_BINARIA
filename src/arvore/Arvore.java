package arvore;

public class Arvore {

    private No raiz = null;

    public No getRaiz() {
        return raiz;
    }
    
    public void inserir(Object objeto) {
        No novoNo = new No(objeto, null, null);
        if (raiz == null) {
            raiz = novoNo;
        } else {
            inserir(novoNo, raiz);
        }
    }

    private void inserir(No novoNo, No x) {
        int v = (int) novoNo.getObjeto();
        int r = (int) x.getObjeto();
        if (v < r) {
            if (x.getEsquerda() == null) {
                x.setEsquerda(novoNo);
            } else {
                inserir(novoNo, x.getEsquerda());
            }
        } else {
            if (x.getDireita() == null) {
                x.setDireita(novoNo);
            } else {
                inserir(novoNo, x.getDireita());
            }
        }
    }

    public void ordem(No x) {
        if (x != null) {
            ordem(x.getEsquerda());
            System.out.print(x.getObjeto() + " ");
            ordem(x.getDireita());
        }
    }

    public void preOrdem(No x) {
        if (x != null) {
            System.out.print(x.getObjeto() + " ");
            preOrdem(x.getEsquerda());
            preOrdem(x.getDireita());
        }
    }

    public void posOrdem(No x) {
        if (x != null) {
            posOrdem(x.getEsquerda());
            posOrdem(x.getDireita());
            System.out.print(x.getObjeto() + " ");
        }
    }

    public void percurso(No x, ListaPercursos tipo) {
        if (x != null) {
            if (tipo.equals(ListaPercursos.PRE)) {
                System.out.print(x.getObjeto() + " ");
            }
            percurso(x.getEsquerda(), tipo);
            if (tipo.equals(ListaPercursos.ORDEM)) {
                System.out.print(x.getObjeto() + " ");
            }
            percurso(x.getDireita(), tipo);
            if (tipo.equals(ListaPercursos.POS)) {
                System.out.print(x.getObjeto() + " ");
            }
        }
    }

}
